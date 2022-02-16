package inmetrics.automacao.evidencia.doc;

import inmetrics.automacao.evidencia.image.CaptureImage;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;

public class EvidenceDoc extends CaptureImage {

	private ArrayList<String> prints;
	private ArrayList<String> texts;
	private String image;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public EvidenceDoc() {
		this.prints = new ArrayList();
		this.texts = new ArrayList();
	}

	public String captureInfo(String txt, WebDriver driver, Scenario scenario) throws IOException {
		image = captureImage(driver, scenario);
		prints.add(image);
		texts.add(txt);
		
		return image;
	}

	public void createReportDoc(String nameEvidence) throws Exception {

		@SuppressWarnings("unused")
		Doc report = new Doc(prints, texts, nameEvidence);
	}  
}
