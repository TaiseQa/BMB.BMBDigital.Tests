package br.com.bmbwebtest.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.bmbwebtest.support.BrowserFactory;
import cucumber.api.Scenario;

public abstract class PageObjectUtils {

	public static final String BuscaTextoPage = null;
	public static WebDriver driver;
	public static Scenario cenario;
	WebDriver webDriver;
	public WebDriverWait wait;
	@SuppressWarnings("unused")
	private Actions action;
	@SuppressWarnings("unused")
	private Random random = new Random();
	
	public void uploadArquivoCssSelector(String ScelectoCss, String path) throws Exception {
		By upload = By.cssSelector(ScelectoCss);
		SleepPage(5000);		
		driver.findElement(upload).click();
		SleepPage(2000);
		File file = new File(path);
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		clipboard.getData(DataFlavor.stringFlavor);
		Robot robot = new Robot();
		robot.delay(10000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot = null;
		clipboard = null;
		SleepPage(500);
	}
	
	public void uploadArquivoXpath(String ScelectoCss, String CaminhoArq) throws Exception {
		By upload = By.xpath(ScelectoCss);
		SleepPage(5000);		
		driver.findElement(upload).click();
		SleepPage(500);
		driver.findElement(upload).sendKeys(CaminhoArq);
	}
	
	public void ReloadPage() {
		driver.navigate().refresh();
	}
	
	public void redimencionaPage(int x, int y) {
		driver.manage().window().setSize(new Dimension(x, y));
	}
	
	// Metodos usados ​​no projeto	
	public static void SleepPage(int time_) throws Exception {
		Thread.sleep(time_);
	}

	public void BasePage(WebDriver _driver) {
		driver = _driver;
		action = new Actions(driver);
	}

	public static void OpenBrowse() throws IOException {
		if (driver != null)
			return;
		driver = BrowserFactory.GetBrowser();
	}

	public static void CloseBrowse() throws Throwable {
		if (driver == null)
			return;
		driver.quit();
		driver = null;
	}

	public void SendTextCssScelector(String ScelectoCss, String text_) throws Throwable {
		SleepPage(500);
		By inputScelectoCss = By.cssSelector(ScelectoCss);
		driver.findElement(inputScelectoCss).clear();
		driver.findElement(inputScelectoCss).sendKeys(text_);
	}
	
	public void EnterCssScelector(String ScelectoCss) throws Throwable {
		SleepPage(500);
		driver.findElement(By.cssSelector(ScelectoCss)).sendKeys(Keys.ENTER);
		return;
	}
	
	public String GetTextCssScelector(String ScelectoCss) throws Throwable {
		SleepPage(500);
		return driver.findElement(By.cssSelector(ScelectoCss)).getText();
	}
	
	public void GetTextXpathScelector(String ScelectoXpat) throws Throwable {
		SleepPage(500);
		driver.findElement(By.xpath(ScelectoXpat)).getText();
		return;
	}
	
	public void SelectXpathScelector(String ScelectoXpat, String text_) throws Throwable {
		SleepPage(500);
		driver.findElement(By.xpath(ScelectoXpat)).sendKeys(text_);
		return;
	}
	
	public void SelectScelector(String ScelectoCss, String text_) throws Throwable {
		SleepPage(500);
		Select select = new Select(driver.findElement(By.cssSelector(ScelectoCss)));
		select.selectByVisibleText(text_);
		return;
	}
	
	public void EnterXpathScelector(String ScelectoXpat) throws Throwable {
		SleepPage(500);
		driver.findElement(By.xpath(ScelectoXpat)).sendKeys(Keys.ENTER);
		return;
	}
	
	public void SendTextXpathScelector(String ScelectoCss, String text_) throws Throwable {
		SleepPage(500);
		By inputScelectoCss = By.xpath(ScelectoCss);
		driver.findElement(inputScelectoCss).sendKeys(Keys.chord(Keys.COMMAND, "a"), text_);
	}

	public void ClickCssScelector(String ScelectoCss) throws Throwable {
		SleepPage(500);
		driver.findElement(By.cssSelector(ScelectoCss)).click();
		return;
	}

	public void ClickXpathScelecto(String btXpathPropostasContratos) throws Exception {
		SleepPage(500);
		driver.findElement(By.xpath(btXpathPropostasContratos)).click();
		return;
	}

	public void HoverCssScelector(String ScelectoCss) throws Exception {
		SleepPage(500);
		WebElement HoverScelecto = driver.findElement(By.cssSelector(ScelectoCss));
		Actions actions = new Actions(driver);
		actions.moveToElement(HoverScelecto).perform();

	}

	public void HoverXpath(String btHoverxpathPropostasContratos) throws Exception {
		SleepPage(500);
		WebElement HoverScelecto = driver.findElement(By.xpath(btHoverxpathPropostasContratos));
		Actions actions = new Actions(driver);
		actions.moveToElement(HoverScelecto).perform();

	}
	
	public void ClickAngularCssSelector(String ScelectoCss) throws Exception {
		SleepPage(1000);
		WebElement element = driver.findElement(By.cssSelector(ScelectoCss));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void ClickAngularScelectoXpath(String ScelectoXpath) throws Exception {
		SleepPage(1000);
		WebElement element = driver.findElement(By.xpath(ScelectoXpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void EsperaElementoClicavel(By elementClickable) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(elementClickable));
	}
	
	public void EsperaXpathClicavel(String elementClickable) throws Exception {
		SleepPage(1000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(By.xpath(elementClickable)); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static String BuscaTextoPage(String _text) throws Throwable {
		SleepPage(1000);
		String message = driver.findElement(By.cssSelector("body")).getText();
		assert (message.contains(_text));
		return message;
	}

	public static void ScreenshotBmb() throws Exception {
		SleepPage(1000);
		try {
			byte[] scrennshot = ((TakesScreenshot) PageObjectUtils.driver).getScreenshotAs(OutputType.BYTES);
			cenario.embed(scrennshot, "image/png");
			cenario.write("URL Screenshot" + PageObjectUtils.driver.getCurrentUrl());
		} catch (WebDriverException wde) {
			cenario.write("Embed Screenshot" + wde.getMessage());
		} catch (ClassCastException cce) {
			cce.printStackTrace();
		}
		SleepPage(500);
	}

	// Metodos usados ​​no projeto
}
