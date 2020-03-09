package br.com.zup.pageObjects;

import br.com.zup.pageObjects.enums.BuscaPOEnum;
import br.com.zup.pages.framework.Tela;

public class BuscaPO extends Tela {

	public void buscarProduto(String produto) {
		try {
			bucarProdutoPaginaInicial(produto);
			selecionarOpcaoBuscaDeProdutos();

		} catch (Exception e) {
			e.printStackTrace();
			NavegacaoPO.closeBrowser();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	private void selecionarOpcaoBuscaDeProdutos() {
		waintElementToBeClickable(BuscaPOEnum.BUSCAR_ITENS.getStrProperty(), BuscaPOEnum.BUSCAR_ITENS.getStrValue());
		clickObject(BuscaPOEnum.BUSCAR_ITENS.getStrProperty(), BuscaPOEnum.BUSCAR_ITENS.getStrValue());

	}

	private void bucarProdutoPaginaInicial(String produto) {
		waintPresenceOfElementLocated(BuscaPOEnum.CAMPO_BUSCA.getStrProperty(), BuscaPOEnum.CAMPO_BUSCA.getStrValue());
		waintElementToBeClickable(BuscaPOEnum.CAMPO_BUSCA.getStrProperty(), BuscaPOEnum.CAMPO_BUSCA.getStrValue());
		clickObject(BuscaPOEnum.CAMPO_BUSCA.getStrProperty(), BuscaPOEnum.CAMPO_BUSCA.getStrValue());
		setText(BuscaPOEnum.CAMPO_BUSCA.getStrProperty(), BuscaPOEnum.CAMPO_BUSCA.getStrValue(), produto.trim());
	}

}
