package page.ajuda;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;

public class AjudaPage extends InteracoesTelaWeb {

    @FindBy(css = "[formcontrolname = 'text']")
    private WebElement inputPesquisaAjuda;

    @FindBy(xpath = "//app-question//span")
    private WebElement resultadoBusca;

    @FindBy(xpath = "//source")
    private WebElement video;

    @FindBy(xpath = "(//div[@aria-expanded = 'true'])[2]//p")
    private WebElement respostaPergunta;

    public void noCampoDeBuscaPesquiso(String busca) {
        escrever(inputPesquisaAjuda, busca);
    }

    public String verificoSeResultadoDaBuscaEOMesmoQuePesquisei() {
        return getTexto(resultadoBusca);
    }

    public void clicoNoTutorial(String oop) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//span[text() = '%s']", oop)));
        opcao.click();
    }

    public String verificoQueVideoDoTutotrialEExibido() {
        return video.getAttribute("src");
    }

    public void clicoEmUmaPergunta(String pergunta) {
        WebElement opcao = getDriver().findElement(By.xpath
                (String.format("//h3[text() = '%s']", pergunta)));
        opcao.click();
    }

    public String queSuaRespostaExibidaSeja() {
        return getTexto(respostaPergunta);
    }

    public String tiposDeVideo(String op) {
        if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/V3.mp4")) {
            log.info("o video apresentado é: Vídeo Tutorial - Assinatura Eletrônica Pessoa Física");
            return ("https://digital.bancomercedes-benz.com.br/Videos/V3.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/BMBDigital2.0_VA_170119.mp4")) {
            log.info("o video apresentado é: Vídeo de Divulgação do BMB Digital 2.0");
            return ("https://digital.bancomercedes-benz.com.br/Videos/BMBDigital2.0_VA_170119.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/Retencao_VA_160420.mp4")) {
            log.info("o video apresentado é: Vídeo tutorial do Módulo de Retenção do BMB Digital");
            return ("https://digital.bancomercedes-benz.com.br/Videos/Retencao_VA_160420.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/Instit_Comer_VA_280520.mp4")) {
            log.info("o video apresentado é: Caminhões: Institucional");
            return ("https://digital.bancomercedes-benz.com.br/Videos/Instit_Comer_VA_280520.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/CDC_Flex_Comer_VA_280520.mp4")) {
            log.info("o video apresentado é: Caminhões, Ônibus e Vans: CDC Flexibility");
            return ("https://digital.bancomercedes-benz.com.br/Videos/CDC_Flex_Comer_VA_280520.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/CDC_Decres_VA_280520.mp4")) {
            log.info("o video apresentado é: Automóveis, Caminhões, Ônibus e Vans: CDC Decrescente");
            return ("https://digital.bancomercedes-benz.com.br/Videos/CDC_Decres_VA_280520.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/CDC_Auto_VA_280520.mp4")) {
            log.info("o video apresentado é: Automóveis: CDC");
            return ("https://digital.bancomercedes-benz.com.br/Videos/CDC_Auto_VA_280520.mp4");
        } else if (op.equalsIgnoreCase("https://digital.bancomercedes-benz.com.br/Videos/CDC_Flex_Auto_VA_280520.mp4")) {
            log.info("o video apresentado é: Automóveis: CDC Flexibility");
            return ("https://digital.bancomercedes-benz.com.br/Videos/CDC_Flex_Auto_VA_280520.mp4");
        } else {
            return "video não mapeado";
        }
    }


}
