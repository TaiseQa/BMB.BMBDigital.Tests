package framework.pages;


import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CadastroVeiculoPage extends InteracoesTelaWeb {

    //******** VEICULO ********************//
    @FindBy(how = How.XPATH, xpath = "//h1[contains(text(), 'Veículo')]")
    protected WebElement tituloVeiculoPaginaSimulacao;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Ano de fabricação')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboAnoFabricacao;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), '2022')]")
    protected WebElement opcaoComboAnoFabricacao2022;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Ano do modelo')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboAnoModelo;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Tipo de veículo')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboTipoVeiculo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Carro Passeio')]")
    protected WebElement opcaoComboTipoVeiculoCarroPasseio;

    @FindBy(how = How.XPATH, xpath = "//input[@value='NOVO']")
    protected WebElement checkEstadoVeiculoNovo;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Modelo de veículo')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboModeloVeiculo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind')]")
    protected WebElement opcaoComboModeloVeiculoGLC43CoupeBlind;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='hasAccessory'])[1]")
    protected WebElement checkTemAcessorioAdicional;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Acessório')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboTipoAcessorio;

    @FindBy(how = How.XPATH, xpath = "(//input[@type='radio'])[5]")
    protected WebElement checkTipoPessoaFisica;

    @FindBy(how = How.XPATH, xpath = "(//input[@type='radio'])[6]")
    protected WebElement checkTipoPessoaJuridica;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), '4º DIRECIONAL MECÂNICO')]")
    protected WebElement opcaoComboTipoAcessorio4DirecionalMecanico;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'Valor do acessório')]/following-sibling::input")
    protected WebElement campoValorAcessorio;
    //******** FIM VEICULO ********************//

    //******** FINANCIAMENTO ********************//
    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Produto')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboProduto;

    @FindBy(how = How.XPATH, xpath = "(//span[contains(text(), 'CDC')])[1]")
    protected WebElement opcaoComboProdutoCDC;

    @FindBy(how = How.XPATH, xpath = "(//span[contains(text(), 'CDC Decrescente')])[1]")
    protected WebElement opcaoComboProdutoCdcDecrescente;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Campanha')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboCampanha;

    @FindBy(how = How.XPATH, xpath = "(//span[contains(text(), 'Taxa')])[1]")
    protected WebElement opcaoComboCampanhaTaxa;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Prazo')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboPrazo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), '36')]")
    protected WebElement opcaoComboPrazo36;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Carência')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboCarencia;

    @FindBy(how = How.XPATH, xpath = "(//a//span[contains(text(), '0')])[1]")
    protected WebElement opcaoComboCarenciaZero;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='downPayment']")
    protected WebElement campoValorEntrada;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Prestamista (PPI)')]/following-sibling::label/input)[1]")
    protected WebElement checkPrestamista;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Prestamista (PPI)')]/following-sibling::label/input)[2]")
    protected WebElement checkSemPrestamista;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='WarrantyInsuranceValue']")
    protected WebElement campoGarantiaEstendida;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Simular seguro do veículo?')]/following-sibling::label/input)[1]")
    protected WebElement checkSimularSeguro;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='insuranceValue']")
    protected WebElement campoValorAproximadoSeguro;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'GERAR SIMULAÇÃO')]")
    protected WebElement btnGerarSimulacao;

    @FindBy(how = How.XPATH, xpath = ".button-primary-bmb:nth-child(2)")
    protected WebElement btnContinuar;

    //******** FIM FINANCIAMENTO ********************//

    //******** MENSAGENS ********************//
    @FindBy(how = How.CSS, css = ".error-msg")
    protected WebElement mensagemErro;
    //******** FIM MENSAGENS ********************//
    public CadastroVeiculoPage() {
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    //******** MÉTODOS VEICULOS ********************//

    private void selecionarAnoFabricacao(String ano) throws InterruptedException {
        Thread.sleep(5000);
        clicarElemento(comboAnoFabricacao,20);
        if(ano.equalsIgnoreCase("2022"))
            clicarElemento(opcaoComboAnoFabricacao2022,20);
    }

    private void selecionarTipoVeiculo(String tipoVeiculo){
        clicarElemento(comboTipoVeiculo, 60);
        if(tipoVeiculo.equalsIgnoreCase("carro passeio"))
            opcaoComboTipoVeiculoCarroPasseio.click();
    }

    private void selecionarModeloVeiculo(String modeloVeiculo) throws InterruptedException {
        Thread.sleep(15000);
        clicarElemento(comboModeloVeiculo, 60);
        if(modeloVeiculo.equalsIgnoreCase("GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind"))
            clicarElemento(opcaoComboModeloVeiculoGLC43CoupeBlind, 60);
    }

    private void selecionarAcessorioVeiculo(String acessorioVeiculo) throws InterruptedException {
        clicarElemento(comboTipoAcessorio, 60);
        if(acessorioVeiculo.equalsIgnoreCase("4 DIRECIONAL MECANICO"))
            clicarElemento(opcaoComboTipoAcessorio4DirecionalMecanico, 60);
    }

    public void preencherCamposVeiculo(String anoFabricacao, String tipoVeiculo, String estadoVeiculo,
                                       String modelo, String valor, String quantidade, String adicionarAcessorio,
                                       String acessorio, String valorAcessorio) throws InterruptedException {
        selecionarAnoFabricacao(anoFabricacao);
        Thread.sleep(17000);
        clicarElemento(comboAnoModelo, 90);
        selecionarTipoVeiculo(tipoVeiculo);
        if(estadoVeiculo.equalsIgnoreCase("novo"))
            checkEstadoVeiculoNovo.click();
        selecionarModeloVeiculo(modelo);
        Thread.sleep(5000);
        if(adicionarAcessorio.equalsIgnoreCase("sim")) {
            checkTemAcessorioAdicional.click();
            selecionarAcessorioVeiculo(acessorio);
            inserirValor(campoValorAcessorio, valorAcessorio, 60);
        }
    }
    //******** PREENCHIMENTO FINANCIAMENTO ********************//

    private void selecionarProdutoFinanciamento(String produto){
        clicarElemento(comboProduto);
        if(produto.equalsIgnoreCase("cdc"))
            opcaoComboProdutoCDC.click();
        if(produto.equalsIgnoreCase("cdc decrescente"))
            opcaoComboProdutoCdcDecrescente.click();
    }

    public void preencherFinanciamento(String produto, String campanha, String prazo, String carencia, String tipoPessoa, String entrada,
                                       String prestamista, String garantiaEstendida, String seguroVeiculo, String valorAproxSeguro) {
        selecionarProdutoFinanciamento(produto);
        clicarElemento(comboCampanha);
        clicarElemento(opcaoComboCampanhaTaxa);
        clicarElemento(comboPrazo);
        clicarElemento(opcaoComboPrazo36);
        clicarElemento(comboCarencia);
        clicarElemento(opcaoComboCarenciaZero);
        if (tipoPessoa.equalsIgnoreCase("Fisica")){
            checkTipoPessoaFisica.click();
        }
        if (tipoPessoa.equalsIgnoreCase("Juridica")){
            checkTipoPessoaJuridica.click();
        }
        campoValorEntrada.clear();
        inserirValor(campoValorEntrada, entrada);
        if (prestamista.equalsIgnoreCase("não") || prestamista.equalsIgnoreCase("nao"))
            checkSemPrestamista.click();
        if(prestamista.equalsIgnoreCase("sim")) {
            checkPrestamista.click();
            campoGarantiaEstendida.clear();
            inserirValor(campoGarantiaEstendida, garantiaEstendida);
        }
        if (seguroVeiculo.equalsIgnoreCase("sim")) {
            checkSimularSeguro.click();
            inserirValor(campoValorAproximadoSeguro, valorAproxSeguro);
        }
    }


    public void clicarGerarSimulacao() throws InterruptedException {
        clicarElemento(btnGerarSimulacao);
        Thread.sleep(5000);
    }

    //******** FIM PREENCHIMENTO FINANCIAMENTO ********************//

}
