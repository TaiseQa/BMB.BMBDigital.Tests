package steps;

import framework.pages.*;
import framework.utils.GeraCpfCnpj;
import framework.utils.Utils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CadastroFichaSteps extends CadastroFichaPage {

    CadastroVeiculoPage cadastroVeiculoPage;
    PropostasContratosPage propostasContratosPage;
    CadastroFichaPage cadastroFichaPage;
    MenuPage menuPage;
    LoginPage loginPage;

    @Dado("^que faço login no portal BMB Digital$")
    public void que_faco_login_no_portal_BMB_Digital() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.realizarLogin("#{Server.Frontend.Digital.Url}#/App/login",
                "#{NonProd.Credential.BMBDigital.Tests.Username}#",
                "#{NonProd.Credential.BMBDigital.Tests.Password}#");
    }

    @Quando("^acesso a página de Propostas e Contratos$")
    public void acesso_a_pagina_de_propostas_e_contratos() {
        menuPage = new MenuPage();
        propostasContratosPage = menuPage.clicarMenuContratosPropostas();
    }

    @E("clico no botão Nova Ficha")
    public void queEuTenhaClicadoNoBotaoNovaFicha() throws InterruptedException {
        cadastroFichaPage = propostasContratosPage.clicarBotaoNovaFicha();
    }

    @Dado("que preencho o campo CPF com valor válido")
    public void quePreenchoOCampoCPFComValor() {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        cadastroFichaPage.preencheCpfCnpj(geraCpfCnpj.cpf(false));
    }

    @Dado("que preencho o campo CPF ou CNPJ com valor inválido {string}")
    public void preenchoOCampoCPFCNPJComValorInvalido(String cpfCnpj) {

        cadastroFichaPage.preencheCpfCnpj(cpfCnpj);
    }

    @Então("é apresentada a mensagem {string}.")
    public void eApresentadaAMensagem(String mensagem) {
        String mensagemAtual = cadastroFichaPage.obterTextoMensagemErro();
        Assert.assertEquals(mensagem, mensagemAtual);
    }

    @E("preenchido o campo de CPF com valor válido")
    public void preenchidoOCampoCPF() {
        GeraCpfCnpj geraCpfCnpj = new GeraCpfCnpj();
        cadastroFichaPage.preencheCpfCnpj(geraCpfCnpj.cpf(false));
    }

    @Dado("que preencho os campos de identificação do cliente")
    public void preenchoOsCamposDeIdentificacaoDoCliente(DataTable identificacaoCliente) throws InterruptedException {
        List<Map<String, String>> map = identificacaoCliente.asMaps(String.class, String.class);
        cadastroFichaPage.preencherIdentificacaoCliente(map.get(0).get("Valor"), map.get(1).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(4).get("Valor"));
    }

    @E("preencho os campos de endereço")
    public void preenchoOsCamposDeEndereco(DataTable endereco) throws InterruptedException {
        List<Map<String, String>> map = endereco.asMaps(String.class, String.class);
        cadastroFichaPage.preencherCamposEndereco(map.get(0).get("Valor"), map.get(1).get("Valor"), map.get(2).get("Valor"),
                map.get(3).get("Valor"), map.get(4).get("Valor"), map.get(5).get("Valor"));
    }

    @E("preencho as informações de Dados adicionais:")
    public void preenchoAsInformacoesDeDadosAdicionais(DataTable dadosAdicionais) throws InterruptedException {
        List<Map<String, String>> map = dadosAdicionais.asMaps(String.class, String.class);
        cadastroFichaPage.preencherDadosAdicionais(map.get(0).get("Valor"), map.get(1).get("Valor"), map.get(2).get("Valor"),
                map.get(3).get("Valor"), map.get(4).get("Valor"), map.get(5).get("Valor"), map.get(6).get("Valor"),
                map.get(7).get("Valor"), map.get(8).get("Valor"), map.get(9).get("Valor"), map.get(10).get("Valor"),
                map.get(11).get("Valor"), map.get(12).get("Valor"));

    }

    @E("preencho o formulário de Dados profissionais:")
    public void preenchoOFormularioDeDadosProfissionais(DataTable dadosProfissionais) throws InterruptedException {
        List<Map<String, String>> map = dadosProfissionais.asMaps(String.class, String.class);
        cadastroFichaPage.preencherDadosProfissionais(map.get(0).get("Valor"), map.get(1).get("Valor"), map.get(2).get("Valor"),
                map.get(3).get("Valor"), map.get(4).get("Valor"), map.get(5).get("Valor"), map.get(6).get("Valor"), map.get(7).get("Valor"), map.get(8).get("Valor"), map.get(9).get("Valor"), map.get(10).get("Valor"));

    }

    @E("preencho o formulário de Declaração de exposição política:")
    public void preenchoOFormularioDeDeclaracaoDeExposicaoPolitica(DataTable declaracao) throws InterruptedException {
        List<Map<String, String>> map = declaracao.asMaps(String.class, String.class);
        cadastroFichaPage.preencherDeclaracaoExposicaoPolitica(map.get(0).get("Valor"), map.get(1).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"));
    }

    @E("seleciono a Finalidade do financiamento com {string}")
    public void selecionoAFinalidadeDoFinanciamentoCom(String finalidadeFinanciamento) {
        cadastroFichaPage.selecionarFinalidadeFinanciamento(finalidadeFinanciamento);
    }

    @E("clico no botão Salvar Cliente")
    public void clicoNoBotaoSalvarCliente() throws InterruptedException {
        cadastroVeiculoPage = cadastroFichaPage.clicarSalvarCliente();
    }

    @Então("quando estou na tela de simulação do financiamento")
    public void quandoEstouNaSegundaTelaDeSimulacaoDoFinanciamento() throws InterruptedException {
    }

    @E("preencho os campos de veiculo:")
    public void preenchoOsCamposDeVeiculo(DataTable veiculo) throws InterruptedException {
        List<Map<String, String>> map = veiculo.asMaps(String.class, String.class);
        cadastroVeiculoPage = new CadastroVeiculoPage();
        cadastroVeiculoPage.preencherCamposVeiculo(map.get(0).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(5).get("Valor"),
                map.get(6).get("Valor"), map.get(7).get("Valor"), map.get(8).get("Valor"),
                map.get(9).get("Valor"), map.get(10).get("Valor"));
    }

    @E("preencho o formulário de Financiamento")
    public void preenchoOFormularioDeFinanciamento(DataTable financiamento) throws InterruptedException {
        List<Map<String, String>> map = financiamento.asMaps(String.class, String.class);
        cadastroVeiculoPage.preencherFinanciamento(map.get(0).get("Valor"), map.get(1).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(4).get("Valor"),
                map.get(5).get("Valor"), map.get(6).get("Valor"), map.get(7).get("Valor"),
                map.get(8).get("Valor"), map.get(9).get("Valor"));
    }

    @E("clico no botão Gerar Simulação")
    public void clicoNoBotaoGerarSimulacao() throws InterruptedException {
        cadastroVeiculoPage.clicarGerarSimulacao();
    }

    @E("o sistema apresenta o fluxo financeiro")
    public void oSistemaApresentaOFluxoFinanceiro() {
        cadastroFichaPage = new CadastroFichaPage();
        Assert.assertTrue(cadastroFichaPage.verificarTelaFluxoFinanceiro());
    }

    @E("clico em CONTINUAR")
    public void clicoEmCONTINUAR() {
        cadastroFichaPage = new CadastroFichaPage();
        cadastroFichaPage.clicarBotaoContinuarFluxoFinanceiro();
    }

    @E("o sistema informa a não solicitação de seguro do veículo")
    public void oSistemaHabilitaASolicitacaoDeSeguroDoVeiculo() throws InterruptedException {
        cadastroFichaPage.habilitarSolicitacaoSeguroVeiculo();
    }

    @E("seleciono que não desejo o seguro do veículo")
    public void selecionoQueNaoDesejoOSegudoDoVeiculo() throws InterruptedException {
        cadastroFichaPage.selecionarNaoDesejoSeguroVeiculo();
    }

    @E("clico no botão ENVIAR PROPOSTA DE CRÉDITO")
    public void clicoNoBotaoENVIARPROPOSTADECREDITO() throws InterruptedException {
        cadastroFichaPage.EnviarPropostaDeCredito();
    }

    @E("preencho com o vendedor {string}")
    public void preenchoComOVendedor(String vendedor) {
        cadastroFichaPage.preencherVendedor(vendedor);
    }

    @E("clico no botão ENVIAR")
    public void clicoNoBotaoENVIAR() throws InterruptedException {
        cadastroFichaPage.clicarBotaoEnviarVendedor();
    }

    @E("confirmo o envio de proposta de crédito")
    public void confirmoOEnvioDePropostaDeCredito() throws InterruptedException {
        cadastroFichaPage.clicarBotaoConfirmarEnvioPropostaCredito();
    }

    @Então("o sistema apresenta a tela com os detalhes da proposta cadastrada")
    public void oSistemaApresentaATelaComOsDetalhesDaPropostaCadastrada() {
        Assert.assertTrue(cadastroFichaPage.verificarTelaPropostaCadastrada());
//        Utils.killDriver();
    }

    @E("preencho o patrimônio estimado com {string}")
    public void preenchoOPatrimonioEstimadoCom(String patrimonio) {
        cadastroFichaPage.preencherPatrimonioEstimado(patrimonio);
    }

    @E("seleciono total de veículos próprios {string}")
    public void selecionoTotalDeVeiculosProprios(String quantidadeVeiculos) {
        cadastroFichaPage.preencherTotalVeiculosProprios(quantidadeVeiculos);
    }

    @E("preencho o formulário de avalista")
    public void preenchoOFormularioDeAvalista(DataTable avalista) throws InterruptedException {
        List<Map<String, String>> map = avalista.asMaps(String.class, String.class);
        cadastroFichaPage.preencherCamposAvalista(map.get(0).get("Valor"), map.get(1).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(4).get("Valor"));
    }

    @Quando("que preencho os campos de identificação do cliente e cônjuge")
    public void quePreenchoOsCamposDeIdentificaçãoDoClienteECônjuge(DataTable clienteConjuge) throws InterruptedException {
        List<Map<String, String>> map = clienteConjuge.asMaps(String.class, String.class);
        cadastroFichaPage.preencherIdentificacaoCliente(map.get(0).get("Valor"), map.get(1).get("Valor"), map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(4).get("Valor"));
        cadastroFichaPage.preencherIdentificacaoConjuge(map.get(5).get("Valor"), map.get(6).get("Valor"), map.get(8).get("Valor"));
    }

    @E("preencho as informações de Dados adicionais para naturalidade estrangeira:")
    public void preenchoAsInformaçõesDeDadosAdicionaisParaNaturalidadeEstrangeira(DataTable dadosAdicionaisEstrangeiros) throws InterruptedException {
        List<Map<String, String>> map = dadosAdicionaisEstrangeiros.asMaps(String.class, String.class);
        cadastroFichaPage.preencherDadosAdicionaisEstrangeiro(map.get(0).get("Valor"), map.get(1).get("Valor"),
                map.get(2).get("Valor"), map.get(3).get("Valor"), map.get(4).get("Valor"), map.get(5).get("Valor"),
                map.get(6).get("Valor"), map.get(7).get("Valor"), map.get(8).get("Valor"), map.get(9).get("Valor"),
                map.get(10).get("Valor"), map.get(11).get("Valor"));
    }
}
