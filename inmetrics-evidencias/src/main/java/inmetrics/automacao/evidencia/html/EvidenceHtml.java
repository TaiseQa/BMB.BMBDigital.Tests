package inmetrics.automacao.evidencia.html;

import inmetrics.automacao.evidencia.constant.Constant;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EvidenceHtml {

	private ExtentHtmlReporter extentHtmlReporter;
	private  ExtentReports extentReports;
	private  ExtentTest extentTest;
    static String pathPrint = Constant.FOLDER_PRINT;
    private String[] registros;
	private String dateDay = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS").format(Calendar.getInstance().getTime());

	

	public EvidenceHtml() {
		if (extentReports == null) { 
			extentReports = new ExtentReports();
			extentHtmlReporter = new ExtentHtmlReporter(Constant.FOLDER_HTML_EVIDENCE + dateDay + ".html");
			extentReports.attachReporter(extentHtmlReporter); 
		}
	}

	public EvidenceHtml(String caminho) {
		if (extentReports == null) {
			extentReports = new ExtentReports();
			extentHtmlReporter = new ExtentHtmlReporter(caminho.concat("Html") + dateDay + ".html");
			extentReports.attachReporter(extentHtmlReporter);
		}
	}

	/**
	 * Get ExtentTest
	 */
	public ExtentTest getExtentTest() {
		return extentTest;
	}

	public  ExtentReports getExtentReports() {
		return extentReports;
	}

	/**
	 * Método para Inicializar o arquivo html.
	 * 
	 * @param log
	 *            - Mensagem que será inserida no relatório
	 */

	public ExtentTest criarTesteHtml(String scenario) {
		extentTest = extentReports.createTest(scenario);
		return extentTest;
	}

	/**
	 * Método para Inicializar o arquivo html.
	 * 
	 * @param log
	 *            - Mensagem que será inserida no relatório
	 */

	public void createNewHtml() {
		extentReports = new ExtentReports();
		extentHtmlReporter = new ExtentHtmlReporter(Constant.FOLDER_HTML_EVIDENCE + dateDay + ".html");
		extentReports.attachReporter(extentHtmlReporter);
	}

	/**
	 * Método para inserir mensagem no relatório quando validação é realizada com
	 * sucesso.
	 * 
	 * @param log
	 *            - Mensagem que será inserida no relatório
	 */
	public void logInToPassHtml(String log) {
		extentTest.log(Status.PASS, log);
	}

	/**
	 * Método para inserir mensagem no relatório quando validação não é realizada
	 * com sucesso.
	 * 
	 * @param log
	 *            - Mensagem que será inserida no relatório
	 */
	public void logInToFailHtml(String log) {
		extentTest.log(Status.FAIL, log);
	}

	/**
	 * Método para inserir mensagem no relatório.
	 * 
	 * @param log
	 *            - Mensagem que será inserida no relatório
	 */
	public void logInToInfoHtml(String log) {
		extentTest.log(Status.INFO, log);
	}

	/**
	 * Método para adicionar evidência de tela do teste no relatório.
	 * 
	 * @param log
	 *            - Nome do arquivo
	 * @throws IOException
	 */
	public void logInToImageHtml(String log, String nameImage) throws IOException {
		registros = nameImage.split("//");	
		nameImage = "../image/" + registros[3];
		
		extentTest.log(Status.INFO, log,
				MediaEntityBuilder.createScreenCaptureFromPath(nameImage).build());

	}

	/**
	 * Método para adicionar evidência de tela do teste no relatório.
	 * 
	 * @param log
	 *            - Nome do arquivo
	 * @throws IOException
	 */
	public void startHtml() {
		extentReports.flush();
	}
}
