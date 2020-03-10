package br.com.zup.pageObjects.enums;

public enum SubCategoriasEnum {
	
	NOTEBOOK(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"),
	COMPUTADORES_E_ALL_IN_ONE(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"),
	TABLET_IPAD(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"),
	APPLE(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"),
	SERVIDOR(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)"),
	CHROMEBOOK(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"),
	WORKSTATION(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)");
	
	
	private String strProperty;
	private String strValue;
	
	
	SubCategoriasEnum(String strProperty,String strValue) {
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
