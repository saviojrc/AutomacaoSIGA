package br.com.zup.pageObjects.enums;

public enum BuscaPOEnum {
	
	CAMPO_BUSCA(".id", "h_search-input"),
	BUSCAR_ITENS(".id", "h_search-btn");
	
	
	private String strProperty;
	private String strValue;
	
	
	BuscaPOEnum( String strProperty, String strValue) {
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
