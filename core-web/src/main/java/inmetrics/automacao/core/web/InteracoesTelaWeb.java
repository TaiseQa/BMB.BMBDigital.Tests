package inmetrics.automacao.core.web;

import inmetrics.automacao.core.web.util.Log;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class InteracoesTelaWeb {

    private static Actions action;
    private WebDriver driver;
    private static WebDriverWait wait;


    public InteracoesTelaWeb(WebDriver driver) {
        this.driver = driver;
        DefinirArquivoLog();

    }


    private void DefinirArquivoLog() {
        if ((null == Log.ArquivoLogNome || "" == Log.ArquivoLogNome.trim()))
            Log.DefinirLocalAquivoLog(null, "inmetrics.automacao.core.web.log_".concat(new SimpleDateFormat("yyyyMMddHHmmssSS").format(new java.util.Date())).concat(".log"));
    }

    /**
     * Método utilizado para aguardar até 10 segundos a visibilidade do elemento na
     * tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void aguardarVisibilidade(WebElement elemento) {
        Log.LogarInfo("Verificando visibilidade do elemento :" + elemento);
        try {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(elemento));
        } catch (TimeoutException e) {
            Log.LogarErro("Elemento não encontrado : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
        }
    }

    /**
     * Método utilizado para aguardar por um período determinado a visibilidade do
     * elemento na tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void aguardarVisibilidade(WebElement elemento, int segundos) {
        Log.LogarInfo("Verificando visibilidade do elemento :" + elemento);
        try {
            wait = new WebDriverWait(driver, segundos);
            wait.until(ExpectedConditions.visibilityOf(elemento));
        } catch (TimeoutException e) {
            Log.LogarErro("Elemento não encontrado : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
        }
    }

    /**
     * Método utilizado para aguardar até 10 segundos a habilitação de click do
     * elemento na tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void aguardarClickHabilitado(WebElement elemento) {
        Log.LogarInfo("Verificando visibilidade do elemento :" + elemento);
        try {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(elemento));
        } catch (TimeoutException e) {
            Log.LogarErro("Elemento não encontato : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
        }
    }

    /**
     * Método utilizado para aguardar por um período determinado habilitação de
     * click do elemento na tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void aguardarClickHabilitado(WebElement elemento, int segundos) {
        Log.LogarInfo("Verificando visibilidade do elemento :" + elemento);
        try {
            wait = new WebDriverWait(driver, segundos);
            wait.until(ExpectedConditions.elementToBeClickable(elemento));
        } catch (TimeoutException e) {
            Log.LogarErro("Elemento não encontato : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
        }
    }

    /**
     * Método utilizado para focar o elemento na tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void focarElemento(WebElement elemento) {
        Log.LogarInfo("Verificando visibilidade do elemento :" + elemento);
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemento);
            Thread.sleep(500);
        } catch (Exception e) {
            Log.LogarErro("Elemento não encontato : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
        }
    }

    /**
     * Método utilizado para verificar se existe ocorrência do elemento na tela
     *
     * @param elemento - Instancia do elemento da tela
     * @return boolean - Se existe correspondência do elemento na tela
     */
    protected boolean consultarExistencia(WebElement elemento) {
        try {
            aguardarVisibilidade(elemento);
            focarElemento(elemento);
            return true;
        } catch (Exception e) {
            Log.LogarErro("Elemento não encontato : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
            return false;
        }
    }

    /**
     * Método utilizado para verificar se existe ocorrência do elemento na tela passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     * @return boolean - Se existe correspondência do elemento na tela
     */
    protected boolean consultarExistencia(WebElement elemento, int segundos) {
        try {
            aguardarVisibilidade(elemento, segundos);
            focarElemento(elemento);
            return true;
        } catch (Exception e) {
            Log.LogarErro("Elemento não encontato : " + elemento);
            Log.LogarErro(e.getMessage());
            Assert.fail(e.toString());
            return false;
        }
    }

    /**
     * Método utilizado para obter o texto do elemento da tela
     *
     * @param elemento - Instancia do elemento da tela
     * @return string - Texto do elemento
     */
    protected String obterValorTexto(WebElement elemento) {
        aguardarVisibilidade(elemento);
        String value = elemento.getText();
        return value;
    }

    /**
     * Método utilizado para obter o texto do elemento da tela passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     * @return string - Texto do elemento
     */
    protected String obterValorTexto(WebElement elemento, int segundos) {
        aguardarVisibilidade(elemento, segundos);
        String value = elemento.getText();
        return value;
    }

    /**
     * Método utilizado para inserir texto no elemento da tela
     *
     * @param elemento - Instancia do elemento da tela
     * @param valor    - Texto que será inserido
     */
    protected void inserirValor(WebElement elemento, String valor) {
        aguardarClickHabilitado(elemento);
        elemento.click();
        elemento.sendKeys(valor);
    }

    /**
     * Método utilizado para inserir texto no elemento da tela passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     * @param valor    - Texto que será inserido
     */
    protected void inserirValor(WebElement elemento, String valor, int segundos) {
        aguardarClickHabilitado(elemento);
        elemento.click();
        elemento.sendKeys(valor);
    }

    /**
     * Método utilizdo para efetuar click no elemento da tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void clicarElemento(WebElement elemento) {
        aguardarClickHabilitado(elemento);
        elemento.click();
    }

    /**
     * Método utilizdo para efetuar click no elemento da tela passando o tempo
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void clicarElemento(WebElement elemento, int segundos) {
        aguardarClickHabilitado(elemento, segundos);
        elemento.click();
    }

    /**
     * Método utilizdo para efetuar click por coordenada na tela a parti de um
     * elemento
     *
     * @param elemento - Instancia do elemento da tela
     * @param x        - Coordenada horizontal
     * @param y        - Coordenada vertical
     */
    protected void clickElementoPorCoordenada(WebElement elemento, int x, int y) {
        aguardarClickHabilitado(elemento);
        action = new Actions(driver);
        action.moveToElement(elemento, 0, 0);
        action.moveByOffset(x, y);
        action.click();
        action.build();
        action.perform();
        elemento.click();
    }

    /**
     * Método utilizdo para efetuar submit no elemento da tela
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void submitElemento(WebElement elemento) {
        aguardarClickHabilitado(elemento);
        elemento.submit();
    }

    /**
     * Método utilizdo para efetuar submit no elemento da tela passando o tempo
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void submitElemento(WebElement elemento, int segundos) {
        aguardarClickHabilitado(elemento, segundos);
        elemento.submit();
    }

    /**
     * Método utilizdo para abrir o navegador
     *
     * @param url - url da pagina
     */
    public void abrirNavegador(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    /**
     * Método utilizado para obter o texto do elemento da tela passando uma
     * propriedade do elemento
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected String obterValorPropriedade(WebElement elemento, String propriedade) {
        aguardarVisibilidade(elemento);
        String value = elemento.getAttribute(propriedade);
        return value;
    }

    /**
     * Método utilizado para obter o texto do elemento da tela passando uma
     * propriedade do elemento e o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected String obterValorPropriedade(WebElement elemento, String propriedade, int segundos) {
        aguardarVisibilidade(elemento, segundos);
        String value = elemento.getAttribute(propriedade);
        return value;
    }

    /**
     * Método utilizado para selecionar o checkbox
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarCheckbox(WebElement elemento) {
        boolean checkstatus;
        aguardarVisibilidade(elemento);
        checkstatus = elemento.isSelected();
        if (checkstatus == false) {
            elemento.click();
        }
    }

    /**
     * Método utilizado para selecionar o checkbox passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarCheckbox(WebElement elemento, int segundos) {
        boolean checkstatus;
        aguardarVisibilidade(elemento, segundos);
        checkstatus = elemento.isSelected();
        if (checkstatus == false) {
            elemento.click();
        }
    }

    /**
     * Método utilizado para deselecionar o checkbox
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void deselecionarCheckbox(WebElement elemento) {
        boolean checkstatus;
        aguardarVisibilidade(elemento);
        checkstatus = elemento.isSelected();
        if (checkstatus == true) {
            elemento.click();
        }
    }

    /**
     * Método utilizado para deselecionar o checkbox passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void deselecionarCheckbox(WebElement elemento, int segundos) {
        boolean checkstatus;
        aguardarVisibilidade(elemento, segundos);
        checkstatus = elemento.isSelected();
        if (checkstatus == true) {
            elemento.click();
        }
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o texto
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoTexto(WebElement elemento, String name) {
        aguardarVisibilidade(elemento);
        Select selectitem = new Select(elemento);
        selectitem.selectByVisibleText(name);
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o texto passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoTexto(WebElement elemento, String name, int segundos) {
        aguardarVisibilidade(elemento, segundos);
        Select selectitem = new Select(elemento);
        selectitem.selectByVisibleText(name);
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o valor
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoValor(WebElement elemento, String name) {
        aguardarVisibilidade(elemento);
        Select selectitem = new Select(elemento);
        selectitem.selectByValue(name);
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o valor passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoValor(WebElement elemento, String name, int segundos) {
        aguardarVisibilidade(elemento, segundos);
        Select selectitem = new Select(elemento);
        selectitem.selectByValue(name);
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o índice
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoIndice(WebElement elemento, int indice) {
        aguardarVisibilidade(elemento);
        Select selectitem = new Select(elemento);
        selectitem.selectByIndex(indice);
    }

    /**
     * Método utilizado para seleciona o elemtno pelo o índice passando o tempo de espera
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void selecionarElementoIndice(WebElement elemento, int indice, int segundos) {
        aguardarVisibilidade(elemento, segundos);
        Select selectitem = new Select(elemento);
        selectitem.selectByIndex(indice);
    }

    /**
     * Método utilizado para movimentar barra de rolagem
     *
     * @param valor - Instancia do elemento da tela
     */
    protected void movimentarBarraRolagem(int valor) {
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0," + valor + ")", "");
    }

    /**
     * Método utilizado para abri iframe
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void abrirIframe(WebElement elemento) {
        driver.switchTo().frame(elemento);
        driver.switchTo().activeElement();
    }

    /**
     * Método utilizado para fecha iframe
     *
     * @param elemento - Instancia do elemento da tela
     */
    protected void fechaIframe(WebElement elemento) {
        driver.switchTo().frame(elemento);
        driver.switchTo().defaultContent();
    }

    /**
     * Método utilizado para fecha aplicação
     */
    public void fechaAplicacao() {
        driver.quit();
    }

    /**
     * Método utilizado para fecha aba
     */
    protected void fechaAba() {
        driver.close();
    }

    /**
     * Metodo utilizado para simular o acionamento de teclas especiais
     * <p>
     * Parametro Keys pode receber as seguintes opções:
     * <p>
     * NULL = '\ue000' CANCEL = '\ue001' # ^break HELP = '\ue002' BACKSPACE =
     * '\ue003' BACK_SPACE = BACKSPACE TAB = '\ue004' CLEAR = '\ue005' RETURN =
     * '\ue006' ENTER = '\ue007' SHIFT = '\ue008' LEFT_SHIFT = SHIFT CONTROL =
     * '\ue009' LEFT_CONTROL = CONTROL ALT = '\ue00a' LEFT_ALT = ALT PAUSE =
     * '\ue00b' ESCAPE = '\ue00c' SPACE = '\ue00d' PAGE_UP = '\ue00e' PAGE_DOWN =
     * '\ue00f' END = '\ue010' HOME = '\ue011' LEFT = '\ue012' ARROW_LEFT = LEFT UP
     * = '\ue013' ARROW_UP = UP RIGHT = '\ue014' ARROW_RIGHT = RIGHT DOWN = '\ue015'
     * ARROW_DOWN = DOWN INSERT = '\ue016' DELETE = '\ue017' SEMICOLON = '\ue018'
     * EQUALS = '\ue019'
     * <p>
     * NUMPAD0 = '\ue01a' # number pad keys NUMPAD1 = '\ue01b' NUMPAD2 = '\ue01c'
     * NUMPAD3 = '\ue01d' NUMPAD4 = '\ue01e' NUMPAD5 = '\ue01f' NUMPAD6 = '\ue020'
     * NUMPAD7 = '\ue021' NUMPAD8 = '\ue022' NUMPAD9 = '\ue023' MULTIPLY = '\ue024'
     * ADD = '\ue025' SEPARATOR = '\ue026' SUBTRACT = '\ue027' DECIMAL = '\ue028'
     * DIVIDE = '\ue029'
     * <p>
     * F1 = '\ue031' # function keys F2 = '\ue032' F3 = '\ue033' F4 = '\ue034' F5 =
     * '\ue035' F6 = '\ue036' F7 = '\ue037' F8 = '\ue038' F9 = '\ue039' F10 =
     * '\ue03a' F11 = '\ue03b' F12 = '\ue03c'
     * <p>
     * META = '\ue03d' COMMAND = '\ue03d'
     * <p>
     * Exemplo de uso pressionarTecla(Keys.LEFT_CONTROL, elemento);
     *
     * @param elemento - Instancia do elemento da tela
     * @param key      - Indicador de tecla a ser simulada
     **/
    protected void pressionarTecla(Keys key, WebElement elemento) {
        try {
            elemento.sendKeys(key);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    protected void esperar(long time) {
        try {
            synchronized (this) {
                wait(time);
            }
        } catch (InterruptedException ignored) {
        }
    }

    protected void esperarElementoLoadSumir() {
        wait = new WebDriverWait(driver, 30);
        WebElement element = driver.findElement(By.xpath("//app-interceptor//aside[not(@hidden)]"));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
