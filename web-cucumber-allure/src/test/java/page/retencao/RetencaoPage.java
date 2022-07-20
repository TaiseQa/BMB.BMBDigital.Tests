package page.retencao;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetencaoPage extends InteracoesTelaWeb {

    @FindBy(xpath = "(//div[@class='retention-card-content'])[1]")
    private WebElement modalProposta;

    @FindBy(xpath = "//h2[text() = 'Campanha de retenção']")
    private WebElement textoCampanhaRetencao;

    @FindBy(xpath = "//app-retention-card[@class = 'selected']")
    private WebElement cardCliado;

    @FindBy(xpath = "//div[@class = 'no-results text-center'][normalize-space() = 'Nenhum resultado encontrado!']")
    private WebElement textoSemProposta;

    @FindBy(xpath = "//div[@class = 'no-results'][normalize-space() = 'Nenhum resultado encontrado!']")
    private WebElement textoSemPropostaGerenciarLeads;

    @FindBy(css = "[href='/App/retention/not-limit-available']")
    private WebElement btnSemLimiteDisponivel;

    @FindBy(css = "[href='/App/retention/favorites']")
    private WebElement btnFavoritos;

    @FindBy(css = "[href = '/App/retention/manage-leads']")
    private WebElement btnGerenciarLeads;

    @FindBy(xpath = "(//app-retentions-list-manage-leads//div[normalize-space() = '(1 item selecionado)'])[2]")
    private WebElement infoModalSelecionado;


    public void clicoNaAbaSemLimiteDisponivel() {
        clicar(btnSemLimiteDisponivel);
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
    }

    public void clicoNaAbaFavoritos() {
        clicar(btnFavoritos);
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
    }

    public void clicoNaAbaGerenciarLeads() {
        clicar(btnGerenciarLeads);
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
    }

    public String validoSeExisteOuNaoUmaPropostaNaPagina() {
        if (verificarSeExistePropostaRetencao()) {
            clicar(modalProposta);
            seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
            return ("Existe");
        } else {
            return ("Não existe");
        }
    }

    public String textoCampanha() {
        return getTexto(textoCampanhaRetencao);
    }

    public String textoSemCampanha() {
        return getTexto(textoSemProposta);
    }

    public String validoSeExisteOuNaoUmaPropostaNaPaginaEmGerenciarLeads() {
        if (verificarSeExistePropostaRetencao()) {
            clicar(modalProposta);
            if (verificarSeModalEstaAssociadoAvendedor()) {
                return ("Existe modal e foi selecionado");
            } else {
                return ("Não existe");
            }
        } else {
            return ("Não existe");
        }
    }

    public String modalSelecionado() {
        return getTexto(infoModalSelecionado);
    }

    public String textoSemCampanhaGerenciarLeads() {
        return getTexto(textoSemPropostaGerenciarLeads);
    }

    public boolean verificarSeModalEstaAssociadoAvendedor() {
        try {
            cardCliado.isDisplayed();
            return true;
        } catch (NoSuchElementException | TimeoutException | StaleElementReferenceException ignore) {
            return false;
        }
    }

    public boolean verificarSeExistePropostaRetencao() {
        try {
            modalProposta.isDisplayed();
            return true;
        } catch (NoSuchElementException | TimeoutException ignore) {
            return false;
        }
    }

}
