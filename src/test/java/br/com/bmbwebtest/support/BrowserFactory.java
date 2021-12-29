package br.com.bmbwebtest.support;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
	
	public static enum Browser{
		CHROME,
		FIREFOX,
		CHROME_HEADLESS,
		FIREFOX_HEADLESS
	}
	
	public static WebDriver GetBrowser() throws IOException {
		return GetBrowser(Browser.CHROME);
	}
	
	public static WebDriver GetBrowser(Browser _browserUsed) throws IOException {
		WebDriver resultBrowser;
		
		 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver",  "src\\test\\resources\\webdrivers\\geckodriver.exe");
		
		switch (_browserUsed) {
			case CHROME:
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
				chromeOptions.addArguments("--incognito");
				chromeOptions.addArguments("window-size=1024x768");
				resultBrowser = new ChromeDriver(chromeOptions);
//				resultBrowser.manage().window().maximize();
				break;
			case FIREFOX:
				resultBrowser = new FirefoxDriver();
//				resultBrowser.manage().window().maximize();
				break;
			case CHROME_HEADLESS:
				ChromeOptions optionsheadles = new ChromeOptions();
				optionsheadles.addArguments("--headless");
				optionsheadles.addArguments("--disable-gpu");
				optionsheadles.addArguments("--no-sandbox");
				optionsheadles.addArguments("--incognito");
				optionsheadles.addArguments("window-size=1024x768");
				optionsheadles.addArguments("--disable-site-isolation-trials");
				resultBrowser = new ChromeDriver(optionsheadles);
				break;
			case FIREFOX_HEADLESS:
				FirefoxOptions firefoxOptions = new FirefoxOptions();
		        firefoxOptions.addArguments("--headless");
		        firefoxOptions.addArguments("--window-size=1024x768");
		        resultBrowser = new FirefoxDriver(firefoxOptions);
				break;
			default:
				resultBrowser = null;
				new Exception("Navegador não encontrado!!!");
		}
		SelectEnvironment xUrl = new SelectEnvironment();
		resultBrowser.get(xUrl.GetBaseUrl());
		resultBrowser.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		return resultBrowser;
	}
}
