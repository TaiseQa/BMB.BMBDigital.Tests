package steps;


import io.cucumber.java.pt.*;
import framework.pages.LoginPage;

public class LoginStep {

	LoginPage loginPage;

	@Dado("que estou na página principal da aplicação {string}")
	public void que_estou_na_pagina_principal_da_aplicacao(String url) {
		loginPage = new LoginPage();
	    loginPage.acessarAplicacao(url);
	}

	@E("quando ignoro o certificado")
	public void quando_ignoro_o_certificado() {

	}

	@Quando("ao inserir o usuario {string} e {string},")
	public void ao_inserir_o_usuario_e(String user, String pass) {
	    loginPage.preencherLoginForm(user, pass);
	}

	@Quando("ao clicar no botão Entre")
	public void ao_clicar_no_botao_Entre() {
		loginPage.clicarBotaoLogin();
	}
	
	@Entao("fecho a ficha de campanha")
	public void fecho_a_ficha_de_campanha()  {
		loginPage.fecharJanelaCampanha();
	}
}
