package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SegurosPage extends InteracoesTelaWeb {

    //******** SEGURO ********************//

    @FindBy(how = How.XPATH, xpath = "(//input[@name='chkVehicleInsurance'])[2]")
    protected WebElement checkNaoDesejoSeguro;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'CONTINUAR')]")
    protected WebElement btnContinuarSeguro;

    //******** FIM SEGURO ********************//

//    public SegurosPage(){
//        super(Utils.getDriver());
//        PageFactory.initElements(Utils.getDriver(), this);
//    }


}
