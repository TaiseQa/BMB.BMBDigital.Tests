package framework.pages;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import framework.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends InteracoesTelaWeb {

    @FindBy(how = How.CSS, css = "[href='/App/financings'] img")
    protected WebElement menuContratosPropostas;

    public MenuPage() {
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    public CadastroFichaPage clicarMenuContratosPropostas() {
        clicarElemento(menuContratosPropostas, 60);
        return new CadastroFichaPage();
    }
}
