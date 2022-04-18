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
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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
			WindowsProcessKiller pKiller = new WindowsProcessKiller();

			String processName = "chromedriver.exe";
			boolean isRunning = pKiller.isProcessRunning(processName);

			System.out.println("o " + processName + " está rodando: " + isRunning);

			if (isRunning) {
				pKiller.killProcess(processName);
			} else {
				System.out.println("O processo não foi encontrado: " + processName);
			}
		}
	}
}
