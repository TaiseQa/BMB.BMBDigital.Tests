package steps.campanhas;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.apache.log4j.Logger;
import org.junit.Assert;
import page.campanhas.CampanhasPage;

public class CampanhasSteps {

    public static final Logger log = Logger.getLogger(CampanhasSteps.class);

    CampanhasPage campanhasPage;

    private static final String TITULO_MODAL = "Termo de aceite";
    private static final String DE_ACORDO = "Estou de acordo";
    private static final String BTN_ATIVAR_CAMPANHA = "Ativar Campanha";
    private static final String BTN_CANCELAR = "Cancelar";

    public CampanhasSteps(CampanhasPage campanhasPage) {
        this.campanhasPage = campanhasPage;
    }

    @Entao("verifico se existe ou nao campanhas")
    public void verificoSeExistemOuNaoCampanhas() {
        Assert.assertTrue(campanhasPage.verificoSeExistemOuNaoCampanhas());
    }

    @E("clico no botao ativar")
    public void clicoNoBotaoAtivar() {
        campanhasPage.clicoNoBotaoAtivar();
    }

    @E("verifico a presenca de um modal {string}")
    public void verificoPresencaDeUmModal(String modal) {
        Assert.assertEquals(modal, campanhasPage.verificoPresencaDeUmModal().substring(0, 15));
    }

    @E("que modal contenha o botao radio button {string}")
    public void queModalContenhaBotaoRadioButton(String radioButton) {
        Assert.assertEquals(radioButton, campanhasPage.queModalContenhaBotaoRadioButton());
    }

    @E("que modal contenha botao {string}")
    public void queModalContenhaBotao(String button) {
        Assert.assertEquals(button.toUpperCase(), campanhasPage.queModalContenhaBotao(button));
    }

    @E("marco alguns vendedores")
    public void marcoAlgunsVendedores() {
        campanhasPage.marcoAlgunsVendedores();
    }

    @E("desmarco os mesmos vendedores")
    public void desmarcoOsMesmoVendedores() {
        campanhasPage.desmarcoOsMesmoVendedores();
    }

    @Entao("verifico se existe ou nao campanhas se existir faco as verificacoes caso contrario nao faco nada")
    public void verificoSeExisteCampanhasEExistirFacoAsVerificacoesCasoContrarioNao() {
        if (campanhasPage.verificoSeExistemOuNaoCampanhas()) {
            campanhasPage.clicoNoBotaoAtivar();
            Assert.assertEquals(TITULO_MODAL, campanhasPage.verificoPresencaDeUmModal().substring(0, 15));
            Assert.assertEquals(DE_ACORDO, campanhasPage.queModalContenhaBotaoRadioButton());
            Assert.assertEquals(BTN_ATIVAR_CAMPANHA.toUpperCase(), campanhasPage.queModalContenhaBotao(BTN_ATIVAR_CAMPANHA));
            Assert.assertEquals(BTN_CANCELAR.toUpperCase(), campanhasPage.queModalContenhaBotao(BTN_CANCELAR));
            campanhasPage.marcoAlgunsVendedores();
            campanhasPage.desmarcoOsMesmoVendedores();
            Assert.assertTrue(campanhasPage.validarSeBotaoAtivarCampanhaFicaHabilitado());
        } else {
            log.info("NENHUMA CAMPANHA EXISTENTE");
        }

    }

}
