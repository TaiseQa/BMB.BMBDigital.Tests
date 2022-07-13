package steps.propostas_contratos;

import io.cucumber.java.pt.E;
import page.propostas_contratos.PropostasEContratosPage;

public class PropostasEContratosSteps {


    PropostasEContratosPage propostasEContratosPage;

    public PropostasEContratosSteps(PropostasEContratosPage propostasEContratosPage) {
        this.propostasEContratosPage = propostasEContratosPage;
    }

    @E("clico no botao Nova Ficha")
    public void clicoNoBotaoNovaFicha() {
        propostasEContratosPage.clicoNoBotaoNovaFicha();
    }

    @E("clico no botao nova simulacao")
    public void clicoNoBotaoNovaSimulacao() {
        propostasEContratosPage.clicoNoBotaoNovaSimulacao();
    }

}
