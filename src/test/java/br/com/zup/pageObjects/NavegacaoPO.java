package br.com.zup.pageObjects;

import br.com.zup.pages.framework.Tela;

public class NavegacaoPO extends Tela {

	public static void navegatePage(String url) {

		try {
			getDriver().navigate().to(url);
			getDriver().manage().window().maximize();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public static void closeBrowser() {

		try {

			
			getDriver().quit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}
}
