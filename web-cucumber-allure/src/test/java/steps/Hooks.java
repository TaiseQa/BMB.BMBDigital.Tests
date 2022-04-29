package steps;

import framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void beforeAllTest(Scenario scenario) {
        driver = Utils.getDriver();

    }

    @AfterStep
    public void printCadaPasso(Scenario scenario) {
        takeScreeShot(scenario, "print de cada passo.png");
    }

    @After
    public void afterAllTest(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreeShot(scenario, "print da falha.png");
        }

        Utils.killDriver();
    }

    public void takeScreeShot(Scenario scenario, String name) {
        TakesScreenshot screenshot = (TakesScreenshot) Utils.getDriver();
        byte[] data = screenshot.getScreenshotAs(OutputType.BYTES);
        scenario.embed(data, "image/png", name);
    }

}