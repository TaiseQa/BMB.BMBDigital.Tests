package framework.pages;

import framework.utils.GeraCpfCnpj;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static framework.utils.Utils.getDriver;

public class CadastroFichaPage extends InteracoesTelaWeb {

    //Botões

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Divorciado')]")
    protected WebElement opcaoComboEstadoCivilDivorciadoavalista;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Solteiro')]")
    protected WebElement opcaoComboEstadoCivilSolteiro;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Divorciado')]")
    protected WebElement opcaoComboEstadoCivilDivorciado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'UniaoEstavel')]")
    protected WebElement opcaoComboEstadoCivilUniaoEstavel;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Viuvo')]")
    protected WebElement opcaoComboEstadoCivilViuvo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Desquitado')]")
    protected WebElement opcaoComboEstadoCivilDesquitado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Casado')]")
    protected WebElement opcaoComboEstadoCivilCasado;

    @FindBy(how = How.XPATH, xpath = "(//ngx-select[@formcontrolname='matrimonialRegimeId']/div)[1]")
    protected WebElement comboRegimeCasamento;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Comunhão Total De Bens')]")
    protected WebElement opcaoComboRegimeCasamentoComunhaoTotalBens;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Separação Total De Bens')]")
    protected WebElement opcaoComboRegimeCasamentoSeparacaoTotalBens;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Comunhão Parcial De Bens')]")
    protected WebElement opcaoComboRegimeCasamentoComunhãoParcialDeBens;

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'ANALFABETO')]")
    protected WebElement opcaoComboEscolaridadeAnalfabeto;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'MÉDIO')]")
    protected WebElement opcaoComboEscolaridadeEnsinoMedio;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'SUPERIOR')]")
    protected WebElement opcaoComboEscolaridadeSuperior;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'MBA')]")
    protected WebElement opcaoComboEscolaridadeMbaPosGraduacao;

    @FindBy(how = How.CSS, css = ".complete-scholarity[formgroupname='scholarity']")
    protected WebElement comboSituacaoEscolar;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Completo')]")
    protected WebElement opcaoComboSituacaoEscolarCompleto;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Incompleto')]")
    protected WebElement opcaoComboSituacaoEscolarInCompleto;

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'OAB')]")
    protected WebElement opcaoComboDocumentoProponenteOab;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'CRA')]")
    protected WebElement opcaoComboDocumentoProponenteCra;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'CRC')]")
    protected WebElement opcaoComboDocumentoProponenteCrc;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'CRM')]")
    protected WebElement opcaoComboDocumentoProponenteCrm;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'CNH')]")
    protected WebElement opcaoComboDocumentoProponenteCnh;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'RNE')]")
    protected WebElement opcaoComboDocumentoProponenteRne;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'PASSAPORTE')]")
    protected WebElement opcaoComboDocumentoProponentePassaporte;

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Acima de R$5.000.000,00')]")
    public WebElement opcaoComboPatrimonioEstimadoAcimadeCincoMilhoes;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'até R$500.000,00')]")
    public WebElement opcaoComboPatrimonioEstimadoAteQuinhentosMil;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'de R$1.000.000,00 até R$2.000.000,00')]")
    public WebElement opcaoComboPatrimonioEstimadoDeUmMilhaoADois;

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

    @FindBy(how = How.XPATH, xpath = "(//span[contains(text(), 'Transportador Autônomo')]")
    public WebElement opcaoComboNaturezaOcupacaoTrasportadorAutonomo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Outros')]")
    public WebElement opcaoComboNaturezaOcupacaoOutros;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Estudante')]")
    public WebElement opcaoComboNaturezaOcupacaoEstudante;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Capitalista')]")
    public WebElement opcaoComboNaturezaOcupacaoCapitalista;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Proprietário')]")
    public WebElement opcaoComboNaturezaOcupacaoProprietario;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Aposentado/Pensionista')]")
    public WebElement opcaoComboNaturezaOcupacaoAposentadoPensionista;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Profissional Liberal/Autonomo')]")
    public WebElement opcaoComboNaturezaOcupacaoAvalistaProfissionalLiberalAutonomo;

    @FindBy(how = How.XPATH, xpath = "(//app-control-field//input[@formcontrolname='name'])[2]")
    public WebElement campoNomeDaEmpresa;

    @FindBy(how = How.XPATH, xpath = "//input[@mask='00.000.000/0000-00']")
    public WebElement campoCnpjEmpresa;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='averageIncome']")
    public WebElement campoSomaDoFaturamento;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='percentage']")
    public WebElement campoPorcentagemDeParticipacao;

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

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Serv. Publ ADM Direta')]")
    public WebElement opcaoComboNaturezaOcupacaoServPublicAdmDireta;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Func. Empresa Públ/Econ Mista')]")
    public WebElement opcaoComboNaturezaOcupacaoFuncEmpresaPublEconMista;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Profissional Liberal/Autonomo')]")
    protected WebElement opcaoComboNaturezaOcupacaoProfissionalLiberalAutonomo;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Empregado no Setor Privado')]")
    protected WebElement opcaoComboNaturezaOcupacaoEmpregadoSetorPrivado;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Transportador Autônomo')]")
    protected WebElement opcaoComboNaturezaOcupacaoTransportadorAutonomo;

    @FindBy(how = How.ID, id = "admissionDate")
    public WebElement campoDataAdmissao;

    //Campo de data de adimissão para trasnportador autonomo
    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='admissionDate'])[1]")
    public WebElement campoDataInicioAtividade;

    // campo Data de entrada proprietario
    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='entryDate']")
    public WebElement campoDataentrada;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='salary']")
    public WebElement campoRendaMensal;

    //Campo de receita para trasnportador autonomo
    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='monthlyIncome'])[1]")
    public WebElement campoReceita;

    @FindBy(how = How.ID, id = "extraIncomeSourceValue")
    public WebElement campoOutrasRendas;

    @FindBy(how = How.XPATH, xpath = "//*[@id='bmb-page-body']/app-pf/form/div[5]/div/div[17]/app-control-field/input")
    public WebElement campoOrigemOutrasRendas;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='extraIncomeSourceDescription']")
    public WebElement campoOrigemOutrasRendasSimulacao;

    @FindBy(how = How.XPATH, xpath = "//input[@formcontrolname='mainActivity']")
    protected WebElement campoAtividadePrincipal;

    @FindBy(how = How.XPATH, xpath = "(//ngx-select/div/div/div)[17]")
    protected WebElement comboTipoTransporte;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Escolar')]")
    protected WebElement opcaoComboTipoTransporteEscolar;

    @FindBy(how = How.XPATH, xpath = "(//div/label/input[@formcontrolname='isCooperative'])[2]")
    protected WebElement checkCooperativaNao;

    //********  FIM DADOS PROFISSIONAIS ********************//

    //********  DECLARAÇÃO POLÍTICA ********************//
    @FindBy(how = How.XPATH, xpath = "(//input[@name='isPublicOffice'])[1]")
    public WebElement checkDesempenhaCargoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@name='isPublicOffice'])[2]")
    public WebElement checkNaoDesempenhaCargoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@name='hasKinshipPublicOffice'])[2]")
    public WebElement checkSemParentescoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@name='hasKinshipPublicOffice'])[1]")
    public WebElement checkParentescoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='publicOfficeWork'])[2]")
    public WebElement campoFuncaoExercidaParentescoPolitico;

    @FindBy(how = How.XPATH, xpath = "(//input[@formcontrolname='publicOfficeKinshipDegree'])[2]")
    public WebElement campoParentescoPolitico;
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

    @FindBy(how = How.XPATH, xpath = "//div[contains(text(), 'Cliente criado')]")
    protected WebElement textoClienteCriado;

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

    @FindBy(how = How.XPATH, xpath = "(//ngx-select[@formcontrolname='id']//div//ul//li)[7]")
    protected WebElement opcaoComboSelecionarVendedor;

    @FindBy(how = How.XPATH, xpath = "(//button[contains(text(), 'ENVIAR')])[2]")
    protected WebElement btnEnviarVendedor;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'OK')]")
    protected WebElement btnConfirmarEnvioPropostaCredito;

    @FindBy(xpath = "//button[contains(.,'OK')]")
    private WebElement buttonOkModalPropostaCredito;

    @FindBy(how = How.XPATH, xpath = "(//div[@class='col-8']//div[@class='info']/span)[1]")
    protected WebElement nomeClienteTelaPropostaCadastrada;

    @FindBy(how = How.XPATH, xpath = "(//div[@class='col-4']//div[@class='info']/span)[1]")
    protected WebElement cpfClienteTelaPropostaCadastrada;

    //******** MENSAGENS ********************//
    @FindBy(how = How.CSS, css = ".error-msg")
    protected WebElement mensagemErro;
    //******** FIM MENSAGENS ********************//

    @FindBy(css = "app-financial-simulator-result")
    private WebElement modalAtencao;

//    public CadastroFichaPage() {
//        super(getDriver());
//        PageFactory.initElements(getDriver(), this);
//    }

    //******** MÉTODOS NOVO CLIENTE ********************//

    public void preencheCpfCnpj(String cpfCnpj) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(campoCpfCnpj, cpfCnpj);
        clicar(btnSelecionarCpfCnpj);
    }

    public String obterTextoMensagemErro() {
        return getTexto(mensagemErro);
    }

    public void preencherIdentificacaoCliente(String nome, String dataNascimento, String email, String celular, String estadoCivil) {
        esperandoElementoSumir();
        escrever(campoNome, nome);
        escrever(campoDataNascimento, dataNascimento);
        escrever(campoEmail, email);
        escrever(campoCelular, celular);
        selecionarEstadoCivil(estadoCivil);
    }

    public void preencherIdentificacaoConjuge(String regimeCasamento, String nome, String data) {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        if (!regimeCasamento.isEmpty()) {
            selecionarRegimeCasamento(regimeCasamento);
        }
        escrever(campoNomeConjuge, nome);
        escrever(campoCpfConjuge, geraCpfCnpj.cpf(false));
        escrever(campoDataNascimentoConjuge, data);
    }

    public void preencherIdentificacaoConjuge(String nome, String data) {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        escrever(campoNomeConjuge, nome);
        escrever(campoCpfConjuge, geraCpfCnpj.cpf(false));
        escrever(campoDataNascimentoConjuge, data);
    }

    public void preencherCamposEndereco(String cep, String numero, String complemento, String tipoResidencia, String tempoResidencia, String cepComercial) {

        escrever(campoCep, cep);
        escrever(campoNumero, numero);
        esperar(5000);
        escrever(campoComplemento, complemento);
        selecionarTipoResidencia(tipoResidencia);
        campoTempoDeResidencia.clear();
        esperar(5000);
        campoTempoDeResidencia.sendKeys(tempoResidencia);
        escrever(campoCepComercial, cepComercial);
    }

    public void preencherCamposEndereco(String cep, String numero, String complemento, String tipoResidencia, String tempoResidencia) {
        escrever(campoCep, cep);
        escrever(campoNumero, numero);
        esperar(3000);
        escrever(campoComplemento, complemento);
        selecionarTipoResidencia(tipoResidencia);
        campoTempoDeResidencia.clear();
        esperar(3000);
        campoTempoDeResidencia.sendKeys(tempoResidencia);
    }

    public void preencherDadosAdicionais(String sexo, String escolaridade, String statusEscolaridade, String paisNaturalidade,
                                         String estadoNaturalidade, String cidadeNaturalidade, String nomeMae,
                                         String documentoProponente, String numeroDocumento, String dataExpedicao,
                                         String ufDocumento, String orgaoEmissor, String validadeDocumentoPromonente) {
        esperar(2000);
        clicar(areaDadosAdicionais);
        selecionarSexo(sexo);
        selecionarEscolaridade(escolaridade);
        selecionarSituacaoEscolaridade(statusEscolaridade);
        selecionarNaturalidadePais(paisNaturalidade);
        if (!estadoNaturalidade.isEmpty())
            selecionarNaturalidadeEstado(estadoNaturalidade);
        if (!estadoNaturalidade.isEmpty())
            selecionarNaturalidadeCidade(cidadeNaturalidade);
        escrever(campoNomeDaMae, nomeMae);
        selecionarDocumentoProponente(documentoProponente, validadeDocumentoPromonente);
        escrever(campoNumeroDocumento, numeroDocumento);
        escrever(campoDataExpedicao, dataExpedicao);
        selecionarUfDocumentoProponente(ufDocumento);
        escrever(campoOrgaoEmissor, orgaoEmissor);
    }

    public void preencherDadosAdicionaisEstrangeiro(String sexo, String escolaridade, String statusEscolaridade,
                                                    String paisNaturalidade, String nomeMae, String documentoProponente,
                                                    String numeroDocumento, String dataExpedicao, String validade,
                                                    String ufDocumento, String orgaoEmissor, String validadeDocumentoPromonente) {
        preencherDadosAdicionais(sexo, escolaridade, statusEscolaridade, paisNaturalidade, "", "",
                nomeMae, documentoProponente, numeroDocumento, dataExpedicao, ufDocumento, orgaoEmissor, validadeDocumentoPromonente);
        if (documentoProponente.equalsIgnoreCase("PASSAPORTE"))
            escrever(campoDataValidadePassaporte, validade);
        else {
        }
    }

    public void preencherDadosAdicionaisEstrangeiro(String sexo, String escolaridade, String statusEscolaridade,
                                                    String paisNaturalidade, String nomeMae, String documentoProponente,
                                                    String numeroDocumento, String dataExpedicao,
                                                    String validade, String uf, String orgaoEmissor) {


        esperar(5000);
        clicar(areaDadosAdicionais);
        selecionarSexo(sexo);
        selecionarEscolaridade(escolaridade);
        selecionarSituacaoEscolaridade(statusEscolaridade);
        selecionarNaturalidadePais(paisNaturalidade);
        escrever(campoNomeDaMae, nomeMae);
        selecionarDocumentoProponente(documentoProponente, validade);
        escrever(campoNumeroDocumento, numeroDocumento);
        escrever(campoDataExpedicao, dataExpedicao);
        esperar(5000);
        clicar(comboUfDocumentoProponente);
        WebElement e = getDriver().findElement(By.xpath(String.format("//span[contains(text(), '%s')]/..", uf.toUpperCase())));
        e.click();
//        selecionarUfDocumentoProponente(uf);
        escrever(campoOrgaoEmissor, orgaoEmissor);

    }


    public void preencherDadosProfissionais(String naturezaOcupacao, String dataAdmissao, String rendaMensal, String outrasRendas,
                                            String origem, String atividadePrincipal, String tipoDeTransporte, String cooperativa,
                                            String nomeEmpresa, String cnpjEmpresa, String somaFaturamento) {
        selecionarNaturezaOcupacao(naturezaOcupacao);
        esperar(3000);
        peencherNaturezaOcupacao(naturezaOcupacao);
        peencherNomeDaEmpresa(nomeEmpresa, naturezaOcupacao);
        peencherCampoAdmissao(dataAdmissao, naturezaOcupacao);
        peencherCampoReceitaAutonomo(rendaMensal, naturezaOcupacao);
        peencherCampoRendaMensal(rendaMensal, naturezaOcupacao);
        peencherOutrasRendas(naturezaOcupacao, outrasRendas);
        peencherCampoOrigem(origem, naturezaOcupacao);
        peencherComboTipoTransport(tipoDeTransporte, naturezaOcupacao);
        peencherCampocooperativa(cooperativa, naturezaOcupacao);
        peencherCnpjEmpresa(cnpjEmpresa, naturezaOcupacao);
        peencherDataEntrada(dataAdmissao, naturezaOcupacao);
        peencherSomaFaturamento(somaFaturamento, naturezaOcupacao);
    }

    public void preencherDeclaracaoExposicaoPolitica(String funcao, String funcaoExercida, String parentesco, String grauParentesco) {
        selecionarSeDesempenhouCargoPolitico(funcao);
        if (checkDesempenhaCargoPolitico.isSelected()) {
            esperar(3000);
            campoFuncaoExercidaParentescoPolitico.sendKeys(funcaoExercida);
        }
        selecionarSePossuiParentescoPolitico(parentesco);
        if (checkParentescoPolitico.isSelected()) {
            esperar(3000);
            campoParentescoPolitico.sendKeys(grauParentesco);
        }
    }

    public void selecionarFinalidadeFinanciamento(String finalidadeFinanciamento) {
        clicar(comboFinalidadeFinanciamento);
        if (finalidadeFinanciamento.equalsIgnoreCase("uso particular"))
            clicar(opcaoComboFinalidadeFinanciamentoUsoParticular);
    }


    public CadastroVeiculoPage clicarSalvarCliente() {
        btnSalvarCliente.click();
        aguardarVisibilidade(textoClienteCriado);
        clicar(btnConfirmarClienteSalvo);
        esperar(8000);
        return new CadastroVeiculoPage();
    }

    //******** FIM MÉTODOS NOVO CLIENTE ********************//

    //******** MÉTODOS SIMULAÇÃO ********************//

    public boolean verificarTelaFluxoFinanceiro() {
        aguardarVisibilidade(tituloFluxoFinanceiro);
        return tituloFluxoFinanceiro.isDisplayed();
    }

    public void clicarBotaoContinuarFluxoFinanceiro() {
        clicar(btnContinuarFluxoFinanceiro);
    }

    public void habilitarSolicitacaoSeguroVeiculo() {
        aguardarVisibilidade(modalAtencao);
        esperar(500);
        clicar(btnContinuarAvisoSeguro);
    }

    public void selecionarNaoDesejoSeguroVeiculo() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        esperar(8000);
        checkNaoDesejoSeguro.click();
        esperar(500);
        btnContinuarSeguro.click();
    }

    public void EnviarPropostaDeCredito() {
        esperar(11000);
        ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].click();", checkAceitarTermoJuridico);
        esperar(3000);
        ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].click();", btnEnviarPropostaCredito);
    }

    public void preencherVendedor(String vendedor) {
        clicar(comboSelecionarVendedor);
        clicar(opcaoComboSelecionarVendedor);
    }

    public void clicarBotaoEnviarVendedor() {
        esperar(3000);
        clicar(btnEnviarVendedor);
    }

    public void clicarBotaoConfirmarEnvioPropostaCredito() {
        aguardarVisibilidade(buttonOkModalPropostaCredito);
        esperar(1000);
        clicar(btnConfirmarEnvioPropostaCredito);
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
        escrever(campoQuantidadeVeiculosProprios, quantidadeVeiculos);
    }

    public void preencherCamposAvalista(String haveraAvalista, String cpf, String nome, String naturezaOcupacao, String estadoCivil) {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        if (haveraAvalista.equalsIgnoreCase("haverá um avalista") || haveraAvalista.equalsIgnoreCase("havera um avalista"))
            campoHaveraAvalista.click();
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(campoCpfAvalista, geraCpfCnpj.cpf(false));
        campoNomeAvalista.sendKeys(nome);
        selecionarNaturezaOcupacaoAvalista(naturezaOcupacao);
        selecionarEstadoCivil(estadoCivil);
    }

    //******** MÉTODOS AUXILIARES ********************//


    private void selecionarTipoResidencia(String tipoResidencia) {
        esperar(5000);
        clicar(comboTipoResidencia);
        esperar(2000);
        if (tipoResidencia.equalsIgnoreCase("propria") ||
                tipoResidencia.equalsIgnoreCase("própia"))
            clicar(opcaoComboTipoResidenciaPropria);
        if (tipoResidencia.equalsIgnoreCase("alugada"))
            clicar(opcaoComboTipoResidenciaAlugada);
    }

    private void selecionarRegimeCasamento(String regimeCasamento) {
        esperar(5000);
        clicar(comboRegimeCasamento);
        if (regimeCasamento.equalsIgnoreCase("Comunhão Total de Bens") ||
                regimeCasamento.equalsIgnoreCase("Comunhao Total de Bens"))
            clicar(opcaoComboRegimeCasamentoComunhaoTotalBens);
        if (regimeCasamento.equalsIgnoreCase("Separação Total De Bens") ||
                regimeCasamento.equalsIgnoreCase("Separacao Total De Bens"))
            clicar(opcaoComboRegimeCasamentoSeparacaoTotalBens);
        if (regimeCasamento.equalsIgnoreCase("Comunhão Parcial De Bens") ||
                regimeCasamento.equalsIgnoreCase("Comunhao Parcial De Bens"))
            clicar(opcaoComboRegimeCasamentoComunhãoParcialDeBens);
    }

    private void selecionarPatrimonioEstimado(String patrimonio) {
        clicar(comboPatrimonioEstimado);
        if (patrimonio.equalsIgnoreCase("de R$500.000,00 até R$1.000.000,00"))
            clicar(opcaoComboPatrimonioEstimadoQuinhentosMilUmMilhao);
        if (patrimonio.equalsIgnoreCase("de R$2.000.000,00 até R$5.000.000,00"))
            clicar(opcaoComboPatrimonioEstimadoDoisMilhoesACinco);
        if (patrimonio.equalsIgnoreCase("Acima de R$5.000.000,00"))
            clicar(opcaoComboPatrimonioEstimadoAcimadeCincoMilhoes);
        if (patrimonio.equalsIgnoreCase("até R$500.000,00"))
            clicar(opcaoComboPatrimonioEstimadoAteQuinhentosMil);
        if (patrimonio.equalsIgnoreCase("de R$1.000.000,00 até R$2.000.000,00"))
            clicar(opcaoComboPatrimonioEstimadoDeUmMilhaoADois);
    }

    private void selecionarSePossuiParentescoPolitico(String parente) {
        if (parente.equalsIgnoreCase("não") || parente.equalsIgnoreCase("nao"))
            checkSemParentescoPolitico.click();
        if (parente.equalsIgnoreCase("Sim") || parente.equalsIgnoreCase("sim"))
            checkParentescoPolitico.click();
    }

    private void selecionarSeDesempenhouCargoPolitico(String funcao) {
        if (funcao.equalsIgnoreCase("sim"))
            checkDesempenhaCargoPolitico.click();
        if (funcao.equalsIgnoreCase("não") || funcao.equalsIgnoreCase("nao"))
            checkNaoDesempenhaCargoPolitico.click();
    }

    private void peencherCampoAdmissao(String dataAdmissao, String cargo) {
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo"))
            escrever(campoDataInicioAtividade, dataAdmissao);
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoDataInicioAtividade, dataAdmissao);
        if (cargo.equalsIgnoreCase("Profissional Liberal Autonomo"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Empregado no Setor Privado"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Outros"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Serv. Publ Aut/Fund"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Ser. Publ ADM Direta"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Func. Empresa Publ/Econ Mista") || cargo.equalsIgnoreCase("Func. Empresa Públ/Econ Mista"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Aposentado/Pensionista"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("Capitalista"))
            escrever(campoDataAdmissao, dataAdmissao);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherCampoOrigem(String origem, String cargo) {
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Profissional Liberal Autonomo"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Empregado no Setor Privado"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Outros"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Empregado no Setor Privado"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Serv. Publ Aut/Fund"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Ser. Publ ADM Direta"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Func. Empresa Publ/Econ Mista") || cargo.equalsIgnoreCase("Func. Empresa Públ/Econ Mista"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Aposentado/Pensionista"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("Capitalista"))
            escrever(campoOrigemOutrasRendasSimulacao, origem);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherComboTipoTransport(String tipoDeTransporte, String cargo) {
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo")) {
            clicar(comboTipoTransporte);
            clicar(opcaoComboTipoTransporteEscolar);
        }
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherCampocooperativa(String cooperativa, String cargo) {
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo"))
            checkCooperativaNao.click();
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherNaturezaOcupacao(String cargo) {
        if (cargo.equalsIgnoreCase("Estudante") || cargo.equalsIgnoreCase("estudante")) {
        } else
            escrever(campoAtividadePrincipal, cargo);
    }

    private void peencherNomeDaEmpresa(String nomeEmpresa, String cargo) {
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoNomeDaEmpresa, nomeEmpresa);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherCnpjEmpresa(String cnpjEmpresa, String cargo) {
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoCnpjEmpresa, cnpjEmpresa);
        if (cargo.equalsIgnoreCase("")) {
        }
    }


    private void peencherDataEntrada(String dataAdmissao, String cargo) {
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoDataentrada, dataAdmissao);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherSomaFaturamento(String somaFaturamento, String cargo) {
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario")) {
            escrever(campoSomaDoFaturamento, somaFaturamento);
            escrever(campoPorcentagemDeParticipacao, "500");
        } else {
        }
    }

    private void peencherCampoReceitaAutonomo(String rendaMensal, String cargo) {
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo"))
            escrever(campoReceita, rendaMensal);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherCampoRendaMensal(String renda, String cargo) {
        if (cargo.equalsIgnoreCase("Proprietário") || cargo.equalsIgnoreCase("Proprietario"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Transportador Autônomo") || cargo.equalsIgnoreCase("Transportador Autonomo"))
            escrever(campoOutrasRendas, renda);
        if (cargo.equalsIgnoreCase("Profissional Liberal Autonomo"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Empregado no Setor Privado"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Serv. Publ Aut/Fund"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Outros"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Estudante") || cargo.equalsIgnoreCase("estudante"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Ser. Publ ADM Direta"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Func. Empresa Publ/Econ Mista") || cargo.equalsIgnoreCase("Func. Empresa Públ/Econ Mista"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Aposentado/Pensionista"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("Capitalista"))
            escrever(campoRendaMensal, renda);
        if (cargo.equalsIgnoreCase("")) {
        }
    }

    private void peencherOutrasRendas(String cargo, String outrasRendas) {
        if (cargo.equalsIgnoreCase("Estudante") || cargo.equalsIgnoreCase("estudante")) {
        } else
            escrever(campoOutrasRendas, outrasRendas);
    }

    private void selecionarNaturezaOcupacao(String naturezaOcupacao) {
        clicar(comboNaturezaOcupacao);
        esperar(3000);
        if (naturezaOcupacao.equalsIgnoreCase("Profissional Liberal Autonomo"))
            clicar(opcaoComboNaturezaOcupacaoProfissionalLiberalAutonomo);
        if (naturezaOcupacao.equalsIgnoreCase("Empregado no Setor Privado"))
            clicar(opcaoComboNaturezaOcupacaoEmpregadoSetorPrivado);
        if (naturezaOcupacao.equalsIgnoreCase("Serv. Publ Aut/Fund"))
            clicar(opcaoComboNaturezaOcupacaoServPublicAutFund);
        if (naturezaOcupacao.equalsIgnoreCase("Ser. Publ ADM Direta"))
            clicar(opcaoComboNaturezaOcupacaoServPublicAdmDireta);
        if (naturezaOcupacao.equalsIgnoreCase("Func. Empresa Publ/Econ Mista") || naturezaOcupacao.equalsIgnoreCase("Func. Empresa Públ/Econ Mista"))
            clicar(opcaoComboNaturezaOcupacaoFuncEmpresaPublEconMista);
        if (naturezaOcupacao.equalsIgnoreCase("Transportador Autonomo"))
            clicar(opcaoComboNaturezaOcupacaoTransportadorAutonomo);
        if (naturezaOcupacao.equalsIgnoreCase("Outros"))
            clicar(opcaoComboNaturezaOcupacaoOutros);
        if (naturezaOcupacao.equalsIgnoreCase("Estudante"))
            clicar(opcaoComboNaturezaOcupacaoEstudante);
        if (naturezaOcupacao.equalsIgnoreCase("Proprietario") || naturezaOcupacao.equalsIgnoreCase("proprietario"))
            clicar(opcaoComboNaturezaOcupacaoProprietario);
        if (naturezaOcupacao.equalsIgnoreCase("Aposentado/Pensionista") || naturezaOcupacao.equalsIgnoreCase("aposentado/pensionista"))
            clicar(opcaoComboNaturezaOcupacaoAposentadoPensionista);
        if (naturezaOcupacao.equalsIgnoreCase("Capitalista"))
            clicar(opcaoComboNaturezaOcupacaoCapitalista);
    }

    private void selecionarNaturezaOcupacaoAvalista(String naturezaOcupacao) {
        esperar(5000);
        clicar(comboNaturezaOcupacaoAvalista);
        esperar(1000);
        if (naturezaOcupacao.equalsIgnoreCase("Profissional Liberal Autonomo"))
            opcaoComboNaturezaOcupacaoAvalistaProfissionalLiberalAutonomo.click();
        if (naturezaOcupacao.equalsIgnoreCase("Empregado no Setor Privado"))
            opcaoComboNaturezaOcupacaoAvalistaEmpregadoSetorPrivado.click();
        if (naturezaOcupacao.equalsIgnoreCase("Transportador Autônomo"))
            opcaoComboNaturezaOcupacaoTrasportadorAutonomo.click();
        if (naturezaOcupacao.equalsIgnoreCase("Outros"))
            opcaoComboNaturezaOcupacaoOutros.click();
    }

    private void selecionarUfDocumentoProponente(String uf) {
        esperar(10000);
        clicar(comboUfDocumentoProponente);
        WebElement e = getDriver().findElement(By.xpath(String.format("//span[contains(text(), '%s')]/..", uf.toUpperCase())));
        e.click();
//        if (documento.equals("SP"))
//            clicarElemento(opcaoComboUfDocumentoProponenteSp);
    }

    private void selecionarDocumentoProponente(String documento, String validadeDocumentoPromonente) {
        clicar(comboDocumentoDoProponente);
        if (documento.equalsIgnoreCase("rg"))
            clicar(opcaoComboDocumentoProponenteRg);
        if (documento.equalsIgnoreCase("passaporte")) {
            clicar(opcaoComboDocumentoProponentePassaporte);
            escrever(campoDataValidadePassaporte, validadeDocumentoPromonente);
        }
        if (documento.equalsIgnoreCase("OAB"))
            clicar(opcaoComboDocumentoProponenteOab);
        if (documento.equalsIgnoreCase("CRA"))
            clicar(opcaoComboDocumentoProponenteCra);
        if (documento.equalsIgnoreCase("CRC"))
            clicar(opcaoComboDocumentoProponenteCrc);
        if (documento.equalsIgnoreCase("CRM"))
            clicar(opcaoComboDocumentoProponenteCrm);
        if (documento.equalsIgnoreCase("CNH"))
            clicar(opcaoComboDocumentoProponenteCnh);
        if (documento.equalsIgnoreCase("RNE"))
            clicar(opcaoComboDocumentoProponenteRne);
    }

    private void selecionarNaturalidadeCidade(String naturalidadeCidade) {
        esperar(15000);
        clicar(comboNaturalidadeCidade);
        if (naturalidadeCidade.equalsIgnoreCase("barueri")) {
            opcaoComboNaturalidadeCidadeBarueri.click();
        }
    }

    private void selecionarNaturalidadeEstado(String naturalidadeEstado) {
        esperar(7000);
        clicar(comboNaturalidadeEstado);
        if (naturalidadeEstado.equalsIgnoreCase("são paulo")
                || naturalidadeEstado.equalsIgnoreCase("sao paulo")
                || naturalidadeEstado.equalsIgnoreCase("sp")) {
            clicar(opcaoComboNaturalidadeEstadoSaoPaulo);
        }
    }

    private void selecionarNaturalidadePais(String naturalidadePais) {
        clicar(comboNaturalidadePais);
        if (naturalidadePais.equalsIgnoreCase("brasileira"))
            clicar(opcaoComboNaturalidadePaisBrasileira);
        if (naturalidadePais.equalsIgnoreCase("estrangeira"))
            clicar(opcaoComboNaturalidadePaisEstrangeira);
    }

    private void selecionarSituacaoEscolaridade(String statusEscolaridade) {
        clicar(comboSituacaoEscolar);
        if (statusEscolaridade.equalsIgnoreCase("completo"))
            clicar(opcaoComboSituacaoEscolarCompleto);
        if (statusEscolaridade.equalsIgnoreCase("Incompleto"))
            clicar(opcaoComboSituacaoEscolarInCompleto);
    }

    private void selecionarEscolaridade(String escolaridade) {
        clicar(comboeEscolaridade);
        if (escolaridade.equalsIgnoreCase("ensino fundamental"))
            clicar(opcaoComboEscolaridadeEnsinoFundamental);
        if (escolaridade.equalsIgnoreCase("Analfabeto"))
            clicar(opcaoComboEscolaridadeAnalfabeto);
        if (escolaridade.equalsIgnoreCase("ensino medio") || escolaridade.equalsIgnoreCase("ensino médio"))
            clicar(opcaoComboEscolaridadeEnsinoMedio);
        if (escolaridade.equalsIgnoreCase("Superior") || escolaridade.equalsIgnoreCase("superior"))
            clicar(opcaoComboEscolaridadeSuperior);
        if (escolaridade.equalsIgnoreCase("MBA Pós-Graduação") || escolaridade.equalsIgnoreCase("MBA Pos-Graduacao"))
            clicar(opcaoComboEscolaridadeMbaPosGraduacao);
    }

    private void selecionarEstadoCivil(String estadoCivil) {
        clicar(comboEstadoCivil);
        if (estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("Solteiro"))
            clicar(opcaoComboEstadoCivilSolteiro);
        if (estadoCivil.equalsIgnoreCase("casado"))
            clicar(opcaoComboEstadoCivilCasado);
        if (estadoCivil.equalsIgnoreCase("Desquitado"))
            clicar(opcaoComboEstadoCivilDesquitado);
        if (estadoCivil.equalsIgnoreCase("Divorciado"))
            clicar(opcaoComboEstadoCivilDivorciado);
        if (estadoCivil.equalsIgnoreCase("Viuvo") || estadoCivil.equalsIgnoreCase("Viúvo"))
            clicar(opcaoComboEstadoCivilViuvo);
        if (estadoCivil.equalsIgnoreCase("Uniao Estavel") || estadoCivil.equalsIgnoreCase("UniaoEstavel"))
            clicar(opcaoComboEstadoCivilUniaoEstavel);
    }

    private void selecionarSexo(String sexo) {
        if (sexo.equalsIgnoreCase("feminino"))
            opcaoCheckSexoFemino.click();
        if (sexo.equalsIgnoreCase("masculino"))
            opcaoCheckSexoMasculino.click();
    }

    //******** FIM MÉTODOS AUXILIARES ********************//
}
