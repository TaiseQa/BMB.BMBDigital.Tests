package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PropostasContratosPage extends InteracoesTelaWeb {

    //BOTÃO NOVA SIMULAÇÃO//
    @FindBy(how = How.XPATH, xpath = "//button[@routerlink='/financings/create/simulation/financial-simulator']")
    protected WebElement btnNovaSimulacao;

    @FindBy(how = How.XPATH, xpath = "//button[contains(.,'Nova ficha')]")
    protected WebElement btnNovaFicha;

    //FIM BOTÃO NOVA SIMULAÇÃO//

    public PropostasContratosPage(){
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    public CadastroVeiculoPage clicarBotaoNovaSimulacao() throws InterruptedException {
        Thread.sleep(30000);
        clicarElemento(btnNovaSimulacao, 90);
        return new CadastroVeiculoPage();
    }

    public CadastroFichaPage clicarBotaoNovaFicha() throws InterruptedException {
        Thread.sleep(30000);
        clicarElemento(btnNovaFicha, 90);
        return new CadastroFichaPage();
    }
}