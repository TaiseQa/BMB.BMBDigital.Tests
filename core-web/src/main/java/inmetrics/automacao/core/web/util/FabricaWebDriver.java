package inmetrics.automacao.core.web.util;

import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import inmetrics.automacao.core.web.enumeradores.Navegador;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FabricaWebDriver {
	
	static WebDriver driver;
	
	/**
	 * Método responsável pela criação da instância webdriver que fara acesso ao navegador
	 * 
	 * @param navegador - Enumerador indicador de qual navegador será utilizado no teste
	 * @param pathWebDriver - Caminho para o webdriver
	 * @return WebDrive - Objeto responsável para interação com telas web
	 */
	public static WebDriver CriarWebDriver(Navegador navegador, String pathWebDriver) {
		
		try {
			
			PageLoadStrategy pageLoadStrategy = PageLoadStrategy.NORMAL;
			
			switch (navegador) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver", pathWebDriver);
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new ChromeDriver(chromeOptions);
				break;
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", pathWebDriver);
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new FirefoxDriver(firefoxOptions);
				break;
			case INTERNETEXPLORER:
				System.setProperty("webdriver.ie.driver", pathWebDriver);
				InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
				internetExplorerOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new InternetExplorerDriver(internetExplorerOptions);
				break;
			default:
				Assert.fail("Não foi possível iniciar o WebDriver do navegador " + navegador.toString());
				break;
			}
			
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
		
		return driver;
	}
	
	
	
	/**
	 * Método responsável pela criação da instância webdriver que fara acesso ao navegador sem passa o path do driver.
	 * 
	 * @param navegador - Enumerador indicador de qual navegador será utilizado no teste
	 * @return WebDrive - Objeto responsável para interação com telas web
	 */
	public static WebDriver CriarWebDriver(Navegador navegador) {
		
		try {
			
			PageLoadStrategy pageLoadStrategy = PageLoadStrategy.NORMAL;
			
			switch (navegador) {
			case CHROME:
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new ChromeDriver(chromeOptions);
				break;
			case FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new FirefoxDriver(firefoxOptions);
				break;
			case INTERNETEXPLORER:
				WebDriverManager.iedriver().setup();
				InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
				internetExplorerOptions.setPageLoadStrategy(pageLoadStrategy);
				driver = new InternetExplorerDriver(internetExplorerOptions);
				break;
			default:
				Assert.fail("Não foi possível iniciar o WebDriver do navegador " + navegador.toString());
				break;
			}
			
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
		
		return driver;
	}

}
