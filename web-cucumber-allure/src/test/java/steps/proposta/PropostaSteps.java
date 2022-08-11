package steps.proposta;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.Assert;
import page.proposta.PropostaPage;

public class PropostaSteps {

    private static final String TEXTO_PDF = "Fechar";
    PropostaPage propostaPage;

    public PropostaSteps(PropostaPage propostaPage) {
        this.propostaPage = propostaPage;
    }

    @E("clico na proposta CDC que esteja em analise")
    public void clicoNaPropostaCDCQueEstejaEmAnalise() {
        val props = propostaPage.properties("proposta.properties");
        propostaPage.clicoNaPropostaCDCQueEstejaEmAnalise(props.getString("proposta"));
    }

    @E("clico na proposta que esteja aprovada")
    public void clicoNaPropostaQueEstejaAprovada() {
        propostaPage.clicoNaPropostaCDCQueEstejaEmAnalise("SPM039648");
    }

    @SneakyThrows
    @E("recupero nome cpf ou cnpj email e telefone")
    public void recuperoNomeCpfOuEmailETefone() {
        val props = propostaPage.properties("dadosCliente.properties");
        System.out.println(props.getBasePath());
        propostaPage.clicoBotaoFichaCadastral();
        props.setProperty("nome", propostaPage.recuperarNome());
        props.setProperty("cpf", propostaPage.recuperarCpfOrCnpj());
        props.setProperty("email", propostaPage.recuperarEmail());
        props.setProperty("telefone", propostaPage.recuperarTelefone());
        props.save();
        propostaPage.fecharModalFichaCadastral();
    }

    @E("clico no botao assinar contrato")
    public void clicoNoBotaoAssinarContrato() {
        propostaPage.clicoNoBotaoAssinarContrato();
    }

    @E("valido que um modal foi apresentado")
    public void validoQueUmModalFoiApresentado() {
        Assert.assertTrue(propostaPage.validoQueUmModalFoiApresentado());
    }

    @Entao("verifico que o nome cpf ou cnpj email e telefone sao os mesmos na hora do cadastro")
    public void verificoQueNomeCpfOuCpnjEmailETelefoneSaoOsMesmosNaHoraDoCadastro() {
        val props = propostaPage.properties("dadosCliente.properties");
        Assert.assertEquals(props.getString("nome").substring(4,20).replaceAll("\\n",""), propostaPage.getNome());
        Assert.assertEquals(props.getString("cpf").substring(3,18).replaceAll("\\n",""), propostaPage.getCpfOrCnpj().substring(9,24).replaceAll(" ",""));
        Assert.assertEquals(props.getString("email"), propostaPage.getEmail());
        Assert.assertEquals(props.getString("telefone").replace("(","").replace(")",""), propostaPage.getTelefone().substring(3,17));
    }

    @E("clico em informacoes de faturamento")
    public void clicoEmInformacoesDeFaturamento() {
        propostaPage.clicoEmInformacoesDeFaturamento();
    }

    @Entao("valido que um documento PDF eh apresentado")
    public void validoQueUmDocumentoPdfehApresentado() {
        Assert.assertEquals(TEXTO_PDF, propostaPage.validoQueUmDocumentoPdfehApresentado());
    }
}
