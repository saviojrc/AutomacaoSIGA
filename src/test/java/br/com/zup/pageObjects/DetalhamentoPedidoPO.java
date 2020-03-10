package br.com.zup.pageObjects;

import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.enums.OpcoesConfirmacaoResumoCompraEnum;
import br.com.zup.pageObjects.enums.OpcoesResumoComprasEnum;
import br.com.zup.pageObjects.enums.ResumoCompraEnum;
import br.com.zup.pages.framework.Tela;
import br.com.zup.util.Formatacao;

public class DetalhamentoPedidoPO extends Tela {

	public ProdutoTO obterProdutoResumoCompras() {
		try {

			ResumoCompraEnum descricao = ResumoCompraEnum.DESCRICAO;
			ResumoCompraEnum preco = ResumoCompraEnum.PRECO;
			ResumoCompraEnum codigo = ResumoCompraEnum.CODIGO;
			ResumoCompraEnum codigoDeBarras = ResumoCompraEnum.CODIGO_BARRAS;
			ResumoCompraEnum referencia = ResumoCompraEnum.REFERENCIA;
			ResumoCompraEnum peso = ResumoCompraEnum.PESO;
			ResumoCompraEnum modelo = ResumoCompraEnum.MODELO;

			waintPresenceOfElementLocated(descricao.getStrProperty(), descricao.getStrValue());
			MoveToElementPage(descricao.getStrProperty(), descricao.getStrValue());
			String descricaoProduto = getPropertyObject(descricao.getStrProperty(), descricao.getStrValue(),
					"innerText");

			waintPresenceOfElementLocated(preco.getStrProperty(), preco.getStrValue());
			MoveToElementPage(preco.getStrProperty(), preco.getStrValue());
			Double precoProduto = Formatacao.formatarMoedaStringParaDouble(
					getPropertyObject(preco.getStrProperty(), preco.getStrValue(), "innerText").trim().replace("R$",
							""));

			waintPresenceOfElementLocated(codigo.getStrProperty(), codigo.getStrValue());
			triggerEndKey();
			MoveToElementPage(codigo.getStrProperty(), codigo.getStrValue());
			Integer codigoProduto = Integer
					.valueOf(getPropertyObject(codigo.getStrProperty(), codigo.getStrValue(), "innerText").trim());

			waintPresenceOfElementLocated(codigoDeBarras.getStrProperty(), codigoDeBarras.getStrValue());
			triggerEndKey();
			MoveToElementPage(codigoDeBarras.getStrProperty(), codigoDeBarras.getStrValue());
			String codigoDeBarrasProduto = getPropertyObject(codigoDeBarras.getStrProperty(),
					codigoDeBarras.getStrValue(), "innerText");

			waintPresenceOfElementLocated(referencia.getStrProperty(), referencia.getStrValue());
			triggerEndKey();
			MoveToElementPage(referencia.getStrProperty(), referencia.getStrValue());

			String referenciaProduto = getPropertyObject(referencia.getStrProperty(), referencia.getStrValue(),
					"innerText").trim();

			waintPresenceOfElementLocated(peso.getStrProperty(), peso.getStrValue());
			MoveToElementPage(peso.getStrProperty(), peso.getStrValue());
			Double pesoProduto = Formatacao.formatarMoedaStringParaDouble(
					getPropertyObject(peso.getStrProperty(), peso.getStrValue(), "innerText").replace("kg", ""));

			waintPresenceOfElementLocated(modelo.getStrProperty(), modelo.getStrValue());
			MoveToElementPage(modelo.getStrProperty(), modelo.getStrValue());
			String modeloProduto = getPropertyObject(modelo.getStrProperty(), modelo.getStrValue(), "innerText");

			ProdutoTO p = new ProdutoTO();

			p.setCodigo(codigoProduto);
			p.setDescricao(descricaoProduto);
			p.setCodigoBarras(codigoDeBarrasProduto);
			p.setReferencia(referenciaProduto);
			p.setPeso(pesoProduto);
			p.setModelo(modeloProduto);
			p.setPreco(precoProduto);

			return p;

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void selecionarOpcaoResumoPedido(OpcoesResumoComprasEnum opcao) {
		try {
			waintPresenceOfElementLocated(opcao.getStrProperty(), opcao.getStrValue());
			MoveToElementPage(opcao.getStrProperty(), opcao.getStrValue());
			clickObject(opcao.getStrProperty(), opcao.getStrValue());

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String obterValorTextoCampo(ResumoCompraEnum campo) {
		try {

			waintPresenceOfElementLocated(campo.getStrProperty(), campo.getStrValue());
			MoveToElementPage(campo.getStrProperty(), campo.getStrValue());
			String valorCampo = getPropertyObject(campo.getStrProperty(), campo.getStrValue(), "innerText");
			return valorCampo;

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void confirmarPedido(OpcoesConfirmacaoResumoCompraEnum opcao) {
		try {

			waintPresenceOfElementLocated(opcao.getStrProperty(), opcao.getStrValue());
			waintElementToBeClickable(opcao.getStrProperty(), opcao.getStrValue());
			clickObject(opcao.getStrProperty(), opcao.getStrValue());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void preencherCampoCEP(String CEP) {
		try {
			ResumoCompraEnum cep = ResumoCompraEnum.CEP;

			waintPresenceOfElementLocated(cep.getStrProperty(), cep.getStrValue());
			MoveToElementPage(cep.getStrProperty(), cep.getStrValue());
			triggerHomeKey();
			setText(cep.getStrProperty(), cep.getStrValue(), CEP);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
