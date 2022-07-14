package steps;

import framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.*;

public class Hooks {

    WebDriver driver;

    @Before
    public void beforeAllTest() {
        iniciarNavegador();

    }

    @AfterStep
    public void printCadaPasso(Scenario scenario) {
        String scn = String.valueOf(scenario.getStatus());
        if (scn.equals("PASSED")){
            takeScreeShot(scenario, "print de cada passo.png");
        }
    }

    @After
    public void afterAllTest(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreeShot(scenario, "print da falha.png");
        }

        fecharNavegador();
    }

    public void takeScreeShot(Scenario scenario, String name) {
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        byte[] data = screenshot.getScreenshotAs(OutputType.BYTES);
        scenario.embed(data, "image/png", name);
    }

}