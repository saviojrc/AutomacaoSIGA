package br.com.zup.pageObjects.enums;

public enum FiltroPrecoEnum {
	
	MENORES_PRECOS(0,"Menores Preços"),
	MAIORES_PRECOS(1,"Maiores Preços"),
	MAIS_RELEVANTES(2,"Mais Relevantes"),
	MAIS_VENDIDOS(3,"Mais Vendidos"),
	MELHOR_AVALIADOS(4,"Melhor Avaliados");
	
	
	private Integer indice;
	private String descricao;
	
	
	private FiltroPrecoEnum(Integer indice, String descricao) {
		this.indice=indice;
		this.descricao=descricao;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getIndice() {
		return indice;
	}
	
	

}
