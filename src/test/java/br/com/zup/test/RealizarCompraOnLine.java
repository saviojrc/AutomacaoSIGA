package br.com.zup.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.zup.DAO.ProdutoTODAO;
import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.BuscaPO;
import br.com.zup.pageObjects.CestaDeProdutos;
import br.com.zup.pageObjects.DetalhamentoPedidoPO;
import br.com.zup.pageObjects.FiltroProdutosPO;
import br.com.zup.pageObjects.NavegacaoPO;
import br.com.zup.pageObjects.ServicosPO;
import br.com.zup.pageObjects.enums.CamposCestaProdutosEnum;
import br.com.zup.pageObjects.enums.CategoriasProdutosEnum;
import br.com.zup.pageObjects.enums.FaixaPrecoEnum;
import br.com.zup.pageObjects.enums.FiltroPrecoEnum;
import br.com.zup.pageObjects.enums.OpcoesConfirmacaoResumoCompraEnum;
import br.com.zup.pageObjects.enums.OpcoesResumoComprasEnum;
import br.com.zup.pageObjects.enums.OpcoesRetiradaProdutoEnum;
import br.com.zup.pageObjects.enums.OpcoesServicosEnum;
import br.com.zup.pageObjects.enums.ResumoCompraEnum;
import br.com.zup.pageObjects.enums.SubCategoriasEnum;
import br.com.zup.pageObjects.enums.TipoDeProdutoEnum;
import br.com.zup.pageObjects.verificationPoint.CestaProdutosVP;
import br.com.zup.pageObjects.verificationPoint.ResumoPedidoVP;
import br.com.zup.util.Constantes;
import br.com.zup.util.Formatacao;

public class RealizarCompraOnLine {

	private BuscaPO busca = new BuscaPO();
	private FiltroProdutosPO filtro = new FiltroProdutosPO();
	private ProdutoTO produtoMaisBarato = new ProdutoTO();
	private ProdutoTO produtoASerComprado = new ProdutoTO();
	private ProdutoTODAO daoProdutoTO = new ProdutoTODAO();
	private List<ProdutoTO> listaDeProdutosNaTela = new ArrayList<ProdutoTO>();
	private DetalhamentoPedidoPO detalhamentoPedido = new DetalhamentoPedidoPO();
	private FaixaPrecoEnum faixaPrecoProduto = FaixaPrecoEnum.DE_1000_2500;
	private FaixaPrecoEnum faixaPrecoListagemProdutos;
	private String CEPAtual;
	private String CEPEsperado;
	private ServicosPO paginaDeServicos = new ServicosPO();
	private CestaDeProdutos cestaDeProdutos = new CestaDeProdutos();
	private String quantidade = "1";
	private String descricaoProdutoAtualCesta;
	private String quantidadeAtualCesta;
	private Double precoAtualCesta = 0.00;
	private Double valorTotalAtual = 0.00;
	private String CEPAtualCesta;

	@Before
	public void setUp() {
		NavegacaoPO.navegatePage(Constantes.URL_WEB_BROWSER);

	}

	@Test
	public void comprarProdutoMenorPeloPreco() {
		busca.buscarProduto(Constantes.PRODUTO);
		filtro.selecionarCategoria(CategoriasProdutosEnum.INFORMATICA);
		filtro.selecionarSubCategoria(SubCategoriasEnum.NOTEBOOK);
		filtro.ordenarProdutos(FiltroPrecoEnum.MENORES_PRECOS);
		filtro.selecionarTipoProduto(TipoDeProdutoEnum.NOTEBOOK);
		filtro.filtrarFaixaDePreco(faixaPrecoProduto);
		listaDeProdutosNaTela = filtro.obterListaProdutos();
		produtoMaisBarato = daoProdutoTO.obterProdutoMenorValor(listaDeProdutosNaTela);
		filtro.selecionarProdutoPesquisado(produtoMaisBarato);
		produtoASerComprado = detalhamentoPedido.obterProdutoResumoCompras();

		faixaPrecoListagemProdutos = FaixaPrecoEnum.obterFaixaPreco(produtoMaisBarato.getPreco());

		detalhamentoPedido.preencherCampoCEP(Constantes.CEP);
		detalhamentoPedido.selecionarOpcaoResumoPedido(OpcoesResumoComprasEnum.CONFIRMAR_CEP_OK);

		CEPAtual = detalhamentoPedido.obterValorTextoCampo(ResumoCompraEnum.CEP_SELECIONADO).trim().replace("CEP: ", "")
				.replace("-", "");
		CEPEsperado = Constantes.CEP;

		detalhamentoPedido.selecionarOpcaoResumoPedido(OpcoesResumoComprasEnum.COMPRAR);
		detalhamentoPedido.confirmarPedido(OpcoesConfirmacaoResumoCompraEnum.SIM_CONTINUAR);

		paginaDeServicos.selecionarOpcaoServico(OpcoesServicosEnum.CONTINUAR);
		cestaDeProdutos.marcarOpcaoEntregaPedido(OpcoesRetiradaProdutoEnum.RETIRAR_NA_LOJA_EM_10_DIAS_UTEIS);
		cestaDeProdutos.selecionarQuantidade(quantidade);

		descricaoProdutoAtualCesta = cestaDeProdutos
				.obterValorCamposCestaProdutos(CamposCestaProdutosEnum.DESCRICAO_PRODUTO);
		quantidadeAtualCesta = cestaDeProdutos.obterValorCampoQuatidadeProdutosSelecionados();
		precoAtualCesta = Formatacao.formatarMoedaStringParaDouble(
				cestaDeProdutos.obterValorCamposCestaProdutos(CamposCestaProdutosEnum.PRECO_RESUMO).replace("R$", ""));
		valorTotalAtual = Formatacao.formatarMoedaStringParaDouble(
				cestaDeProdutos.obterValorCamposCestaProdutos(CamposCestaProdutosEnum.TOTAL).replace("R$", ""));

		CEPAtualCesta =cestaDeProdutos.obterValorCEP();
	}

	@After
	public void tearDown() {
		
		NavegacaoPO.closeBrowser();
		
		CestaProdutosVP.validarProdutosInformadosNaCesta(descricaoProdutoAtualCesta, produtoASerComprado.getDescricao(),
				quantidadeAtualCesta, quantidade, precoAtualCesta, produtoASerComprado.getPreco(), valorTotalAtual,
				produtoASerComprado.getPreco(), CEPAtualCesta, CEPEsperado);
		
		ResumoPedidoVP.verificarCEPSelecionado(CEPAtual, CEPEsperado);
		
		ResumoPedidoVP.verificarResumoPedido(produtoMaisBarato, produtoASerComprado, faixaPrecoListagemProdutos,
				faixaPrecoProduto);
		

		
		

	}

}
