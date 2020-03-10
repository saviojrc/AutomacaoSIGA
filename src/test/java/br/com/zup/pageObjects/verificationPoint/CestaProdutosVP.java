package br.com.zup.pageObjects.verificationPoint;

import br.com.zup.pages.framework.VerificationPoint;

public class CestaProdutosVP extends VerificationPoint {

	public static void validarProdutosInformadosNaCesta(String descricaoProdutoAtual, String descricaoProdutoEsperada,
			String quantidadeAtual, String quantidadeEsperada,Double precoAtual, Double precoEsperado, Double valorTotalAtual, Double valorTotalEsperado, String CEPAtual, String CEPEsperado) {
		try {
			
			
			verificationPointConditionalString(descricaoProdutoAtual, descricaoProdutoEsperada);
			
			verificationPointConditionalString(quantidadeAtual, quantidadeEsperada);
			
			verificationPointConditionalDouble(precoAtual, precoEsperado);
			
			verificationPointConditionalDouble(valorTotalAtual, valorTotalEsperado);
			verificationPointConditionalString(CEPAtual, CEPEsperado);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
