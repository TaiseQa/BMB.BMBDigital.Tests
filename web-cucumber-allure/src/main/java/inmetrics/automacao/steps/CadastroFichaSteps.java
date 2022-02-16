package inmetrics.automacao.steps;

import inmetrics.automacao.framework.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import inmetrics.automacao.framework.pages.CadastroFichaPage;
import inmetrics.automacao.framework.pages.MenuPage;
import org.junit.Assert;

public class CadastroFichaSteps extends CadastroFichaPage{

    CadastroFichaPage cadastroFichaPage;
    MenuPage menuPage;
    LoginPage loginPage;

    @Dado("^que faço login no portal BMB Digital$")
    public void que_faco_login_no_portal_BMB_Digital() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.realizarLogin("https://digitalqa.br800.corpintra.net/App/login",
                "atucun0f", "Mercedes@2022");
    }

    @Quando("^acesso a pagina de Propostas e Contratos$")
    public void acesso_a_pagina_de_propostas_e_contratos() {
        menuPage = new MenuPage();
        cadastroFichaPage = menuPage.clicarMenuContratosPropostas();
    }

    @Dado("que eu tenha clicado no botão Nova Ficha")
    public void queEuTenhaClicadoNoBotaoNovaFicha() {
        cadastroFichaPage.clicarBotaoNovaFicha();
    }

    @Dado("^preencho o campo abaixo com um valor inválido \"([^\"]*)\"$")
    public void preencho_o_campo_abaixo_com_um_valor_invalido(String cpfCnpj) {
        cadastroFichaPage.preencheCpfCnpj(cpfCnpj);
    }

    @Quando("preencho o campo CPF ou CNPJ com valor inválido {string}")
    public void preenchoOCampoCPFCNPJComValorInvalido(String cpfCnpj) {
        cadastroFichaPage.preencheCpfCnpj(cpfCnpj);
    }

    @Então("é apresentada a mensagem {string}.")
    public void eApresentadaAMensagem(String mensagem) {
        String mensagemAtual = cadastroFichaPage.obterTextoMensagemErro();
        Assert.assertEquals(mensagem, mensagemAtual);
    }


}
