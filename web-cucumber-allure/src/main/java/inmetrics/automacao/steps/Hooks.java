package inmetrics.automacao.steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import Inmetrics.Automacao.logger.Log;
import inmetrics.automacao.framework.utils.Utils;
import inmetrics.automacao.evidencia.html.EvidenceHtml;
import inmetrics.automacao.evidencia.pdf.EvidencePdf;
import inmetrics.automacao.evidencia.doc.EvidenceDoc;
import inmetrics.automacao.evidencia.structure.FolderStructure;
import inmetrics.automacao.evidencia.video.EvidenceVideo;

public class Hooks {

	private static final WebDriver driver = Utils.getDriver();
	private EvidenceDoc capaturarEvidencia;
	private EvidenceHtml evidenciaHtml;
	private EvidencePdf evidenciaPDF;
	private EvidenceVideo movie;
	private String log;
	private String infoImage;


	@Before
	public void setUp(Scenario scenario) throws IOException, AWTException {

		FolderStructure.createFolderStructureEvidence();
		capaturarEvidencia = new EvidenceDoc();
		evidenciaHtml = new EvidenceHtml();
		evidenciaPDF = new EvidencePdf();
		

		evidenciaHtml.criarTesteHtml(scenario.getName());
		Log.DefinirLocalAquivoLog();
		movie = new EvidenceVideo();
		movie.start();
	}

	@After
	public void afterScenario(Scenario scenario) throws Exception {
		log = scenario.getStatus().toString();
		
		if (scenario.isFailed()) {	
			evidenciaHtml.logInToFailHtml("Cenário \"" + scenario.getName() + "\" executado  com falhas.");
			infoImage = capaturarEvidencia.captureInfo("Cenário \"" + scenario.getName() + "\" executado falhas.",
					driver, scenario);
		
		} else {
			evidenciaHtml.logInToPassHtml("Cenário \"" + scenario.getName() + "\" executado com sucesso.");
			infoImage = capaturarEvidencia.captureInfo("Cenário \"" + scenario.getName() + "\" executado com sucesso.",
					driver, scenario);
		}
		
		evidenciaHtml.logInToImageHtml(log, infoImage);
		evidenciaPDF.GravarPDF();
		evidenciaHtml.startHtml();
		movie.stop();
		Utils.killDriver();
	}

}
