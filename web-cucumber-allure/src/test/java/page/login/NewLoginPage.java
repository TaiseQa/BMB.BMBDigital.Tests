package page.login;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.home.HomePage;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;
import static inmetrics.automacao.core.web.util.FabricaWebDriver.wait;


public class NewLoginPage extends InteracoesTelaWeb {

    HomePage homePage;
    @FindBy(id = "login")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputSenha;

    @FindBy(xpath = "//button[text() = 'Entrar']")
    private WebElement btnEntrar;

    @FindBy(css = ".ngx-select.dropdown")
    private WebElement inputComboConcessionario;

    @FindBy(xpath = "(//ngx-select//a)[2]")
    private WebElement segundaOpCombo;

    @FindBy(css = ".continue > button")
    private WebElement btnContinuar;

    public NewLoginPage(HomePage homePage) {
        this.homePage = homePage;
    }

    public void faCoLoginNoPortalBMBDigital() {
        getDriver().get("#{Server.Frontend.Digital.Url}#/App/login");
        acessarComLoginESenha("#{NonProd.Credential.BMBDigital.Tests.Username}#",
                "#{NonProd.Credential.BMBDigital.Tests.Password}#");
        escolherConcessionarioCasoExista();
        homePage.fecharJanelaCampanha();
    }

    public void acessarComLoginESenha(String user, String password) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputLogin, user);
        escrever(inputSenha, password);
        clicar(btnEntrar);
    }

    public boolean verificarExistenciaComboConssecionario() {
        wait = new WebDriverWait(getDriver(), 10);
        WebElement element = getDriver().findElement(By.xpath("//app-login//ngx-select"));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException | StaleElementReferenceException ignore) {
            return false;
        }
    }

    public void escolherConcessionarioCasoExista() {
        if (verificarExistenciaComboConssecionario()) {
            clicar(inputComboConcessionario);
            clicar(segundaOpCombo);
            clicar(btnContinuar);
        }
    }

}
