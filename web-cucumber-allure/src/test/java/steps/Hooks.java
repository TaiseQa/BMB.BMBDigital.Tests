package steps;

import framework.utils.Utils;
import inmetrics.automacao.evidencia.doc.EvidenceDoc;
import inmetrics.automacao.evidencia.html.EvidenceHtml;
import inmetrics.automacao.evidencia.pdf.EvidencePdf;
import inmetrics.automacao.evidencia.video.EvidenceVideo;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

public class Hooks {

    private static WebDriver driver;
    private EvidenceDoc capaturarEvidencia;
    private EvidenceHtml evidenciaHtml;
    private EvidencePdf evidencePdf;
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

    @AfterStep
    public void printCadaPasso(Scenario scenario){
        takeScreeShot(scenario,"print de cada passo.png");
    }

    @After
    public void afterAllTest(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            takeScreeShot(scenario,"print da falha.png");
        }
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

    public void takeScreeShot(Scenario scenario, String name) {
        TakesScreenshot screenshot = (TakesScreenshot) Utils.getDriver();
        byte[] data = screenshot.getScreenshotAs(OutputType.BYTES);
        scenario.embed(data, "image/png", name);
    }

}
