package inmetrics.automacao.framework.pages;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import inmetrics.automacao.framework.utils.Utils;
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
        clicarElemento(menuContratosPropostas);
        return new CadastroFichaPage();
    }
}
