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
			driver.quit();
			driver = null;
		}
	}

	public static String getValorFormulario(String campoFormulario, List<Map<String, String>> formulario) {
		return formulario.stream().filter(campo -> campo.get("Campo").equals(campoFormulario)).findFirst().get()
				.get("Valor");
	}


}
