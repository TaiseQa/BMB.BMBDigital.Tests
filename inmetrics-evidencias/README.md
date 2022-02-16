# inmetrics-evidencias

## **Sobre o framework inmetrics-evidencias:**

> Seguindo o pensamento de desacoplamento de projetos referente ao **framework de automação**, seja na plataforma:

1. web
2. mobile
3. api

> Sob a ótica de iniciativas sobre o processo de inovação na inmetrics, alguns profissionais dedicaram seu tempo em criar um framework, que nasce com o objetivo de agilizar na criação de projetos de automações, os mesmos  resolveram ciar projetos desacoplados, referente ao Framework Automação:

* core-web
* core-mobile
* core-api
* inmetrics-logger
* inmetrics-evidencias 

> Referente ao projeto inmetrics-evidencias, ao ser consumido nos Projetos de Automação, terá como resultado as seguintes evidências:

* arquivo .doc: Automation_Evid-nome_do_cenário-data-hora-execução_dos_testes
* arquivo .html: data-hora-ececução_dos_testes
* arquivo .jpg: nome_do_cenaário-status-data-hora-execução_dos_testes
* arquivo .pdf: data-hora_execução_dos_testes
* arquivo .avi: ScreenRecording-data-hora-execução_dos_testes 

> Será criado uma arquitetura de pastas dentro da pasta: "**target**" 
<pre>
evidence
    |_doc
    |_html
    |_image
    |_pdf
    |_video
</pre>

> É importante ressaltar que o colaborador não estará obrigado a realizar todas estas configurações que o framework disponibiliza para a geração de evidências, no entanto, utilizar aquelas configurações que agregam valores em sua entrega.


# Configurações

## **Para utilizar o inmetrics-evidencias**
> [!IMPORTANT]
> **No arquivo pom.xml, adicionar a depedência**:
<pre><b>
&lt;dependency&gt;
    &lt;groupId&gt;Inmetrics.Automacao&lt;/groupId&gt;
    &lt;artifactId&gt;Gestor.Evidencia&lt;/artifactId&gt;
    &lt;version&gt;1.0.0&lt;/version&gt;
&lt;/dependency&gt;
</b></pre>


# Gerando Evidências 
>Após baixar as depedèncias poderá utilizar as classes e os métodos específicos:
1. Gerando Evidência Doc:
- Realizar o importe do pacote:
> import EvidenceDoc;
<pre>
    Criar um objeto referente a classe EvidenceDoc:
    -->  EvidenceDoc capaturarEvidencia = new EvidenceDoc();
    -->  Chamar o método createReportDoc(String nameEvidence));
    Exemplo:
    capaturarEvidencia.createReportDoc(scenario.getName());
</pre>
> Referente ao método **createReportDoc(String nameEvidence)**:
Criará um documento com extenção ".doc", neste documento irá conter a Logo da <font color="yellow">in|</font>metrics, data e hora da execução, nome do cenário de teste executado, o status da execução e o print.<br/>
Nota-se que que ao chamar o método, ele espera uma String como o nome da evidência.

2. Gerando Evidência HTML 
- Realizar o importe do pacote:
> import EvidenceHtml;
<pre>
    1º Criar um objeto referente a classe EvidenceHtml:
    -->  EvidenceHtml evidenciaHtml = newEvidenceHtml();
    -->  Chamar método criarTesteHtml(String scenario);
    Exemplo:
    evidenciaHtml.criarTesteHtml(scenario.getName());
</pre>
> Referente ao método **criarTesteHtml(String scenario)**: O mesmo aguarda uma String do tipo cenário, observe - que no exemplo utilizado foi informado o nome do cenário.
<pre>
    2º Criar um fluxo de decisão 
    -->  Nesse fuxo serão utilizados 05 (cinco) métodos:
        1º logInToFailHtml(String log);
        2º logInToPassHtml(String log);
        3º captureInfo(String txt, WebDriver driver, Scenario scenario)  
        4ª logInToImageHtml(String log, String nameImage);
        5º startHtml();
    --> Será necessário a criação de uma variável do tipo String;

Exemplo:

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
	evidenciaHtml.startHtml();
}
</pre>
> [!IMPORTANT] Referente ao método:<br/>
> Observe que no início do método foi criado uma variável String "log" ao qual está recebendo os status do cenário, que será utilizado no método <b>logInToImageHtml(String log, String nameImage)</b>.<br/>
> Este método espera duas string, onde o exemplo está passando no log -> o status do cenário <br/>
> nameImage -> estamos passando o InfoImage pois de acordo com o exemplo citado, esta variável está recebendo o retorno do método <b><u>captureInfo(String txt, WebDriver driver, Scenario scenario)</u></b> disponível da classe "<b>EvidenceDoc</b>", que retornará uma imagem, esse informação será essencial, para não capturar outra imagem, ou seja evita a duplicação de um arquivo com extensão .jpg<br/>
> Após o fluxo de decisão é necessário invocar o método -> logInToImageHtml(String log, String nameImage), onde serão passadas as variáveis criadas log e InfoImage.<br/>
> por último se faz necessário invocar o método -> startHtml(), responsável para arquitetar a criação da evidência em HTML.
3. Gerando Evidência em vídeo
- Realizar o importe do pacote
> import EvidenceVideo
<pre>
    Criar um objeto referente a classe EvidenceDoc:
    -->  EvidenceVideo movie = new EvidenceVideo();
    -->  Chamar o método start();
    Exemplo:
   movie.start();
</pre>
> Exemplo da aplicação das configurações da bbiblioteca inmetrics-evidencias:
<pre>
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import Inmetrics.Automacao.logger.Log;
import inmetrics.automacao.framework.utils.Utils;
import inmetrics.automacao.evidencia.doc.EvidenceDoc;
import inmetrics.automacao.evidencia.html.EvidenceHtml;
import inmetrics.automacao.evidencia.pdf.EvidencePDF;
import inmetrics.automacao.evidencia.structure.FolderStructure;
import inmetrics.automacao.evidencia.video.EvidenceVideo;

public class Hooks {

	private static final WebDriver driver = Utils.getDriver();
	private EvidenceDoc capaturarEvidencia;
	private EvidenceHtml evidenciaHtml;
	private EvidencePDF evidenciaPDF;
	private EvidenceVideo movie;
	private String log;
	private String infoImage;


	@Before
	public void setUp(Scenario scenario) throws IOException, AWTException {

		FolderStructure.createFolderStructureEvidence();
		capaturarEvidencia = new EvidenceDoc();
		evidenciaHtml = new EvidenceHtml();
		evidenciaPDF = new EvidencePDF();
		

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
		capaturarEvidencia.createReportDoc(scenario.getName());
	}

}
</pre> 









