package br.com.zup.pageObjects.enums;

public enum OpcoesTipoProdutoEnum {
	
	VER_TODOS(".cssSelector",".card-aggregation-filter > section:nth-child(1) > button:nth-child(3)"),
	OCULTAR(".cssSelector","#icon-close > path:nth-child(1)");
	
	private String strProperty;
	private String strValue;
	
	OpcoesTipoProdutoEnum(String strProperty,String strValue ) {
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
