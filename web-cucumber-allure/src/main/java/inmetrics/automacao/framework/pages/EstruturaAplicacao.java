package inmetrics.automacao.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import inmetrics.automacao.core.web.InteracoesTelaWeb;


public class EstruturaAplicacao extends InteracoesTelaWeb  {

		
	public EstruturaAplicacao(WebDriver driver) { 
		super(driver);
	}

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
	
}
