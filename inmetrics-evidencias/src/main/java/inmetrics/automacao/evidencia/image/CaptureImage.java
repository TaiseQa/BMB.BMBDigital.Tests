package inmetrics.automacao.evidencia.image;

import inmetrics.automacao.evidencia.constant.Constant;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaptureImage {

	private static String pathPrint = Constant.FOLDER_PRINT;
	private static String nameImage;
	private static String dateDay;
	private static File image; 
	private static byte[] screenshot;

	
	public static String  captureImage(WebDriver driver, Scenario scenario) throws IOException {
		dateDay = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS").format(Calendar.getInstance().getTime());
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		scenario.embed(screenshot, "image/png");
		image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		nameImage = pathPrint+ scenario.getName() + "_" + scenario.getStatus() + "_"+ dateDay + ".jpg";
		FileUtils.copyFile(image,
				(new File(nameImage)));
		
		return nameImage;

	}

}
