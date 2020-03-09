package br.com.zup.util;

public class Utilitarios {

	public static Boolean VerificaObjetoValido(Object obj) {
		return obj!=null;
	}
	
	
	public static Boolean VerificaObjetoValido(String obj) {
		return obj!=null && obj.length()>0;
	}

}
