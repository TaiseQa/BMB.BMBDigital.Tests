package page.proposta;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class PropostaPage extends InteracoesTelaWeb {

    public void clicoNaPropostaCDCQueEstejaEmAnalise(String op) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("(//div[normalize-space() = '%s'])[3]/../../../../..", op)));
        opcao.click();
    }
}
