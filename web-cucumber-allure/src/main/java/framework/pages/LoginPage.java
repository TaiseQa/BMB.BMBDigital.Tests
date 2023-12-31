package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class LoginPage extends InteracoesTelaWeb {

    @FindBy(how = How.NAME, id = "details-button")
    public WebElement detailchrome;

    @FindBy(how = How.NAME, id = "proceed-link")
    public WebElement proceed;

    @FindBy(how = How.NAME, id = "login")
    public WebElement formInputUser;

    @FindBy(id = "password")
    public WebElement formInputPass;

    @FindBy(css = ".enter > .send")
    public WebElement formbuttonEntrar;

    @FindBy(css = ".d-flex >  .close-modal")
    public WebElement closeModal;

    @FindBy(css = ".m-0 > .col-12:nth-child(2)")
    public WebElement buttonProposta;

    @FindBy(css = ".mr-3 > button")
    public WebElement buttonNovaFicha;

    @FindBy(css = "input.form-control")
    public WebElement insertCPF;

    @FindBy(css = ".btn-cpfCnpj > button.button-primary-bmb")
    public WebElement continueCPF;

    @FindBy(css = ".ngx-select.dropdown")
    private WebElement inputComboConcessionario;

    @FindBy(xpath = "(//ngx-select//a)[2]")
    private WebElement segundaOpCombo;

    @FindBy(css = ".continue > button")
    private WebElement btnContinuar;

//    public LoginPage() {
//        super(Utils.getDriver());
//        PageFactory.initElements(Utils.getDriver(), this);
//    }

    public void realizarLogin() {
        getDriver().get("https://digitalprj.br800.corpintra.net/App/login");
//        acessarAplicacao(url);
        preencherLoginForm("atucun0f", "Mercedes@22");
        clicarBotaoLogin();
//        escolherConcessionario();
//        fecharJanelaCampanha();
    }

//    public void acessarAplicacao(String url) {
//        abrirNavegador(url);
//    }

    public void preencherLoginForm(String usuario, String senha) {
//        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(formInputUser, usuario);
        escrever(formInputPass, senha);
    }

//    public void escolherConcessionario() {
//        if (verificarExistenciaComboConssecionario()) {
//            clicar(inputComboConcessionario);
//            clicar(segundaOpCombo);
//            clicar(btnContinuar);
//        }
//    }

    public void clicarBotaoLogin() {
        clicar(formbuttonEntrar);
    }

//    public boolean verificarexistenciaModalcampanha() {
//        WebElement element = Utils.getDriver().findElement(By.xpath("//app-notifications-modal//div[@class='d-flex title']"));
//        try {
//            Utils.wait.until(ExpectedConditions.visibilityOf(element));
//            return true;
//        } catch (NoSuchElementException | StaleElementReferenceException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

//    public boolean verificarExistenciaComboConssecionario() {
//        WebElement element = Utils.getDriver().findElement(By.xpath("//app-login//ngx-select"));
//        try {
//            Utils.wait.until(ExpectedConditions.visibilityOf(element));
//            return true;
//        } catch (NoSuchElementException | StaleElementReferenceException ignore) {
//            return false;
//        }
//    }

//    public void fecharJanelaCampanha() {
//        esperandoElementoSumir();
//        esperar(1000);
//        if (verificarexistenciaModalcampanha()) {
//            clicar(closeModal);
//        } else {
//            clicar(closeModal);
//        }
//    }
}