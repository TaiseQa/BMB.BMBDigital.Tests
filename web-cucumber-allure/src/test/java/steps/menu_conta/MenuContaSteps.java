package steps.menu_conta;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.menu_conta.MenuContaPage;

import java.util.List;
import java.util.Map;

public class MenuContaSteps {

    MenuContaPage menuContaPage;

    public MenuContaSteps(MenuContaPage menuContaPage) {
        this.menuContaPage = menuContaPage;
    }

    @Entao("valido que os suarios e concessionarios informados sao")
    public void validoQueOsUsuarioEConcessionariosInformadoSao(DataTable user) {
        List<Map<String, String>> maps = user.asMaps(String.class, String.class);
        Assert.assertEquals(maps.get(0).get("valor"), menuContaPage.userConta());
        Assert.assertEquals(maps.get(1).get("valor"), menuContaPage.concessionarioConta());
    }

    @E("clico em trocar senha")
    public void clicoEmTrocarSenha() {
        menuContaPage.clicoEmTrocarSenha();
    }

    @Entao("um modal de atencao e apresentado")
    public void umModalDeAtencaoEApresentado() {
        Assert.assertTrue(menuContaPage.umModalDeAtencaoEApresentado());
    }

    @E("clico em ok entendi")
    public void clicoOkEntendi() {
        menuContaPage.clicoOkEntendi();
    }

    @Entao("valido redirecionamento para pagina de troca de senha {string}")
    public void validoRedirecionamentoParaPaginaDeTrocaDeSenha(String texto) {
        Assert.assertEquals(texto, menuContaPage.validoRedirecionamentoParaPaginaDeTrocaDeSenha());
    }

    @E("clico em privacidade e protecao de dados")
    public void clicoEmPrivacidadeProtecaoDeDados() {
        menuContaPage.clicoEmPrivacidadeProtecaoDeDados();
    }

    @Entao("valido redirecionamento para pagina de protecao de dados {string}")
    public void validoRedirecionamentoParaPaginaProtecaoDeDados(String texto) {
        Assert.assertEquals(texto, menuContaPage.validoRedirecionamentoParaPaginaProtecaoDeDados());
    }

    @E("clico em sair")
    public void clicoEmSair() {
        menuContaPage.clicoEmSair();
    }

    @Entao("valido que estou na pagina de login")
    public void validoQueEstouNaPaginaLogin() {
        Assert.assertTrue(menuContaPage.validoQueEstouNaPaginaLogin());
    }
}
