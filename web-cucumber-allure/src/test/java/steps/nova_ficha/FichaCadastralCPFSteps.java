package steps.nova_ficha;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.Assert;
import page.nova_ficha.FichaCadastralCPFPage;

public class FichaCadastralCPFSteps {

    FichaCadastralCPFPage fichaCadastralCPFPage;

    public FichaCadastralCPFSteps(FichaCadastralCPFPage fichaCadastralCPFPage) {
        this.fichaCadastralCPFPage = fichaCadastralCPFPage;
    }


    @Dado("que preencho o campo CPF com valor valido")
    public void que_preencho_o_campo_CPF_com_valor_valido() {
        fichaCadastralCPFPage.que_preencho_o_campo_CPF_com_valor_valido();
    }


    @Dado("preencho o campo nome {string}")
    public void preencho_o_campo_nome(String nome) {
        fichaCadastralCPFPage.preencho_o_campo_nome(nome);
    }


    @Dado("preencho a data de nascimento {string}")
    public void preencho_a_data_de_nascimento(String dataNascimento) {
        fichaCadastralCPFPage.preencho_a_data_de_nascimento(dataNascimento);
    }


    @Dado("preencho o campo email {string}")
    public void preencho_o_campo_email(String email) {
        fichaCadastralCPFPage.preencho_o_campo_email(email);
    }

    @E("preencho o campo celular {string}")
    public void preenchoOCampoCelular(String celular) {
        fichaCadastralCPFPage.preenchoOCampoCelular(celular);
    }


    @Dado("escolho o estado civil {string}")
    public void escolho_o_estado_civil(String estadoCivil) {
        fichaCadastralCPFPage.escolho_o_estado_civil(estadoCivil);
    }


    @E("no combo regime de casamento escolho {string}")
    public void noComboRegumeDeCasamentoEscolho(String regimeCasamento) {
        fichaCadastralCPFPage.noComboRegumeDeCasamentoEscolho(regimeCasamento);
    }

    @E("informo o nome do conjugue {string}")
    public void informoONomeDoConjugue(String nomeConjugue) {
        fichaCadastralCPFPage.informoONomeDoConjugue(nomeConjugue);
    }

    @E("informo o CPF do conjugue")
    public void informoCpfDoConjugue() {
        fichaCadastralCPFPage.informoCpfDoConjugue();
    }

    @E("informo a data de nascimento do conjugue {string}")
    public void informoDataNascimentoConjugue(String dataNascimentoConjugue) {
        fichaCadastralCPFPage.informoDataNascimentoConjugue(dataNascimentoConjugue);
    }

    @Dado("clico em dados adicionais")
    public void clico_em_dados_adicionais() {
        fichaCadastralCPFPage.clico_em_dados_adicionais();
    }

    @Dado("nas opcoes sexo escolho {string}")
    public void nas_opcoes_sexo_escolho(String sexo) {
        fichaCadastralCPFPage.selecionarSexo(sexo);
    }

    @Dado("no combo escolaridade escolho {string} e informo o estatus do mesmo {string}")
    public void no_combo_escolaridade_escolho_e_informo_o_estatus_do_mesmo(String escolaridade, String statusEscolaridade) {
        fichaCadastralCPFPage.no_combo_escolaridade_escolho_e_informo_o_estatus_do_mesmo(escolaridade, statusEscolaridade);
    }

    @Dado("no combo naturalidade pais escolho {string}")
    public void no_combo_naturalidade_pais_escolho(String naturalidade) {
        fichaCadastralCPFPage.no_combo_naturalidade_pais_escolho(naturalidade);
    }


    @Dado("no combo naturalidade estado escolho {string}")
    public void no_combo_naturalidade_estado_escolho(String estadoNaturalidade) {
        fichaCadastralCPFPage.no_combo_naturalidade_estado_escolho(estadoNaturalidade);
    }


    @Dado("no combo naturalidade cidade escolho {string}")
    public void no_combo_naturalidade_cidade_escolho(String cidadeNaturalidade) {
        fichaCadastralCPFPage.no_combo_naturalidade_cidade_escolho(cidadeNaturalidade);
    }


    @Dado("informo o nome da mae {string}")
    public void informo_o_nome_da_mae(String nomeMae) {
        fichaCadastralCPFPage.informo_o_nome_da_mae(nomeMae);
    }


    @Dado("no combo documento do proponente escolho {string}")
    public void no_combo_documento_do_proponente_escolho(String documento) {
        fichaCadastralCPFPage.no_combo_documento_do_proponente_escolho(documento);
    }


    @Dado("informo o numero do documento {string}")
    public void informo_o_numero_do_documento(String numeroDocumento) {
        fichaCadastralCPFPage.informo_o_numero_do_documento(numeroDocumento);
    }


    @Dado("informo a data de expedicao do documento {string}")
    public void informo_a_data_de_expedicao_do_documento(String dataExpedicao) {
        fichaCadastralCPFPage.informo_a_data_de_expedicao_do_documento(dataExpedicao);
    }

    @E("no combo UF cidades escolho {string}")
    public void noComboUfCidadesEscolho(String ufCidades) {
        fichaCadastralCPFPage.noComboUfCidadesEscolho(ufCidades);
    }

    @Dado("no combo UF escolho {string}")
    public void no_combo_UF_escolho(String uf) {
        fichaCadastralCPFPage.no_combo_UF_escolho(uf);
    }


    @Dado("informo o orgao emissor {string}")
    public void informo_o_orgao_emissor(String orgaoEmissor) {
        fichaCadastralCPFPage.informo_o_orgao_emissor(orgaoEmissor);
    }


    @Dado("informo a validade do documento {string}")
    public void informo_a_validade_do_documento(String validade) {
        fichaCadastralCPFPage.informo_a_validade_do_documento(validade);
    }


    @Dado("no combo patrimonio escolho {string}")
    public void no_combo_patrimonio_escolho(String patrimonio) {
        fichaCadastralCPFPage.no_combo_patrimonio_escolho(patrimonio);
    }


    @Dado("no campo endereco informo o cep {string}")
    public void no_campo_endereco_informo_o_cep(String cep) {
        fichaCadastralCPFPage.no_campo_endereco_informo_o_cep(cep);
    }


    @Dado("informo o numero da rua {string}")
    public void informo_o_numero_da_rua(String numero) {
        fichaCadastralCPFPage.informo_o_numero_da_rua(numero);
    }


    @Dado("no combo tipo de residencia escolho {string}")
    public void no_combo_tipo_de_residencia_escolho(String tipoResidencia) {
        fichaCadastralCPFPage.no_combo_tipo_de_residencia_escolho(tipoResidencia);
    }


    @Dado("informo o tempo de residencia {string}")
    public void informo_o_tempo_de_residencia(String tempoResidencia) {
        fichaCadastralCPFPage.informo_o_tempo_de_residencia(tempoResidencia);
    }

    @Dado("no combo natureza da ocupacao escolho {string}")
    public void no_combo_natureza_da_ocupacao_escolho(String ocupacao) {
        fichaCadastralCPFPage.no_combo_natureza_da_ocupacao_escolho(ocupacao);
    }

    @E("clico no botao novo endereco de correspondencia")
    public void clicoNoBotaoNovoEnderecoDeCorrespondencia() {
fichaCadastralCPFPage.clicoNoBotaoNovoEnderecoDeCorrespondencia();
    }

    @E("informo o novo cep {string}")
    public void informoNovoCep(String novoCep) {
fichaCadastralCPFPage.informoNovoCep(novoCep);
    }

    @E("informo o novo numero da rua {string}")
    public void informoNovoNumeroDaRua(String novoNumeroRua) {
fichaCadastralCPFPage.informoNovoNumeroDaRua(novoNumeroRua);
    }

    @Dado("no combo natureza da ocupacao do avalista escolho {string}")
    public void no_combo_natureza_da_ocupacao_do_avalista_escolho(String ocupacao) {
        fichaCadastralCPFPage.no_combo_natureza_da_ocupacao_do_avalista_escolho(ocupacao);
    }

    @E("informo data de admissao do avalista {string}")
    public void informoDataDeAdmissaoDoAvalista(String dataAdmissaoAvalista) {
        fichaCadastralCPFPage.informoDataDeAdmissaoDoAvalista(dataAdmissaoAvalista);
    }

    @E("informo receitas mensais do avalista {string}")
    public void informoReceitasMensaisDoAvalista(String receitasAvalista) {
        fichaCadastralCPFPage.informoReceitasMensaisDoAvalista(receitasAvalista);
    }

    @E("informo o tipo de transporte do avalista {string}")
    public void informoOTipoDeTransporteDoAvalista(String tipoTransporteAvalista) {
        fichaCadastralCPFPage.informoOTipoDeTransporteDoAvalista(tipoTransporteAvalista);
    }

    @E("no campo salario e renda do avalista mensal informo {string}")
    public void noCampoSalarioeRendaDoAvalistaInformo(String rendaAvalista) {
        fichaCadastralCPFPage.noCampoSalarioeRendaDoAvalistaInformo(rendaAvalista);
    }

    @E("em relacao do veiculos e frota clico em adicionar novo")
    public void emRelacaoDoVeiculoEFrotaClicoEmAdicionar() {
        fichaCadastralCPFPage.emRelacaoDoVeiculoEFrotaClicoEmAdicionar();
    }

    @E("informo o modelo {string}")
    public void informoModelo(String modelo) {
        fichaCadastralCPFPage.informoModelo(modelo);
    }

    @E("informo o ano de fabricacao {string}")
    public void informoAnoFabricacao(String anoFabricacao) {
        fichaCadastralCPFPage.informoAnoFabricacao(anoFabricacao);
    }

    @E("na opcoes possui onus informo {string}")
    public void nasOpcoesPossuiOnusInformo(String simOrnao) {
        fichaCadastralCPFPage.nasOpcoesPossuiOnusInformo(simOrnao);
    }

    @E("escolho o estado civil do avalista {string}")
    public void escolhoEstadoCivilAvalista(String estadoCivilAvalista) {
        fichaCadastralCPFPage.escolhoEstadoCivilAvalista(estadoCivilAvalista);
    }

    @E("no combo regime de casamento escolho do avalista {string}")
    public void noComboRegimeCasamentoDoAvalista(String regimeCasamentoAvalista) {
        fichaCadastralCPFPage.noComboRegimeCasamentoDoAvalista(regimeCasamentoAvalista);
    }

    @E("informo o nome do conjugue do avalista {string}")
    public void informoNomeDoConjugueAvalista(String conjugueAvalista) {
        fichaCadastralCPFPage.informoNomeDoConjugueAvalista(conjugueAvalista);
    }

    @E("informo o CPF do conjugue do avalista")
    public void informoCpfDoConjugueAvalista() {
        fichaCadastralCPFPage.informoCpfDoConjugueAvalista();
    }

    @E("informo a data de nascimento do conjugue do avalista {string}")
    public void informoDataDeNascimentoConjugueAvalista(String dataNascimentoConjugueAvalista) {
        fichaCadastralCPFPage.informoDataDeNascimentoConjugueAvalista(dataNascimentoConjugueAvalista);
    }


    @E("informo a atividade principal {string}")
    public void informoAtividadePrincipal(String atividade) {
        fichaCadastralCPFPage.informoAtividadePrincipal(atividade);
    }

    @E("informo o nome da empresa {string}")
    public void informoNomeDaEmpresa(String nomeEmpresa) {
        fichaCadastralCPFPage.informoNomeDaEmpresa(nomeEmpresa);
    }

    @E("informo o CNPJ da empresa")
    public void informoCnpjEmpresa() {
        fichaCadastralCPFPage.informoCnpjEmpresa();
    }

    @E("informo a soma do faturamento do ultimos 12 meses {string}")
    public void informoSomaDoFaturamentoUltimos12Meses(String faturamento) {
        fichaCadastralCPFPage.informoSomaDoFaturamentoUltimos12Meses(faturamento);
    }

    @E("informo a porcentagem de participacao {string}")
    public void informoPorcentagemDeParticipacao(String participacao) {
        fichaCadastralCPFPage.informoPorcentagemDeParticipacao(participacao);
    }

    @E("informo a data de inicio de atividade {string}")
    public void informoDataInicioAtividade(String dataAtividade) {
        fichaCadastralCPFPage.informoDataInicioAtividade(dataAtividade);
    }

    @E("informo as receitas mensais {string}")
    public void informoAsReceitasMensais(String receitas) {
        fichaCadastralCPFPage.informoAsReceitasMensais(receitas);
    }

    @E("no combo tipo de transporte escolho {string}")
    public void noComboTipoDeTransporteEscolho(String tipoTransporte) {
        fichaCadastralCPFPage.noComboTipoDeTransporteEscolho(tipoTransporte);
    }

    @E("informo o numero da ANTT {string}")
    public void informoNumeroANTT(String antt) {
        fichaCadastralCPFPage.informoNumeroANTT(antt);
    }

    @E("nas opcoes cooperativa informo {string}")
    public void nasOpcoessCooperativaInfomro(String simOrnao) {
        fichaCadastralCPFPage.nasOpcoessCooperativaInfomro(simOrnao);
    }

    @E("informo a data de entrada {string}")
    public void informoDataDeEntrada(String dataEntrada) {
        fichaCadastralCPFPage.informoDataDeEntrada(dataEntrada);
    }


    @E("informo data de admissao {string}")
    public void informoDataDeAdmissao(String dataAdmissao) {
        fichaCadastralCPFPage.informoDataDeAdmissao(dataAdmissao);
    }

    @Dado("no campo salario e renda mensal informo {string}")
    public void no_campo_salario_e_renda_mensal_informo(String salario) {
        fichaCadastralCPFPage.no_campo_salario_e_renda_mensal_informo(salario);
    }


    @Dado("no campo avalista escolho {string}")
    public void no_campo_avalista_escolho(String avalista) {
        fichaCadastralCPFPage.no_campo_avalista_escolho(avalista);
    }

    @E("informo CPF do avalista")
    public void informoCpfDoAvalista() {
        fichaCadastralCPFPage.informoCpfDoAvalista();
    }

    @E("informo nome do avalista {string}")
    public void informoNomeDoAvalista(String nomeAvalista) {
        fichaCadastralCPFPage.informoNomeDoAvalista(nomeAvalista);
    }


    @Dado("nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho {string}")
    public void nas_opcoes_desempenhou_funcao_ou_cargo_publico_relevante_nos_ultimos_anos_escolho(String simOrnao) {
        fichaCadastralCPFPage.nas_opcoes_desempenhou_funcao_ou_cargo_publico_relevante_nos_ultimos_anos_escolho(simOrnao);
    }

    @E("escrevo a funcao politica {string}")
    public void escrevoFuncaoPolitica(String funcaoPolitica) {
        fichaCadastralCPFPage.escrevoFuncaoPolitica(funcaoPolitica);
    }


    @Dado("nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos {string}")
    public void nas_opcoes_possui_parentesco_com_pessoa_que_exerceu_funcao_ou_cargo_publico_relevante_nos_ultimos_anos(String simOrnao) {
        fichaCadastralCPFPage.nas_opcoes_possui_parentesco_com_pessoa_que_exerceu_funcao_ou_cargo_publico_relevante_nos_ultimos_anos(simOrnao);
    }

    @E("informo o grau de parentesco {string}")
    public void informoGrauParentesco(String grauParentesco) {
        fichaCadastralCPFPage.informoGrauParentesco(grauParentesco);
    }

    @Dado("no combo declaracao do proposito da aquisicao do bem financiamento escolho {string}")
    public void no_combo_declaracao_do_proposito_da_aquisicao_do_bem_financiamento_escolho(String opcao) {
        fichaCadastralCPFPage.no_combo_declaracao_do_proposito_da_aquisicao_do_bem_financiamento_escolho(opcao);
    }


    @Dado("clico no botao Salvar Cliente")
    public void clico_no_botao_Salvar_Cliente() {
        fichaCadastralCPFPage.clico_no_botao_Salvar_Cliente();
    }


    @Dado("no combo ano fabricacao do veiculo escolho {string}")
    public void no_combo_ano_fabricacao_do_veiculo_escolho(String anoFabricacao) {
        fichaCadastralCPFPage.no_combo_ano_fabricacao_do_veiculo_escolho(anoFabricacao);
    }


    @Dado("no combo tipo de veiculo escolho {string}")
    public void no_combo_tipo_de_veiculo_escolho(String tipoVeiculo) {
        fichaCadastralCPFPage.no_combo_tipo_de_veiculo_escolho(tipoVeiculo);
    }


    @Dado("escolho o estado do veiculo {string}")
    public void escolho_o_estado_do_veiculo(String estadoVeiculo) {
        fichaCadastralCPFPage.escolho_o_estado_do_veiculo(estadoVeiculo);
    }


    @Dado("no combo modelo do veiculo escolho {string}")
    public void no_combo_modelo_do_veiculo_escolho(String tipoVeiculo) {
        fichaCadastralCPFPage.no_combo_modelo_do_veiculo_escolho(tipoVeiculo);
    }

    @E("no combo utilizacao do veiculo escolho {string}")
    public void noComboUtilizacaoDoVeiculoescolho(String utilizacao) {
        fichaCadastralCPFPage.noComboUtilizacaoDoVeiculoescolho(utilizacao);
    }

    @E("no combo tipo de carga escolho {string}")
    public void noComboTipoDeCargaEscolho(String tipoCarga) {
        fichaCadastralCPFPage.noComboTipoDeCargaEscolho(tipoCarga);
    }


    @Dado("nas opcoes adicionar acessorio escolho {string}")
    public void nas_opcoes_adicionar_acessorio_escolho(String simOrnao) {
        fichaCadastralCPFPage.nas_opcoes_adicionar_acessorio_escolho(simOrnao);
    }

    @E("no combo acessorio escolho {string}")
    public void noComboAcessorioEscolho(String acessorio) {
        fichaCadastralCPFPage.noComboAcessorioEscolho(acessorio);
    }

    @E("informo o valor do acessorio {string}")
    public void informoOValorDoAcessorio(String valorAcessorio) {
        fichaCadastralCPFPage.informoOValorDoAcessorio(valorAcessorio);
    }

    @Dado("no combo produto escolho {string}")
    public void no_combo_produto_escolho(String produto) {
        fichaCadastralCPFPage.no_combo_produto_escolho(produto);
    }

    @Dado("no combo campanha escolho {string}")
    public void no_combo_campanha_escolho(String campanha) {
        fichaCadastralCPFPage.no_combo_campanha_escolho(campanha);
    }

    @Dado("no combo prazo escolho {string} e carencia {string}")
    public void no_combo_prazo_escolho_e_carencia(String prazo, String carencia) {
        fichaCadastralCPFPage.no_combo_prazo_escolho_e_carencia(prazo, carencia);
    }

    @E("nas opcoes tipo pessoa escolho {string}")
    public void nasOpcoesTipoPessoaEscolho(String tipoPessoa) {
        fichaCadastralCPFPage.nasOpcoesTipoPessoaEscolho(tipoPessoa);
    }

    @Dado("informo o valor de entrada {string}")
    public void informo_o_valor_de_entrada(String valorEntrada) {
        fichaCadastralCPFPage.informo_o_valor_de_entrada(valorEntrada);
    }


    @Dado("na opcao prestamista escolho {string}")
    public void na_opcao_prestamista_escolho(String simOrnao) {
        fichaCadastralCPFPage.na_opcao_prestamista_escolho(simOrnao);
    }

    @E("nas opcoes simular seguro do veiculo escolho {string}")
    public void nasOpcoesSimularSeguroDoVeiculoEscolho(String simOrnao) {
        fichaCadastralCPFPage.nasOpcoesSimularSeguroDoVeiculoEscolho(simOrnao);
    }

    @E("informo o valor aproximado do seguro {string}")
    public void informoOValorAproximadoDoSeguro(String valorSeguro) {
        fichaCadastralCPFPage.informoOValorAproximadoDoSeguro(valorSeguro);
    }

    @Dado("clico em gerar simulacao")
    public void clico_em_gerar_simulacao() {
        fichaCadastralCPFPage.clico_em_gerar_simulacao();
    }


    @E("clico na aba operações")
    public void clicoNaAbaOperacoes() {
        fichaCadastralCPFPage.clicoNaAbaOperacoes();
    }

    @E("valido que data da simulação é a data atual")
    public void validoQueDataSimulacaoEDataAutal() {
        Assert.assertEquals(fichaCadastralCPFPage.dataAtual(), fichaCadastralCPFPage.validoQueDataSimulacaoEDataAutal());
    }

    @E("valido que o produto é {string}")
    public void validoQueProdutoE(String produt) {
        Assert.assertEquals(produt, fichaCadastralCPFPage.validoQueProdutoE());
    }

    @E("valido que a quantidade de parcelas e {string} e a carencia {string}")
    public void validoQueQuantidadeDeParcelasECarencia(String parcelas, String carencia) {
        Assert.assertEquals(parcelas, fichaCadastralCPFPage.validoQueQuantidadeDeParcelasECarencia());
        Assert.assertEquals(carencia, fichaCadastralCPFPage.getCarencia());
    }

    @E("valido o prazo total {string}")
    public void validoPrazoTotal(String prazo) {
        Assert.assertEquals(prazo, fichaCadastralCPFPage.validoPrazoTotal());
    }

    @E("valido o valor total {string}")
    public void validoValorTotal(String valorTotal) {
        Assert.assertEquals(valorTotal, fichaCadastralCPFPage.validoValorTotal());
    }

    @E("Valido porcentagem de entrada {string}")
    public void validoPorcentagemEntrada(String porcentagemEntrada) {
        Assert.assertEquals(porcentagemEntrada, fichaCadastralCPFPage.validoPorcentagemEntrada());
    }

    @E("valido o valor de entrada {string}")
    public void validoValorEntrada(String valorEntrada) {
        Assert.assertEquals(valorEntrada, fichaCadastralCPFPage.validoValorEntrada());
    }

    @Então("valido a campanha escolhida")
    public void validoACampanhaEscolhida() {
        val props = fichaCadastralCPFPage.properties("campanhas.properties");
        Assert.assertEquals(fichaCadastralCPFPage.getCampanhaTaxa(), fichaCadastralCPFPage.validoACampanhaEscolhida());
    }


    @E("clico em imprimir")
    public void clicoEmImprimir() {
        fichaCadastralCPFPage.clicoEmImprimir();
    }

    @Então("valido que nova aba com documento pdf para imprimir foi aberto na url")
    public void validoDocumentoPdfSimulacaoParaImprimirFoiAbertoEmUmaNovaAba() {
        Assert.assertEquals(2,fichaCadastralCPFPage.validoDocumentoPdfSimulacaoParaImprimirFoiAbertoEmUmaNovaAba());
    }


    @Dado("na opcao deseja seguro do veiculo escolho {string}")
    public void na_opcao_deseja_seguro_do_veiculo_escolho(String simOrnao) {
        fichaCadastralCPFPage.na_opcao_deseja_seguro_do_veiculo_escolho(simOrnao);
    }

    @E("na opcao deseja incluir seguro do veiculo no financiamento escolho {string}")
    public void naOpcaoDesejaIncluirSeguroVeiculoNoFinanciamentoEscolho(String simOrnao) {
        fichaCadastralCPFPage.naOpcaoDesejaIncluirSeguroVeiculoNoFinanciamentoEscolho(simOrnao);
    }

    @E("valido um modal de atencao informando que cotacao de seguros nao permite cobertura do veiculo")
    public void validoModalDeAtencaoInformandoCotacaoSeguroNaoPermiteCobertura() {
        Assert.assertEquals("Atenção!", fichaCadastralCPFPage.validoModalDeAtencaoInformandoCotacaoSeguroNaoPermiteCobertura());
    }

    @Dado("clico em continuar")
    public void clico_em_continuar() {
        fichaCadastralCPFPage.clico_em_continuar();
    }

    @E("valido modal de atencao informando que valores do seguro serao removidos do processo")
    public void validoModalDeAtencaoInformadoQueValoresSegurosSeraoRemovidosDoProcesso() {
        Assert.assertTrue(fichaCadastralCPFPage.validoModalDeAtencaoInformadoQueValoresSegurosSeraoRemovidosDoProcesso());
    }


    @Dado("clico em enviar proposta de credito")
    public void clico_em_enviar_proposta_de_credito() {
        fichaCadastralCPFPage.clico_em_enviar_proposta_de_credito();
    }


    @Dado("no modal selecione o vendedor escolho {string}")
    public void no_modal_selecione_o_vendedor_escolho(String vendedor) {
        fichaCadastralCPFPage.no_modal_selecione_o_vendedor_escolho(vendedor);
    }

    @Então("o sistema apresenta a tela com os detalhes da proposta cadastrada")
    public void SistemaApresenteTelaComDetalhesDaPropostaCadastrada() {
        Assert.assertTrue(fichaCadastralCPFPage.SistemaApresenteTelaComDetalhesDaPropostaCadastrada());
    }


    @Dado("que preencho o campo CPF ou CNPJ com valor inválido {string}")
    public void quePreenchoOCampoCpfOuCnpjComValorInvalido(String cpf) {
        fichaCadastralCPFPage.quePreenchoOCampoCpfOuCnpjComValorInvalido(cpf);
    }

    @Então("é apresentada a mensagem {string}.")
    public void EApresentadaAMensagem(String msg) {
        Assert.assertEquals(fichaCadastralCPFPage.EApresentadaAMensagem(), msg);
    }

}
