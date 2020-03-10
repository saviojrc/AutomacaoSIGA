package br.com.zup.pageObjects.enums;

public enum CamposCestaProdutosEnum {
	
	
	DESCRICAO_PRODUTO(".cssSelector",".link-default"),
	QUANTIDADE_RESUMO(".cssSelector","li.summary-detail:nth-child(1) > span:nth-child(1)"),
	CEP_RETIRADA(".id","cep"),
	PRECO_RESUMO(".cssSelector",".basket-productPrice"),
	TOTAL(".cssSelector",".summary-total");
	
	private String strProperty;
	private String strValue;
	
	
	private CamposCestaProdutosEnum(String strProperty,String strValue) {
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
