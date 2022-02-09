package core.web.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import inmetrics.automacao.core.web.InteracoesTelaWeb;

public class MapTeste extends InteracoesTelaWeb{	
	
	public MapTeste(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.NAME, using = "username")
	public WebElement formInputUsername;
	
	@FindBy(name = "pass")
	public WebElement formInputPassword;
	
	@FindBy(xpath = "//div/button[contains(text(),'Entre')]")
	public WebElement formButtonEntre;
		
	@FindBy(xpath = "//*[@id='tabela']/thead/tr/th[1]")
	public WebElement textoNome;
	
	
	
	@FindBy(xpath = "//*[@name=\"gender\"][3]")
	public WebElement radiobutton;
	
	@FindBy(xpath = "//*[@name='vehicle'][1]")
	public WebElement checkbox1;
	
	@FindBy(xpath = "//*[@name='vehicle'][2]")
	public WebElement checkbox2;
	
	@FindBy(xpath = "//*[@class=\"et_pb_blurb_description\"]/select")
	public WebElement select;
	
}
