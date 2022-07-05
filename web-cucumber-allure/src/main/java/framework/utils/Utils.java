package framework.utils;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;


public class Utils {

    private static WebDriver driver;
    public static WebDriverWait wait;

    private Utils() {

    }

    @SneakyThrows
    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            DriverService.Builder<ChromeDriverService, ChromeDriverService.Builder> serviceBuilder = new ChromeDriverService.Builder();
            ChromeDriverService chromeDriverSerive = serviceBuilder.build();
            chromeDriverSerive.sendOutputTo(new FileOutputStream("target/chromedriver_log.txt", true));

            prefs.put("profile.default_content_setting_values.geolocation", 2);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--log-level=3");
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1400,800");
            java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
            options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            driver = new ChromeDriver(chromeDriverSerive, options);
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
