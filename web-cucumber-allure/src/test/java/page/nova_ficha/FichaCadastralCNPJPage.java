package page.nova_ficha;

import framework.utils.GeraCpfCnpj;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import io.cucumber.java.pt.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class FichaCadastralCNPJPage extends InteracoesTelaWeb {

    GeraCpfCnpj geraCpfCnpj;

    public FichaCadastralCNPJPage(GeraCpfCnpj geraCpfCnpj) {
        this.geraCpfCnpj = geraCpfCnpj;
    }


    @FindBy(css = "[formcontrolname = 'cpfCnpj']")
    private WebElement inputCPFCNPJ;

    @FindBy(xpath = "//button[normalize-space() = 'SELECIONAR']")
    private WebElement btnSelecionar;

    @FindBy(xpath = "//label[normalize-space() = 'Nome da empresa']//following-sibling::input")
    private WebElement inputNomeEmpresa;

    @FindBy(css = "[formcontrolname = 'constitution']")
    private WebElement startComboConstituicao;

    @FindBy(css = "[formcontrolname = 'foundationDate']")
    private WebElement inputDataFundacao;

    @FindBy(css = "[formcontrolname = 'companyContractDate']")
    private WebElement inputDataAlteracaoContra;

    @FindBy(css = "[formcontrolname = 'phoneNumber']")
    private WebElement inputTelefone;

    @FindBy(xpath = "//button[normalize-space() = 'BUSCAR CNAE']")
    private WebElement btnBuscarCNAE;

    @FindBy(css = "[formcontrolname = 'description']")
    private WebElement inputDescricaoCNAE;

    @FindBy(xpath = "//label[text() = 'Regime de tributação']/..//ngx-select")
    private WebElement startComboRegimeTributacao;

    @FindBy(css = "[formcontrolname = 'shareCapital']")
    private WebElement inputCapitalSocial;

    @FindBy(css = "[formcontrolname = 'amountEmployees']")
    private WebElement inputQtFuncionarios;

    @FindBy(xpath = "//label[text() = 'Natureza jurídica']/..//ngx-select")
    private WebElement startComboNaturezaJuridica;

    @FindBy(xpath = "//label[text() = 'Nome/Razão social']/following-sibling::input")
    private WebElement inputNomeOrRazaoSocial;

    @FindBy(xpath = "//label[text() = 'CPF/CNPJ']/following-sibling::input")
    private WebElement inputCPFCNPJSocio;


    @FindBy(id = "assetValue-0")
    private WebElement inputValorPatrimonioImobiliario;

    @FindBy(id = "percentage-0")
    private WebElement inputPorcentagem;

    @FindBy(id = "birthDate-0")
    private WebElement inputDataNascimentoSocio;

    @FindBy(xpath = "//label[text() = 'Sócio representante legal']/..//ngx-select")
    private WebElement startComboSocioRepresentanteLegal;

    @FindBy(xpath = "//label[text() = 'Sócio representante legal']/..//ngx-select//a")
    private WebElement opcaoComboSocioRepresentanteLegal;

    @FindBy(id = "legalRepresentativeTaxId")
    private WebElement inputCPFSocio;

    @FindBy(id = "legalRepresentativeName")
    private WebElement inputNomeRepresentante;

    @FindBy(xpath = "(//label[text() = 'Sócio']/..//ngx-select)[1]")
    private WebElement startComboAvalista;

    @FindBy(xpath = "(//label[text() = 'Sócio']/..//ngx-select)[1]//a")
    private WebElement opcaoSocioComboAvalista;

    @FindBy(xpath = "//button[text() = 'ADICIONAR AVALISTA']")
    private WebElement btnAdicionarAvalista;

    @FindBy(id = "finalBeneficiaryTaxId-1")
    private WebElement inputCpfAvalista;

    @FindBy(id = "finalBeneficiaryName-1")
    private WebElement inputNomeAvalistaPj;

    @FindBy(xpath = "(//label[text() = 'Natureza da ocupação']/..//ngx-select)[2]")
    private WebElement startComboNaturezaOcupacaoAvalistaPj;

    @FindBy(id = "finalBeneficiaryAdmissionDate-1")
    private WebElement inputDataAdmissaoAvalistaPj;

    @FindBy(id = "suretyCreateSalary-1")
    private WebElement inputSalarioRendaAvalistaPj;

    @FindBy(xpath = "(//label[text() = 'Estado civil'])[2]/..//ngx-select")
    private WebElement startComboEstadoCivilAvalistaPj;

    @FindBy(id = "finalBeneficiarySpouseName-1")
    private WebElement inputNomeConjugueAvalistaPj;

    @FindBy(id = "finalBeneficiarySpouseRegisterNumber-1")
    private WebElement inputCpfConjugueAvalistaPj;

    @FindBy(id = "finalBeneficiarySpouseBirthDate-1")
    private WebElement inputDataNascimentoConjugueAvalistaPj;

    @FindBy(xpath = "//button[normalize-space() = 'ADICIONAR BENEFICIÁRIO FINAL']")
    private WebElement btnAdicionarBeneficiarioFinal;

    @FindBy(id = "finalBeneficiaryTaxId-0")
    private WebElement inputCpfBeneficiarioFinal;

    @FindBy(id = "finalBeneficiaryName-0")
    private WebElement inputNomeBeneficiarioFinal;

    @FindBy(xpath = "//label[text() = 'Natureza da ocupação']/..//ngx-select")
    private WebElement startComboNaturezaOcupacao;

    @FindBy(id = "finalBeneficiaryAdmissionDate-0")
    private WebElement inputDataAdmissao;

    @FindBy(css = "[formcontrolname = 'salary']")
    private WebElement inputRendaBeneficiario;

    @FindBy(xpath = "//label[text() = 'Regime de casamento']/..//ngx-select")
    private WebElement startComboRegimeCasamento;

    @FindBy(xpath = "(//label[normalize-space() = 'E-mail']/..//input)[2]")
    private WebElement inputEmailBeneficiarioFinal;

    @FindBy(css = "[formcontrolname = 'cellphone']")
    private WebElement inputCelular;

    @FindBy(css = "[formcontrolname = 'birthDate']")
    private WebElement inputDataNascimentoBeneficiario;

    @FindBy(css = "[formcontrolname = 'motherName']")
    private WebElement inputNomeMaeBeneficiario;

    @FindBy(xpath = "(//input[@formcontrolname = 'zipCode'])[2]")
    private WebElement inputCepBeneficiario;

    @FindBy(xpath = "//label[text() = 'Tipo de residência']/..//ngx-select")
    private WebElement startComboTipoResidenciaBeneficiarioFinal;

    @FindBy(xpath = "(//input[@formcontrolname = 'addressNumber'])[2]")
    private WebElement inputNumeroBeneficiario;

    @FindBy(xpath = "(//input[@formcontrolname = 'publicOfficeWork'])[1]")
    private WebElement inputFuncaoExercidaBeneficiario;

    @FindBy(xpath = "(//input[@formcontrolname = 'publicOfficeKinshipDegree'])[1]")
    private WebElement inputGrauParentescoBeneficiario;

    @FindBy(id = "finalBeneficiaryTaxId-2")
    private WebElement inputCpfAvalistaSocio2;

    @FindBy(id = "finalBeneficiaryName-2")
    private WebElement inputNomeAvalistaSocio2;

    @FindBy(xpath = "(//label[text() = 'Natureza da ocupação'])[3]/..//ngx-select")
    private WebElement startComboNaturezaOcupacaoAvalista02;

    @FindBy(id = "suretyCreateSalary-2")
    private WebElement inputRendaAavalista02;

    @FindBy(xpath = "(//label[text() = 'Estado civil'])[3]/..//ngx-select")
    private WebElement startComboEstadoCivilAvalista02;

    @FindBy(xpath = "(//label[text() = 'Sócio']/..//ngx-select)[2]")
    private WebElement startComboSocioBeneficiarioFinal;

    @FindBy(xpath = "(//label[text() = 'Sócio']/..//ngx-select)[2]//a")
    private WebElement opcaoSocioComboBeneficiarioFinal;

    @FindBy(xpath = "//button[text() = 'ADICIONAR EMPRESA COLIGADA']")
    private WebElement btnAdicionarEmpresasColigadasControladora;

    @FindBy(css = "[formcontrolname = 'companyName']")
    private WebElement startComboParticipantes;

    @FindBy(xpath = "//ngx-select[@formcontrolname = 'companyName']//a")
    private WebElement opcaoSocioParticipantes;

    @FindBy(id = "affiliateTaxId-0")
    private WebElement inputCNPJEmpresas;

    @FindBy(id = "affiliateName-0")
    private WebElement inputRazaoSocialEmpresa;

    @FindBy(id = "affiliatePercentage-0")
    private WebElement inputCapitalTotal;

    @FindBy(xpath = "//label[text() = 'Período de faturamento']/..//ngx-select")
    private WebElement startComboPeriodoFaturamento;

    @FindBy(xpath = "(//label[text() = 'Período de faturamento']/..//ngx-select//a)[1]")
    private WebElement opcaoComboPeriodoFaturamento;

    @FindBy(css = "[formcontrolname = 'value']")
    private List<WebElement> camposFaturamento;

    @FindBy(xpath = "//input[@formcontrolname = 'value'][not(@class='form-control ng-touched ng-dirty ng-valid')]")
    private WebElement inputPeriodoFaturamento;

    @FindBy(css = "[formcontrolname = 'admissionDate']")
    private WebElement inputDataInicioAtividade;

    @FindBy(css = "[formcontrolname = 'percentage']")
    private WebElement inputPorcentagemParticipacaoSocio;

    public void informoUmCnpjValido() {
        escrever(inputCPFCNPJ, geraCpfCnpj.cnpj(false));
        clicar(btnSelecionar);
    }

    public void informoONomeDaEmpresaDoClienteJuridica(String nomeEmpresa) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputNomeEmpresa, nomeEmpresa);
    }

    public void noComboConstituicaoEscolho(String constituicao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboConstituicao, constituicao);
    }

    public void informoDataDeFuncao(String dataFuncao) {
        escrever(inputDataFundacao, dataFuncao);
    }

    public void informoDataDaUltimaAlteracaoContratualSocietaria(String dataAlteraContratual) {
        escrever(inputDataAlteracaoContra, dataAlteraContratual);
    }

    public void informoTelefone(String telefone) {
        escrever(inputTelefone, telefone);
    }

    public void escolhoCNAE(String cnae) {
        clicar(btnBuscarCNAE);
        escrever(inputDescricaoCNAE, cnae);
        esperar(1000);
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//p[normalize-space() = '%s']/../../..", cnae)));
        opcao.click();
    }

    public void noComboRegimeTributacao(String regimeTributacao) {
        selecionarCombos(startComboRegimeTributacao, regimeTributacao);
    }

    public void informoCapitalSocial(String capitalSocial) {
        escrever(inputCapitalSocial, capitalSocial);
    }

    public void informoQuantidadeDeFuncionarios(String qtFuncionarios) {
        escrever(inputQtFuncionarios, qtFuncionarios);
    }

    public void noComboNaturezaJuridica(String naturezaJuridica) {
        selecionarCombos(startComboNaturezaJuridica, naturezaJuridica);
    }

    public void informoNomeOuRazaoSocialDoSocio(String nome) {
        escrever(inputNomeOrRazaoSocial, nome);

    }

    public void informoCnpjDoSocio() {
        escrever(inputCPFCNPJSocio, geraCpfCnpj.cnpj(false));
    }

    public void informoCpfSocio() {
        escrever(inputCPFCNPJSocio, geraCpfCnpj.cpf(false));
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
    }

    public void informoCpfDoSocio() {
        escrever(inputCPFCNPJSocio, geraCpfCnpj.cpf(false));
    }

    public void informoValorPatrimonioImobiliario(String valorPatriImobiliario) {
        escrever(inputValorPatrimonioImobiliario, valorPatriImobiliario);
    }

    public void informoPorcentagemParicipacaoDoSocio(String porcentagemParticipacao) {
        escrever(inputPorcentagem, porcentagemParticipacao);
    }

    public void informodataNascimentoSocio(String dataNascimentoSocio) {
        escrever(inputDataNascimentoSocio, dataNascimentoSocio);
    }

    public void naOpcaoRepresentanteLegalEscolho(String representanteLegal) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//span[text() = '%s']/../input", representanteLegal)));
        opcao.click();
    }

    public void nasOpcoesRepresentanteESocioEscolho(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("(//span[text() = '%s']/../input)[3]", simOrnao)));
        opcao.click();
    }

    public void escolhoSocioNoComboRepresentanteLegal() {
        clicar(startComboSocioRepresentanteLegal);
        clicar(opcaoComboSocioRepresentanteLegal);
    }

    public void informoCpfDoRepresentanteLegal() {
        escrever(inputCPFSocio, geraCpfCnpj.cpf(false));
    }

    public void informoNomeRepresentanteLegal(String nomeRepresentante) {
        escrever(inputNomeRepresentante, nomeRepresentante);
    }

    public void naOpcaoAvalistaInformoOSocio() {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        clicar(startComboAvalista);
        clicar(opcaoSocioComboAvalista);
    }

    public void clicoOpcaoAdicionarAvalista(String opcao) {
        if (opcao.equalsIgnoreCase("Sim")) {
            clicar(btnAdicionarAvalista);
        }
    }

    public void informoSegundoAvalistaSocio(String simOrnao) {
        WebElement opcoa = getDriver().findElement(By.xpath
                (String.format("(//label[text() = 'É sócio?'])[3]/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcoa.click();
    }

    public void informoSeAvalistaESocio(String simOrnao) {
        WebElement opcoa = getDriver().findElement(By.xpath
                (String.format("(//label[text() = 'É sócio?'])[2]/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcoa.click();


    }

    public void informoCpfDoAvalista() {
        escrever(inputCpfAvalista, geraCpfCnpj.cpf(false));
    }

    public void informoNomeAvalistaPj(String nome) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputNomeAvalistaPj, nome);
    }

    public void noComboNaturezaOcupacaoPj(String ocupacao) {
        selecionarCombos(startComboNaturezaOcupacaoAvalistaPj, ocupacao);
    }

    public void informoDataDeAdmissaoAvalistaPj(String dataAdmissao) {
        escrever(inputDataAdmissaoAvalistaPj, dataAdmissao);
    }

    public void noCampoSalarioRendaAvalistaPjInformo(String renda) {
        escrever(inputSalarioRendaAvalistaPj, renda);
    }

    public void escolhoEstadoCivilAvalistaPj(String estatdoCivil) {
        selecionarCombos(startComboEstadoCivilAvalistaPj, estatdoCivil);
    }

    public void informoNomeConjuguePJ(String nome) {
        escrever(inputNomeConjugueAvalistaPj, nome);
    }

    public void informoCpfConjugueAvalista() {
        escrever(inputCpfConjugueAvalistaPj, geraCpfCnpj.cpf(false));
    }

    public void informoDataNascimentoConjugueAvalistaPj(String dataNascimento) {
        escrever(inputDataNascimentoConjugueAvalistaPj, dataNascimento);
    }


    public void naOpcaoBeneficiarioFinalClicoEmAdicionar(String simOrnao) {
        if (simOrnao.equalsIgnoreCase("Sim")) {
            clicar(btnAdicionarBeneficiarioFinal);
        }
    }

    public void informoSeBeneficiarioDinalESocio(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//span[normalize-space() = 'Beneficiário final']/../..//span[text() = '%s']/..//input", simOrnao)));
        opcao.click();
    }

    public void informoCpfDoBeneficiarioFinal() {
        escrever(inputCpfBeneficiarioFinal, geraCpfCnpj.cpf(false));
    }

    public void informoCnpjBeneficiarioFinal() {
        escrever(inputCpfBeneficiarioFinal, geraCpfCnpj.cnpj(false));
    }

    public void informoNomeBeneficiarioFinal(String nome) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputNomeBeneficiarioFinal, nome);

    }

    public void noComboNaturezaDaOcupacaoBeneficiarioFinalEscolho(String naturezaOcupacao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        selecionarCombos(startComboNaturezaOcupacao, naturezaOcupacao);
    }

    public void informoDataAdmissaoBeneficiarioFinal(String dataAdmissao) {
        escrever(inputDataAdmissao, dataAdmissao);
    }

    public void noCampóSalarioRendaMensalBeneficiarioInformo(String renda) {
        escrever(inputRendaBeneficiario, renda);
    }

    public void noComboregimeCasamentoBeneficiarioFinalEscolho(String regimeCasamento) {
        selecionarCombos(startComboRegimeCasamento, regimeCasamento);
    }

    public void informoEmailBeneficiarioFinal(String email) {
        escrever(inputEmailBeneficiarioFinal, email);
    }

    public void informoCelularBeneficiarioFinal(String celular) {
        escrever(inputCelular, celular);
    }

    public void informoDataNascimentoBeneficiarioFinal(String dataNascimento) {
        escrever(inputDataNascimentoBeneficiario, dataNascimento);
    }

    public void informoNomeMaeBeneficiarioFinal(String nome) {
        escrever(inputNomeMaeBeneficiario, nome);
    }

    public void noCamboEnderecoInformoCepBeneficiarioFinal(String cepBeneficiario) {
        escrever(inputCepBeneficiario, cepBeneficiario);
    }

    public void informoTipoResidenciaBeneficiarioFinal(String tipoResidencia) {
        selecionarCombos(startComboTipoResidenciaBeneficiarioFinal, tipoResidencia);
    }

    public void informoNumeroRuaBeneficiarioFinal(String numero) {
        escrever(inputNumeroBeneficiario, numero);
    }

    public void naOpcoesDesempenhouFuncaoOuCargoPublicoRelevanteNosUltimos5AnosDoBeneficiario(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("//label[text() = 'Desempenhou função ou cargo público relevante nos últimos 5 anos?']/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcao.click();
    }

    public void escrevoFuncaoPoliticaBeneficiarioFinal(String funcao) {
        escrever(inputFuncaoExercidaBeneficiario, funcao);
    }

    public void nasOpcoesPossuiParentescoComPessoasExerceuFuncaoOuCargoRelevanteNoUltimos5AnosBeneficiario(String simOrnao) {
        WebElement opcao = getDriver().findElement(By.xpath(
                String.format("//label[text() = 'Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?']/..//span[text() = '%s']/preceding-sibling::input", simOrnao)));
        opcao.click();
    }

    public void informoGrauParentescoBeneficiarioFinal(String parentesco) {
        escrever(inputGrauParentescoBeneficiario, parentesco);
    }


    public void informoOsDadosObrigatorioDosSocios() {
        escrever(inputCpfAvalistaSocio2, geraCpfCnpj.cpf(false));
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        escrever(inputNomeAvalistaSocio2, gerarStringAleatorio());
        selecionarCombos(startComboNaturezaOcupacaoAvalista02, "Estudante");
        escrever(inputRendaAavalista02, "6.000,00");
        selecionarCombos(startComboEstadoCivilAvalista02, "Solteiro");
    }


    public void naOpcaoBeneficiarioFibalEscolhoOSocio() {
        clicar(startComboSocioBeneficiarioFinal);
        clicar(opcaoSocioComboBeneficiarioFinal);
    }

    public void naOpcaoEmpresasColigadasControladorasClicoEmAdicionar(String simOrnao) {
        seCarregamentoForVisivelAguardaEleSumirSeNaoContinua();
        if ((simOrnao.equalsIgnoreCase("Sim"))) {
            clicar(btnAdicionarEmpresasColigadasControladora);
        }
    }

    public void informoOsparticipantes() {
        clicar(startComboParticipantes);
        clicar(opcaoSocioParticipantes);
    }

    public void informoCnpjDaEmpresaColigadaControladora() {
        escrever(inputCNPJEmpresas, geraCpfCnpj.cnpj(false));
    }

    public void informoRazaoSocialDaEmpresas(String razaoSocial) {
        escrever(inputRazaoSocialEmpresa, razaoSocial);
    }

    public void informoCapitalTotal(String capita) {
        escrever(inputCapitalTotal, capita);
    }

    public void escolhoOPeriodoDeFaturamento() {
        clicar(startComboPeriodoFaturamento);
        clicar(opcaoComboPeriodoFaturamento);
    }

    public void nosMesesFaturamentoInformOValor(String valor) {
        int quantidade = camposFaturamento.size();
        int test = 0;
        for (int x = 0; x < quantidade; x++) {
            test++;
            WebElement opcao = getDriver().findElement(By.xpath
                    (String.format("(//input[@formcontrolname = 'value'])[%s]", test)));
            escrever(opcao, valor);

        }
    }

}
