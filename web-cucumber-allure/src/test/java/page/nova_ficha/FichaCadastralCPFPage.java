package page.nova_ficha;

import framework.utils.GeraCpfCnpj;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class FichaCadastralCPFPage extends InteracoesTelaWeb {

    GeraCpfCnpj geraCpfCnpj;

    public String getCampanhaTaxa() {
        return campanhaTaxa;
    }

    private String campanhaTaxa;

    public FichaCadastralCPFPage(GeraCpfCnpj geraCpfCnpj) {
        this.geraCpfCnpj = geraCpfCnpj;
    }

    @FindBy(css = "[formcontrolname='cpfCnpj']")
    private WebElement inputCpfCnpj;

    @FindBy(xpath = "//button[normalize-space() = 'SELECIONAR']")
    private WebElement btnSelecionar;

    @FindBy(id = "name")
    private WebElement inputName;

    @FindBy(id = "birthDate")
    private WebElement inputDataNascimento;

    @FindBy(xpath = "(//app-control-email//input)[1]")
    private WebElement inputEmail;

    @FindBy(css = "[formcontrolname = 'celPhone']")
    private WebElement inputCelular;

    @FindBy(css = "[formcontrolname = 'phoneNumber']")
    private WebElement inputTelefone;

    @FindBy(css = "[formcontrolname = 'type']")
    private WebElement startComboEstadoCivil;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'matrimonialRegimeId'])[1]")
    private WebElement startComboRegimeCasamento;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseName'])[1]")
    private WebElement inputNomeConjugue;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseRegisterNumber'])[1]")
    private WebElement inputCpfConjugue;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseBirthDate'])[1]")
    private WebElement inputDataNascimentoConjugue;

    @FindBy(xpath = "(//div[contains(text(), 'Dados adicionais')])[1]")
    private WebElement btnDadosAdicionais;

    @FindBy(xpath = "(//div[@formgroupname='scholarity']//ngx-select//div)[1]")
    private WebElement startComboEscolaridade;

    @FindBy(xpath = "//span[contains(text(), 'FUNDAMENTAL')]")
    private WebElement opcaoEnsinoFundamental;

    @FindBy(xpath = "//span[contains(text(), 'ANALFABETO')]")
    private WebElement opcaoAnalfabeto;

    @FindBy(xpath = "//span[contains(text(), 'MÉDIO')]")
    private WebElement opcaoEnsinoMedio;

    @FindBy(xpath = "//span[contains(text(), 'SUPERIOR')]")
    private WebElement opcaoSuperior;

    @FindBy(xpath = "//span[contains(text(), 'MBA')]")
    private WebElement opcaoMBA;

    @FindBy(css = ".complete-scholarity[formgroupname='scholarity'] [formcontrolname = 'isComplete']")
    private WebElement startComboSituacaoEscolar;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'nationality'])[1]")
    private WebElement startComboNaturalidade;

    @FindBy(xpath = "//span[contains(text(), 'BRASILEIRA')]/..")
    private WebElement opcaoNaturalBrasileiro;

    @FindBy(xpath = "//span[contains(text(), 'ESTRANGEIRA')]/..")
    private WebElement opcaoNaturalEstrangeiro;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'nationalityUF'])[1]")
    private WebElement startComboNaturalidadeEstado;

    @FindBy(xpath = "(//ngx-select[@formcontrolname='nationalityCityId'])[1]")
    private WebElement startComboNaturalidadeCidade;

    @FindBy(id = "motherName")
    private WebElement inputNomeMae;

    @FindBy(xpath = "(//ngx-select[@formcontrolname='documentType'])[1]")
    private WebElement startComboDocumentoProponente;

    @FindBy(css = "[formcontrolname='documentNumber']")
    private WebElement inputNumeroDoDocumento;

    @FindBy(css = "[formcontrolname='documentExpeditionDate']")
    private WebElement inputDataExpedicao;

    @FindBy(css = "[formcontrolname='documentIssuerUF']")
    private WebElement startComboUf;

    @FindBy(css = "[formcontrolname='documentIssuerDescription']")
    private WebElement inputOrgaoEmissor;

    @FindBy(css = "[formcontrolname = 'documentExpirationDate']")
    private WebElement inputValidadeDoc;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'patrimonyId'])[1]")
    private WebElement startComboPatrimonio;

    @FindBy(xpath = "(//input[@formcontrolname = 'zipCode'])[1]")
    private WebElement inputCep;

    @FindBy(xpath = "(//input[@formcontrolname = 'addressNumber'])[1]")
    private WebElement inputNumeroRua;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'residenceType'])[1]")
    private WebElement startComboTipoResidencia;

    @FindBy(css = "[formcontrolname = 'residenceTime']")
    private WebElement inputTempoResidencia;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'id'])[1]")
    private WebElement startComboNaturezaOcupacao;

    @FindBy(xpath = "(//button[normalize-space() = 'NOVO ENDEREÇO DE CORRESPONDÊNCIA'])[1]")
    private WebElement btnNovoEndereco;

    @FindBy(xpath = "(//input[@formcontrolname = 'zipCodeCR'])[1]")
    private WebElement inputNovoCep;

    @FindBy(xpath = "(//input[@formcontrolname = 'addressNumberCR'])[1]")
    private WebElement inputNovoNumero;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'id'])[3]")
    private WebElement startComboNaturezaOcupacaoAvalista;

    @FindBy(xpath = "(//input[@formcontrolname = 'admissionDate'])[3]")
    private WebElement inputDataAdmissaoAvalista;

    @FindBy(xpath = "(//label[text() = 'Receitas mensais']/following-sibling::input)[2]")
    private WebElement inputReceitasMensaisAvalista;

    @FindBy(xpath = "(//label[text() = 'Tipo de transporte']/..//ngx-select)[2]")
    private WebElement startComboTipoTransporteAvalista;

    @FindBy(id = "suretySalary")
    private WebElement inputRendaAvalista;

    @FindBy(xpath = "//button[text() = '+ ADICIONAR NOVO']")
    private WebElement btnAdicionarNovoVeiculoEFrota;

    @FindBy(css = "[formcontrolname = 'model']")
    private WebElement inputModelo;

    @FindBy(css = "[formcontrolname = 'manufacturyYear']")
    private WebElement inputAnoFabricacao;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'type'])[2]")
    private WebElement startComboEstadoCivilAvalista;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseName'])[2]")
    private WebElement inputNomeConjugueAvalista;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'matrimonialRegimeId'])[2]")
    private WebElement startComboRegimeCasamentoAvalista;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseRegisterNumber'])[2]")
    private WebElement inputCpfConjugueAvalista;

    @FindBy(xpath = "(//input[@formcontrolname = 'spouseBirthDate'])[2]")
    private WebElement inputDataNascimentoConjugueAvalista;

    @FindBy(css = "[formcontrolname = 'mainActivity']")
    private WebElement inputAtividadePrincipal;

    @FindBy(xpath = "//label[text() = 'Nome da empresa']//following-sibling::input")
    private WebElement inputNomeEmpresa;

    @FindBy(xpath = "//label[text() = 'CNPJ da empresa']//following-sibling::input")
    private WebElement inputCnpjEmpresa;

    @FindBy(xpath = "//label[text() = 'Soma do Faturamento (últimos 12 meses)']//following-sibling::input")
    private WebElement inputSomaFaturamento;

    @FindBy(xpath = "//label[text() = '(%) de participação']//following-sibling::input")
    private WebElement inputPorcentagemParticipacao;

    @FindBy(xpath = "//label[text() = 'Data de início de atividade']//following-sibling::input")
    private WebElement inputDataInicioAtividade;

    @FindBy(xpath = "(//label[text() = 'Receitas mensais']/following-sibling::input)[1]")
    private WebElement inputReceitasMensais;

    @FindBy(xpath = "(//label[text() = 'Tipo de transporte']/..//ngx-select)[1]")
    private WebElement startComboTipoTransporte;

    @FindBy(css = "[formcontrolname = 'crntrc']")
    private WebElement inputNumeroAntt;

    @FindBy(xpath = "//label[text() = 'Data de entrada']//following-sibling::input")
    private WebElement inputDataEntrada;

    @FindBy(id = "admissionDate")
    private WebElement inputDataAdmissao;

    @FindBy(id = "salary")
    private WebElement inputSalario;

    @FindBy(xpath = "(//input[@formcontrolname = 'taxId'])[2]")
    private WebElement inputCpfAvalista;

    @FindBy(xpath = "(//label[text() = 'Nome']//..//input)[2]")
    private WebElement inputNomeAvalista;

    @FindBy(xpath = "(//input[@formcontrolname = 'publicOfficeWork'])[2]")
    private WebElement inputDescreverFuncaoPolitica;

    @FindBy(xpath = "(//input[@formcontrolname = 'publicOfficeKinshipDegree'])[2]")
    private WebElement inputGrauParentesco;

    @FindBy(xpath = "(//ngx-select[@formcontrolname = 'financingPurpose'])[1]")
    private WebElement startComboFinalidadeFinanciamento;

    @FindBy(xpath = "//button[text() = 'SALVAR CLIENTE']")
    private WebElement btnSalvarCliente;

    @FindBy(css = ".swal2-popup.swal2-modal.swal2-icon-success.swal2-show")
    private WebElement modalClienteCriado;

    @FindBy(xpath = "//button[text() = 'OK']")
    private WebElement btnConfirmarClienteSalvo;

    @FindBy(xpath = "//button[normalize-space() = 'Continuar']")
    private WebElement btnContinuarModalTipoSimulacao;

    @FindBy(css = "[formcontrolname = 'manufactureYear']")
    private WebElement startComboAnoFabricacao;

    @FindBy(css = "[formcontrolname = 'creditClass']")
    private WebElement startComboTipoVeiculo;

    @FindBy(xpath = "//ngx-select[@formcontrolname = 'code']")
    private WebElement startComboModeloVeiculo;

    @FindBy(css = "[formcontrolname = 'vehicleUse']")
    private WebElement startComboUtilizacaoVeiculo;

    @FindBy(css = "[formcontrolname = 'vehicleLoadType']")
    private WebElement startComboTipoCarga;

    @FindBy(xpath = "//label[normalize-space() = 'Acessório']/..//ngx-select")
    private WebElement startComboAcessorio;

    @FindBy(xpath = "//label[normalize-space() = 'Valor do acessório']/..//input")
    private WebElement inputValorAcessorio;

    @FindBy(xpath = "//label[normalize-space() = 'Produto']/../ngx-select")
    private WebElement startComboProduto;

    @FindBy(css = "[formcontrolname = 'id']")
    private WebElement startComboCampanha;

    @FindBy(css = "[formcontrolname = 'num']")
    private WebElement startComboPrazo;

    @FindBy(css = "[formcontrolname = 'gracePeriod']")
    private WebElement startComboCarencia;

    @FindBy(css = "[formcontrolname = 'downPayment']")
    private WebElement inputValorEntrada;

    @FindBy(css = "[formcontrolname = 'insuranceValue']")
    private WebElement inputValorAproximadoSeguro;

    @FindBy(xpath = "//button[normalize-space() = 'Gerar simulação']")
    private WebElement btnGerarSimulacao;

    @FindBy(xpath = "//a[normalize-space() = 'Operação']")
    private WebElement btnOperacao;

    @FindBy(xpath = "//label[text() = 'Data da simulação']/../label[2]")
    private WebElement dataSimulacao;

    @FindBy(xpath = "//label[text() = 'Produto']/../label[2]")
    private WebElement produto;

    @FindBy(xpath = "//label[text() = 'Quantidade de parcelas']/../label[2]")
    private WebElement quantidadeParcelas;

    @FindBy(xpath = "//label[text() = 'Carência']/../label[2]")
    private WebElement carencia;

    @FindBy(xpath = "//label[text() = 'Prazo total']/../label[2]")
    private WebElement prazoTotal;

    @FindBy(xpath = "//label[text() = 'Valor total (Bem + Acessório)']/../label[2]")
    private WebElement valorTotal;

    @FindBy(xpath = "//label[text() = '% Entrada']/../label[2]")
    private WebElement porcentagemEntrada;

    @FindBy(xpath = "//label[text() = 'Valor entrada']/../label[2]")
    private WebElement valorEntrada;

    @FindBy(xpath = "//label[text() = 'Campanha']/../label[2]")
    private WebElement campanha;

    @FindBy(xpath = "//button[text() = 'IMPRIMIR']")
    private WebElement btnImprimir;

    @FindBy(xpath = "//h2[text() = 'Atenção!']")
    private WebElement textoAtencao;

    @FindBy(xpath = "//button[text() = 'Continuar']")
    private WebElement btnContinuarModalAtencao;

    @FindBy(xpath = "(//button[text() = 'CONTINUAR'])[2]")
    private WebElement btnContinuarModalAtencaoSeguroRemovido;

    @FindBy(xpath = "(//button[text() = 'CONTINUAR'])[1]")
    private WebElement btnContinuar;

    @FindBy(xpath = "//div[@class ='card show']")
    private WebElement modalAtencao;

    @FindBy(css = "[formcontrolname = 'autorize']")
    private WebElement campoAutorizarBanco;

    @FindBy(xpath = "//button[text() = 'ENVIAR PROPOSTA DE CRÉDITO']")
    private WebElement btnEnviarPropostaDeCredito;

    @FindBy(css = "[formcontrolname = 'id']")
    private WebElement startComboSelecioneVendedor;

    @FindBy(xpath = "//button[text() = 'ENVIAR']")
    private WebElement btnEnviarVendedor;

    @FindBy(xpath = "//button[text() = 'OK']")
    private WebElement btnOkPropostaEnviada;

    @FindBy(xpath = "//span[text() = ' Proposta ']//following-sibling::span")
    private WebElement numeroProposta;

    @FindBy(xpath = "(//div[@class='col-8']//div[@class='info']/span)[1]")
    protected WebElement nomeClienteTelaPropostaCadastrada;

    @FindBy(xpath = "(//div[@class='col-4']//div[@class='info']/span)[1]")
    protected WebElement cpfClienteTelaPropostaCadastrada;

    @FindBy(xpath = "(//app-field-error//div)[2]")
    private WebElement msgCpfOuCnpjInvalido;

    public void que_preencho_o_campo_CPF_com_valor_valido() {
        escrever(inputCpfCnpj, geraCpfCnpj.cpf(false));
        clicar(btnSelecionar);
    }

    public void preencho_o_campo_nome(String nome) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputName, nome);
    }

    public void preencho_a_data_de_nascimento(String dataNascimento) {
        escrever(inputDataNascimento, dataNascimento);
    }

    public void preencho_o_campo_email(String email) {
        escrever(inputEmail, email);
    }

    public void preenchoOCampoCelular(String celular) {
        escrever(inputCelular, celular);
    }

    public void escolho_o_estado_civil(String estadoCivil) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboEstadoCivil, estadoCivil);
    }

    public void noComboRegumeDeCasamentoEscolho(String regimeCasamento) {
        selecionarCombos(startComboRegimeCasamento, regimeCasamento);
    }

    public void informoONomeDoConjugue(String nomeConjugue) {
        escrever(inputNomeConjugue, nomeConjugue);
    }

    public void informoCpfDoConjugue() {
        escrever(inputCpfConjugue, geraCpfCnpj.cpf(false));
    }

    public void informoDataNascimentoConjugue(String dataNascimentoConjugue) {
        escrever(inputDataNascimentoConjugue, dataNascimentoConjugue);
    }

    public void clico_em_dados_adicionais() {
        clicar(btnDadosAdicionais);
    }

    public void no_combo_escolaridade_escolho_e_informo_o_estatus_do_mesmo(String escolaridade, String statusEscolaridade) {
        selecionarEscolaridade(escolaridade);
        selecionarCombos(startComboSituacaoEscolar, statusEscolaridade);
    }

    public void no_combo_naturalidade_pais_escolho(String naturalidade) {
        selecionarNaturalidade(naturalidade);
    }

    public void no_combo_naturalidade_estado_escolho(String estadoNaturalidade) {
        selecionarCombos(startComboNaturalidadeEstado, estadoNaturalidade);
    }

    public void no_combo_naturalidade_cidade_escolho(String cidadeNaturalidade) {
        esperandoElementoSumir();
        selecionarCombosUpperCase(startComboNaturalidadeCidade, cidadeNaturalidade);
    }

    public void informo_o_nome_da_mae(String nomeMae) {
        escrever(inputNomeMae, nomeMae);
    }

    public void no_combo_documento_do_proponente_escolho(String documento) {
        selecionarCombosUpperCase(startComboDocumentoProponente, documento);
    }

    public void informo_o_numero_do_documento(String numeroDocumento) {
        escrever(inputNumeroDoDocumento, numeroDocumento);
    }

    public void informo_a_data_de_expedicao_do_documento(String dataExpedicao) {
        escrever(inputDataExpedicao, dataExpedicao);
    }

    public void noComboUfCidadesEscolho(String ufCidades) {
        selecionarCombos(startComboUf, ufCidades);
    }

    public void no_combo_UF_escolho(String uf) {
        selecionarCombosUpperCase(startComboUf, uf);
    }

    public void informo_o_orgao_emissor(String orgaoEmissor) {
        escrever(inputOrgaoEmissor, orgaoEmissor);
    }

    public void informo_a_validade_do_documento(String validade) {
        escrever(inputValidadeDoc, validade);
    }

    public void no_combo_patrimonio_escolho(String patrimonio) {
        selecionarCombos(startComboPatrimonio, patrimonio);
    }

    public void no_campo_endereco_informo_o_cep(String cep) {
        escrever(inputCep, cep);
        esperar(1500);
    }

    public void informo_o_numero_da_rua(String numero) {
        escrever(inputNumeroRua, numero);
    }

    public void no_combo_tipo_de_residencia_escolho(String tipoResidencia) {
        selecionarCombos(startComboTipoResidencia, tipoResidencia);
    }

    public void informo_o_tempo_de_residencia(String tempoResidencia) {
        escrever(inputTempoResidencia, tempoResidencia);
    }

    public void no_combo_natureza_da_ocupacao_escolho(String ocupacao) {
        selecionarCombos(startComboNaturezaOcupacao, ocupacao);
    }

    public void clicoNoBotaoNovoEnderecoDeCorrespondencia() {
        clicar(btnNovoEndereco);
    }

    public void informoNovoCep(String novoCep) {
        escrever(inputNovoCep, novoCep);
        esperar(1500);
    }

    public void informoNovoNumeroDaRua(String novoNumeroRua) {
        escrever(inputNovoNumero, novoNumeroRua);
    }

    public void no_combo_natureza_da_ocupacao_do_avalista_escolho(String ocupacao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboNaturezaOcupacaoAvalista, ocupacao);
    }

    public void informoDataDeAdmissaoDoAvalista(String dataAdmissaoAvalista) {
        escrever(inputDataAdmissaoAvalista, dataAdmissaoAvalista);
    }

    public void informoReceitasMensaisDoAvalista(String receitasAvalista) {
        escrever(inputReceitasMensaisAvalista, receitasAvalista);
    }

    public void informoOTipoDeTransporteDoAvalista(String tipoTransporteAvalista) {
        selecionarCombos(startComboTipoTransporteAvalista, tipoTransporteAvalista);
    }

    public void noCampoSalarioeRendaDoAvalistaInformo(String rendaAvalista) {
        escrever(inputRendaAvalista, rendaAvalista);
    }

    public void emRelacaoDoVeiculoEFrotaClicoEmAdicionar() {
        clicar(btnAdicionarNovoVeiculoEFrota);
    }

    public void informoModelo(String modelo) {
        escrever(inputModelo, modelo);
    }

    public void informoAnoFabricacao(String anoFabricacao) {
        escrever(inputAnoFabricacao, anoFabricacao);
    }

    public void nasOpcoesPossuiOnusInformo(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//label[text() ='Possui ônus']/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcao.click();
    }

    public void escolhoEstadoCivilAvalista(String estadoCivilAvalista) {
        selecionarCombos(startComboEstadoCivilAvalista, estadoCivilAvalista);
    }

    public void noComboRegimeCasamentoDoAvalista(String regimeCasamentoAvalista) {
        selecionarCombos(startComboRegimeCasamentoAvalista, regimeCasamentoAvalista);
    }

    public void informoNomeDoConjugueAvalista(String conjugueAvalista) {
        escrever(inputNomeConjugueAvalista, conjugueAvalista);
    }

    public void informoCpfDoConjugueAvalista() {
        escrever(inputCpfConjugueAvalista, geraCpfCnpj.cpf(false));
    }

    public void informoDataDeNascimentoConjugueAvalista(String dataNascimentoConjugueAvalista) {
        escrever(inputDataNascimentoConjugueAvalista, dataNascimentoConjugueAvalista);
    }

    public void informoAtividadePrincipal(String atividade) {
        escrever(inputAtividadePrincipal, atividade);
    }

    public void informoNomeDaEmpresa(String nomeEmpresa) {
        escrever(inputNomeEmpresa, nomeEmpresa);
    }

    public void informoCnpjEmpresa() {
        escrever(inputCnpjEmpresa, geraCpfCnpj.cnpj(false));
    }

    public void informoSomaDoFaturamentoUltimos12Meses(String faturamento) {
        escrever(inputSomaFaturamento, faturamento);
    }

    public void informoPorcentagemDeParticipacao(String participacao) {
        escrever(inputPorcentagemParticipacao, participacao);
    }

    public void informoDataInicioAtividade(String dataAtividade) {
        escrever(inputDataInicioAtividade, dataAtividade);
    }

    public void informoAsReceitasMensais(String receitas) {
        escrever(inputReceitasMensais, receitas);
    }

    public void noComboTipoDeTransporteEscolho(String tipoTransporte) {
        selecionarCombos(startComboTipoTransporte, tipoTransporte);
    }

    public void informoNumeroANTT(String antt) {
        escrever(inputNumeroAntt, antt);
    }

    public void nasOpcoessCooperativaInfomro(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//label[text() = 'Cooperativa']/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcao.click();
    }

    public void informoDataDeEntrada(String dataEntrada) {
        escrever(inputDataEntrada, dataEntrada);
    }

    public void informoDataDeAdmissao(String dataAdmissao) {
        escrever(inputDataAdmissao, dataAdmissao);
    }

    public void no_campo_salario_e_renda_mensal_informo(String salario) {
        escrever(inputSalario, salario);
    }

    public void no_campo_avalista_escolho(String avalista) {
        selecionarAvalista(avalista);
    }

    public void informoCpfDoAvalista() {
        escrever(inputCpfAvalista, geraCpfCnpj.cpf(false));
    }

    public void informoNomeDoAvalista(String nomeAvalista) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputNomeAvalista, nomeAvalista);
    }

    public void nas_opcoes_desempenhou_funcao_ou_cargo_publico_relevante_nos_ultimos_anos_escolho(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("(//label[text() = 'Desempenhou função ou cargo público relevante nos últimos 5 anos?']/..//span[text() = '%s']/preceding-sibling::input)[2]", simOrnao)));
        opcao.click();
    }

    public void escrevoFuncaoPolitica(String funcaoPolitica) {
        escrever(inputDescreverFuncaoPolitica, funcaoPolitica);
    }

    public void nas_opcoes_possui_parentesco_com_pessoa_que_exerceu_funcao_ou_cargo_publico_relevante_nos_ultimos_anos(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("(//label[text() = 'Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?']/..//span[text() = '%s']/preceding-sibling::input)[2]", simOrnao)));
        opcao.click();
    }

    public void informoGrauParentesco(String grauParentesco) {
        escrever(inputGrauParentesco, grauParentesco);
    }

    public void no_combo_declaracao_do_proposito_da_aquisicao_do_bem_financiamento_escolho(String opcao) {
        selecionarCombos(startComboFinalidadeFinanciamento, opcao);
    }

    public void clico_no_botao_Salvar_Cliente() {
        clicar(btnSalvarCliente);
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        modalClienteCriado.isDisplayed();
        clicar(btnConfirmarClienteSalvo);
    }

    public void selecionoTipoDeSimulacao(String tipoSimulacao){
        WebElement opcao = getDriver().findElement(
                By.xpath(String.format("//span[text()='%s']/preceding-sibling::input",tipoSimulacao)));
        esperar(1000);
        opcao.click();
        clicar(btnContinuarModalTipoSimulacao);
    }

    public void no_combo_ano_fabricacao_do_veiculo_escolho(String anoFabricacao) {
        esperandoElementoSumir();
        selecionarCombos(startComboAnoFabricacao, anoFabricacao);
    }

    public void no_combo_tipo_de_veiculo_escolho(String tipoVeiculo) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboTipoVeiculo, tipoVeiculo);
    }

    public void escolho_o_estado_do_veiculo(String estadoVeiculo) {
        WebElement opcao = getDriver().findElement(
                By.xpath(String.format("//span[text() = '%s']/preceding-sibling::input", estadoVeiculo)));
        opcao.click();
    }

    public void no_combo_modelo_do_veiculo_escolho(String modeloVeiculo) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboModeloVeiculo, modeloVeiculo);
    }

    public void noComboUtilizacaoDoVeiculoescolho(String utilizacao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboUtilizacaoVeiculo, utilizacao);
    }

    public void noComboTipoDeCargaEscolho(String tipoCarga) {
        selecionarCombos(startComboTipoCarga, tipoCarga);
    }

    public void nas_opcoes_adicionar_acessorio_escolho(String simOrnao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("(//span[text() = '%s']/preceding-sibling::input)[1]", simOrnao)));
        opcao.click();
    }

    public void noComboAcessorioEscolho(String acessorio) {
        selecionarCombos(startComboAcessorio, acessorio);
    }

    public void informoOValorDoAcessorio(String valorAcessorio) {
        escrever(inputValorAcessorio, valorAcessorio);
    }

    public void no_combo_produto_escolho(String produto) {
        selecionarCombos(startComboProduto, produto);
    }

    public void no_combo_campanha_escolho(String campanha) {
        campanhaTaxa = campanha;
        selecionarCombos(startComboCampanha, campanha);
    }

    public void noComboCamapnhaEscoljoTaxaComPpi() {
        clicar(startComboCampanha);
        WebElement opcao = getDriver().findElement(
                By.xpath("(//ngx-select[@formcontrolname='id']//ul//li)[2]"));
        clicar(opcao);
    }

    public void noComboCampanhaEscolhoUmaTaxaSemPpi() {
        clicar(startComboCampanha);

        if (verificarSeOpcaoCampanhaExiste()) {
            WebElement opcao = getDriver().findElement(
                    By.xpath("//ngx-select[@formcontrolname='id']//ul//li//span[contains(text(),'Taxa')][not(contains(text(),'PPI'))]"));
            campanhaTaxa = getTexto(opcao);
            clicar(opcao);
        } else {
            WebElement opcao2 = getDriver().findElement(
                    By.xpath("//ngx-select[@formcontrolname='id']//ul//li//span[contains(text(),'Truck')][not(contains(text(),'PPI'))]"));
            campanhaTaxa = getTexto(opcao2);
            clicar(opcao2);
        }

    }

    public boolean verificarSeOpcaoCampanhaExiste(){
        FluentWait<WebDriver> foo = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class, TimeoutException.class);
        try {
            WebElement opcao = getDriver().findElement(
                    By.xpath("//ngx-select[@formcontrolname='id']//ul//li//span[contains(text(),'Taxa')][not(contains(text(),'PPI'))]"));
            foo.until(ExpectedConditions.visibilityOf(opcao));
            return true;
        }catch (NoSuchElementException ignore){
            return false;
        }
    }

    public void no_combo_prazo_escolho_e_carencia(String prazo, String carencia) {
        selecionarCombos(startComboPrazo, prazo);
        selecionarCombos(startComboCarencia, carencia);
    }

    public void nasOpcoesTipoPessoaEscolho(String tipoPessoa) {
        WebElement opca = getDriver().findElement(By.xpath
                (String.format("//label[normalize-space() = 'Tipo de pessoa']/..//span[text() = '%s']/preceding-sibling::input", tipoPessoa)));
        opca.click();
    }

    public void informo_o_valor_de_entrada(String valorEntrada) {
        escrever(inputValorEntrada, valorEntrada);
    }

    public void na_opcao_prestamista_escolho(String simOrnao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("(//span[text() = '%s']/preceding-sibling::input)[2]", simOrnao)));
        opcao.click();
    }

    public void nasOpcoesSimularSeguroDoVeiculoEscolho(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("(//span[text() = '%s']/preceding-sibling::input)[3]", simOrnao)));
        opcao.click();
    }

    public void informoOValorAproximadoDoSeguro(String valorSeguro) {
        escrever(inputValorAproximadoSeguro, valorSeguro);
    }

    public void clico_em_gerar_simulacao() {
        clicar(btnGerarSimulacao);
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
    }

    public void clicoNaAbaOperacoes() {
        clicar(btnOperacao);
    }

    public String validoQueDataSimulacaoEDataAutal() {
        return getTexto(dataSimulacao);
    }

    public String dataAtual() {
        Date dataHoraAtual = new Date();
        return new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    }

    public String validoQueProdutoE() {
        return getTexto(produto);
    }

    public String validoQueQuantidadeDeParcelasECarencia() {
        return getTexto(quantidadeParcelas);
    }

    public String getCarencia() {
        return getTexto(carencia);
    }

    public String validoPrazoTotal() {
        return getTexto(prazoTotal);
    }

    public String validoValorTotal() {
        return getTexto(valorTotal);
    }

    public String validoPorcentagemEntrada() {
        return getTexto(porcentagemEntrada);
    }

    public String validoValorEntrada() {
        return getTexto(valorEntrada);
    }

    public String validoACampanhaEscolhida() {
        return getTexto(campanha);
    }

    public void clicoEmImprimir() {
        clicar(btnImprimir);
    }

    public int validoDocumentoPdfSimulacaoParaImprimirFoiAbertoEmUmaNovaAba() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        List<String> aba = new ArrayList<>(getDriver().getWindowHandles());
        return aba.size();
    }

    public void na_opcao_deseja_seguro_do_veiculo_escolho(String simOrnao) {
        esperandoElementoSumir();
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        esperar(3000);
        WebElement opca = getDriver().findElement(By.xpath(
                String.format("(//span[text() = '%s']/preceding-sibling::input)[1]", simOrnao)));
        opca.click();
    }

    public void naOpcaoDesejaIncluirSeguroVeiculoNoFinanciamentoEscolho(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("(//span[text() = '%s']/preceding-sibling::input)[2]", simOrnao)));
        opcao.click();
    }

    public String validoModalDeAtencaoInformandoCotacaoSeguroNaoPermiteCobertura() {
        String texto = getTexto(textoAtencao);
        clicar(btnContinuarModalAtencao);
        return texto;
    }

    public void clico_em_continuar() {
        clicar(btnContinuar);
    }

    public boolean validoModalDeAtencaoInformadoQueValoresSegurosSeraoRemovidosDoProcesso() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        boolean existeOrnao = modalAtencao.isDisplayed();
        clicar(btnContinuarModalAtencaoSeguroRemovido);
        return existeOrnao;
    }

    public void clico_em_enviar_proposta_de_credito() {
        clicar(campoAutorizarBanco);
        clicar(btnEnviarPropostaDeCredito);
    }

    public void no_modal_selecione_o_vendedor_escolho(String vendedor) {
        selecionarCombos(startComboSelecioneVendedor, vendedor);
        clicar(btnEnviarVendedor);
        esperandoElementoSumir();
        clicar(btnOkPropostaEnviada);
    }

    public String guardoONumeroDaPropostaParaRecuperarDepois() {
        return getTexto(numeroProposta);
    }

    public boolean SistemaApresenteTelaComDetalhesDaPropostaCadastrada() {
        esperandoElementoSumir();
        return nomeClienteTelaPropostaCadastrada.isDisplayed() && cpfClienteTelaPropostaCadastrada.isDisplayed();
    }

    public void quePreenchoOCampoCpfOuCnpjComValorInvalido(String cpf) {
        escrever(inputCpfCnpj, cpf);
    }

    public String EApresentadaAMensagem() {
        return getTexto(msgCpfOuCnpjInvalido);
    }

    public void selecionarSexo(String sexo) {
        WebElement opcao = getDriver().findElement(
                By.xpath(String.format("(//span[text() = '%s']/preceding-sibling::input)[1]", sexo)));
        opcao.click();
    }

    public void selecionarEscolaridade(String escolaridade) {
        clicar(startComboEscolaridade);
        switch (escolaridade) {
            case "Ensino Fundamental":
                clicar(opcaoEnsinoFundamental);
                break;
            case "Analfabeto":
                clicar(opcaoAnalfabeto);
                break;
            case "Ensino Médio":
                clicar(opcaoEnsinoMedio);
                break;
            case "Superior":
                clicar(opcaoSuperior);
                break;
            case "MBA Pós-Graduação":
                clicar(opcaoMBA);
                break;
            default:
                throw new NoSuchElementException("A primeira letra de cada palavra deve começar com maiúsculo, exemplo: Ensino Médio, se for a opção:\" " +
                        "MBA\", escrava assim: MBA Pós-Graduação");
        }
    }

    public void selecionarNaturalidade(String naturalidade) {
        clicar(startComboNaturalidade);
        switch (naturalidade) {
            case "Brasileira":
                clicar(opcaoNaturalBrasileiro);
                break;
            case "Estrangeira":
                clicar(opcaoNaturalEstrangeiro);
                break;
            default:
                throw new NoSuchElementException("Nenhuma opcao selecionada, possivel erro seria a escrita dos parâmetros, " +
                        "as opções devem começar com a primeira lestra maiúscula, exemplo: Brasileira");
        }
    }

    public void selecionarAvalista(String avalista) {
        WebElement opcao = getDriver().findElement(
                By.xpath(String.format("(//span[text() = '%s']/preceding-sibling::input)[1]", avalista)));
        opcao.click();
    }

}