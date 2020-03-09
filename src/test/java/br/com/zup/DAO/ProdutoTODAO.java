package br.com.zup.DAO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.TO.ProdutoTO;

public class ProdutoTODAO {
	
	
	
	public ProdutoTO obterProdutoMenorValor(List<ProdutoTO> produtos) {
		
		try {
			ProdutoTO produtoMenorValor = produtos.stream().sorted( (p1,p2) -> p1.getPreco().compareTo(p2.getPreco()) ).collect(Collectors.toList()).get(0);
			
			return produtoMenorValor;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
