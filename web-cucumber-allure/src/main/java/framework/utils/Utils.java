package framework.utils;

import org.openqa.selenium.WebDriver;
import inmetrics.automacao.core.web.enumeradores.Navegador;
import inmetrics.automacao.core.web.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.List;
import java.util.Map;

public class Utils {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			//driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME, "chromedriver-1.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1400,800");
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			driver = new ChromeDriver(options);
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}
}
