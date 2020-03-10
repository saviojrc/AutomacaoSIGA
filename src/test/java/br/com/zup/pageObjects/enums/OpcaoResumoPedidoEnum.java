package br.com.zup.pageObjects.enums;

public enum OpcaoResumoPedidoEnum {
	
	CONTINUAR(".cssSelector","button.summary-buyBtn:nth-child(4)"),
	QUANTIDADE(".cssSelector",".form-control");
	
	
	private String strProperty;
	private String strValue;
	
	private OpcaoResumoPedidoEnum(String strProperty,String strValue ) {
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
