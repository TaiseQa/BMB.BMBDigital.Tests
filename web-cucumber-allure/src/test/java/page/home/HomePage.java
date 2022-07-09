package page.home;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;
import static inmetrics.automacao.core.web.util.FabricaWebDriver.wait;

public class HomePage extends InteracoesTelaWeb {

    @FindBy(css = ".d-flex >  .close-modal")
    private WebElement closeModal;

    @FindBy(css = "a[href='/App/financings']")
    private WebElement btnPropostaContratos;

    public void acessarPaginaDePropostasEContratos(){
        clicar(btnPropostaContratos);
    }

    public boolean verificarexistenciaModalcampanha() {
        WebElement element = getDriver().findElement(By.xpath("//app-notifications-modal//div[@class='d-flex title']"));
        try {
            WebDriverWait wait1 = new WebDriverWait(getDriver(),3);
            wait1.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException ignore) {
            return false;
        }
    }

    public void fecharJanelaCampanha() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        esperar(1000);
        if (verificarexistenciaModalcampanha()) {
            clicar(closeModal);
        }
    }


}
