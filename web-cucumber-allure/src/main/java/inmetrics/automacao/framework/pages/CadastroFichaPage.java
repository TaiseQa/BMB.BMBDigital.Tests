package inmetrics.automacao.framework.pages;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import inmetrics.automacao.framework.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroFichaPage extends InteracoesTelaWeb {

    @FindBy(how = How.XPATH, xpath = "//button[contains(.,'Nova ficha')]")
    protected WebElement botaoNovaFicha;

    @FindBy(how = How.CSS, css = "[formcontrolname='cpfCnpj']")
    protected WebElement campoCpfCnpj;

    @FindBy(how = How.CSS, css = ".error-msg")
    protected WebElement mensagemErro;

    public CadastroFichaPage() {
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    public void clicarBotaoNovaFicha(){
        aguardarClickHabilitado(botaoNovaFicha);
        clicarElemento(botaoNovaFicha);
    }

    public void preencheCpfCnpj(String cpfCnpj) {
        inserirValor(campoCpfCnpj, cpfCnpj);
    }

    public String obterTextoMensagemErro() {
        return obterValorTexto(mensagemErro);
    }
}
