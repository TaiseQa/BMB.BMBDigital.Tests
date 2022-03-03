package framework.pages;

import framework.utils.Utils;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import framework.utils.GeraCpfCnpj;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroFichaPage extends InteracoesTelaWeb {

    //Botões
    @FindBy(how = How.XPATH, xpath = "//button[contains(.,'Nova ficha')]")
    protected WebElement btnNovaFicha;

    @FindBy(how = How.CSS, css = ".btn-cpfCnpj")
    protected WebElement btnSelecionarCpfCnpj;

    //********* Campos Identificação do Cliente e Conjuge *********//
    @FindBy(how = How.CSS, css = "[formcontrolname='cpfCnpj']")
    protected WebElement campoCpfCnpj;

    @FindBy(how = How.ID, id = "name")
    protected WebElement campoNome;

    @FindBy(how = How.ID, id = "birthDate")
    protected WebElement campoDataNascimento;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'E-mail')]/following-sibling::div/input[@class='form-control ng-untouched ng-pristine ng-invalid']")
    protected WebElement campoEmail;

    @FindBy(how = How.CSS, css = "[formcontrolname='celPhone']")
    protected WebElement campoCelular;

    @FindBy(how = How.XPATH, xpath = "(//div[@formgroupname='maritalStatus']//span[@class='ngx-select__placeholder text-muted']/span[contains(.,'Selecione')])[1]")
    protected WebElement comboEstadoCivil;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Solteiro')]")
    protected WebElement opcaoComboEstadoCivilSolteiro;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Casado')]")
    protected WebElement opcaoComboEstadoCivilCasado;

    @FindBy(how = How.XPATH, xpath = "(//ngx-select[@formcontrolname='matrimonialRegimeId']/div)[1]")
    protected WebElement comboRegimeCasamento;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Comunhão Total De Bens')]")
    protected WebElement opcaoComboRegimeCasamentoComunhaoTotalBens;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Separação Total De Bens')]")
    protected WebElement opcaoComboRegimeCasamentoSeparacaoTotalBens;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='spouseName'])[1]")
    protected WebElement campoNomeConjuge;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='spouseRegisterNumber'])[1]")
    protected WebElement campoCpfConjuge;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='spouseBirthDate'])[1]")
    protected WebElement campoDataNascimentoConjuge;
    //******* fim identificação do cliente **********//

    //******** DADOS ADICIONAIS ********************//
    @FindBy(how = How.XPATH, xpath = "(//div[contains(text(), 'Dados adicionais')])[1]")
    protected WebElement areaDadosAdicionais;

    @FindBy(how = How.XPATH, xpath = "(//input[@value='M']/following-sibling::span[contains(text(), 'Masculino')])[1]")
    protected WebElement opcaoCheckSexoMasculino;

    @FindBy(how = How.XPATH, xpath = "(//input[@value='F']/following-sibling::span[contains(text(), 'Feminino')])[1]")
    protected WebElement opcaoCheckSexoFemino;

    @FindBy(how = How.XPATH, xpath = "(//div[@formgroupname='scholarity']//ngx-select//div)[1]")
    protected WebElement comboeEscolaridade;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'FUNDAMENTAL')]")
    protected WebElement opcaoComboEscolaridadeEnsinoFundamental;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'MÉDIO')]")
    protected WebElement opcaoComboEscolaridadeEnsinoMedio;

    @FindBy(how = How.CSS, css = ".complete-scholarity[formgroupname='scholarity']")
    protected WebElement comboSituacaoEscolar;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Completo')]")
    protected WebElement opcaoComboSituacaoEscolarCompleto;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Naturalidade (país)')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboNaturalidadePais;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'BRASILEIRA')]")
    protected WebElement opcaoComboNaturalidadePaisBrasileira;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'ESTRANGEIRA')]")
    protected WebElement opcaoComboNaturalidadePaisEstrangeira;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Naturalidade (estado)')]/following-sibling::app-control-field)[1]")
    protected WebElement comboNaturalidadeEstado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'São Paulo')]")
    protected WebElement opcaoComboNaturalidadeEstadoSaoPaulo;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Naturalidade (cidade)')]/following-sibling::app-control-field)[1]")
    protected WebElement comboNaturalidadeCidade;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'BARUERI')]")
    protected WebElement opcaoComboNaturalidadeCidadeBarueri;

    @FindBy(how = How.ID, id = "motherName")
    protected WebElement campoNomeDaMae;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Documento do Proponente')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboDocumentoDoProponente;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'RG')]")
    protected WebElement opcaoComboDocumentoProponenteRg;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'PASSAPORTE')]")
    protected WebElement opcaoComboDocumentoProponentePassaporte;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'OAB']")
    protected WebElement opcaoComboDocumentoProponenteOab;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='documentNumber']")
    protected WebElement campoNumeroDocumento;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='documentExpeditionDate']")
    protected WebElement campoDataExpedicao;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'UF')]/following-sibling::ngx-select/div)[1]")
    protected WebElement comboUfDocumentoProponente;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'SP')]")
    protected WebElement opcaoComboUfDocumentoProponenteSp;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='documentIssuerDescription']")
    protected WebElement campoOrgaoEmissor;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='documentExpirationDate']")
    protected WebElement campoDataValidadePassaporte;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Patrimônio estimado')]/following-sibling::ngx-select/div)[1]")
    public WebElement comboPatrimonioEstimado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'de R$500.000,00 até R$1.000.000,00')]")
    public WebElement opcaoComboPatrimonioEstimadoQuinhentosMilUmMilhao;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'de R$2.000.000,00 até R$5.000.000,00')]")
    public WebElement opcaoComboPatrimonioEstimadoDoisMilhoesACinco;
    //******** FIM DADOS ADICIONAIS ********************//

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='amountVehicles']")
    public WebElement campoQuantidadeVeiculosProprios;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Haverá um avalista')]")
    public WebElement campoHaveraAvalista;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='taxId'])[2]")
    public WebElement campoCpfAvalista;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='name'])[3]")
    public WebElement campoNomeAvalista;

    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Natureza da ocupação')]/following-sibling::ngx-select/div)[2]")
    public WebElement comboNaturezaOcupacaoAvalista;

    @FindBy(how = How.XPATH, xpath = "(//span[contains(text(), 'Empregado no Setor Privado')])[2]")
    public WebElement opcaoComboNaturezaOcupacaoAvalistaEmpregadoSetorPrivado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Profissional Liberal/Autonomo')]")
    public WebElement opcaoComboNaturezaOcupacaoAvalistaProfissionalLiberalAutonomo;

    //********  ENDEREÇO ********************//
    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[2]/div/input")
    public WebElement campoCep;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[5]/div/input")
    public WebElement campoNumero;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[6]/input")
    public WebElement campoComplemento;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[10]/app-control-field/ngx-select/div/div[2]/div")
    public WebElement comboTipoResidencia;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Própria')]")
    public WebElement opcaoComboTipoResidenciaPropria;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Alugada')]")
    public WebElement opcaoComboTipoResidenciaAlugada;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[11]/div/input")
    public WebElement campoTempoDeResidencia;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[2]/div/div[13]/input")
    public WebElement campoCepComercial;
    //********  FIM ENDEREÇO ********************//

    //********  DADOS PROFISSIONAIS ********************//
    @FindBy(how = How.XPATH, xpath = "(//label[contains(text(), 'Natureza da ocupação')]/following-sibling::ngx-select/div)[1]")
    public WebElement comboNaturezaOcupacao;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Serv. Publ Aut/Fund')]")
    public WebElement opcaoComboNaturezaOcupacaoServPublicAutFund;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Profissional Liberal/Autonomo')]")
    protected WebElement opcaoComboNaturezaOcupacaoProfissionalLiberalAutonomo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Empregado no Setor Privado')]")
    protected WebElement opcaoComboNaturezaOcupacaoEmpregadoSetorPrivado;

    @FindBy(how = How.ID, id = "admissionDate")
    public WebElement campoDataAdmissao;

    @FindBy(how = How.ID, id = "salary")
    public WebElement campoSalarioRenda;

    @FindBy(how = How.ID, id = "extraIncomeSourceValue")
    public WebElement campoOutrasRendas;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[5]/div/div[17]/app-control-field/input")
    public WebElement campoOrigemOutrasRendas;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='mainActivity']")
    protected WebElement campoAtividadePrincipal;
    //********  FIM DADOS PROFISSIONAIS ********************//

    //********  DECLARAÇÃO POLÍTICA ********************//
    @FindBy(how = How.XPATH, xpath = "(//input[@name='isPublicOffice'])[1]")
    public WebElement checkDesempenhaCargoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@name='isPublicOffice'])[2]")
    public WebElement checkNaoDesempenhaCargoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@name='hasKinshipPublicOffice'])[2]")
    public WebElement checkSemParentescoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='publicOfficeWork'])[2]")
    public WebElement campoFuncaoExercidaParentescoPolitico;
    //******** FIM DECLARAÇÃO POLÍTICA ********************//

    //Finalidade do financiamento
    @FindBy(how = How.XPATH, xpath = "//ngx-select[@formcontrolname='financingPurpose']/div")
    public WebElement comboFinalidadeFinanciamento;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Uso particular')]")
    protected WebElement opcaoComboFinalidadeFinanciamentoUsoParticular;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'SALVAR CLIENTE')]")
    protected WebElement btnSalvarCliente;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'OK')]")
    protected WebElement btnConfirmarClienteSalvo;

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Física')]")
    protected WebElement checkTipoPessoaFisica;

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
    //******** FIM FINANCIAMENTO ********************//

    //******** FLUXO FINANCEIRO ********************//
    ////a[contains(text(),'Fluxo')]
    //@FindBy(how = How.XPATH, xpath = "//div[contains(text(), 'FLUXO FINANCEIRO')]")
    @FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Fluxo')]")
    protected WebElement tituloFluxoFinanceiro;

    @FindBy(how = How.XPATH, xpath = "(//button[contains(text(), 'CONTINUAR')])[1]")
    protected WebElement btnContinuarFluxoFinanceiro;

    @FindBy(how = How.XPATH, xpath = "(//button[contains(text(), 'CONTINUAR')])[2]")
    protected WebElement btnContinuarAvisoSeguro;
    //******** FIM FLUXO FINANCEIRO ********************//

    //******** AVISO SEGURO ********************//

    @FindBy(how = How.XPATH, xpath = "(//input[@name='chkVehicleInsurance'])[2]")
    protected WebElement checkNaoDesejoSeguro;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'CONTINUAR')]")
    protected WebElement btnContinuarSeguro;
    //******** FIM AVISO SEGURO ********************//

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='autorize']")
    protected WebElement checkAceitarTermoJuridico;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'ENVIAR PROPOSTA DE CRÉDITO')]")
    protected WebElement btnEnviarPropostaCredito;

    @FindBy(how = How.XPATH, xpath = "(//ngx-select[@formcontrolname='id']//div)[1]")
    protected WebElement comboSelecionarVendedor;

    @FindBy(how = How.XPATH, xpath = "(//a//span)[1]")
    protected WebElement opcaoComboSelecionarVendedor;

    @FindBy(how = How.XPATH, xpath = "(//button[contains(text(), 'ENVIAR')])[2]")
    protected WebElement btnEnviarVendedor;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'OK')]")
    protected WebElement btnConfirmarEnvioPropostaCredito;

    @FindBy(how = How.XPATH, xpath = "(//div[@class='col-8']//div[@class='info']/span)[1]")
    protected WebElement nomeClienteTelaPropostaCadastrada;

    @FindBy(how = How.XPATH, xpath = "(//div[@class='col-4']//div[@class='info']/span)[1]")
    protected WebElement cpfClienteTelaPropostaCadastrada;

    //******** MENSAGENS ********************//
    @FindBy(how = How.CSS, css = ".error-msg")
    protected WebElement mensagemErro;
    //******** FIM MENSAGENS ********************//

    public CadastroFichaPage(){
        super(Utils.getDriver());
        PageFactory.initElements(Utils.getDriver(), this);
    }

    //******** MÉTODOS NOVO CLIENTE ********************//
    public void clicarBotaoNovaFicha() throws InterruptedException {
        Thread.sleep(30000);
        clicarElemento(btnNovaFicha, 90);
    }

    public void preencheCpfCnpj(String cpfCnpj) {
        inserirValor(campoCpfCnpj, cpfCnpj, 20);
        clicarElemento(btnSelecionarCpfCnpj);
    }

    public String obterTextoMensagemErro(){
        return obterValorTexto(mensagemErro);
    }

    public void preencherIdentificacaoCliente(String nome, String dataNascimento, String email, String celular, String estadoCivil) throws InterruptedException {
        Thread.sleep(15000);
        inserirValor(campoNome, nome);
        inserirValor(campoDataNascimento, dataNascimento);
        inserirValor(campoEmail, email);
        inserirValor(campoCelular, celular);
        selecionarEstadoCivil(estadoCivil);
    }

    public void preencherIdentificacaoConjuge(String regimeCasamento, String nome, String data) throws InterruptedException {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        selecionarRegimeCasamento(regimeCasamento);
        inserirValor(campoNomeConjuge, nome);
        inserirValor(campoCpfConjuge, geraCpfCnpj.cpf(false));
        inserirValor(campoDataNascimentoConjuge, data);
    }

    public void preencherCamposEndereco(String cep, String numero, String complemento, String tipoResidencia,
                                        String tempoResidencia, String cepComercial) throws InterruptedException {

        inserirValor(campoCep, cep);
        inserirValor(campoNumero, numero);
        Thread.sleep(10000);
        inserirValor(campoComplemento, complemento);
        selecionarTipoResidencia(tipoResidencia);
        campoTempoDeResidencia.clear();
        Thread.sleep(5000);
        campoTempoDeResidencia.sendKeys(tempoResidencia);
        inserirValor(campoCepComercial, cepComercial);
    }

    public void preencherDadosAdicionais(String sexo, String escolaridade, String statusEscolaridade, String paisNaturalidade,
                                         String estadoNaturalidade, String cidadeNaturalidade, String nomeMae,
                                         String documentoProponente, String numeroDocumento, String dataExpedicao,
                                         String ufDocumento, String orgaoEmissor) throws InterruptedException {
        clicarElemento(areaDadosAdicionais);
        selecionarSexo(sexo);
        selecionarEscolaridade(escolaridade);
        selecionarSituacaoEscolaridade(statusEscolaridade);
        selecionarNaturalidadePais(paisNaturalidade);
        if(!estadoNaturalidade.isEmpty())
            selecionarNaturalidadeEstado(estadoNaturalidade);
        if(!estadoNaturalidade.isEmpty())
            selecionarNaturalidadeCidade(cidadeNaturalidade);
        inserirValor(campoNomeDaMae, nomeMae);
        selecionarDocumentoProponente(documentoProponente);
        inserirValor(campoNumeroDocumento, numeroDocumento);
        inserirValor(campoDataExpedicao, dataExpedicao);
        selecionarUfDocumentoProponente(ufDocumento);
        inserirValor(campoOrgaoEmissor, orgaoEmissor);

    }

    public void preencherDadosAdicionaisEstrangeiro(String sexo, String escolaridade, String statusEscolaridade,
                                                    String paisNaturalidade, String nomeMae, String documentoProponente,
                                                    String numeroDocumento, String dataExpedicao, String validade,
                                                    String ufDocumento, String orgaoEmissor) throws InterruptedException {
        preencherDadosAdicionais(sexo,escolaridade,statusEscolaridade, paisNaturalidade, "", "",
                nomeMae, documentoProponente, numeroDocumento, dataExpedicao,ufDocumento, orgaoEmissor);
        inserirValor(campoDataValidadePassaporte, validade);

    }

    public void preencherDadosProfissionais(String naturezaOcupacao, String dataAdmissao, String renda, String outrasRendas,
                                            String origem, String atividadePrincipal) throws InterruptedException {
        selecionarNaturezaOcupacao(naturezaOcupacao);
        inserirValor(campoDataAdmissao, dataAdmissao, 30);
        inserirValor(campoSalarioRenda, renda);
        inserirValor(campoOutrasRendas, outrasRendas);
        inserirValor(campoOrigemOutrasRendas, origem, 30);
        inserirValor(campoAtividadePrincipal, atividadePrincipal);
    }

    public void preencherDeclaracaoExposicaoPolitica(String funcao, String funcaoExercida, String parentesco) throws InterruptedException {
        selecionarSeDesempenhouCargoPolitico(funcao);
        if (!funcaoExercida.isEmpty()){
            Thread.sleep(5000);
            campoFuncaoExercidaParentescoPolitico.sendKeys(funcaoExercida);
        }
        selecionarSePossuiParentescoPolitico(parentesco);
    }

    public void selecionarFinalidadeFinanciamento(String finalidadeFinanciamento) {
        clicarElemento(comboFinalidadeFinanciamento);
        if(finalidadeFinanciamento.equalsIgnoreCase("uso particular"))
            clicarElemento(opcaoComboFinalidadeFinanciamentoUsoParticular, 30);
    }


    public void clicarSalvarCliente() {
        btnSalvarCliente.click();
    }

    //******** FIM MÉTODOS NOVO CLIENTE ********************//

    //******** MÉTODOS SIMULAÇÃO ********************//
    public boolean verificarPaginaSimulacao() throws InterruptedException {
        clicarElemento(btnConfirmarClienteSalvo, 90);
        Thread.sleep(20000);
        return tituloVeiculoPaginaSimulacao.isDisplayed();
    }

    public void preencherCamposVeiculo(String anoFabricacao, String tipoVeiculo, String estadoVeiculo,
                                       String modelo, String valor, String quantidade, String adicionarAcessorio,
                                       String acessorio, String valorAcessorio) throws InterruptedException {
        selecionarAnoFabricacao(anoFabricacao);
        Thread.sleep(15000);
        clicarElemento(comboAnoModelo, 90);
        selecionarTipoVeiculo(tipoVeiculo);
        if(estadoVeiculo.equalsIgnoreCase("novo"))
            checkEstadoVeiculoNovo.click();
        selecionarModeloVeiculo(modelo);
        Thread.sleep(10000);
        if(adicionarAcessorio.equalsIgnoreCase("sim")) {
            checkTemAcessorioAdicional.click();
            selecionarAcessorioVeiculo(acessorio);
            inserirValor(campoValorAcessorio, valorAcessorio, 60);
        }
    }

    public void preencherFinanciamento(String produto, String campanha, String prazo, String carencia, String entrada,
                                       String prestamista, String garantiaEstendida, String seguroVeiculo, String valorAproxSeguro) {
        selecionarProdutoFinanciamento(produto);
        clicarElemento(comboCampanha);
        clicarElemento(opcaoComboCampanhaTaxa);
        clicarElemento(comboPrazo);
        clicarElemento(opcaoComboPrazo36);
        clicarElemento(comboCarencia);
        clicarElemento(opcaoComboCarenciaZero);
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

    public void clicarGerarSimulacao(){
        clicarElemento(btnGerarSimulacao);
    }

    //******** FIM MÉTODOS SIMULAÇÃO ********************//

    public boolean verificarTelaFluxoFinanceiro(){
        aguardarVisibilidade(tituloFluxoFinanceiro,120);
        return tituloFluxoFinanceiro.isDisplayed();
    }

    public void clicarBotaoContinuarFluxoFinanceiro(){
        clicarElemento(btnContinuarFluxoFinanceiro);
    }

    public void habilitarSolicitacaoSeguroVeiculo() throws InterruptedException {
        Thread.sleep(20000);
        clicarElemento(btnContinuarAvisoSeguro,90);
    }

    public void selecionarNaoDesejoSeguroVeiculo() throws InterruptedException {
        Thread.sleep(40000);
        checkNaoDesejoSeguro.click();
        btnContinuarSeguro.click();
    }

    public void EnviarPropostaDeCredito() throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(checkAceitarTermoJuridico);
        clicarElemento(btnEnviarPropostaCredito);
    }

    public void preencherVendedor(String vendedor) {
        clicarElemento(comboSelecionarVendedor);
        clicarElemento(opcaoComboSelecionarVendedor);
    }

    public void clicarBotaoEnviarVendedor() throws InterruptedException {
        Thread.sleep(5000);
        clicarElemento(btnEnviarVendedor, 90);
    }

    public void clicarBotaoConfirmarEnvioPropostaCredito() throws InterruptedException {
        Thread.sleep(60000);
        clicarElemento(btnConfirmarEnvioPropostaCredito);
    }

    public boolean verificarTelaPropostaCadastrada() {
        aguardarVisibilidade(nomeClienteTelaPropostaCadastrada);
        aguardarVisibilidade(cpfClienteTelaPropostaCadastrada);
        return nomeClienteTelaPropostaCadastrada.isDisplayed() && cpfClienteTelaPropostaCadastrada.isDisplayed();
    }

    public void preencherPatrimonioEstimado(String patrimonio) {
        selecionarPatrimonioEstimado(patrimonio);
    }

    public void preencherTotalVeiculosProprios(String quantidadeVeiculos) {
        campoQuantidadeVeiculosProprios.clear();
        inserirValor(campoQuantidadeVeiculosProprios, quantidadeVeiculos);
    }

    public void preencherCamposAvalista(String haveraAvalista, String cpf, String nome, String naturezaOcupacao,
                                        String estadoCivil) throws InterruptedException {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        if(haveraAvalista.equalsIgnoreCase("haverá um avalista") || haveraAvalista.equalsIgnoreCase("havera um avalista"))
            campoHaveraAvalista.click();
        Thread.sleep(30000);
        inserirValor(campoCpfAvalista, geraCpfCnpj.cpf(false), 30);
        campoNomeAvalista.sendKeys(nome);
        selecionarNaturezaOcupacaoAvalista(naturezaOcupacao);
        selecionarEstadoCivil(estadoCivil);
    }

    //******** MÉTODOS AUXILIARES ********************//
    private void selecionarAcessorioVeiculo(String acessorioVeiculo) throws InterruptedException {
        clicarElemento(comboTipoAcessorio, 60);
        if(acessorioVeiculo.equalsIgnoreCase("4 DIRECIONAL MECANICO"))
            clicarElemento(opcaoComboTipoAcessorio4DirecionalMecanico, 60);
    }

    private void selecionarModeloVeiculo(String modeloVeiculo) throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(comboModeloVeiculo, 60);
        if(modeloVeiculo.equalsIgnoreCase("GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind"))
            clicarElemento(opcaoComboModeloVeiculoGLC43CoupeBlind, 60);
    }

    private void selecionarTipoVeiculo(String tipoVeiculo){
        clicarElemento(comboTipoVeiculo, 60);
        if(tipoVeiculo.equalsIgnoreCase("carro passeio"))
            opcaoComboTipoVeiculoCarroPasseio.click();
    }

    private void selecionarProdutoFinanciamento(String produto){
        clicarElemento(comboProduto);
        if(produto.equalsIgnoreCase("cdc"))
            opcaoComboProdutoCDC.click();
        if(produto.equalsIgnoreCase("cdc decrescente"))
            opcaoComboProdutoCdcDecrescente.click();
    }

    private void selecionarTipoResidencia(String tipoResidencia) throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(comboTipoResidencia,20);
        Thread.sleep(2000);
        if(tipoResidencia.equalsIgnoreCase("propria") ||
                tipoResidencia.equalsIgnoreCase("própia"))
            clicarElemento(opcaoComboTipoResidenciaPropria);
        if(tipoResidencia.equalsIgnoreCase("alugada"))
            clicarElemento(opcaoComboTipoResidenciaAlugada);
    }

    private void selecionarRegimeCasamento(String regimeCasamento) throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(comboRegimeCasamento,20);
        if(regimeCasamento.equalsIgnoreCase("Comunhão Total de Bens") ||
                regimeCasamento.equalsIgnoreCase("Comunhao Total de Bens"))
            clicarElemento(opcaoComboRegimeCasamentoComunhaoTotalBens,20);
    }

    private void selecionarPatrimonioEstimado(String patrimonio)  {
        clicarElemento(comboPatrimonioEstimado,20);
        if(patrimonio.equalsIgnoreCase("de R$500.000,00 até R$1.000.000,00"))
            clicarElemento(opcaoComboPatrimonioEstimadoQuinhentosMilUmMilhao,20);
    }

    private void selecionarAnoFabricacao(String ano) {
        clicarElemento(comboAnoFabricacao,20);
        if(ano.equalsIgnoreCase("2022"))
            clicarElemento(opcaoComboAnoFabricacao2022,20);
    }

    private void selecionarSePossuiParentescoPolitico(String parente){
        if(parente.equalsIgnoreCase("não") || parente.equalsIgnoreCase("nao"))
            checkSemParentescoPolitico.click();
    }

    private void selecionarSeDesempenhouCargoPolitico(String funcao){
        if(funcao.equalsIgnoreCase("sim"))
            checkDesempenhaCargoPolitico.click();
        if(funcao.equalsIgnoreCase("não") || funcao.equalsIgnoreCase("nao"))
            checkNaoDesempenhaCargoPolitico.click();
    }

    private void selecionarNaturezaOcupacao(String naturezaOcupacao) throws InterruptedException {
        clicarElemento(comboNaturezaOcupacao);
        Thread.sleep(2000);
        if(naturezaOcupacao.equalsIgnoreCase("Profissional Liberal Autonomo"))
            clicarElemento(opcaoComboNaturezaOcupacaoProfissionalLiberalAutonomo);
        if(naturezaOcupacao.equalsIgnoreCase("Empregado no Setor Privado"))
            clicarElemento(opcaoComboNaturezaOcupacaoEmpregadoSetorPrivado, 30);
    }

    private void selecionarNaturezaOcupacaoAvalista(String naturezaOcupacao) throws InterruptedException {
        Thread.sleep(2000);
        clicarElemento(comboNaturezaOcupacaoAvalista);
        Thread.sleep(1000);
        if(naturezaOcupacao.equalsIgnoreCase("Profissional Liberal Autonomo"))
            opcaoComboNaturezaOcupacaoAvalistaProfissionalLiberalAutonomo.click();
        if(naturezaOcupacao.equalsIgnoreCase("Empregado no Setor Privado"))
            opcaoComboNaturezaOcupacaoAvalistaEmpregadoSetorPrivado.click();
    }

    private void selecionarUfDocumentoProponente(String documento) throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(comboUfDocumentoProponente);
        if(documento.equalsIgnoreCase("sp"))
            clicarElemento(opcaoComboUfDocumentoProponenteSp);
    }

    private void selecionarDocumentoProponente(String documento){
        clicarElemento(comboDocumentoDoProponente);
        if(documento.equalsIgnoreCase("rg"))
            clicarElemento(opcaoComboDocumentoProponenteRg);
        if(documento.equalsIgnoreCase("passaporte"))
            clicarElemento(opcaoComboDocumentoProponentePassaporte);
    }

    private void selecionarNaturalidadeCidade(String naturalidadeCidade) throws InterruptedException {
        Thread.sleep(10000);
        clicarElemento(comboNaturalidadeCidade);
        if(naturalidadeCidade.equalsIgnoreCase("barueri")) {
            opcaoComboNaturalidadeCidadeBarueri.click();
        }
    }

    private void selecionarNaturalidadeEstado(String naturalidadeEstado) throws InterruptedException {
        Thread.sleep(5000);
        clicarElemento(comboNaturalidadeEstado, 20);
        if(naturalidadeEstado.equalsIgnoreCase("são paulo")
                || naturalidadeEstado.equalsIgnoreCase("sao paulo")
                || naturalidadeEstado.equalsIgnoreCase("sp")) {
            clicarElemento(opcaoComboNaturalidadeEstadoSaoPaulo, 20);
        }
    }

    private void selecionarNaturalidadePais(String naturalidadePais){
        clicarElemento(comboNaturalidadePais);
        if(naturalidadePais.equalsIgnoreCase("brasileira"))
            clicarElemento(opcaoComboNaturalidadePaisBrasileira);
        if(naturalidadePais.equalsIgnoreCase("estrangeira"))
            clicarElemento(opcaoComboNaturalidadePaisEstrangeira);
    }

    private void selecionarSituacaoEscolaridade(String statusEscolaridade){
        clicarElemento(comboSituacaoEscolar);
        if(statusEscolaridade.equalsIgnoreCase("completo"))
            clicarElemento(opcaoComboSituacaoEscolarCompleto);
    }

    private void selecionarEscolaridade(String escolaridade){
        clicarElemento(comboeEscolaridade);
        if(escolaridade.equalsIgnoreCase("ensino fundamental"))
            clicarElemento(opcaoComboEscolaridadeEnsinoFundamental);
        if(escolaridade.equalsIgnoreCase("ensino medio") || escolaridade.equalsIgnoreCase("ensino médio"))
            clicarElemento(opcaoComboEscolaridadeEnsinoMedio);
    }

    private void selecionarEstadoCivil(String estadoCivil){
        clicarElemento(comboEstadoCivil);
        if(estadoCivil.equalsIgnoreCase("solteiro"))
            clicarElemento(opcaoComboEstadoCivilSolteiro);
        if(estadoCivil.equalsIgnoreCase("casado"))
            clicarElemento(opcaoComboEstadoCivilCasado);
    }

    private void selecionarSexo(String sexo) {
        if (sexo.equalsIgnoreCase("feminino"))
            opcaoCheckSexoFemino.click();
        if (sexo.equalsIgnoreCase("masculino"))
            opcaoCheckSexoMasculino.click();
    }

    //******** FIM MÉTODOS AUXILIARES ********************//
}
