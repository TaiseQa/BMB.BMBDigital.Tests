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
public class Teste1 extends MapTeste {
	
	private static final WebDriver driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME);;
		
	public Teste1() {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private static String pathNavegador = "src\\test\\java\\resources\\chromedriver.exe";
	//private static final WebDriver driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME, pathNavegador);;
	private String url = "https://inm-test-app.herokuapp.com/accounts/login/";
	//private InteracoesTelaWeb interacoesTelaWeb = new InteracoesTelaWeb(driver);
	

	@Test
	public void teste1AbriNavegador() {
		abrirNavegador(url);
		PageFactory.initElements(driver, this);
	}

	@Test
	public void teste2InserirValor() {
		PageFactory.initElements(driver, this);
		String user = "user_test";
		String senha = "test123!";				
		inserirValor(formInputUsername, user);
		inserirValor(formInputPassword, senha);
		
		assertEquals(user, obterValorPropriedade(formInputUsername, "value"));
		assertEquals(senha, obterValorPropriedade(formInputPassword, "value"));
	}
	

	@Test
	public void teste3ClicarElemento() {
		PageFactory.initElements(driver, this);
		consultarExistencia(formButtonEntre);
		clicarElemento(formButtonEntre);
		
		assertTrue(consultarExistencia(textoNome));
	}
	
	@Test
	public void teste4obterValorTexto() {
		PageFactory.initElements(driver, this);
		assertEquals("Nome", obterValorTexto(textoNome));
	}
	
	
	@Test
	public void teste5FechaAplicacao() {
		PageFactory.initElements(driver, this);
		fechaAplicacao();
	}
	


}

