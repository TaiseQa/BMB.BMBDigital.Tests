package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Utils {

    private static WebDriver driver;

    private Utils() {

    }

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
            driver.quit();
            driver = null;
    }
}
