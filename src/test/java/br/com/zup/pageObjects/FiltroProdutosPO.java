package br.com.zup.pageObjects;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.enums.CategoriasProdutosEnum;
import br.com.zup.pageObjects.enums.FaixaPrecoEnum;
import br.com.zup.pageObjects.enums.FiltroPrecoEnum;
import br.com.zup.pageObjects.enums.ProdutosPesquisaEnum;
import br.com.zup.pageObjects.enums.TipoDeProdutoEnum;
import br.com.zup.pages.framework.Tela;
import br.com.zup.util.Constantes;

public class FiltroProdutosPO extends Tela {

	public void selecionarCategoria(CategoriasProdutosEnum categoria) {
		try {

			waintPresenceOfElementLocated(categoria.getStrProperty(), categoria.getStrValue());
			clickObject(categoria.getStrProperty(), categoria.getStrValue());

		} catch (Exception e) {
			e.printStackTrace();

			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void ordenarProdutos(FiltroPrecoEnum filtroOrdenacao) {
		try {

			String strProperty = ".cssSelector";
			String strValue = "select.form-control-flat";
			implicitlyWait(2);
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			TriggerDowmKey();
			ClickDropDowmIndex(strProperty, strValue, filtroOrdenacao.getIndice());

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void selecionarTipoProduto(TipoDeProdutoEnum tipoDeProduto) {
		try {

			String strProperty = tipoDeProduto.getStrProperty();
			String strValue = tipoDeProduto.getStrValue();
			implicitlyWait(2);
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			MoveToElementPage(strProperty, strValue);
			TriggerDowmKey();
			clickObject(strProperty, strValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void filtrarFaixaDePreco(FaixaPrecoEnum faixaPreco) {
		try {

			String strProperty = faixaPreco.getStrProperty();
			String strValue = faixaPreco.getStrValue();
			implicitlyWait(2);
			waintPresenceOfElementLocated(strProperty, strValue);
			waintVisibilityOfElementLocated(strProperty, strValue);
			waintElementToBeClickable(strProperty, strValue);
			MoveToElementPage(strProperty, strValue);
			TriggerDowmKey();
			clickObject(strProperty, strValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public List<ProdutoTO> obterListaProdutos() {
		try {

			List<ProdutoTO> produtos = new ArrayList<>();
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
						.replace("R$", "").replace(".", "").replace(",", "").trim();

				Double objDoublePreco = Double.parseDouble(objStrPreco);

				produtoTO.setCodigo(i);
				produtoTO.setDescricao(objStrDescricao.trim());
				produtoTO.setPreco(objDoublePreco);
				produtoTO.setCodigoBarras("");
				produtoTO.setModelo("");
				produtoTO.setPeso(0.00);
				produtoTO.setReferencia("");

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
