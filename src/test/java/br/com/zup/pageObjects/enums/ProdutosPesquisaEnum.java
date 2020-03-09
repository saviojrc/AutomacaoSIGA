package br.com.zup.pageObjects.enums;

public enum ProdutosPesquisaEnum {
	
	
	DESCRICAO(".cssSelector","div.ColUI-gjy0oc-0:nth-child(<<i>>) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1)"),
	PRECO(".cssSelector","div.ColUI-gjy0oc-0:nth-child(<<i>>) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > span:nth-child(1)");
	
	
	private String strProperty;
	private String strValue;
	
	
	ProdutosPesquisaEnum(String strProperty,String strValue ) {
		 this.strProperty=strProperty;
		 this.strValue=strValue;
	}
	
	public String getStrProperty() {
		return strProperty;
	}
	
	public String getStrValue() {
		return strValue;
	}
	
	
	public static ProdutosPesquisaEnum obterProdutosPesquisa(ProdutosPesquisaEnum produtoPesquisa, int i) {
		
		
		for(ProdutosPesquisaEnum p : values()) {
			
			if(produtoPesquisa.equals(p)) {
				p.strValue=p.strValue.replace("<<i>>", ""+(i)+"");
				return p;
			}
			
		}
		
		return null;
	}

}
