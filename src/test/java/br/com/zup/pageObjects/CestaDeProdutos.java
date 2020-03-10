package br.com.zup.pageObjects;

import br.com.zup.pageObjects.enums.CamposCestaProdutosEnum;
import br.com.zup.pageObjects.enums.OpcaoResumoPedidoEnum;
import br.com.zup.pageObjects.enums.OpcoesRetiradaProdutoEnum;
import br.com.zup.pages.framework.Tela;
import br.com.zup.util.Formatacao;

public class CestaDeProdutos extends Tela {

	public void marcarOpcaoEntregaPedido(OpcoesRetiradaProdutoEnum opcao) {

		try {

			waintPresenceOfElementLocated(opcao.getStrProperty(), opcao.getStrValue());
			MoveToElementPage(opcao.getStrProperty(), opcao.getStrValue());
			clickObject(opcao.getStrProperty(), opcao.getStrValue());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void selecionarOpcao(OpcaoResumoPedidoEnum opcao) {

		try {

			waintPresenceOfElementLocated(opcao.getStrProperty(), opcao.getStrValue());
			MoveToElementPage(opcao.getStrProperty(), opcao.getStrValue());
			clickObject(opcao.getStrProperty(), opcao.getStrValue());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public String obterValorCamposCestaProdutos(CamposCestaProdutosEnum campo) {
		try {

			waintPresenceOfElementLocated(campo.getStrProperty(), campo.getStrValue());
			MoveToElementPage(campo.getStrProperty(), campo.getStrValue());

			String valorSelecionado = getPropertyObject(campo.getStrProperty(), campo.getStrValue(), "innerText");

			return valorSelecionado.trim();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String obterValorCEP() {
		try {

			waintPresenceOfElementLocated(CamposCestaProdutosEnum.CEP_RETIRADA.getStrProperty(),
					CamposCestaProdutosEnum.CEP_RETIRADA.getStrValue());
			MoveToElementPage(CamposCestaProdutosEnum.CEP_RETIRADA.getStrProperty(),
					CamposCestaProdutosEnum.CEP_RETIRADA.getStrValue());

			String valorSelecionado = getPropertyValue(CamposCestaProdutosEnum.CEP_RETIRADA.getStrProperty(),
					CamposCestaProdutosEnum.CEP_RETIRADA.getStrValue());

			return Formatacao.retirarMascaraCEP(valorSelecionado);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String obterValorCampoQuatidadeProdutosSelecionados() {
		try {

			waintPresenceOfElementLocated(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue());
			MoveToElementPage(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue());

			String valorSelecionado = getTextSelectComboBox(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue());

			return valorSelecionado.trim();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void selecionarQuantidade(String quantidade) {

		try {

			waintPresenceOfElementLocated(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue());
			MoveToElementPage(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue());
			ClickDropDowm(OpcaoResumoPedidoEnum.QUANTIDADE.getStrProperty(),
					OpcaoResumoPedidoEnum.QUANTIDADE.getStrValue(), quantidade);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

}
