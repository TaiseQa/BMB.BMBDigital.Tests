package page.propostas_contratos;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PropostasEContratosPage extends InteracoesTelaWeb {

    @FindBy(xpath = "//button[normalize-space() = 'Nova ficha']")
    private WebElement btnNovaFicha;

    public void clicoNoBotaoNovaFicha(){
        esperandoElementoSumir();
        clicar(btnNovaFicha);
    }

}
