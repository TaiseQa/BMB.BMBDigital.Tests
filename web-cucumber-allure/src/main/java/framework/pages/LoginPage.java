package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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

    public LoginPage() {
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    public void realizarLogin(String url, String usuario, String senha) {
        acessarAplicacao(url);
        ignorarCertificado();
        preencherLoginForm(usuario, senha);
        clicarBotaoLogin();
        escolherConcessionario();
        fecharJanelaCampanha();
    }

    public void acessarAplicacao(String url) {
        abrirNavegador(url);
    }

    public void preencherLoginForm(String usuario, String senha) {
        inserirValor(formInputUser, usuario);
        inserirValor(formInputPass, senha);
    }

    public void escolherConcessionario() {
        if (verificarExistenciaComboConssecionario()) {
            clicarElemento(inputComboConcessionario);
            clicarElemento(segundaOpCombo);
            clicarElemento(btnContinuar);
        }
    }

    public void clicarBotaoLogin() {
        clicarElemento(formbuttonEntrar);
    }

    public void ignorarCertificado() {
        //clicarElemento(detailchrome);
        //clicarElemento(proceed);
    }

    public boolean verificarexistenciaModalcampanha() {
        try {
            Utils.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return Utils.getDriver().findElements(By.cssSelector("card show")).size() > 0;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verificarExistenciaComboConssecionario() {
        try {
            Utils.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return Utils.getDriver().findElements(By.xpath("//app-login//ngx-select")).size() > 0;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fecharJanelaCampanha() {
        esperar(15000);
        if (verificarexistenciaModalcampanha()) {
            clicarElemento(closeModal);
        }
    }

}
