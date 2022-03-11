package steps;

import framework.pages.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

import java.util.List;
import java.util.Map;


public class CadastroSimulacaoSteps  {

    PropostasContratosPage propostasContratosPage;

    @Dado("tenha clicado no botão Nova Simulação")
    public void queEuEstejaLogadoComUmUsuárioComPerfilParaPreenchimentoDeProposta() throws InterruptedException {
        propostasContratosPage = new PropostasContratosPage();
        propostasContratosPage.clicarBotaoNovaSimulacao();
    }
}
