package br.com.zup.pageObjects.enums;

public enum OpcoesCategoriasEnum {
	
	VER_TODOS(".cssSelector","#collapse-categorias > button:nth-child(3)"),
	OCULTAR(".cssSelector","#collapse-categorias > button:nth-child(3)");
	
	private String strProperty;
	private String strValue;
	
	OpcoesCategoriasEnum(String strProperty,String strValue ) {
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
