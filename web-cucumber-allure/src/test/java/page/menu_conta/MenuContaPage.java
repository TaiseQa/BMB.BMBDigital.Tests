package page.menu_conta;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class MenuContaPage extends InteracoesTelaWeb {

    @FindBy(xpath = "(//app-modal-user-acount//p)[1]")
    private WebElement userConta;

    @FindBy(xpath = "(//app-modal-user-acount//p)[2]")
    private WebElement concessionarioConta;

    @FindBy(xpath = "//a[normalize-space() = 'Trocar senha']")
    private WebElement btnTrocarSenha;

    @FindBy(css = ".swal2-popup.swal2-modal.swal2-icon-warning.swal2-show")
    private WebElement modalAtencao;

    @FindBy(xpath = "//button[text() = 'Ok, Entendi!']")
    private WebElement btnOkEntendi;

    @FindBy(xpath = "//h1")
    private WebElement textoH1;

    @FindBy(css = "[href='https://www.bancomercedes-benz.com.br/privacidade-protecao-de-dados']")
    private WebElement btnPrivacidadeProtecaoDeDados;

    @FindBy(xpath = "(//h1)[2]")
    private WebElement textoProtecaoDados;

    @FindBy(xpath = "//a[normalize-space() = 'Sair']")
    private WebElement btnSair;

    @FindBy(xpath = "//button[text() = 'Entrar']")
    private WebElement btnEntrar;

    public void clicoEmTrocarSenha() {
        clicar(btnTrocarSenha);
    }

    public boolean umModalDeAtencaoEApresentado() {
        return modalAtencao.isDisplayed();
    }

    public void clicoOkEntendi() {
        clicar(btnOkEntendi);
    }

    public String validoRedirecionamentoParaPaginaDeTrocaDeSenha() {
        List<String> quantos = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(quantos.get(1));
        return getTexto(textoH1);
    }

    public void clicoEmPrivacidadeProtecaoDeDados() {
        clicar(btnPrivacidadeProtecaoDeDados);
    }

    public String validoRedirecionamentoParaPaginaProtecaoDeDados() {
        List<String> quantos = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(quantos.get(1));
        return getTexto(textoProtecaoDados);
    }

    public void clicoEmSair() {
        clicar(btnSair);
    }

    public boolean validoQueEstouNaPaginaLogin() {
        return btnEntrar.isDisplayed();
    }


    public String userConta() {
        return getTexto(userConta);
    }

    public String concessionarioConta() {
        return getTexto(concessionarioConta);
    }

}
