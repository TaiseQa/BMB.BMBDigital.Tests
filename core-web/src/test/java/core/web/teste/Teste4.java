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
public class Teste4 extends MapTeste {
	
	private static final WebDriver driver = FabricaWebDriver.CriarWebDriver(Navegador.CHROME);;
		
	public Teste4() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private String url = "https://ultimateqa.com/simple-html-elements-for-automation/";
	

	@Test
	public void teste1AbriNavegador() {
		abrirNavegador(url);
		PageFactory.initElements(driver, this);
	}

	@Test
	public void teste2ClicarRadioButtonTempoEspera() {
		PageFactory.initElements(driver, this);
		selecionarCheckbox(radiobutton);
		
		assertTrue(radiobutton.isSelected());
	}
	
	@Test
	public void teste3DescerBarraTempoEspera() {
		PageFactory.initElements(driver, this);
		movimentarBarraRolagem(500);
	}
	
	@Test
	public void teste4SelecionarCheckboxTempoEspera() {
		PageFactory.initElements(driver, this);
		selecionarCheckbox(checkbox1);
		selecionarCheckbox(checkbox2);
		
		assertTrue(checkbox1.isSelected());
		assertTrue(checkbox2.isSelected());
	}
	
	@Test
	public void teste5DeselecionarCheckboxTempoEspera() {
		PageFactory.initElements(driver, this);
		deselecionarCheckbox(checkbox1);
		deselecionarCheckbox(checkbox2);
		
		assertFalse(checkbox1.isSelected());
		assertFalse(checkbox2.isSelected());
	}
	
	@Test
	public void teste6selecionarTextoTempoEspera() {
		PageFactory.initElements(driver, this);		
		String texto = "Saab" ;		
		selecionarElementoTexto(select, texto);	
		
		assertEquals(texto.toLowerCase(), obterValorPropriedade(select, "value"));		
	}
	
	@Test
	public void teste7selecionarValorTempoEspera() {
		PageFactory.initElements(driver, this);		
		String texto = "saab" ;		
		selecionarElementoValor(select, texto);	
		
		assertEquals(texto, obterValorPropriedade(select, "value"));		
	}
	
	@Test
	public void teste8selecionarIndiceTempoEspera() {
		PageFactory.initElements(driver, this);		
		String texto = "saab" ;		
		selecionarElementoIndice(select, 1);	
		
		assertEquals(texto, obterValorPropriedade(select, "value"));		
	}
	
	
	@Test
	public void teste9SubirBarra() {
		PageFactory.initElements(driver, this);
		movimentarBarraRolagem(-900);
	}

}

