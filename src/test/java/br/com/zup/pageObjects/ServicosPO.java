package br.com.zup.pageObjects;

import br.com.zup.pageObjects.enums.OpcoesServicosEnum;
import br.com.zup.pages.framework.Tela;

public class ServicosPO extends Tela {
	
	
	
	public void selecionarOpcaoServico(OpcoesServicosEnum opcao) {
		try {
			
			waintPresenceOfElementLocated(opcao.getStrProperty(), opcao.getStrValue());
			MoveToElementPage(opcao.getStrProperty(), opcao.getStrValue());
			clickObject(opcao.getStrProperty(), opcao.getStrValue());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
