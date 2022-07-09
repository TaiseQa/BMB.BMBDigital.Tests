package steps.nova_ficha;

import io.cucumber.java.pt.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.nova_ficha.FichaCadastralCNPJPage;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class FichaCadastralCNPJSteps {

    FichaCadastralCNPJPage fichaCadastralCNPJPage;

    public FichaCadastralCNPJSteps(FichaCadastralCNPJPage fichaCadastralCNPJPage) {
        this.fichaCadastralCNPJPage = fichaCadastralCNPJPage;
    }

    @E("informo um CNPJ valido")
    public void informoUmCnpjValido() {
        fichaCadastralCNPJPage.informoUmCnpjValido();
    }

    @E("informo o nome da empresa do cliente juridico {string}")
    public void informoONomeDaEmpresaDoClienteJuridica(String nomeEmpresa) {
        fichaCadastralCNPJPage.informoONomeDaEmpresaDoClienteJuridica(nomeEmpresa);
    }

    @E("no combo constituicao escolho {string}")
    public void noComboConstituicaoEscolho(String constituicao) {
        fichaCadastralCNPJPage.noComboConstituicaoEscolho(constituicao);
    }

    @E("informo a data de fundacao {string}")
    public void informoDataDeFuncao(String dataFuncao) {
        fichaCadastralCNPJPage.informoDataDeFuncao(dataFuncao);
    }

    @E("informo a data da ultima alteracao contratual societaria {string}")
    public void informoDataDaUltimaAlteracaoContratualSocietaria(String dataAlteraContratual) {
        fichaCadastralCNPJPage.informoDataDaUltimaAlteracaoContratualSocietaria(dataAlteraContratual);
    }

    @E("informo o telefone {string}")
    public void informoTelefone(String telefone) {
        fichaCadastralCNPJPage.informoTelefone(telefone);
    }


    @E("escolho o CNAE {string}")
    public void escolhoCNAE(String cnae) {
        fichaCadastralCNPJPage.escolhoCNAE(cnae);
    }

    @E("no combo regime de tributacao {string}")
    public void noComboRegimeTributacao(String regimeTributacao) {
        fichaCadastralCNPJPage.noComboRegimeTributacao(regimeTributacao);
    }

    @E("informo o capital social {string}")
    public void informoCapitalSocial(String capitalSocial) {
        fichaCadastralCNPJPage.informoCapitalSocial(capitalSocial);
    }

    @E("informo a quantidade de funcionarios {string}")
    public void informoQuantidadeDeFuncionarios(String qtFuncionarios) {
        fichaCadastralCNPJPage.informoQuantidadeDeFuncionarios(qtFuncionarios);
    }

    @E("no combo natureza juridica {string}")
    public void noComboNaturezaJuridica(String naturezaJuridica) {
        fichaCadastralCNPJPage.noComboNaturezaJuridica(naturezaJuridica);
    }

    @E("informo o nome ou raza social do socio {string}")
    public void informoNomeOuRazaoSocialDoSocio(String nome) {
        fichaCadastralCNPJPage.informoNomeOuRazaoSocialDoSocio(nome);
    }

    @E("informo o cnpj do socio")
    public void informoCnpjDoSocio() {
        fichaCadastralCNPJPage.informoCnpjDoSocio();
    }

    @E("informo cpf do socio")
    public void informoCpfDoSocio() {
        fichaCadastralCNPJPage.informoCpfDoSocio();
    }

    @E("informo o valor de patrimonio imobiliario {string}")
    public void informoValorPatrimonioImobiliario(String valorPatriImobiliario) {
        fichaCadastralCNPJPage.informoValorPatrimonioImobiliario(valorPatriImobiliario);
    }

    @E("informo a porcentagem de participacao do socio {string}")
    public void informoPorcentagemParicipacaoDoSocio(String porcentagemParticipacao) {
        fichaCadastralCNPJPage.informoPorcentagemParicipacaoDoSocio(porcentagemParticipacao);
    }

    @E("informo a data nascimento do socio {string}")
    public void informodataNascimentoSocio(String dataNascimentoSocio) {
        fichaCadastralCNPJPage.informodataNascimentoSocio(dataNascimentoSocio);
    }

    @E("na opcao representante legal escolho {string}")
    public void naOpcaoRepresentanteLegalEscolho(String representanteLegal) {
        fichaCadastralCNPJPage.naOpcaoRepresentanteLegalEscolho(representanteLegal);
    }

    @E("nas opcoes o representante e socio escolho {string}")
    public void nasOpcoesRepresentanteESocioEscolho(String simOrnao) {
        fichaCadastralCNPJPage.nasOpcoesRepresentanteESocioEscolho(simOrnao);
    }

    @E("informo o CPF do representante legal")
    public void informoCpfDoRepresentanteLegal() {
        fichaCadastralCNPJPage.informoCpfDoRepresentanteLegal();
    }

    @E("informo o nome do representante legal {string}")
    public void informoNomeRepresentanteLegal(String nomeRepresentante) {
        fichaCadastralCNPJPage.informoNomeRepresentanteLegal(nomeRepresentante);
    }

    @E("na opcao avalista informo o socio")
    public void naOpcaoAvalistaInformoOSocio() {
        fichaCadastralCNPJPage.naOpcaoAvalistaInformoOSocio();
    }

    @E("na opcao beneficiario final clico em adicionar {string}")
    public void naOpcaoBeneficiarioFinalClicoEmAdicionar(String simOrnao) {
        fichaCadastralCNPJPage.naOpcaoBeneficiarioFinalClicoEmAdicionar(simOrnao);
    }

    @E("informo se o beneficiario final e socio {string}")
    public void informoSeBeneficiarioDinalESocio(String simOrnao) {
        fichaCadastralCNPJPage.informoSeBeneficiarioDinalESocio(simOrnao);
    }

    @E("informo cpf do beneficiario final")
    public void informoCpfDoBeneficiarioFinal() {
        fichaCadastralCNPJPage.informoCpfDoBeneficiarioFinal();
    }

    @E("informo nome do beneficiario final {string}")
    public void informoNomeBeneficiarioFinal(String nome) {
        fichaCadastralCNPJPage.informoNomeBeneficiarioFinal(nome);
    }

    @E("no combo natureza da ocupacao do beneficiario final escolho {string}")
    public void noComboNaturezaDaOcupacaoBeneficiarioFinalEscolho(String naturezaOcupacao) {
        fichaCadastralCNPJPage.noComboNaturezaDaOcupacaoBeneficiarioFinalEscolho(naturezaOcupacao);
    }

    @E("informo a data de admissao do beneficiario final {string}")
    public void informoDataAdmissaoBeneficiarioFinal(String dataAdmissao) {
        fichaCadastralCNPJPage.informoDataAdmissaoBeneficiarioFinal(dataAdmissao);
    }

    @E("no campo salario e renda mensal do beneficiario final informo {string}")
    public void noCampóSalarioRendaMensalBeneficiarioInformo(String renda) {
        fichaCadastralCNPJPage.noCampóSalarioRendaMensalBeneficiarioInformo(renda);
    }

    @E("no combo regime de casamento do beneficiario final escolho {string}")
    public void noComboregimeCasamentoBeneficiarioFinalEscolho(String regimeCasamento) {
        fichaCadastralCNPJPage.noComboregimeCasamentoBeneficiarioFinalEscolho(regimeCasamento);
    }

    @E("informo o email do beneficiario final {string}")
    public void informoEmailBeneficiarioFinal(String email) {
        fichaCadastralCNPJPage.informoEmailBeneficiarioFinal(email);
    }

    @E("informo o celular do beneficiario final {string}")
    public void informoCelularBeneficiarioFinal(String celular) {
        fichaCadastralCNPJPage.informoCelularBeneficiarioFinal(celular);
    }

    @E("informo dataNascimento do beneficiario final {string}")
    public void informoDataNascimentoBeneficiarioFinal(String dataNascimento) {
        fichaCadastralCNPJPage.informoDataNascimentoBeneficiarioFinal(dataNascimento);
    }

    @E("informo o nome da mae do beneficiario final {string}")
    public void informoNomeMaeBeneficiarioFinal(String nome) {
        fichaCadastralCNPJPage.informoNomeMaeBeneficiarioFinal(nome);
    }

    @E("no campo endereco informo o cep do beneficiario final {string}")
    public void noCamboEnderecoInformoCepBeneficiarioFinal(String cepBeneficiario) {
        fichaCadastralCNPJPage.noCamboEnderecoInformoCepBeneficiarioFinal(cepBeneficiario);
    }

    @E("informo o numero da rua do beneficiario final {string}")
    public void informoNumeroRuaBeneficiarioFinal(String numero) {
        fichaCadastralCNPJPage.informoNumeroRuaBeneficiarioFinal(numero);
    }

    @E("nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho {string}")
    public void naOpcoesDesempenhouFuncaoOuCargoPublicoRelevanteNosUltimos5AnosDoBeneficiario(String simOrnao) {
        fichaCadastralCNPJPage.naOpcoesDesempenhouFuncaoOuCargoPublicoRelevanteNosUltimos5AnosDoBeneficiario(simOrnao);
    }

    @E("nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final {string}")
    public void nasOpcoesPossuiParentescoComPessoasExerceuFuncaoOuCargoRelevanteNoUltimos5AnosBeneficiario(String parentesco) {
        fichaCadastralCNPJPage.nasOpcoesPossuiParentescoComPessoasExerceuFuncaoOuCargoRelevanteNoUltimos5AnosBeneficiario(parentesco);
    }

    @E("na aopcao beneficiario final escolho qual o socio")
    public void naOpcaoBeneficiarioFibalEscolhoOSocio() {
        fichaCadastralCNPJPage.naOpcaoBeneficiarioFibalEscolhoOSocio();
    }

    @E("na opcao empresas coligadas e controladoras clico em adicionar {string}")
    public void naOpcaoEmpresasColigadasControladorasClicoEmAdicionar(String simOrnao) {
        fichaCadastralCNPJPage.naOpcaoEmpresasColigadasControladorasClicoEmAdicionar(simOrnao);
    }

    @E("informo os participantes")
    public void informoOsparticipantes() {
        fichaCadastralCNPJPage.informoOsparticipantes();
    }

    @E("informo o CNPJ da empresa coligada e controladora")
    public void informoCnpjDaEmpresaColigadaControladora() {
        fichaCadastralCNPJPage.informoCnpjDaEmpresaColigadaControladora();
    }

    @E("informo a razao social da empresa {string}")
    public void informoRazaoSocialDaEmpresas(String razaoSocial) {
        fichaCadastralCNPJPage.informoRazaoSocialDaEmpresas(razaoSocial);
    }

    @E("informo o capital total {string}")
    public void informoCapitalTotal(String capita) {
        fichaCadastralCNPJPage.informoCapitalTotal(capita);
    }

    @E("escolho o periodo de faturamento")
    public void escolhoOPeriodoDeFaturamento() {
        fichaCadastralCNPJPage.escolhoOPeriodoDeFaturamento();
    }

    @E("nos meses de faturamento informo o valor {string}")
    public void nosMesesFaturamentoInformOValor(String valor) {
        fichaCadastralCNPJPage.nosMesesFaturamentoInformOValor(valor);
    }
}
