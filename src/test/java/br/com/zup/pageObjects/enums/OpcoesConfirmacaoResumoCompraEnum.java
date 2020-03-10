package br.com.zup.pageObjects.enums;

public enum OpcoesConfirmacaoResumoCompraEnum {

	NAO_ALTERAR(".cssSelector",
			"body > div.ModalUI-sc-1393p9h-0.fRRTft.ViewUI-sc-1ijittn-6.iXIDWU > div > div > div.Content-sc-1393p9h-7.jlCTMD.ViewUI-sc-1ijittn-6.iXIDWU > div:nth-child(3) > div > div:nth-child(1) > button"),
	SIM_CONTINUAR(".cssSelector",
			"body > div.ModalUI-sc-1393p9h-0.fRRTft.ViewUI-sc-1ijittn-6.iXIDWU > div > div > div.Content-sc-1393p9h-7.jlCTMD.ViewUI-sc-1ijittn-6.iXIDWU > div:nth-child(3) > div > div:nth-child(2) > div > a");

	private String strProperty;
	private String strValue;

	private OpcoesConfirmacaoResumoCompraEnum(String strProperty, String strValue) {
		this.strProperty = strProperty;
		this.strValue = strValue;
	}

	public String getStrProperty() {
		return strProperty;
	}

	public String getStrValue() {
		return strValue;
	}

}
