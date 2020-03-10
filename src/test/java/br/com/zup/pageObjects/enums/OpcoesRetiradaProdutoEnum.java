package br.com.zup.pageObjects.enums;

public enum OpcoesRetiradaProdutoEnum {
	
	RECEBER_EM_10_DIAS_UTEIS(".cssSelector","li.radio:nth-child(1) > label:nth-child(2)"),
	RECEBER_EM_11_DIAS_UTEIS(".cssSelector","li.radio:nth-child(2) > label:nth-child(2)"),
	RETIRAR_NA_LOJA_EM_10_DIAS_UTEIS(".cssSelector","li.radio:nth-child(3) > label:nth-child(2)");
	
	private String strProperty;
	private String strValue;
	
	OpcoesRetiradaProdutoEnum(String strProperty,String strValue ) {
		 this.strProperty=strProperty;
		 this.strValue=strValue;
	}
	 
	 public String getStrProperty() {
		return strProperty;
	}
	 
	 public String getStrValue() {
		return strValue;
	}

}
