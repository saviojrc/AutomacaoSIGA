package br.com.zup.pageObjects.enums;

public enum OpcoesServicosEnum {
	
	CONTINUAR(".cssSelector","#btn-continue"),
	SEM_GARANTIA_ESTENDIDA(".cssSelector","#garantia_estendida-1295832381-0");
	
	private String strProperty;
	private String strValue;
	
	OpcoesServicosEnum(String strProperty,String strValue ) {
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
