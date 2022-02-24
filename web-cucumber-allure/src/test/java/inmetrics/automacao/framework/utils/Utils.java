package inmetrics.automacao.framework.utils;

import org.openqa.selenium.WebDriver;
import inmetrics.automacao.core.web.enumeradores.Navegador;
import inmetrics.automacao.core.web.util.*;

import java.util.List;
import java.util.Map;

public class Utils {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME); 
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
