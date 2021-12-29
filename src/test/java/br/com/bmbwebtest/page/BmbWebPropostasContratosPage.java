package br.com.bmbwebtest.page;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import br.com.bmbwebtest.map.BmbWebPropostasContratosElementMap;
import br.com.bmbwebtest.utils.Utils;
import cucumber.api.PendingException;
import br.com.bmbwebtest.utils.DataBase;


public class BmbWebPropostasContratosPage extends BmbWebPropostasContratosElementMap {
	
	public void PropostasContratosPage() throws Throwable {
		HoverCssScelector(BtHoverPropostasContratos);
		ClickAngularCssSelector(BtPropostasContratos);
	}
	
	public void SqlConnect(String Nproposta) throws Throwable {
		DataBase.DataBaseConnect(Nproposta);
	}
	
	public void SelecionaEstadoCivil(List<Map<String, String>> formulario) throws Throwable {
		switch (Utils.getValorFormulario("EstadoCivil", formulario)) {
		case "Solteiro":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ScreenshotBmb();
			break;
		case "Casado":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ClickAngularCssSelector(btRegimeDeCasamento);
			ClickXpathScelecto(XpathbtRegimeDeCasamento.replace("@REGIMECASAMENTO", Utils.getValorFormulario("RegimeCivil", formulario)));
			SendTextCssScelector(NomeConjuge, "Automacao Conjuge");
			ScreenshotBmb();
			SendTextCssScelector(CpfConjuge, Utils.geraCPF());
			SendTextCssScelector(NascimentoConjuge, "06/05/1992");
			break;
		case "Divorciado":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ScreenshotBmb();
			break;
		case "Desquitado":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ScreenshotBmb();
			break;
		case "Viuvo":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ScreenshotBmb();
			break;
		case "UniaoEstavel":
			ClickXpathScelecto(XpathbtEstadoCivil.replace("@ESTADOCIVIL", Utils.getValorFormulario("EstadoCivil", formulario)));
			ScreenshotBmb();
			SendTextCssScelector(NomeConjuge, "Automacao Uniao Estavel");
			SendTextCssScelector(CpfConjuge, Utils.geraCPF());
			SendTextCssScelector(NascimentoConjuge, "06/05/1992");
			break;
		default:
			System.out.println(Utils.getValorFormulario("EstadoCivil", formulario));
			break;
		}

	}
	
	public void FichaCadastral(List<Map<String, String>> formulario) throws Throwable {
		ClickAngularScelectoXpath(XpathBtNovaFicha);
//		SendTextXpathScelector(XpathInputCpfCnpj, Utils.geraCPF());
		SendTextXpathScelector(XpathInputCpfCnpj, "32652526391");
		EnterXpathScelector(XpathInputCpfCnpj);
		SendTextXpathScelector(XpathNome, "Teste Automacao");
		SendTextXpathScelector(XpathDataDeNascimento, "06/05/1992");	
		SendTextCssScelector(Email, "teste.automacao@gmail.com");
		SendTextCssScelector(Celular, "(11) 95656-5656");
		ClickAngularCssSelector(btEstadoCivil);
		SelecionaEstadoCivil(formulario);
		ScreenshotBmb();
		SendTextCssScelector(Cep, "05069-000");
		SendTextCssScelector(Numero, "261");
		ClickAngularCssSelector(TipoDeResidencia);
		ClickAngularScelectoXpath(XpathBtAlugada);
		ClickAngularCssSelector(NaturezaDaOcupacao);
		ClickAngularScelectoXpath(XpathOcupacao);
		SendTextCssScelector(AtividadePrincipal, "Analista Sistemas");
		SendTextCssScelector(DataDeAdmissão, "06/05/2000");
		SendTextCssScelector(SalarioRendaMensal, "800000");
		ClickAngularCssSelector(AtuaCargoPublicoNao);
		ClickAngularCssSelector(ParenteCargoPublicoNão);
		ClickAngularCssSelector(selectUsoParticular);
		ClickAngularCssSelector(UsoParticular);
		ClickAngularScelectoXpath(XpathBtSalvaCliente);
		SleepPage(5000);
		String message = driver.findElement(By.cssSelector("#swal2-content")).getText();
		assertTrue("Texto não encontrado!!", message.contains("Cliente atualizado"));
//		assertTrue("Texto não encontrado!!", message.contains("Cliente criado"));
		ScreenshotBmb();
		ClickAngularScelectoXpath(XpathClienteCriadoOk);
	}
		
	public void Simulacao(List<Map<String, String>> formulario) throws Throwable {
		ClickAngularCssSelector(AnoDeFabricacao);
		ClickXpathScelecto(XpathAnoDeFabricacao.replace("@ANOFABRICACAO", Utils.getValorFormulario("AnoFabricacao", formulario)));
		ClickAngularCssSelector(TipoDeVeiculo);
		ClickXpathScelecto(XpathTipoDeVeiculo.replace("@TIPODEVEICULO", Utils.getValorFormulario("TipoVeiculo", formulario)));
		ClickAngularCssSelector(EstadoDoVeiculoNovo);
		ClickAngularCssSelector(ModeloDeVeiculo);
		ClickXpathScelecto(XpathModeloDeVeiculo.replace("@MODELODEVEICULO", Utils.getValorFormulario("ModeloVeiculo", formulario)));
		ClickAngularCssSelector(Produto);
		ClickXpathScelecto(XpathProduto.replace("@PRODUTO", Utils.getValorFormulario("Produto", formulario)));
		ClickAngularCssSelector(Campanha);
		ClickXpathScelecto(XpathCampanha.replace("@CAMPANHA", Utils.getValorFormulario("Campanha", formulario)));
		ClickAngularCssSelector(Prazo);
		ClickXpathScelecto(XpathPrazo.replace("@PRAZO", Utils.getValorFormulario("Prazo", formulario)));
		ClickAngularCssSelector(Carencia);
		ClickAngularCssSelector(SelectorCarencia);
//		ClickXpathScelecto(XpathCarencia.replace("@CARENCIA", Utils.getValorFormulario("Carencia", formulario)));
		ClickAngularCssSelector(PrestamistaPPINao);
		ScreenshotBmb();
		ClickAngularScelectoXpath(XpathBtGeraSimulacao);
	}
	
	public void ContinuaSimulacao() throws Throwable {
		SleepPage(1000);
		String message = driver.findElement(By.cssSelector("span.disclaimer")).getText();
		assertTrue("Texto não encontrado!!", message.contains("IMPORTANTE: As parcelas contemplam Financiamento, Seguro Prestamista e Seguro Garantia"));
		ClickAngularCssSelector(BtFluxoFinanceiro);
		ScreenshotBmb();
		ClickAngularScelectoXpath(XpathBtContinuaSimulacao);
	}
	
	public void Seguros() throws Throwable {
		ClickAngularCssSelector(SeguroDoVeiculoNao);
		ClickAngularScelectoXpath(XpathBtContinuaSeguroDoVeiculo);
		ClickAngularCssSelector(BtTermosCondicoes);
		SleepPage(11000);
		ClickAngularScelectoXpath(XpathBtPropostaCredito);
		SleepPage(11000);
		String message = driver.findElement(By.cssSelector("#swal2-content")).getText();
		assertTrue("Texto não encontrado!!", message.contains("enviada com sucesso!"));
		ScreenshotBmb();
		ClickAngularScelectoXpath(XpathBtOkSeguros);
	}
		
	public void uploadDoc1() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc01)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("01_COMPROVANTE_DE_RENDIMENTOS_DO_PROPONENTE: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc01, "src\\test\\resources\\docsUpload\\01_COMPROVANTE_DE_RENDIMENTOS_DO_PROPONENTE.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("01_COMPROVANTE_DE_RENDIMENTOS_DO_PROPONENTE com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("01_COMPROVANTE_DE_RENDIMENTOS_DO_PROPONENTE com Upload: "+TextStatusDoc1);
		default:
			System.out.print("01_COMPROVANTE_DE_RENDIMENTOS_DO_PROPONENTE: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc2() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc02)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("02_COMPROVANTE_DE_RENDIMENTOS_DOS_AVALISTAS: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc02, "src\\test\\resources\\docsUpload\\02_COMPROVANTE_DE_RENDIMENTOS_DOS_AVALISTAS.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("02_COMPROVANTE_DE_RENDIMENTOS_DOS_AVALISTAS com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("02_COMPROVANTE_DE_RENDIMENTOS_DOS_AVALISTAS com Upload: "+TextStatusDoc1);
		default:
			System.out.print("02_COMPROVANTE_DE_RENDIMENTOS_DOS_AVALISTAS: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc3() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc03)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("03_COMPROVANTE_DE_ENDERECO_DO_PROPONENTE_AO_CREDITO: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc03, "src\\test\\resources\\docsUpload\\03_COMPROVANTE_DE_ENDERECO_DO_PROPONENTE_AO_CREDITO.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("03_COMPROVANTE_DE_ENDERECO_DO_PROPONENTE_AO_CREDITO com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("03_COMPROVANTE_DE_ENDERECO_DO_PROPONENTE_AO_CREDITO com Upload: "+TextStatusDoc1);
		default:
			System.out.print("03_COMPROVANTE_DE_ENDERECO_DO_PROPONENTE_AO_CREDITO: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc4() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc04)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("04_COMPROVANTE_DE_ENDERECO_DOS_AVALISTAS: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc04, "src\\test\\resources\\docsUpload\\04_COMPROVANTE_DE_ENDERECO_DOS_AVALISTAS.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("04_COMPROVANTE_DE_ENDERECO_DOS_AVALISTAS com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("04_COMPROVANTE_DE_ENDERECO_DOS_AVALISTAS com Upload: "+TextStatusDoc1);
		default:
			System.out.print("04_COMPROVANTE_DE_ENDERECO_DOS_AVALISTAS: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc5() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc05)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("05_CPF_RG_ou_CNH_DO_PROPONENTE_AO_CREDITO: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc05, "src\\test\\resources\\docsUpload\\05_CPF_RG_ou_CNH_DO_PROPONENTE_AO_CREDITO.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("05_CPF_RG_ou_CNH_DO_PROPONENTE_AO_CREDITO com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("05_CPF_RG_ou_CNH_DO_PROPONENTE_AO_CREDITO com Upload: "+TextStatusDoc1);
		default:
			System.out.print("05_CPF_RG_ou_CNH_DO_PROPONENTE_AO_CREDITO: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc6() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc06)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("06_CPF_DOS_AVALISTAS: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc06, "src\\test\\resources\\docsUpload\\06_CPF_DOS_AVALISTAS.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("06_CPF_DOS_AVALISTAS com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("06_CPF_DOS_AVALISTAS com Upload: "+TextStatusDoc1);
		default:
			System.out.print("06_CPF_DOS_AVALISTAS: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void uploadDoc7() throws Throwable {
		SleepPage(500);
		String TextStatusDoc1 = driver.findElement(By.cssSelector(StatusDoc07)).getText();
		switch (TextStatusDoc1) {
		case "Aguardando Upload":
			System.out.print("07_RG_DOS_AVALISTAS: "+TextStatusDoc1);
//			ScreenshotBmb();
			uploadArquivoCssSelector(BtDoc07, "src\\test\\resources\\docsUpload\\07_RG_DOS_AVALISTAS.pdf");
			String AlertMessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("Texto não encontrado!!", AlertMessage.contains("Documento enviado com sucesso."));
			ClickAngularScelectoXpath(XpathClienteCriadoOk);
			break;
		case "Upload Realizado":
			System.out.print("07_RG_DOS_AVALISTAS com: "+TextStatusDoc1);
		case "Arquivos Aceitos":
			System.out.print("07_RG_DOS_AVALISTAS com Upload: "+TextStatusDoc1);
		default:
			System.out.print("07_RG_DOS_AVALISTAS: "+TextStatusDoc1);
		}
//		ScreenshotBmb();
	}
	
	public void fichaCadastral() throws Throwable {
		String proposta = GetTextCssScelector(NumeroProposta);
//		String proposta = "SPM032636";
		PropostasContratosPage();
		System.out.print("Codigo da proposta: " + proposta);
		ClickXpathScelecto(PropostaHeader.replace("@PROPOSTA", proposta));
		String message = driver.findElement(By.cssSelector("div.cards>div:nth-child(1) span.status-card")).getText();
//		assertTrue("Texto não encontrado!!", message.contains("IMPORTANTE: As parcelas contemplam Financiamento, Seguro Prestamista e Seguro Garantia"));
		switch (message) {
		case "Pendente":
			ClickAngularScelectoXpath(BtFichaCadastral);
			ClickAngularScelectoXpath(XpathBtSexoFixaCad);
			ClickAngularCssSelector(BtEscolaridadeFixaCad);
			ClickAngularScelectoXpath(XpathBtEscolaridadeFixaCad);
			ClickAngularCssSelector(BtEscolaridadeNivelFixaCad);
			ClickAngularCssSelector(SelectBtEscolaridadeNivelFixaCad);
			ClickAngularCssSelector(SelectBtNaturalPaisNivelFixaCad);
			ClickAngularScelectoXpath(XpathBtNaturalPaisNivelFixaCad);
			ClickAngularCssSelector(SelectBtNaturalEstadoNivelFixaCad);
			ClickAngularScelectoXpath(XpathBtNaturalEstadoNivelFixaCad);
			ClickAngularCssSelector(SelectBtNaturalCidadeNivelFixaCad);
			ClickAngularScelectoXpath(XpathBtNaturalCidadeNivelFixaCad);
			SendTextCssScelector(SelectBtNomeMaeFixaCad, "Mãe Bot Testes");
			ClickAngularCssSelector(SelectBtDocumentoFixaCad);
			ClickAngularScelectoXpath(XpathBtDocumentoFixaCad);
			SendTextCssScelector(SelectBtNumeroDocumentoFixaCad, "118713103");
			SendTextCssScelector(SelectBtDataExpedicaoFixaCad, "06051992");
			ClickAngularCssSelector(SelectBtUFFixaCad);
			ClickAngularScelectoXpath(XpathSelectBtUFFixaCad);
			SendTextCssScelector(XpathSelectBtOrgaoEmissorFixaCad, "SSP");
			ClickAngularScelectoXpath(XpathSelectBtConcluirFixaCad);
			String reesmessage = driver.findElement(By.cssSelector("#swal2-content")).getText();
			assertTrue("FICHA CADASTRAL NÃO ESTÁ COMPLETA!!!", reesmessage.contains("Cliente atualizado"));
			ClickAngularScelectoXpath(XpathBtOkSeguros);
			break;
		case "Aguardando":
			System.out.print("Status Ficha Cadastral: " + message);
			throw new PendingException();
		case "Completo":
			System.out.print("Status Ficha Cadastral: " + message);
		default:
			System.out.println(message);
		}
		ReloadPage();
		String messageN = driver.findElement(By.cssSelector("div.cards>div:nth-child(1) span.status-card")).getText();
		assertTrue("FICHA CADASTRAL NÃO ESTÁ COMPLETA!!!", messageN.contains("Completo"));
		ScreenshotBmb();
			
	}
	
	public void uploadDocumentos() throws Throwable {
		String proposta = GetTextCssScelector(NumeroProposta);
//		String proposta = "SPM032601";
		PropostasContratosPage();
		ClickXpathScelecto(PropostaHeader.replace("@PROPOSTA", proposta));
		String message = driver.findElement(By.cssSelector("div.cards>div:nth-child(2) span.status-card")).getText();
//		assertTrue("Texto não encontrado!!", message.contains("IMPORTANTE: As parcelas contemplam Financiamento, Seguro Prestamista e Seguro Garantia"));
		switch (message) {
		case "Pendente":
			ClickAngularScelectoXpath(BtEnviaDocs);
			ScreenshotBmb();
			uploadDoc1();
			uploadDoc2();
			uploadDoc3();
			uploadDoc4();
			uploadDoc5();
			uploadDoc6();
			uploadDoc7();
			ScreenshotBmb();
			ClickAngularCssSelector(CloseCheckListDoc);
		case "Aguardando":
			System.out.print("Status Ficha Cadastral: " + message);
			throw new PendingException();
		case "Completo":
			System.out.print("Status Ficha Cadastral: " + message);
		default:
			System.out.println(message);
		}
		ReloadPage();
		ScreenshotBmb();
		System.out.print("Codigo da proposta: " + proposta);
		SqlConnect(proposta);
		ReloadPage();
//		Implementar essa parte apenas quando descobrir como essa parte será implementado via API banco ou alguma coisa
//		String messageN = driver.findElement(By.cssSelector("div.cards>div:nth-child(2) span.status-card")).getText();
//		assertTrue("CHECKLIST DE DOCUMENTOS NÃO ESTÁ COMPLETA!!!", messageN.contains("Pendente"));
//		ScreenshotBmb();
	}
	
	public void gerarContrato() throws Throwable {
		String proposta = GetTextCssScelector(NumeroProposta);
//		String proposta = "SPM032601";
		PropostasContratosPage();
		System.out.print("Codigo da proposta: " + proposta);
		ClickXpathScelecto(PropostaHeader.replace("@PROPOSTA", proposta));
		String message = driver.findElement(By.cssSelector("div.cards>div:nth-child(3) span.status-card")).getText();
//		assertTrue("Texto não encontrado!!", message.contains("IMPORTANTE: As parcelas contemplam Financiamento, Seguro Prestamista e Seguro Garantia"));
		
		switch (message) {
		case "Pendente":
			ScreenshotBmb();
			ClickAngularScelectoXpath(XpathBtVerifContrato);
			ClickAngularScelectoXpath(XpathBtConfCondicoes);
			ClickAngularCssSelector(InformacaoContrato);
			ClickAngularCssSelector(BtContratoEstado);
			ClickXpathScelecto(XpathSelectContratoEstado.replace("@ESTADO", "PA"));
			ClickAngularCssSelector(BtContratoCidade);
			ClickXpathScelecto(XpathSelectContratoCidade.replace("@CIDADE", "MARABA"));
			ClickXpathScelecto(XpathFormaDePagamento.replace("@FORMAPAGAMENTO", "Boleto físico"));
			ClickAngularCssSelector(BtSegurado);
			ClickXpathScelecto(XpathBtSegurado.replace("@SEGURADORA", "BRADESCO VIDA E PREVIDÊNCIA S/A"));
			ClickAngularScelectoXpath(XpathBtIdentificar);
			SendTextCssScelector(InputIdentificarEmissor, "mer");
			ClickAngularScelectoXpath(XpathBtBuscarEmissor);
			ClickAngularScelectoXpath(XpathBtSelecionaEmissor);
			ClickAngularScelectoXpath(XpathBtConfirmarContratacao);
			ClickAngularScelectoXpath(XpathBtContinuarContratacao);
		case "Aguardando":
			System.out.print("Status Ficha Cadastral: " + message);
			throw new PendingException();
		case "Completo":
			System.out.print("Status Ficha Cadastral: " + message);
		default:
			System.out.println(message);
		}
		
		ScreenshotBmb();
		String messageN = driver.findElement(By.cssSelector("div.cards>div:nth-child(3) span.status-card")).getText();
		assertTrue("GERAR CONTRATO NÃO ESTÁ COMPLETA!!!", messageN.contains("Completo"));
		
	}
	
}
