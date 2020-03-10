package br.com.zup.pageObjects.verificationPoint;

import br.com.zup.TO.ProdutoTO;
import br.com.zup.pageObjects.enums.FaixaPrecoEnum;
import br.com.zup.pages.framework.VerificationPoint;
import br.com.zup.util.Formatacao;
import br.com.zup.util.Utilitarios;

public class ResumoPedidoVP extends VerificationPoint {

	public static void verificarResumoPedido(ProdutoTO produtoMaisBarato, ProdutoTO produtoASerComprado,
			FaixaPrecoEnum faixaPrecoListagemProdutos, FaixaPrecoEnum faixaDePrecoSelecionada) {
		verificationPointConditionalString(produtoMaisBarato.getDescricao(),
				produtoASerComprado.getDescricao());
		verificationPointConditionalDouble(produtoMaisBarato.getPreco(),
				produtoASerComprado.getPreco());
		verificationPointConditional(true,
				faixaPrecoListagemProdutos.equals(faixaDePrecoSelecionada));
	}
	
	
	public static void verificarCEPSelecionado(String CEPAtual, String CEPSelecionado) {
		
		CEPAtual = Utilitarios.VerificaObjetoValido(CEPAtual) ? Formatacao.retirarMascaraCEP(CEPAtual).trim() : "";
		CEPSelecionado = Utilitarios.VerificaObjetoValido(CEPSelecionado) ? Formatacao.retirarMascaraCEP(CEPSelecionado).trim() : "";
		
		verificationPointConditionalString(CEPAtual, CEPSelecionado);
				
	}

}
