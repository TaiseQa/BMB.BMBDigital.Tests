package steps.home;

import io.cucumber.java.pt.Quando;
import page.home.HomePage;

public class HomeSteps {

    HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Quando("acesso a página de Propostas e Contratos")
    public void acessarPaginaDePropostasEContratos() {
        homePage.acessarPaginaDePropostasEContratos();
    }

    @Quando("clico no botao retencao")
    public void clicoNoBotaoRetencao() {
        homePage.clicoNoBotaoRetencao();
    }

    @Quando("clico no menu conta")
    public void clicoNoMenuConta() {
        homePage.clicoNoMenuConta();
    }

    @Quando("clico no botao de ajuda")
    public void clicoNoBotaoAjuda() {
        homePage.clicoNoBotaoAjuda();
    }

    @Quando("clico em campanhas")
    public void clicoEmCampanhas() {
        homePage.clicoEmCampanhas();
    }

    @Quando("clico em notificacoes")
    public void clicoEmNotificacoes() {
        homePage.clicoEmNotificacoes();
    }

}
