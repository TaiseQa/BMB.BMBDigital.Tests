package steps.retencao;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import lombok.SneakyThrows;
import org.junit.Assert;
import page.retencao.RetencaoPage;

public class RetencaoSteps {

    RetencaoPage retencaoPage;

    public RetencaoSteps(RetencaoPage retencaoPage) {
        this.retencaoPage = retencaoPage;
    }

    private static final String TEXTO_CAMPANHA_RETENCAO = "Campanha de retenção";
    private static final String TEXTO_SEM_CAMPANHA_ENCONTRADA = "Nenhum resultado encontrado!";
    private static final String MODAL_CLICADO = "Existe modal e foi selecionado";
    private static final String INFO_MODAL_SELECIONADO = "(1 item selecionado)";


    @E("clico na aba sem limite disponivel")
    public void clicoNaAbaSemLimiteDisponivel() {
        retencaoPage.clicoNaAbaSemLimiteDisponivel();
    }

    @E("clico na aba favoritos")
    public void clicoNaAbaFavoritos() {
        retencaoPage.clicoNaAbaFavoritos();
    }

    @E("clico na aba gerenciar leads")
    public void clicoNaAbaGerenciarLeads() {
        retencaoPage.clicoNaAbaGerenciarLeads();
    }

    @Entao("valido se existe ou não uma proposta na pagina")
    public void validoSeExisteOuNaoUmaPropostaNaPagina() {
        switch (retencaoPage.validoSeExisteOuNaoUmaPropostaNaPagina()) {
            case "Existe":
                Assert.assertEquals(TEXTO_CAMPANHA_RETENCAO, retencaoPage.textoCampanha());
                break;
            case "Não existe":
                Assert.assertEquals(TEXTO_SEM_CAMPANHA_ENCONTRADA, retencaoPage.textoSemCampanha());
                break;
        }
    }

    @SneakyThrows
    @Entao("valido se existe ou não uma proposta na pagina em gerenciar leads")
    public void validoSeExisteOuNaoUmaPropostaNaPaginaEmGerenciarLeads() {
        switch (retencaoPage.validoSeExisteOuNaoUmaPropostaNaPaginaEmGerenciarLeads()) {
            case MODAL_CLICADO:
                Assert.assertEquals(INFO_MODAL_SELECIONADO, retencaoPage.modalSelecionado());
                break;
            case "Não existe":
                Assert.assertEquals(TEXTO_SEM_CAMPANHA_ENCONTRADA, retencaoPage.textoSemCampanhaGerenciarLeads());
                break;
        }
    }

}
