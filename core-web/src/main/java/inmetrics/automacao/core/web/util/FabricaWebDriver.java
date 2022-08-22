package inmetrics.automacao.core.web.util;

import lombok.SneakyThrows;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import inmetrics.automacao.core.web.enumeradores.Navegador;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class FabricaWebDriver {
	
	private static WebDriver driver;
	public static WebDriverWait wait;

	static Logger log = Logger.getLogger(FabricaWebDriver.class);
	public static WebDriver getDriver(){
		return driver;
	}
	
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

	@SneakyThrows
	public static void iniciarNavegador(){
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<>();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			DriverService.Builder<ChromeDriverService, ChromeDriverService.Builder> serviceBuilder = new ChromeDriverService.Builder();
			ChromeDriverService chromeDriverSerive = serviceBuilder.build();
			chromeDriverSerive.sendOutputTo(new FileOutputStream("target/chromedriver_log.txt", true));
			prefs.put("profile.default_content_setting_values.geolocation", 2);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1360,768");
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			driver = new ChromeDriver(chromeDriverSerive, options);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 60);
		}
	}

	public static void fecharNavegador() {
		if (driver != null) {
			driver.quit();
			driver = null;
			log.info("driver finalizado com sucesso");
		} else {
			log.warn("driver não finalizado");
		}
	}

}
