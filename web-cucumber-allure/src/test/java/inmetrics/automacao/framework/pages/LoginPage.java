package inmetrics.automacao.framework.pages;

import inmetrics.automacao.framework.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends InteracoesTelaWeb  {

	@FindBy(how = How.NAME, id = "details-button")
	public WebElement detailchrome;

	@FindBy(how = How.NAME, id = "proceed-link")
	public WebElement proceed;

	@FindBy(how = How.NAME, id = "login")
	public WebElement formInputUser;
	
	@FindBy(id =  "password")
	public WebElement formInputPass;

	@FindBy(css = ".enter > .send")
	public WebElement formbuttonEntrar;
	
	@FindBy(css = ".d-flex >  .close-modal")
	public WebElement closeModal;
	
	@FindBy(css = ".m-0 > .col-12:nth-child(2)")
	public WebElement buttonProposta;
	
	@FindBy(css = ".mr-3 > button" )
	public WebElement buttonNovaFicha;
	
	@FindBy(css = "input.form-control")
	public WebElement insertCPF;

	@FindBy(css = ".btn-cpfCnpj > button.button-primary-bmb")
	public WebElement continueCPF;

	public LoginPage() {
		super(Utils.getDriver());
		PageFactory.initElements(Utils.getDriver(), this);
	}

	public void realizarLogin(String url, String usuario, String senha) throws InterruptedException {
		acessarAplicacao(url);
		ignorarCertificado();
		preencherLoginForm(usuario, senha);
		clicarBotaoLogin();
		fecharJanelaCampanha();
	}

	public void acessarAplicacao(String url){
		abrirNavegador(url);
	}

	public void preencherLoginForm(String usuario, String senha){
		inserirValor(formInputUser, usuario);
		inserirValor(formInputPass, senha);
	}

	public void clicarBotaoLogin(){
		clicarElemento(formbuttonEntrar);
	}

	public void ignorarCertificado(){
		clicarElemento(detailchrome);
		clicarElemento(proceed);
	}

	public void fecharJanelaCampanha() throws InterruptedException {
		Thread.sleep(50000);
		clicarElemento(closeModal);
	}

	
}
