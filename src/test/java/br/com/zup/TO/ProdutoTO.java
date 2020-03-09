package br.com.zup.TO;

import java.io.Serializable;
import java.util.Comparator;

public class ProdutoTO implements Comparable<ProdutoTO>,Comparator<ProdutoTO>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private Integer codigo;
	private String descricao;
	private String codigoBarras;
	private String referencia;
	private Double peso;
	private String modelo;
	private Double preco;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	@Override
	public int compareTo(ProdutoTO o) {
		if(this.codigo>o.codigo) {
			return 1;
		}else if(this.codigo<o.codigo) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoTO other = (ProdutoTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}
	
	
	@Override
	public int compare(ProdutoTO o1, ProdutoTO o2) {
		if(o1.getPreco()>o2.getPreco()) {
			return 1;
		}else if(o1.getPreco()<o2.getPreco()) {
			return -1;
		}else {
			return 0;
		} 
	}
	
	
	
	
	
	
	
	

}
