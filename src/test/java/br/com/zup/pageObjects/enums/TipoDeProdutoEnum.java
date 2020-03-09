package br.com.zup.pageObjects.enums;

public enum TipoDeProdutoEnum {
	
	
	
	NOTEBOOK(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > svg:nth-child(2)"),
	TELA(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > svg:nth-child(2)"),
	TABLET(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > svg:nth-child(2)"),
	SSD(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > svg:nth-child(2)"),
	PC(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1) > svg:nth-child(2)"),
	MEMORIA(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1) > svg:nth-child(2)"),
	MUSICA(".cssSelector",".card-aggregation-filter > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1) > svg:nth-child(2)");
	
	
	
	private String strProperty;
	private String strValue;
	
	 TipoDeProdutoEnum(String strProperty,String strValue ) {
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
