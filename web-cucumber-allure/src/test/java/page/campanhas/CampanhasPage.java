package page.campanhas;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class CampanhasPage extends InteracoesTelaWeb {

    @FindBy(xpath = "//button[normalize-space() = 'ATIVAR']")
    private WebElement campanhaExistente;

    @FindBy(xpath = "(//div[@class='card p-3 show']//div)[2]")
    private WebElement tituloModal;

    @FindBy(xpath = "//label[normalize-space() = 'Estou de acordo']")
    private WebElement textoRadioButtonModal;

    @FindBy(xpath = "//button[normalize-space() = 'Ativar Campanha']")
    private WebElement textoButtonAtivarCampanha;

    @FindBy(xpath = "//button[text() = 'Cancelar']")
    private WebElement textoButtonCancelar;

    @FindBy(xpath = "//label[normalize-space() = 'Estou de acordo']/preceding-sibling::input")
    private WebElement radioButton;

    @FindBy(xpath = "//button[not (@disabled)][normalize-space() = 'Ativar Campanha']")
    private WebElement btnAtivarHabilitado;

    public boolean verificoSeExistemOuNaoCampanhas() {
        try {
            campanhaExistente.isDisplayed();
            return true;
        } catch (NoSuchElementException | TimeoutException ignore) {
            return false;
        }
    }

    public void clicoNoBotaoAtivar() {
        clicar(campanhaExistente);
    }

    public String verificoPresencaDeUmModal() {
        return getTexto(tituloModal);
    }

    public String queModalContenhaBotaoRadioButton() {
        return getTexto(textoRadioButtonModal);
    }

    public String textoBotaoAtivarCampanha() {
        return getTexto(textoButtonAtivarCampanha);
    }

    public String textoBotaoCancelar() {
        return getTexto(textoButtonCancelar);
    }

    public void marcoAlgunsVendedores() {
        int quantidade = 3;
        int valor = 1;
        for (int s = 1; s < quantidade; s++) {
            valor++;
            WebElement vendedores = getDriver().findElement(By.xpath
                    (String.format("(//input)[%s]", valor)));
            esperar(500);
            vendedores.click();
        }
    }

    public void desmarcoOsMesmoVendedores() {
        int quantidade = 3;
        int valor = 1;
        for (int s = 1; s < quantidade; s++) {
            valor++;
            WebElement vendedores = getDriver().findElement(By.xpath
                    (String.format("(//input)[%s]", valor)));
            esperar(500);
            vendedores.click();
        }
    }

    public boolean validarSeBotaoAtivarCampanhaFicaHabilitado() {
        marcoAlgunsVendedores();
        clicar(radioButton);
        return btnAtivarHabilitado.isDisplayed();
    }

}
