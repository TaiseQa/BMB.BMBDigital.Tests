package page.propostas_contratos;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PropostasEContratosPage extends InteracoesTelaWeb {

    @FindBy(xpath = "//button[normalize-space() = 'Nova ficha']")
    private WebElement btnNovaFicha;

    @FindBy(xpath = "//button[normalize-space() = 'Nova simulação']")
    private WebElement btnNovaSimulacao;

    public void clicoNoBotaoNovaFicha() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        clicar(btnNovaFicha);
    }

    public void clicoNoBotaoNovaSimulacao() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        clicar(btnNovaSimulacao);
    }

}
