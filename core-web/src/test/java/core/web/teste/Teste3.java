package core.web.teste;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import core.web.pageObject.MapTeste;
import inmetrics.automacao.core.web.InteracoesTelaWeb;
import inmetrics.automacao.core.web.enumeradores.Navegador;
import inmetrics.automacao.core.web.util.FabricaWebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Teste3 extends MapTeste {
	
	private static final WebDriver driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME);
		
	public Teste3() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private String url = "https://inm-test-app.herokuapp.com/accounts/login/";
	

	@Test
	public void teste1AbriNavegadorComTempoEspera() {
		abrirNavegador(url);
		PageFactory.initElements(driver, this);
	}

	@Test
	public void teste2InserirValorComTempoEspera() {
		PageFactory.initElements(driver, this);
		String user = "user_test";
		String senha = "test123!";				
		inserirValor(formInputUsername, user, 40);
		inserirValor(formInputPassword, senha, 40);
		
		assertEquals(user, obterValorPropriedade(formInputUsername, "value", 30));
		assertEquals(senha,obterValorPropriedade(formInputPassword, "value", 30));
	}
	

	@Test
	public void teste3ClicarElementoComTempoEspera() {
		PageFactory.initElements(driver, this);
		consultarExistencia(formButtonEntre, 30);
		clicarElemento(formButtonEntre, 30);
		
		assertTrue(consultarExistencia(textoNome, 30));
	}
	
	@Test
	public void teste4obterValorTextoComTempoEspera() {
		PageFactory.initElements(driver, this);
		assertEquals("Nome", obterValorTexto(textoNome, 30));
	}
	
	@Test
	public void teste5FechaAplicaoComTempoEspera() {
		PageFactory.initElements(driver, this);
		fechaAplicacao();
	}
	

}

