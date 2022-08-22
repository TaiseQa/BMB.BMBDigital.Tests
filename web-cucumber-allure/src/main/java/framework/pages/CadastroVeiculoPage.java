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
//    public CadastroVeiculoPage() {
//        super(Utils.getDriver());
//        PageFactory.initElements(Utils.getDriver(), this);
//    }

    //******** MÉTODOS VEICULOS ********************//

    private void selecionarAnoFabricacao(String ano)  {
        esperar(8000);
        clicar(comboAnoFabricacao);
        if(ano.equalsIgnoreCase("2022"))
            clicar(opcaoComboAnoFabricacao2022);
    }

    private void selecionarTipoVeiculo(String tipoVeiculo){
        clicar(comboTipoVeiculo);
        if(tipoVeiculo.equalsIgnoreCase("carro passeio"))
            opcaoComboTipoVeiculoCarroPasseio.click();
    }

    private void selecionarModeloVeiculo(String modeloVeiculo) {
        esperar(20000);
        clicar(comboModeloVeiculo);
        if(modeloVeiculo.equalsIgnoreCase("GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind"))
            clicar(opcaoComboModeloVeiculoGLC43CoupeBlind);
    }

    private void selecionarAcessorioVeiculo(String acessorioVeiculo) {
        clicar(comboTipoAcessorio);
        if(acessorioVeiculo.equalsIgnoreCase("4 DIRECIONAL MECANICO"))
            clicar(opcaoComboTipoAcessorio4DirecionalMecanico);
    }

    public void preencherCamposVeiculo(String anoFabricacao, String tipoVeiculo, String estadoVeiculo,
                                       String modelo, String valor, String quantidade, String adicionarAcessorio,
                                       String acessorio, String valorAcessorio) {
        selecionarAnoFabricacao(anoFabricacao);
        esperandoElementoSumir();
        esperar(1000);
        clicar(comboAnoModelo);
        selecionarTipoVeiculo(tipoVeiculo);
        if(estadoVeiculo.equalsIgnoreCase("novo"))
            checkEstadoVeiculoNovo.click();
        selecionarModeloVeiculo(modelo);
        if(adicionarAcessorio.equalsIgnoreCase("sim")) {
            esperandoElementoSumir();
            checkTemAcessorioAdicional.click();
            selecionarAcessorioVeiculo(acessorio);
            escrever(campoValorAcessorio, valorAcessorio);
        }
    }
    //******** PREENCHIMENTO FINANCIAMENTO ********************//

    private void selecionarProdutoFinanciamento(String produto){
        clicar(comboProduto);
        if(produto.equalsIgnoreCase("cdc"))
            opcaoComboProdutoCDC.click();
        if(produto.equalsIgnoreCase("cdc decrescente"))
            opcaoComboProdutoCdcDecrescente.click();
    }

    public void preencherFinanciamento(String produto, String campanha, String prazo, String carencia, String tipoPessoa, String entrada,
                                       String prestamista, String garantiaEstendida, String seguroVeiculo, String valorAproxSeguro) {
        selecionarProdutoFinanciamento(produto);
        clicar(comboCampanha);
        clicar(opcaoComboCampanhaTaxa);
        clicar(comboPrazo);
        clicar(opcaoComboPrazo36);
        clicar(comboCarencia);
        clicar(opcaoComboCarenciaZero);
        if (tipoPessoa.equalsIgnoreCase("Fisica")){
            checkTipoPessoaFisica.click();
        }
        if (tipoPessoa.equalsIgnoreCase("Juridica")){
            checkTipoPessoaJuridica.click();
        }
        campoValorEntrada.clear();
        escrever(campoValorEntrada, entrada);
        if (prestamista.equalsIgnoreCase("não") || prestamista.equalsIgnoreCase("nao"))
            checkSemPrestamista.click();
        if(prestamista.equalsIgnoreCase("sim")) {
            checkPrestamista.click();
            campoGarantiaEstendida.clear();
            escrever(campoGarantiaEstendida, garantiaEstendida);
        }
        if (seguroVeiculo.equalsIgnoreCase("sim")) {
            checkSimularSeguro.click();
            escrever(campoValorAproximadoSeguro, valorAproxSeguro);
        }
    }

    public void preencherFinanciamento(String produto, String campanha, String prazo, String carencia, String entrada,
                                       String prestamista, String garantiaEstendida, String seguroVeiculo, String valorAproxSeguro) {
        selecionarProdutoFinanciamento(produto);
        clicar(comboCampanha);
        clicar(opcaoComboCampanhaTaxa);
        clicar(comboPrazo);
        clicar(opcaoComboPrazo36);
        clicar(comboCarencia);
        clicar(opcaoComboCarenciaZero);

        campoValorEntrada.clear();
        escrever(campoValorEntrada, entrada);
        if (prestamista.equalsIgnoreCase("não") || prestamista.equalsIgnoreCase("nao"))
            checkSemPrestamista.click();
        if(prestamista.equalsIgnoreCase("sim")) {
            checkPrestamista.click();
            campoGarantiaEstendida.clear();
            escrever(campoGarantiaEstendida, garantiaEstendida);
        }
        if (seguroVeiculo.equalsIgnoreCase("sim")) {
            checkSimularSeguro.click();
            escrever(campoValorAproximadoSeguro, valorAproxSeguro);
        }
    }


    public void clicarGerarSimulacao() {
        clicar(btnGerarSimulacao);
        esperar(3000);
    }

    //******** FIM PREENCHIMENTO FINANCIAMENTO ********************//

}
