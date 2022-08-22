package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends InteracoesTelaWeb {

    @FindBy(how = How.CSS, css = "[href='/App/financings'] img")
    protected WebElement menuContratosPropostas;

//    public MenuPage() {
//        super(Utils.getDriver());
//        PageFactory.initElements(Utils.getDriver(), this);
//    }

    public PropostasContratosPage clicarMenuContratosPropostas() {
        ((JavascriptExecutor) Utils.getDriver()).executeScript("return arguments[0].click();", menuContratosPropostas);
        return new PropostasContratosPage();
    }
}
