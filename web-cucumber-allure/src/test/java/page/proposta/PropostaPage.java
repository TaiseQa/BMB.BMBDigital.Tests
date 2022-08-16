package page.proposta;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class PropostaPage extends InteracoesTelaWeb {

    @FindBy(xpath = "(//app-registration-tab//div)[4]//p")
    private WebElement guardarNome;

    @FindBy(xpath = "(//app-registration-tab//div)[3]//p")
    private WebElement guardarCpf;

    @FindBy(xpath = "//app-control-field//input")
    private WebElement guardarEmail;

    @FindBy(css = "[formcontrolname = 'celNumber']")
    private WebElement guardarCelular;

    @FindBy(xpath = "//button[normalize-space() = 'Acessar ficha cadastral']")
    private WebElement btnFichaCadastral;

    @FindBy(xpath = "//button[@class = 'bmb-modal-button-close']")
    private WebElement fecharModalFichaCadastral;

    @FindBy(xpath = "//button[normalize-space() = 'Informações de faturamento']")
    private WebElement btnInfoFaturamento;

    @FindBy(xpath = "//button[normalize-space() = 'Assinar contrato']")
    private WebElement btnAssinarContrato;

    @FindBy(xpath = "//span[text() = 'Fechar']")
    private WebElement textoPDF;

    @FindBy(css = "app-contract-sign")
    private WebElement modalAssinarContrato;

    @FindBy(xpath = "(//section//div//p)[1]")
    private WebElement textoNome;

    @FindBy(xpath = "(//section//div//p)[2]")
    private WebElement textoCpfOrCnpj;

    @FindBy(xpath = "(//section//div//p)[4]")
    private WebElement textoEmail;

    @FindBy(xpath = "(//section//div//p)[5]")
    private WebElement textoTelefone;

    @FindBy(xpath = "//h5[normalize-space() = 'Ficha Cadastral']/following-sibling::span")
    private WebElement statusFichaCadastral;

    @FindBy(xpath = "//h5[normalize-space() = 'Documentos']/following-sibling::span")
    private WebElement statusDocumentos;

    @FindBy(xpath = "//h5[normalize-space() = 'Contrato']/following-sibling::span")
    private WebElement statusContrato;

    public void clicoNaPropostaCDCQueEstejaEmAnalise(String op) {
        esperandoElementoSumir();
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("(//div[normalize-space() = '%s'])[3]/../../../../..", op)));
        opcao.click();
    }

    public String recuperarNome() {
        return getTexto(guardarNome);
    }

    public String recuperarCpfOrCnpj() {
        return getTexto(guardarCpf);
    }

    public String recuperarEmail() {
        return guardarEmail.getAttribute("value");
    }

    public String recuperarTelefone() {
        return guardarCelular.getAttribute("value");
    }

    public void clicoBotaoFichaCadastral() {
        esperandoElementoSumir();
        clicar(btnFichaCadastral);
    }

    public void fecharModalFichaCadastral() {
        clicar(fecharModalFichaCadastral);
    }

    public void clicoNoBotaoAssinarContrato() {
        clicar(btnAssinarContrato);
    }

    public boolean validoQueUmModalFoiApresentado() {
        esperandoElementoSumir();
        return modalAssinarContrato.isDisplayed();
    }

    public String getNome() {
        return getTexto(textoNome);
    }

    public String getCpfOrCnpj() {
        return getTexto(textoCpfOrCnpj);
    }

    public String getEmail() {
        return getTexto(textoEmail);
    }

    public String getTelefone() {
        return getTexto(textoTelefone);
    }

    public void clicoEmInformacoesDeFaturamento() {
        clicar(btnInfoFaturamento);
    }

    public String validoQueUmDocumentoPdfehApresentado() {
        return getTexto(textoPDF);
    }

    public String getStatusFichaCadastral() {
        esperandoElementoSumir();
        return getTexto(statusFichaCadastral);
    }

    public String getStatusDocumentos() {
        return getTexto(statusDocumentos);
    }

    public String getStatusContrato() {
        return getTexto(statusContrato);
    }

}
