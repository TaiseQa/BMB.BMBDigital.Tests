package inmetrics.automacao.core.web;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static inmetrics.automacao.core.web.util.FabricaWebDriver.getDriver;
import static inmetrics.automacao.core.web.util.FabricaWebDriver.wait;

public class InteracoesTelaWeb {
    public static final Logger log = Logger.getLogger(InteracoesTelaWeb.class);
    private Random random;

    public InteracoesTelaWeb() {
        PageFactory.initElements(getDriver(), this);
    }

    /**
     * Método utilizado para aguardar até 60 segundos a visibilidade do elemento
     *
     * @param element - Instancia do elemento da tela
     */
    protected void aguardarVisibilidade(WebElement element) {
        log.info("verificando a visibilidade do elemento: " + element);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            throw new TimeoutException("o elemento: " + element + " não foi encontrado", e);
        }
    }

    /**
     * Método utilizado para aguardar que um determinado elemento desapareça
     *
     * @param element - Instancia do elemento da tela
     */
    protected void aguardarInvisibilidade(WebElement element) {
        log.info("esperando a invisibilidade do elemento: " + element);
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (TimeoutException e) {
            throw new TimeoutException("o elemento: " + element + " não foi encontrado", e);
        }
    }

    /**
     * Método utilizado para aguardar até 10 segundos a habilitação do click
     * do elemento na página
     *
     * @param element - Instancia do elemento da tela
     */
    protected void aguardarCliqueHabilitado(WebElement element) {
        log.info("verificando habilitação do elemento: " + element);
        try {
            wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            throw new TimeoutException("o elemento: " + element + " não foi encontrado", e);
        }
    }

    /**
     * Método utilizado para focar no alert e aceitar
     */
    protected void mudarParaAlertEAceitar() {
        log.info("mudando foco para o alert presente na tela");
        try {
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (NoAlertPresentException e) {
            log.error("Nenhum alerte encontrado");
            e.getMessage();
        }
    }

    /**
     * Método utilizado para focar no alert e negar
     */
    protected void mudarParaAlertENegar() {
        log.info("mudando foco para o alert presente na tela");
        try {
            wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        } catch (NoAlertPresentException e) {
            log.error("Nenhum alerte encontrado");
            e.getMessage();
        }
    }

    /**
     * Método utilizado  para focar no alert, escrever e aceitar
     *
     * @param texto - Texto que será inserido no input alert
     */
    protected void mudarParaAlertEEscreverEAceitar(String texto) {
        log.info("mudando foco para o alert presente na tela");
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = getDriver().switchTo().alert();
            alert.sendKeys(texto);
            alert.accept();
        } catch (NoAlertPresentException e) {
            log.error("nenhum alert encontrado");
            e.getMessage();
        }
    }

    /**
     * Método utilizado para focar no alert e pegar o texto contido
     *
     * @return - Retorna uma string
     */
    protected String mudarParaAlertEObterTexto() {
        log.info("mudando foco para o alert presente na tela");
        try {
            return wait.until(ExpectedConditions.alertIsPresent()).getText().trim();
        } catch (NoAlertPresentException e) {
            log.error("nenhum alert encontrado");
            e.getMessage();
            return null;
        }
    }

    /**
     * Método utilizado para focar em um alert, pegar o texto e aceitar
     *
     * @return - Retorna uma string
     */
    protected String mudarParaAlertObterTextoEAceitar() {
        log.info("mudando foco para o alert presente na tela");
        try {
            Alert alert = getDriver().switchTo().alert();
            String texto = alert.getText().trim();
            alert.accept();
            return texto;
        } catch (NoAlertPresentException e) {
            log.error("nenhum alert encontrado");
            e.getMessage();
            return null;
        }
    }

    /**
     * Método utilizado para focar em um alert, pegar o texto e negar
     *
     * @return - Retornar uma string
     */
    protected String mudarParaAlertObterTextoENegar() {
        log.info("mudando foco para o alert presente na tela");
        try {
            Alert alert = getDriver().switchTo().alert();
            String texto = alert.getText().trim();
            alert.dismiss();
            return texto;
        } catch (NoAlertPresentException e) {
            log.error("nenhum alert encontrado");
            e.getMessage();
            return null;
        }
    }

    /**
     * Método utilizado para clicar em um elemento
     *
     * @param element - Instancia do elemento da tela
     */
    protected void clicar(WebElement element) {
        aguardarCliqueHabilitado(element);
        element.click();
    }

    /**
     * Método utilizado para clicar num elemento usando JavascriptExecutor
     *
     * @param element - Instancia do elemento da tela
     */
    protected void clicarJs(WebElement element) {
        aguardarCliqueHabilitado(element);
        ((JavascriptExecutor) getDriver())
                .executeScript("return arguments[0].click();", element);
    }

    /**
     * Método utilizado para inserir texto ao elemento da teka
     *
     * @param element - Instancia do elemento da tela
     * @param texto   - Texto que será inseriado ao elemento
     */
    protected void escrever(WebElement element, String texto) {
        aguardarCliqueHabilitado(element);
        element.clear();
        element.sendKeys(texto);
    }

    /**
     * Método utilizado para selecionar uma opção de um combo do tipo select
     *
     * @param element - Instancia do elemento da tela
     * @param value   — Opção contida no combo
     */
    protected void comboBoxSelect(WebElement element, String value) {
        aguardarCliqueHabilitado(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    /**
     * Método utilizado para seleciona uma opção de um combo do tipo value
     *
     * @param element - Instancia do elemento da tela
     * @param value   — Opção contida no combo
     */
    protected void comboBoxValue(WebElement element, String value) {
        aguardarCliqueHabilitado(element);
        aguardarVisibilidade(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * Método utlizado para deselecionar uma opção do combo do tipo select
     *
     * @param element - Instancia do elemento da tela
     * @param value   — Opção contida no combo
     */
    protected void deselecionarComboBoxSelect(WebElement element, String value) {
        aguardarCliqueHabilitado(element);
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }

    /**
     * Método utlizado para deselecionar uma opção do combo do tipo value
     *
     * @param element - Instancia do elemento da tela
     * @param value   — Opção contida no combo
     */
    protected void deselecionarComboBoxValue(WebElement element, String value) {
        aguardarCliqueHabilitado(element);
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    /**
     * Método utilizado para pegar todas as opções selecionados no combo
     *
     * @param element - Instancia do elemento da atela
     * @return - Retornar uma lista de string
     */
    protected List<String> obterValoresCombo(WebElement element) {
        Select select = new Select(element);
        List<WebElement> todasAsOpcoes = select.getAllSelectedOptions();
        List<String> valores = new ArrayList<>();
        for (WebElement opcao : todasAsOpcoes) {
            valores.add(opcao.getText());
        }
        return valores;
    }

    /**
     * Método utilizado para marca um radio button
     *
     * @param element - Instancia do elemento da página
     */
    protected void marcarOpcaoRadio(WebElement element) {
        clicar(element);
    }

    /**
     * Método utilizado para veirificar se radio button está marcado
     *
     * @param element - Instancia do elemento da página
     * @return — Retornar true ou false
     * true se radio estiver marcado
     * false se radio não estiver marcado
     */
    protected boolean verificarSeOpcaoRadioEstaMarcado(WebElement element) {
        return element.isSelected();
    }

    /**
     * Método utilizado para retornar o texto de um elemento
     *
     * @param element - Instancia do elemento da tela
     * @return — Retorno do texto sem espaços no início e no final
     */
    protected String getTexto(WebElement element) {
        aguardarVisibilidade(element);
        return element.getText().trim();
    }

    /**
     * Método utilizado para retornar o value de um elemento
     *
     * @param element - Instancia do elemento da teka
     * @param value   - Value do elemento da tela
     * @return - Retorna o value do elemento da tela
     */
    protected String getTextoValue(WebElement element, String value) {
        return element.getCssValue(value);
    }

    /**
     * Método utilizado para lidar com combos flutuantes de até dois elementos
     *
     * @param element  — Instancia da primeira opção do combo
     * @param element2 — Instancia da segunda opção do combo
     */
    protected void comboFlutuante(WebElement element, WebElement element2) {
        Actions action = new Actions(getDriver());
        aguardarCliqueHabilitado(element);
        action.moveToElement(element).perform();
        aguardarCliqueHabilitado(element2);
        action.moveToElement(element2).perform();
        action.click().build().perform();
    }

    /**
     * Método utilizado para lidar com combos flutuantes de até um elemento
     *
     * @param element — Instancia do elemento opção do combo
     */
    protected void comboFlutuante(WebElement element) {
        Actions action = new Actions(getDriver());
        aguardarCliqueHabilitado(element);
        action.moveToElement(element).perform();
        action.click().build().perform();
    }

    /**
     * Método utilizado para esperar um tempo terminado
     *
     * @param duration — tempo em milissegundos
     */
    protected void esperar(long duration) {
        try {
            synchronized (this) {
                String tamanho = String.valueOf(duration);
                String op = Arrays.toString(String.valueOf(duration).split("0"));
                if (tamanho.length() > 3) {
                    log.info("automação pausada por : " + op + " segundos");
                } else {
                    log.info("automação pausada por : " + op + " milissegundos");
                }
                wait(duration);
                log.info("automação saindo da pausa");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método utilizado para gerar numeros aleatório inteiros
     *
     * @return retorna numero aletório inteiro
     */
    protected int gerarNumeroAleatorio() {
        random = new Random();
        return random.nextInt((1000000 - 10000) + 1) + 10000;
    }

    /**
     * Método utilizado para gerar uma string aleatória
     *
     * @return retorna uma ‘string’ aleatória
     */
    protected String gerarStringAleatorio() {
        String theAlphaNumerics = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder builder = new StringBuilder();
        random = new Random();

        for (int i = 0; i < 15; i++) {
            int myIndex = (int) (theAlphaNumerics.length() * random.nextDouble());
            builder.append(theAlphaNumerics.charAt(myIndex));
        }
        return builder.toString();
    }

    /**
     * Método utilizado para criar um arquivo properties temporario
     *
     * @param name — Nome do arquivo temporario com a extensão.properties
     * @return - Retorna um propertiesConfiguration
     */
    public PropertiesConfiguration properties(String name) {
        File propesFile = new File(FileUtils.getTempDirectory(), name);
        try {
            if (propesFile.createNewFile()) {
                log.info("Arquivo properties temporário: " + name + " criado com sucesso ");
            }
            propesFile.deleteOnExit();
            return new PropertiesConfiguration(propesFile);
        } catch (IOException | ConfigurationException f) {
            f.printStackTrace();
            return null;
        }
    }

    /**
     * Método utilizado para destacar um elemento na página
     *
     * @param element - Instancia do elemento da página
     */
    protected void destarElementoComBorda(WebElement element) {
        String estiloOriginal = element.getAttribute("style");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])",
                element, "style", estiloOriginal + "border: 2px solid red");
        esperar(1000);
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style", estiloOriginal);
    }

    /**
     * Método utilizado para focar num elemento da tela
     *
     * @param element - Instancia do elemento da página
     */
    protected void focarElemento(WebElement element) {
        try {
            log.info("Focando no: " + element);
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            esperar(500);
        } catch (Exception e) {
            log.error("O elemento: " + element + " não foi encontrado");
            log.error(e.getMessage());
        }
    }

    /**
     * Método utilizado para focar num elemento da tela usando borda para destacar
     *
     * @param element - Instancia do elemento da tela
     */
    protected void focarElementoComHighlight(WebElement element) {
        try {
            log.info("Focando no: " + element);
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            destarElementoComBorda(element);
        } catch (Exception e) {
            log.error("O elemento: " + element + " não foi encontrado");
            log.error(e.getMessage());
        }
    }

//    protected void esperar(long time) {
//        try {
//            synchronized (this) {
//                wait(time);
//            }
//        } catch (InterruptedException ignored) {
//        }
//    }

    public void seCarregamentoForVisivelAguardaEleSumirSeNaoContinua() {
        FluentWait<WebDriver> wait1 = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(110))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class, TimeoutException.class);

        Boolean foo = wait1.until(webDriver ->
                getDriver().findElement(By.xpath("//app-interceptor")).getAttribute("innerHTML").contains("hidden=\"\">"));
        boolean existe = false;
        while (!existe) {
            existe = foo;
        }

    }

    public void esperandoElementoSumir() {
        FluentWait<WebDriver> fwait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(120))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class, TimeoutException.class)
                .ignoring(StaleElementReferenceException.class);
        try {
            WebElement element = getDriver().findElement(By.xpath("//app-interceptor//aside[not(@hidden)]"));
            fwait.until(ExpectedConditions.invisibilityOf(element));

            } catch (NoSuchElementException | TimeoutException | StaleElementReferenceException ignore) {
            }
    }

    public void selecionarCombos(WebElement element, String opcaoCombo) {
        clicar(element);
        try {
            WebElement opcao = getDriver().findElement(
                    By.xpath(String.format("//ul//li//span[text() = '%s']/..", opcaoCombo)));
            clicar(opcao);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Nenhuma opção selecionada, um possivel erro pode ser o parâmetro passado," +
                    " as opções devem existir no combo em questão", e);
        }
    }

    public void selecionarCombosUpperCase(WebElement element, String opcaoCombo) {
        clicar(element);
        try {
            WebElement opcao = getDriver().findElement(
                    By.xpath(String.format("//ul//li//span[text() = '%s']/..", opcaoCombo.toUpperCase())));
            clicar(opcao);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Nenhuma opção selecionada, um possivel erro pode ser o parâmetro passado," +
                    " as opções devem existir no combo em questão", e);
        }
    }

}
