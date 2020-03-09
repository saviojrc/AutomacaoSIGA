package br.com.zup.pageObjects.enums;

public enum CategoriasProdutosEnum {
	
	
	INFORMATICA_E_ACESSORIOS(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"),
	MALAS_MOCHILAS_MOCHILAS_ACESSORIOS(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"),
	PC_GAMER(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"),
	INFORMATICA(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"),
	MOVEIS(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)"),
	MUSICA(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"),
	PAPELARIA(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)"),
	MODA(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(8) > a:nth-child(1)"),
	LIVROS(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(9) > a:nth-child(1)"),
	BRINQUEDOS(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)"),
	CELULARES_SMARTPHONES(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"),
	CAMERAS_FILMADORAS(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"),
	TV_E_HOME_THEATHER(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"),
	AUTOMOTIVO(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"),
	CASA_E_CONSTRUCAO(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)"),
	ESPORTE_E_LAZER(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"),
	AUDIO(".cssSelector","#collapse- > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)"),
	NOTEBOOK(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"),
	COMPUTADORES_E_ALL_IN_ONE(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"),
	TABLET_IPAD(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"),
	APPLE(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"),
	SERVIDOR(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)"),
	CHROMEBOOK(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)"),
	WORKSTATION(".cssSelector","#collapse-categorias > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)");
	
	
	
	private String strProperty;
	private String strValue;
	
	 CategoriasProdutosEnum(String strProperty,String strValue ) {
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
