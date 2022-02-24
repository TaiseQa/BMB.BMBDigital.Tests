package inmetrics.automacao.steps;


import io.cucumber.java.pt.E;
import inmetrics.automacao.framework.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginStep {

	LoginPage loginPage;

	@Dado("que estou na página principal da aplicação {string}")
	public void que_estou_na_pagina_principal_da_aplicacao(String url) {
		loginPage = new LoginPage();
	    loginPage.acessarAplicacao(url);
	}

	@E("quando ignoro o certificado")
	public void quando_ignoro_o_certificado() {
		loginPage.ignorarCertificado();
	}

	@Quando("ao inserir o usuario {string} e {string},")
	public void ao_inserir_o_usuario_e(String user, String pass) {
	    loginPage.preencherLoginForm(user, pass);
	}

	@Quando("ao clicar no botão Entre")
	public void ao_clicar_no_botao_Entre() {
		loginPage.clicarBotaoLogin();
	}
	
	@Então("fecho a ficha de campanha")
	public void fecho_a_ficha_de_campanha() throws InterruptedException {
		loginPage.fecharJanelaCampanha();
	}
}
