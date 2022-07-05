package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Utils {

    private static WebDriver driver;
    public static WebDriverWait wait;

    private Utils() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            System.setProperty("webdriver.chrome.silentOutput", "true");
            prefs.put("profile.default_content_setting_values.geolocation", 2);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1400,800");
            options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 60);

        }
        return driver;
    }

    public static void killDriver() {
        driver.quit();
        driver = null;
    }
}
