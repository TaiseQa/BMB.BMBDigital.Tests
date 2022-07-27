package steps.proposta;

import io.cucumber.java.pt.E;
import lombok.val;
import page.proposta.PropostaPage;

public class PropostaSteps {

    PropostaPage propostaPage;

    public PropostaSteps(PropostaPage propostaPage) {
        this.propostaPage = propostaPage;
    }

    @E("clico na proposta CDC que esteja em analise")
    public void clicoNaPropostaCDCQueEstejaEmAnalise() {
        val props = propostaPage.properties("proposta.properties");
        propostaPage.clicoNaPropostaCDCQueEstejaEmAnalise(props.getString("proposta"));
    }
}
