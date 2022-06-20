package steps;

import framework.pages.PropostasContratosPage;
import io.cucumber.java.pt.Dado;


public class CadastroSimulacaoSteps {

    PropostasContratosPage propostasContratosPage;

    @Dado("tenha clicado no botão Nova Simulação")
    public void queEuEstejaLogadoComUmUsuarioComPerfilParaPreenchimentoDeProposta() throws InterruptedException {
        propostasContratosPage = new PropostasContratosPage();
        propostasContratosPage.clicarBotaoNovaSimulacao();
    }
}
