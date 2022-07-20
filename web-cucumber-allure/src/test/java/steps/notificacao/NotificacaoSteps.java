package steps.notificacao;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.apache.log4j.Logger;
import org.junit.Assert;
import page.notificacao.NotificacaoPage;

public class NotificacaoSteps {

    public static final Logger log = Logger.getLogger(NotificacaoSteps.class);

    NotificacaoPage notificacaoPage;

    public NotificacaoSteps(NotificacaoPage notificacaoPage) {
        this.notificacaoPage = notificacaoPage;
    }

    private static final String NENHUMA_NOTIFICACAO = "Nenhuma notificação recebida ainda.";
    private static final String NAO_LIDAS = "Não lindas";
    private static final String LIDAS = "Lidas";

    @Entao("verifico se existe ou nao notificacoes")
    public void verificoSeExistemNotificaoes() {
        if (NENHUMA_NOTIFICACAO.equals(notificacaoPage.verificoSeExistemNotificaoes())) {
            log.info("Nenhuma notificação recebida ainda.");
        } else {
            log.info(notificacaoPage.notificaoExistente());
        }
    }

    @E("clico no filtro de notificacoes")
    public void clicoNoFiltroNotificacoes() {
        notificacaoPage.clicoNoFiltroNotificacoes();
    }

    @Entao("valido que o filtro foi alterado")
    public void validoFiltroFoiAlterado() {
        switch (notificacaoPage.validoFiltroFoiAlterado()) {
            case NAO_LIDAS:
                Assert.assertEquals(NAO_LIDAS, notificacaoPage.validoFiltroFoiAlterado());
                break;
            case LIDAS:
                Assert.assertEquals(LIDAS, notificacaoPage.validoFiltroFoiAlterado());
                break;
        }
    }

}
