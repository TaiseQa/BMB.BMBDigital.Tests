package br.com.bmbwebtest.testrules;

import br.com.bmbwebtest.page.BmbWebHomePage;
import br.com.bmbwebtest.utils.PageObjectUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BmbWebHomePage bmbWebHomePage;
	
	// Abrir Browser
	@Before
	public void beforeAllTest(Scenario _cenario) throws Throwable  {
		PageObjectUtils.OpenBrowse();	
		PageObjectUtils.cenario = _cenario;
	}
	
	// Fechar Browser
	@After
	public void afterAllTest() throws Throwable {
		if(PageObjectUtils.cenario.isFailed())
			PageObjectUtils.ScreenshotBmb();
			PageObjectUtils.CloseBrowse();
		
		bmbWebHomePage = new BmbWebHomePage();
//		bmbWebHomePage.LogouthSucess();
		PageObjectUtils.CloseBrowse();
	}
		
}
