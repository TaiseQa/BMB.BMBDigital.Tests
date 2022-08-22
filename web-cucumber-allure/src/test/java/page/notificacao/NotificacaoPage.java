package page.notificacao;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificacaoPage extends InteracoesTelaWeb {

    @FindBy(xpath = "//p[text() = 'Nenhuma notificação recebida ainda.']")
    private WebElement textoNotificacao;

    @FindBy(xpath = "(//span[text() = 'Notificações']/../..//span)[2]")
    private WebElement btnFiltro;

    @FindBy(xpath = "(//span[text() = 'Notificações']/../..//span)[2]")
    private WebElement textoFiltro;

    @FindBy(xpath = "//app-notifications//ul//li")
    private WebElement notificacaoExistente;

    public String verificoSeExistemNotificaoes() {
        try {
            textoNotificacao.isDisplayed();
            return getTexto(textoNotificacao);
        } catch (NoSuchElementException ignore) {
            return null;
        }
    }

    public String notificaoExistente() {
        return getTexto(notificacaoExistente);
    }

    public void clicoNoFiltroNotificacoes() {
        clicar(btnFiltro);
        esperar(2000);
    }

    public String validoFiltroFoiAlterado() {
        return getTexto(textoFiltro);
    }

}
