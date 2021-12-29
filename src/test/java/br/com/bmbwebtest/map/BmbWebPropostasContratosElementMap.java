package br.com.bmbwebtest.map;

import br.com.bmbwebtest.utils.PageObjectUtils;

public class BmbWebPropostasContratosElementMap extends PageObjectUtils {
	
	protected String BtHoverPropostasContratos = "aside.row>div>div:nth-child(2)>div:nth-child(2)>a>img";
	protected String BtPropostasContratos = "aside.row>div>div:nth-child(2)>div:nth-child(2)>a>popover-container";
	protected String XpathBtNovaFicha = "//button[contains(.,'Nova ficha')]";
	protected String XpathInputCpfCnpj = "//input[contains(@formcontrolname,'cpfCnpj')]";
	protected String XpathbtSelecionar = "//button[contains(.,'SELECIONAR')]";
	//Identificação do cliente
	protected String XpathNome = "//input[contains(@id,'name')]";
	protected String XpathDataDeNascimento = "//input[contains(@id,'birthDate')]";
	protected String Email = "#bmb-page-body>app-pf>form>div:nth-child(1)>div.row>div:nth-child(4)>app-control-email>app-control-field>div.customer-alert-icon-container>input";
	protected String Celular = "form>.pf-container:nth-child(1) input[formcontrolname='celPhone']";
	protected String btEstadoCivil = "form>div:nth-child(1)>div.row>div.col-6.ng-untouched.ng-pristine.ng-valid>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons";
	protected String XpathbtEstadoCivil = "//a//span[contains(.,'@ESTADOCIVIL')]";
	protected String NomeConjuge = "#bmb-page-body>app-pf>form>div:nth-child(1)>div.row>div.col-8.d-none.d-block>div>div>input";
	protected String CpfConjuge = "#bmb-page-body>app-pf>form>div:nth-child(1)>div.row>div.col-4.d-none.d-block>app-control-field>input";
	protected String NascimentoConjuge = "input#spouseBirthDate";
	protected String btRegimeDeCasamento = "#bmb-page-body>app-pf>form>div:nth-child(1)>div.row>div:nth-child(7)>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathbtRegimeDeCasamento = "//a//span[contains(.,'@REGIMECASAMENTO')]";
	
	//Endereço
	protected String Cep = "form>div.pf-container:nth-child(3) input[formcontrolname='zipCode']";
	protected String Numero = "form>div.pf-container:nth-child(3) input[formcontrolname='addressNumber']";
	protected String TipoDeResidencia = "#bmb-page-body>app-pf>form>div:nth-child(3)>div>div:nth-child(10)>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtAlugada = "//span[contains(.,'Alugada')]";
	//Dados profissionais
	protected String NaturezaDaOcupacao = "#bmb-page-body>app-pf>form>div:nth-child(7)>div>div:nth-child(2)>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathOcupacao = "//span[contains(.,'Empregado no Setor Privado')]";
	protected String AtividadePrincipal = "#bmb-page-body>app-pf>form>div:nth-child(7)>div>div.col-6.form-group-bmb.d-none.d-block>input";
	protected String DataDeAdmissão = "input#admissionDate";
	protected String SalarioRendaMensal = "input#salary";
	//Avalista
	protected String NaoAvalista = "//input[contains(@id,'name')]";
	//Declaração de exposição política
	protected String AtuaCargoPublicoNao = "#bmb-page-body>app-pf>form>div:nth-child(13)>div>div:nth-child(2)>label:nth-child(3)>span.checkmark";
	protected String ParenteCargoPublicoNão = "#bmb-page-body>app-pf>form>div:nth-child(13)>div>div:nth-child(4)>label:nth-child(3)>span.checkmark";
	//Finalidade do financiamento
	protected String selectUsoParticular = "#bmb-page-body>app-pf>form>div:nth-child(15)>div>div.col-10>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String UsoParticular = "#bmb-page-body>app-pf>form>div:nth-child(15)>div>div.col-10>ngx-select>div>ul>li:nth-child(3)>a>span";
	//SALVAR CLIENTE
	protected String XpathBtSalvaCliente = "//button[contains(.,'SALVAR CLIENTE')]";
	protected String XpathClienteCriadoOk = "//button[contains(.,'OK')]";
	
	
	//Veículo //Simulação
	protected String AnoDeFabricacao = "#manufactureYear>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathAnoDeFabricacao = "//span[contains(.,'@ANOFABRICACAO')]";
	protected String TipoDeVeiculo = "#vehicleType>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathTipoDeVeiculo = "//span[contains(.,'@TIPODEVEICULO')]";
	protected String EstadoDoVeiculoNovo = "#condition>app-control-field>label:nth-child(2)>input";
	protected String ModeloDeVeiculo = "#vehicle>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathModeloDeVeiculo = "//span[contains(.,'@MODELODEVEICULO')]";
	//Financiamento //Simulação
	protected String Produto = "#product>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathProduto = "//span[contains(.,'@PRODUTO')]";
	protected String Campanha = "#bmb-page-body>app-financial-simulator>div>form>div:nth-child(3)>div>div.col-12.col-lg-8.ng-untouched.ng-pristine.ng-invalid>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathCampanha = "//span[contains(.,'@CAMPANHA')]";
	protected String Prazo = "#bmb-page-body>app-financial-simulator>div>form>div:nth-child(3)>div>div.col-12.col-lg-2.ng-untouched.ng-pristine.ng-valid>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathPrazo = "//span[contains(.,'@PRAZO')]";
	protected String Carencia = "#bmb-page-body>app-financial-simulator>div>form>div:nth-child(3)>div>div:nth-child(5)>app-control-field>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String SelectorCarencia = "#bmb-page-body>app-financial-simulator>div>form>div:nth-child(3)>div>div:nth-child(5)>app-control-field>ngx-select>div>ul>li>a>span";
//	protected String XpathCarencia = "//span[contains(.,'@CARENCIA')]";
	protected String PrestamistaPPINao = "#bmb-page-body>app-financial-simulator>div>form>div:nth-child(3)>div>div:nth-child(8)>div>div.col-12.col-lg-4>app-control-field>label:nth-child(3)>input";
	protected String XpathBtGeraSimulacao = "//button[contains(.,'GERAR SIMULAÇÃO')]";
	//Continua Simulação
	protected String BtFluxoFinanceiro = "img.arrow-icon";
	protected String XpathBtContinuaSimulacao = "//button[contains(.,'CONTINUAR')]";
	//Seguro //Seguro do Veículo
	protected String SeguroDoVeiculoNao = "#bmb-page-body>app-insurances>form>div:nth-child(1)>div:nth-child(2)>div>label:nth-child(3)>input[type=radio]";
	protected String XpathBtContinuaSeguroDoVeiculo = "//button[contains(.,'CONTINUAR')]";
	protected String BtTermosCondicoes = "#defaultCheck1";
	protected String XpathBtPropostaCredito = "//button[contains(.,'ENVIAR PROPOSTA DE CRÉDITO')]";
	protected String XpathBtOkSeguros = "//button[contains(.,'OK')]";
	
	//Proposta
	protected String NumeroProposta = "#bmb-content-child>div.flex-scroll-container>div>app-detail>div>div.row.m-0.header>div.col-6.proposal>div>div>span>span";
	
	protected String PropostaHeader = "//div[contains(text(),'@PROPOSTA')]";
	
	protected String BtEnviaDocs = "//button[contains(.,'Enviar Documentos')]";
	
	protected String BtDoc01 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(2) button";
	protected String StatusDoc01 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(2)>div>div:nth-child(3)";
	protected String BtDoc02 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(3) button";
	protected String StatusDoc02 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(3)>div>div:nth-child(3)";
	protected String BtDoc03 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(4) button";
	protected String StatusDoc03 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(4)>div>div:nth-child(3)";
	protected String BtDoc04 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(5) button";
	protected String StatusDoc04 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(5)>div>div:nth-child(3)";
	protected String BtDoc05 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(6) button";
	protected String StatusDoc05 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(6)>div>div:nth-child(3)";
	protected String BtDoc06 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(7) button";
	protected String StatusDoc06 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(7)>div>div:nth-child(3)";
	protected String BtDoc07 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(8) button";
	protected String StatusDoc07 = "app-checklist-documents div.checklist-card div.card>app-checklist-table-tr:nth-child(8)>div>div:nth-child(3)";
	
	protected String CloseCheckListDoc = "div.row.m-0.h-100.justify-content-center.align-items-center>div>div>div>div.close-modal>img";
	
	protected String XpathBtVerifContrato = "//button[contains(.,'Verificar Contratação')]";
	protected String XpathBtConfCondicoes = "//button[contains(.,'CONFIRMAR CONDIÇÕES')]";
	protected String InformacaoContrato = "div.tab-container>div:nth-child(2).tab";
	protected String BtContratoEstado = "div.contract-container>form>div>div:nth-child(1)>div:nth-child(2)>ngx-select i.dropdown-toggle";
	protected String XpathSelectContratoEstado = "//a//span[contains(.,'@ESTADO')]";
	protected String BtContratoCidade = "div.contract-container>form>div>div:nth-child(1)>div:nth-child(3)>ngx-select i.dropdown-toggle";
	protected String XpathSelectContratoCidade = "//a//span[contains(.,'@CIDADE')]";
	protected String XpathFormaDePagamento = "//span[contains(.,'@FORMAPAGAMENTO')]";
	protected String BtSegurado = "div.contract-container>form>div>div:nth-child(5)>div:nth-child(3)>ngx-select i.dropdown-toggle";
	protected String XpathBtSegurado = "//span[contains(.,'@SEGURADORA')]";
	protected String XpathBtIdentificar = "//button[contains(.,'IDENTIFICAR')]";
	protected String InputIdentificarEmissor = "input#filter";
	protected String XpathBtBuscarEmissor = "//button[contains(.,'BUSCAR')]";
	protected String XpathBtSelecionaEmissor = "//div[@class='content-data']//div[@class='data-content row'][1]//div[4]//button";
	protected String XpathBtConfirmarContratacao = "//*[@id='bmb-content-child']/div[2]/div/app-detail/app-contract/div/div[2]/div/div[2]/div/div[3]/button";
	protected String XpathBtContinuarContratacao = "//*[@id='bmb-content-child']/div[2]/div/app-detail/app-contract/app-confirm/div/div[2]/div/div[3]/button";
	
	protected String BtFichaCadastral = "//button[contains(.,'ACESSAR FICHA CADASTRAL')]";
	protected String XpathBtSexoFixaCad = "//span[contains(.,'Feminino')]";
	protected String BtEscolaridadeFixaCad = "#scholarity>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtEscolaridadeFixaCad = "//span[contains(.,'SUPERIOR')]";
	protected String BtEscolaridadeNivelFixaCad = "#scholarityLevel>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String SelectBtEscolaridadeNivelFixaCad = "#scholarityLevel>div>ul>li:nth-child(2)>a>span";
	protected String SelectBtNaturalPaisNivelFixaCad = "#bmb-content-child>div.flex-scroll-container>div>app-detail>app-registration-form>div>div.dialog.show>div>div.registration-form-container.collapse.d-inline-block>app-registration-tab>div>form>div:nth-child(6)>div:nth-child(1)>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtNaturalPaisNivelFixaCad = "//span[contains(.,'BRASILEIRA')]";
	protected String SelectBtNaturalEstadoNivelFixaCad = "#bmb-content-child>div.flex-scroll-container>div>app-detail>app-registration-form>div>div.dialog.show>div>div.registration-form-container.collapse.d-inline-block>app-registration-tab>div>form>div:nth-child(6)>div:nth-child(2)>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtNaturalEstadoNivelFixaCad = "//span[contains(.,'São Paulo')]";
	protected String SelectBtNaturalCidadeNivelFixaCad = "#bmb-content-child>div.flex-scroll-container>div>app-detail>app-registration-form>div>div.dialog.show>div>div.registration-form-container.collapse.d-inline-block>app-registration-tab>div>form>div:nth-child(6)>div:nth-child(3)>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtNaturalCidadeNivelFixaCad = "//ngx-select//div//ul//li[814]//a//span[contains(.,'SAO PAULO')]";
	protected String SelectBtNomeMaeFixaCad = "input[formcontrolname='motherName']";
	protected String SelectBtDocumentoFixaCad = "#bmb-content-child>div.flex-scroll-container>div>app-detail>app-registration-form>div>div.dialog.show>div>div.registration-form-container.collapse.d-inline-block>app-registration-tab>div>form>div:nth-child(8)>div>ngx-select>div>div.ngx-select__selected>div>span.ngx-select__toggle-buttons>i.dropdown-toggle";
	protected String XpathBtDocumentoFixaCad = "//span[contains(.,'RG')]";
	protected String SelectBtNumeroDocumentoFixaCad = "input[formcontrolname='documentNumber']";
	protected String SelectBtDataExpedicaoFixaCad = "input[formcontrolname='documentExpeditionDate']";
	protected String SelectBtUFFixaCad = "#bmb-content-child > div.flex-scroll-container > div > app-detail > app-registration-form > div > div.dialog.show > div > div.registration-form-container.collapse.d-inline-block > app-registration-tab > div > form > div:nth-child(9) > div.col-2.form-group > ngx-select > div > div.ngx-select__selected > div > span.ngx-select__toggle-buttons > i.dropdown-toggle";
	protected String XpathSelectBtUFFixaCad = "//li[25]//a//span[contains(.,'SP')]";
	protected String XpathSelectBtOrgaoEmissorFixaCad = "input[formcontrolname='documentIssuerDescription']";
	protected String XpathSelectBtConcluirFixaCad = "//button[contains(.,'CONCLUIR DEPOIS')]";
	
	
}
