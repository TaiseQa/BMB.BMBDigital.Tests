package steps.ajuda;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.Assert;
import page.ajuda.AjudaPage;

public class AjudaSteps {

    AjudaPage ajudaPage;

    public AjudaSteps(AjudaPage ajudaPage) {
        this.ajudaPage = ajudaPage;
    }

    @SneakyThrows
    @E("no campo de busca pesquiso {string}")
    public void noCampoDeBuscaPesquiso(String busca) {
        ajudaPage.noCampoDeBuscaPesquiso(busca);
        val props = ajudaPage.properties("busca.properties");
        props.setProperty("tipo.busca", busca);
        props.save();
    }

    @Entao("verifico se o resultado da busca e o mesmo que pesquisei")
    public void verificoSeResultadoDaBuscaEOMesmoQuePesquisei() {
        val props = ajudaPage.properties("busca.properties");
        Assert.assertEquals(props.getString("tipo.busca"), ajudaPage.verificoSeResultadoDaBuscaEOMesmoQuePesquisei());
    }

    @E("clico no tutorial {string}")
    public void clicoNoTutorial(String oop) {
        ajudaPage.clicoNoTutorial(oop);
    }

    @Entao("verifico que o video do tutorial é exibido")
    public void verificoQueVideoDoTutotrialEExibido() {
        Assert.assertEquals(ajudaPage.tiposDeVideo(ajudaPage.verificoQueVideoDoTutotrialEExibido()), ajudaPage.verificoQueVideoDoTutotrialEExibido());
    }

    @E("clico em uma pergunta {string}")
    public void clicoEmUmaPergunta(String pergunta) {
        ajudaPage.clicoEmUmaPergunta(pergunta);
    }

    @Entao("que sua resposta exibida seja {string}")
    public void queSuaRespostaExibidaSeja(String respota) {
        Assert.assertEquals(respota, ajudaPage.queSuaRespostaExibidaSeja());
    }

}
