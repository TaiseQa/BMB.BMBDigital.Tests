package br.com.bmbwebtest.stepDefinitions;

import java.util.List;
import java.util.Map;

import br.com.bmbwebtest.page.BmbWebHomePage;
import br.com.bmbwebtest.page.BmbWebPropostasContratosPage;
import br.com.bmbwebtest.utils.PageObjectUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BmbWebPropostasContratosSteps {
	
	BmbWebPropostasContratosPage bmbWebPropostasContratosPage;
	BmbWebHomePage bmbWebHomePage;

	@Dado("^que faço login no portal BMB Digital$")
	public void que_faço_login_no_portal_BMB_Digital() throws Throwable {
		bmbWebHomePage = new BmbWebHomePage();
		bmbWebHomePage.loginSucess();
	}

	@Quando("^acesso a pagina de \"([^\"]*)\"$")
	public void acesso_a_pagina_de(String _text) throws Throwable {
		bmbWebPropostasContratosPage = new BmbWebPropostasContratosPage();
		bmbWebPropostasContratosPage.PropostasContratosPage();
		PageObjectUtils.BuscaTextoPage(_text);
		Thread.sleep(10000);
	}
	
	@Quando("^efetuo cadastro Ficha Cadastral com sucesso usando:$")
	public void efetuo_cadastro_Ficha_Cadastral_com_sucesso_usando(List<Map<String, String>> formulario) throws Throwable {
		bmbWebPropostasContratosPage.FichaCadastral(formulario);
	}

	@Quando("^efetuo cadastro Simulação com sucesso usando:$")
	public void efetuo_cadastro_Simulação_com_sucesso_usando(List<Map<String, String>> formulario) throws Throwable {
		bmbWebPropostasContratosPage.Simulacao(formulario);
		bmbWebPropostasContratosPage.ContinuaSimulacao();
	}

	@Quando("^efetuo cadastro Seguros com sucesso usando:$")
	public void efetuo_cadastro_Seguros_com_sucesso_usando(List<Map<String, String>> formulario) throws Throwable {
		bmbWebPropostasContratosPage.Seguros();
	}

	@Então("^finalizo Proposta com sucesso$")
	public void finalizo_Proposta_com_sucesso() throws Throwable {
		
	}
	
	@Então("^finalizo Proposta com sucesso Aprova Banco$")
	public void finalizo_Proposta_com_sucesso_Aprova_Banco() throws Throwable {
//		bmbWebPropostasContratosPage.fichaCadastral();
//		bmbWebPropostasContratosPage.uploadDocumentos();
//		bmbWebPropostasContratosPage.gerarContrato();
	}
}