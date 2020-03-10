package br.com.zup.util;

import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Formatacao {


	/**
	 * Metodo para arrendodar valores para cima e baixo.
	 * 
	 * @param valor
	 *            1 - Valor a arredondar.
	 * @param casas
	 *            2 - Quantidade de casas depois da virgula.
	 * @param ceilOrFloor
	 *            3 - Arredondar para cima ou para baixo? Para cima = 0 (ceil)
	 *            Para baixo = 1 ou qualquer outro inteiro (floor)
	 * @return
	 */
	public static Double arredondar(double valor, int casas, int ceilOrFloor) {
		double arredondado = valor;
		arredondado *= (Math.pow(10, casas));
		if (ceilOrFloor == 0) {
			arredondado = Math.ceil(arredondado);
		} else {
			arredondado = Math.floor(arredondado);
		}
		arredondado /= (Math.pow(10, casas));
		return arredondado;
	}

	// M�todo para formatar um valor
	public static String formatarMoeda(double vlr) {
		java.text.DecimalFormat df = new java.text.DecimalFormat("###,###,##0.00");
		return df.format(vlr);
	}

	/**
	 * Retorna o valor String no formato ###,###,##00
	 */
	// M�todo para formatar um valor
	public static String formatarPercentual(double vlr) {
		java.text.DecimalFormat df = new java.text.DecimalFormat("###,###,##00");
		return df.format(vlr);
	}

	// M�todo para formatar um valor
	public static String formatarMoedaInteiro(double vlr) {
		java.text.DecimalFormat df = new java.text.DecimalFormat("###,###,##0");
		return df.format(vlr).trim();
	}

	// M�todo para formatar um valor
	public static String formatarDoubleParaInteiro(double vlr) {

		java.text.DecimalFormat df = new java.text.DecimalFormat("###,###,##");
		return df.format(vlr).trim().replace(".", "");
	}

	
	public static String padLeft(String str, int n) {
		return String.format("%1$" + n + "s", str).replace(' ', '0');
	}

	

	

	public static Double formatarMoedaStringParaDouble(String valor) {

		Double valorDouble = 0.00;
		try {
			valorDouble = DecimalFormat.getNumberInstance().parse(valor.trim()).doubleValue();

			return valorDouble;
		} catch (ParseException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());

		}

	}

	public static Double gerarValoresAleatorios(Double valor) {

		Double numeroGerado = 0.00;
		Double numeroRetornado = 0.00;

		for (Integer i = 0; i < 5; i++) {
			numeroGerado = Math.random() * valor;
			numeroRetornado = (double) Math.round(numeroGerado);

		}

		return numeroRetornado;
	}

	
	
	public static String retirarMascaraCEP(String cep) {
		return cep.trim().replace("-", "");
	}

	public static Integer gerarValoresAleatoriosInteiros() {
		try {

			Random random = new Random();
			Integer x = random.nextInt(1000);

			System.out.println("numero aleat�rio - > " + x);

			return x;
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	

	public static List<?> redimensionarLista(List<?> lista, Integer tamanhoDesejado) {
		try {
			System.out.println("Lista original tem o tamanho igual a : " + " " + lista.size());

			if (lista.size() > 0) {
				System.out.println("Redimensionando lista");
				while (lista.size() != tamanhoDesejado) {
					int i = 0;
					lista.remove(i);
					i++;
				}
				System.out.println("Lista com o tamanho desejado " + "  " + lista.size());
				return lista;

			} else {
				System.out.println("retorna lista original");
				return lista;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	

	

	
	public static Boolean verificarObjetoValido(Object obj) {
		return obj != null;
	}

	public static Boolean verificarListaValida(List<?> lista) {
		return verificarObjetoValido(lista) && lista.size() > 0;
	}

	public static Boolean verificarStringValida(String str) {
		return verificarObjetoValido(str) && !str.isEmpty() && str.length() > 0;
	}
	
	
	public static String gerarID(){
		UUID uuid = UUID.randomUUID();
        return uuid.toString().toUpperCase();
	}
	
	public static  String removeCaracteres(String str){
		
		str = Normalizer.normalize(str, Normalizer.Form.NFD);
		str=str.replaceAll("[^\\p{ASCII}]", "");
		
		return str;
		
		
	}

}
