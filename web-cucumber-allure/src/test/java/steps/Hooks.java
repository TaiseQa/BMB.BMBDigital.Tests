package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import framework.utils.Utils;
import inmetrics.automacao.evidencia.html.EvidenceHtml;
import inmetrics.automacao.evidencia.pdf.EvidencePdf;
import inmetrics.automacao.evidencia.doc.EvidenceDoc;
import inmetrics.automacao.evidencia.video.EvidenceVideo;

public class Hooks {

	private static WebDriver driver;
	private EvidenceDoc capaturarEvidencia;
	private EvidenceHtml evidenciaHtml;
	private EvidencePdf evidenciaPDF;
	private EvidenceVideo movie;
	private String log;
	private String infoImage;


	@Before
	public void beforeAllTest(Scenario scenario) throws IOException, AWTException {
		driver = Utils.getDriver();
//		FolderStructure.createFolderStructureEvidence();
//		capaturarEvidencia = new EvidenceDoc();
//		evidenciaHtml = new EvidenceHtml();
//		evidenciaPDF = new EvidencePdf();
//
//
//		evidenciaHtml.criarTesteHtml(scenario.getName());
//		Log.DefinirLocalAquivoLog();
//		movie = new EvidenceVideo();
//		movie.start();
	}

	@After
	public void afterAllTest(Scenario scenario) throws Exception {
		//log = scenario.getStatus().toString();

//		evidenciaHtml.logInToFailHtml("Cenário \"" + scenario.getName() + "\" " + scenario.getStatus());
//			infoImage = capaturarEvidencia.captureInfo("Cenário \"" + scenario.getName() + "\" " + scenario.getStatus(),
//					driver, scenario);
		
//		if (scenario.isFailed()) {
//			evidenciaHtml.logInToFailHtml("Cenário \"" + scenario.getName() + "\" " + scenario.getStatus());
//			infoImage = capaturarEvidencia.captureInfo("Cenário \"" + scenario.getName() + "\" " + scenario.getStatus(),
//					driver, scenario);
		
//		}
//		else {
//			evidenciaHtml.logInToPassHtml("Cenário \"" + scenario.getName() + "\" executado com sucesso.");
//			infoImage = capaturarEvidencia.captureInfo("Cenário \"" + scenario.getName() + "\" executado com sucesso.",
//					Utils.getDriver(), scenario);
//		}
		
//		evidenciaHtml.logInToImageHtml(log, infoImage);
//		evidenciaPDF.GravarPDF();
//		evidenciaHtml.startHtml();
//		movie.stop();
		Utils.killDriver();
	}

}
