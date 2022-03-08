package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EnviarPropostaCreditoPage extends InteracoesTelaWeb {

    //*************** ENVIO DE PROPOSTA ********************//
    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='autorize']")
    protected WebElement checkAceitarTermoJuridico;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'ENVIAR PROPOSTA DE CRÉDITO')]")
    protected WebElement btnEnviarPropostaCredito;
    //***************FIM ENVIO ****************************//

    //**************** MENSAGEM ESCOLHER VENDEDOR **************//
    @FindBy(how = How.XPATH, xpath = "(//ngx-select[@formcontrolname='id']//div)[1]")
    protected WebElement comboSelecionarVendedor;

    @FindBy(how = How.XPATH, xpath = "(//a//span)[1]")
    protected WebElement opcaoComboSelecionarVendedor;

    @FindBy(how = How.XPATH, xpath = "(//button[contains(text(), 'ENVIAR')])[2]")
    protected WebElement btnEnviarVendedor;
    //****************** FIM ESCOLHER VENDEDOR *************//

    public EnviarPropostaCreditoPage(){
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }
}