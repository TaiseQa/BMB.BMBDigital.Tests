package br.com.bmbwebtest.page;

import br.com.bmbwebtest.map.BmbWebHomeMap;

public class BmbWebHomePage extends BmbWebHomeMap{

	public void loginSucess() throws Throwable {
		SendTextCssScelector(inputLogin, "mpinhe8e");
		SendTextCssScelector(inputSenha, "Mercedes@2021");
		ClickCssScelector(btEntrar);
	}
	
	public void LogouthSucess() throws Throwable {
		ClickAngularCssSelector(BtHoverAccount);
		ClickAngularCssSelector(BtHoverSair);
	}
}
