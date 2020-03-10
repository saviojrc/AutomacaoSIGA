package br.com.zup.pageObjects.enums;

public enum FaixaPrecoEnum {
	NENHUM("","",0.00,00.00),
	DE_0_ATE_25(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > svg:nth-child(2)",0.00,25.00),
	DE_25_A_50(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > svg:nth-child(2)",25.00,50.00),
	DE_50_A_100(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > svg:nth-child(2)",50.00,100.00),
	DE_100_HA_250(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > svg:nth-child(2)",100.00,250.00),
	DE_250_HA_500(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1) > svg:nth-child(2)",250.00,500.00),
	DE_500_HA_1000(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1) > svg:nth-child(2)",500.00,1000.00),
	DE_1000_2500(".cssSelector","section.aggregation-block:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1) > svg:nth-child(2)",1000.00,2500.00);
	
	
	private String strProperty;
	private String strValue;
	private Double faixaPrecoInicial;
	private Double faixaPrecoFinal;
	
	
	FaixaPrecoEnum(String strProperty, String strValue,Double faixaPrecoInicial, Double faixaPrecoFinal) {
		this.strProperty=strProperty;
		this.strValue=strValue;
		this.faixaPrecoInicial=faixaPrecoInicial;
		this.faixaPrecoFinal=faixaPrecoFinal;
	}
	
	
	
	public Double getFaixaPrecoFinal() {
		return faixaPrecoFinal;
	}
	
	public Double getFaixaPrecoInicial() {
		return faixaPrecoInicial;
	}
	
	
	public String getStrProperty() {
		return strProperty;
	}
	
	public String getStrValue() {
		return strValue;
	}
	
	
	public static FaixaPrecoEnum obterFaixaPreco(Double valorProduto) {
		
		
		for(FaixaPrecoEnum faixa : values()) {
			if(validarFaixaPreco(valorProduto, faixa) ) {
				return faixa;
			}
		}
		
		return NENHUM;
		
	}



	private static Boolean validarFaixaPreco(Double valorProduto, FaixaPrecoEnum faixa) {
		return valorProduto>=faixa.getFaixaPrecoInicial() && valorProduto<=faixa.getFaixaPrecoFinal();
	}



	
	

}
