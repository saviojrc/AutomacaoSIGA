package br.com.zup.pageObjects.enums;

public enum OpcoesResumoComprasEnum {
	
	
	CONFIRMAR_CEP_OK(".id","freight-field-button"),
	COMPRAR(".id","btn-buy"),
	MAIS_INFORMACOES(".linkText","mais informações");
	
	
	private String strProperty;
	private String strValue; 
	
	
	OpcoesResumoComprasEnum(String strProperty,String strValue) {
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
