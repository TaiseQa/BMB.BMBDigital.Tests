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

}
