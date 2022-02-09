package inmetrics.automacao.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import inmetrics.automacao.framework.pages.EstruturaAplicacao;
import inmetrics.automacao.framework.utils.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginStep extends EstruturaAplicacao {

	private static final WebDriver driver = Utils.getDriver();


	public LoginStep() {
		super(driver);
		PageFactory.initElements(driver, this); 
	}

	@Dado("estar na página principal da aplicação {string}")
	public void estar_na_página_principal_da_aplicação(String url) {
	    abrirNavegador(url);
	}

	@E("quando ignoro o certificado")
	public void quando_ignoro_o_certificado() {
		clicarElemento(detailchrome);
		clicarElemento(proceed);
	}

	@Quando("ao inserir o usuario {string} e {string},")
	public void ao_inserir_o_usuario_e(String user, String pass) {
	    inserirValor(formInputUser, user);
	    inserirValor(formInputPass, pass);
	}

	@Quando("ao clicar no botão Entre")
	public void ao_clicar_no_botão_Entre() {
	    clicarElemento(formbuttonEntrar);
	    
	}
	
	@Então("fecho a ficha de campanha")
	public void fecho_a_ficha_de_campanha() {
		clicarElemento(closeModal);
	}
}
