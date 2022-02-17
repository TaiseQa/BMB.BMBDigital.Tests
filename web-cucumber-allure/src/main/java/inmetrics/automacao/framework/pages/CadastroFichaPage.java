package inmetrics.automacao.framework.pages;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import inmetrics.automacao.framework.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroFichaPage extends InteracoesTelaWeb {

    //Botões
    @FindBy(how = How.XPATH, xpath = "//button[contains(.,'Nova ficha')]")
    protected WebElement botaoNovaFicha;

    //Campos Identificação do Cliente
    @FindBy(how = How.CSS, css = "[formcontrolname='cpfCnpj']")
    protected WebElement campoCpfCnpj;

    @FindBy(how = How.ID, id = "name")
    protected WebElement campoNome;

    @FindBy(how = How.ID, id = "birthDate")
    protected WebElement campoDataNascimento;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'E-mail')]/following-sibling::div/input[@class='form-control ng-pristine ng-invalid ng-touched']")
    protected WebElement campoEmail;

    @FindBy(how = How.CSS, css = "[formcontrolname='celPhone']")
    protected WebElement campoCelular;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'Estado civil')][0]/following-sibling::ngx-select/div")
    protected WebElement comboEstadoCivil;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Solteiro')]")
    protected WebElement opcaoComboEstadoCivilSolteiro;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Casado')]")
    protected WebElement opcaoComboEstadoCivilCasado;

    //Endereço


    //Mensagens
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

    public void preencherIdentificacaoCliente(String nome, String dataNascimento, String email, String celular, String estadoCivil) {
        inserirValor(campoNome, nome);
        inserirValor(campoDataNascimento, dataNascimento);
        inserirValor(campoEmail, email);
        inserirValor(campoCelular, celular);
        selecionarElementoTexto(comboEstadoCivil, estadoCivil);
    }
}
