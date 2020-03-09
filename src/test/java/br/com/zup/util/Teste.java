package br.com.zup.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.zup.DAO.ProdutoTODAO;
import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.BuscaPO;
import br.com.zup.pageObjects.FiltroProdutosPO;
import br.com.zup.pageObjects.NavegacaoPO;
import br.com.zup.pageObjects.enums.CategoriasProdutosEnum;
import br.com.zup.pageObjects.enums.FaixaPrecoEnum;
import br.com.zup.pageObjects.enums.FiltroPrecoEnum;
import br.com.zup.pageObjects.enums.TipoDeProdutoEnum;

public class Teste {

	private BuscaPO busca = new BuscaPO();
	private FiltroProdutosPO filtro = new FiltroProdutosPO();
	private ProdutoTO produtoMaisBarato = new ProdutoTO();
	private ProdutoTODAO daoProdutoTO = new ProdutoTODAO();
	private List<ProdutoTO> listaDeProdutosNaTela = new ArrayList<ProdutoTO>();

	@Before
	public void setUp() {
		NavegacaoPO.navegatePage(Constantes.URL_WEB_BROWSER);

	}

	@Test
	public void buscarProdutoMenorPreco() {
		busca.buscarProduto(Constantes.PRODUTO);
		filtro.selecionarCategoria(CategoriasProdutosEnum.INFORMATICA);
		filtro.selecionarCategoria(CategoriasProdutosEnum.NOTEBOOK);
		filtro.ordenarProdutos(FiltroPrecoEnum.MENORES_PRECOS);
		filtro.selecionarTipoProduto(TipoDeProdutoEnum.NOTEBOOK);
		filtro.filtrarFaixaDePreco(FaixaPrecoEnum.DE_1000_2500);
		listaDeProdutosNaTela = filtro.obterListaProdutos();
		produtoMaisBarato = daoProdutoTO.obterProdutoMenorValor(listaDeProdutosNaTela);

	}

	@After
	public void tearDown() {

		NavegacaoPO.closeBrowser();

	}

}
