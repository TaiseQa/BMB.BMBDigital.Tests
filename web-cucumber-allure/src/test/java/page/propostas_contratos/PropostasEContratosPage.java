package page.propostas_contratos;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class PropostasEContratosPage extends InteracoesTelaWeb {

    @FindBy(xpath = "//button[normalize-space() = 'Nova ficha']")
    private WebElement btnNovaFicha;

    @FindBy(xpath = "//button[normalize-space() = 'Nova simulação']")
    private WebElement btnNovaSimulacao;

    @FindBy(css = "[src = 'assets/icon/filter.svg']")
    private WebElement startFiltroStatus;

    public void clicoNoBotaoNovaFicha() {
        esperandoElementoSumir();
        clicar(btnNovaFicha);
    }

    public void clicoNoBotaoNovaSimulacao() {
        esperandoElementoSumir();
        clicar(btnNovaSimulacao);
    }

    public void filtroAsPropostasPor(String status) {
        clicar(startFiltroStatus);
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("(//ul)[2]//li[normalize-space() = '%s']", status)));
        opcao.click();
        esperar(500);
        clicar(startFiltroStatus);
    }

}
