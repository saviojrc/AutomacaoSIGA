package br.com.zup.pageObjects;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.enums.CategoriasProdutosEnum;
import br.com.zup.pageObjects.enums.FaixaPrecoEnum;
import br.com.zup.pageObjects.enums.FiltroPrecoEnum;
import br.com.zup.pageObjects.enums.ProdutosPesquisaEnum;
import br.com.zup.pageObjects.enums.SubCategoriasEnum;
import br.com.zup.pageObjects.enums.TipoDeProdutoEnum;
import br.com.zup.pages.framework.Tela;
import br.com.zup.util.Constantes;
import br.com.zup.util.Formatacao;

public class FiltroProdutosPO extends Tela {

	public void selecionarCategoria(CategoriasProdutosEnum categoria) {
		try {
			sleep(10);
			waintPresenceOfElementLocated(categoria.getStrProperty(), categoria.getStrValue());
			clickObject(categoria.getStrProperty(), categoria.getStrValue());

		} catch (Exception e) {
			e.printStackTrace();

			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void selecionarSubCategoria(SubCategoriasEnum subCategoria) {
		try {
			sleep(10);
			waintPresenceOfElementLocated(subCategoria.getStrProperty(), subCategoria.getStrValue());
			clickObject(subCategoria.getStrProperty(), subCategoria.getStrValue());
			sleep(10);
		} catch (Exception e) {
			e.printStackTrace();

			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void ordenarProdutos(FiltroPrecoEnum filtroOrdenacao) {
		try {
			sleep(10);
			String strProperty = ".cssSelector";
			String strValue = "select.form-control-flat";
			implicitlyWait(2);
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			triggerDowmKey();
			ClickDropDowmIndex(strProperty, strValue, filtroOrdenacao.getIndice());

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void selecionarTipoProduto(TipoDeProdutoEnum tipoDeProduto) {
		try {
			sleep(10);
			String strProperty = tipoDeProduto.getStrProperty();
			String strValue = tipoDeProduto.getStrValue();
			implicitlyWait(2);
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			triggerDowmKey();
			clickObject(strProperty, strValue);
			sleep(10);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void filtrarFaixaDePreco(FaixaPrecoEnum faixaPreco) {
		try {
			sleep(10);
			String strProperty = faixaPreco.getStrProperty();
			String strValue = faixaPreco.getStrValue();
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			MoveToElementPage(strProperty, strValue);
			triggerDowmKey();
			clickObject(strProperty, strValue);
			sleep(10);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void selecionarProdutoPesquisado(ProdutoTO produto) {
		try {
			waintElementToBeClickable(produto.getDescricaoNaPesquisa().getStrProperty(),
					produto.getDescricaoNaPesquisa().getStrValue());
			
			clickObject(produto.getDescricaoNaPesquisa().getStrProperty(), produto.getDescricaoNaPesquisa().getStrValue());

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public List<ProdutoTO> obterListaProdutos() {
		try {

			List<ProdutoTO> produtos = new ArrayList<ProdutoTO>();
			ProdutoTO produtoTO = new ProdutoTO();

			int indice = 1;
			for (int i = 0; i < Constantes.PRODUTOS_POR_PAGINA; i++) {

				String objStrDescricao = "";
				String objStrPreco = "";

				ProdutosPesquisaEnum descricao = ProdutosPesquisaEnum
						.obterProdutosPesquisa(ProdutosPesquisaEnum.DESCRICAO, indice);

				ProdutosPesquisaEnum preco = ProdutosPesquisaEnum.obterProdutosPesquisa(ProdutosPesquisaEnum.PRECO,
						indice);

				MoveToElementPage(descricao.getStrProperty(), descricao.getStrValue());
				waintPresenceOfElementLocated(descricao.getStrProperty(), descricao.getStrValue());

				objStrDescricao = getPropertyObject(descricao.getStrProperty(), descricao.getStrValue(), "innerText");
				MoveToElementPage(preco.getStrProperty(), preco.getStrValue());
				objStrPreco = getPropertyObject(preco.getStrProperty(), preco.getStrValue(), "innerText").trim()
						.replace("R$", "").trim();

				Double objDoublePreco = Formatacao.formatarMoedaStringParaDouble(objStrPreco);

				produtoTO.setCodigo(i);
				produtoTO.setDescricao(objStrDescricao.trim());
				produtoTO.setPreco(objDoublePreco);
				produtoTO.setCodigoBarras("");
				produtoTO.setModelo("");
				produtoTO.setPeso(0.00);
				produtoTO.setReferencia("");
				produtoTO.setDescricaoNaPesquisa(descricao);
				produtoTO.setPrecoNaPesquisa(preco);

				produtos.add(produtoTO);

				indice++;
			}

			return produtos;

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
