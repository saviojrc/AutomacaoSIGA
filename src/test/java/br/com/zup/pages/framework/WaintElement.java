package br.com.zup.pages.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.zup.pageObjects.enums.TipoDeElementoByEnum;
import br.com.zup.util.Utilitarios;

public class WaintElement {

	private static WebDriver driver = getDriver();
	private static Integer TIME_OUT = 10;
	private static JavascriptExecutor JS = ((JavascriptExecutor) driver);

	public void waintPresenceOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public static void sleep(int segundos) {
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void waintElementToBeClickable(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.elementToBeClickable(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void waintVisibilityOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void implicitlyWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public void waintElementisEnable(String strProperty, String strValue) {
		By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
		WebElement objhtmlWebElement = getWebElement(by);

		if (Utilitarios.VerificaObjetoValido(objhtmlWebElement)) {
			do {
				implicitlyWait(1);
			} while (!objhtmlWebElement.isEnabled());
		}

	}

	public WebElement getWebElement(By by) {
		WebElement objhtmlWebElement = getDriver().findElement(by);
		return objhtmlWebElement;
	}

	public static JavascriptExecutor getJS() {
		return JS;
	}

	public static synchronized WebDriver getDriver() {

		try {
			
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
			
			if (driver == null) {
				driver = new FirefoxDriver();
			}

			return driver;

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}
	
	

}
