package inmetrics.automacao.framework.pages;

import inmetrics.automacao.core.web.InteracoesTelaWeb;
import inmetrics.automacao.framework.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroFichaPage extends InteracoesTelaWeb {

    //Botões
    @FindBy(how = How.XPATH, xpath = "//button[contains(.,'Nova ficha')]")
    protected WebElement botaoNovaFicha;

    //Campos Identificação do Cliente
    @FindBy(how = How.CSS, css = "[formcontrolname='cpfCnpj']")
    protected WebElement campoCpfCnpj;

    @FindBy(how = How.ID, id = "name")
    protected WebElement campoNome;

    @FindBy(how = How.ID, id = "birthDate")
    protected WebElement campoDataNascimento;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'E-mail')]/following-sibling::div/input[@class='form-control ng-pristine ng-invalid ng-touched']")
    protected WebElement campoEmail;

    @FindBy(how = How.CSS, css = "[formcontrolname='celPhone']")
    protected WebElement campoCelular;

    @FindBy(how = How.XPATH, xpath = "//label[contains(text(), 'Estado civil')][0]/following-sibling::ngx-select/div")
    protected WebElement comboEstadoCivil;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Solteiro')]")
    protected WebElement opcaoComboEstadoCivilSolteiro;

    @FindBy(how = How.XPATH, xpath = "//span[contains(text(), 'Casado')]")
    protected WebElement opcaoComboEstadoCivilCasado;

    //Identificação do cliente

    @FindBy(how = How.XPATH, xpath = "//input[@value='M']")
    protected WebElement opcaoCheckSexoMasculino;

    @FindBy(how = How.XPATH, xpath = "//input[@value='F']")
    protected WebElement opcaoCheckSexoFemino;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/input")
    protected WebElement opcaoComboeEscolaridade;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/ul/li[1]/a/span")
    protected WebElement opcaoComboFundamental;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/ul/li[2]/a")
    protected WebElement opcaoComboMedio;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/ul/li[3]/a")
    protected WebElement opcaoComboSuperior;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/ul/li[4]/a/span")
    protected WebElement opcaoComboMbaPosGraduacao;

    @FinfBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[4]/ngx-select/div/ul/li[5]/a")
    protected WebElement opcaoComboAnalfabeto;

    @FindBy(how = How.XPATH, xpath = ""//*[@id="bmb-page-body"]/app-pf/form/div[1]/div[2]/div[2]/div/div[5]/app-control-field/ngx-select/div/input)
            protected WebElement opcaoComboSituacaoEscolar;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[5]/app-control-field/ngx-select/div/ul/li[1]/a/span")
            protected WebElemente opcaoComboIncompleto;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[5]/app-control-field/ngx-select/div/ul/li[2]/a")
            protected WebElement opcaoComboCompleto;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[6]/ngx-select/div/input")prote
            protected WebElement opcaoComboNacionalidade;
            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[6]/ngx-select/div/ul/li[1]/a"))
    protected WebElement opcaoComboBrasileira;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[6]/ngx-select/div/ul/li[2]/a"
            protected WebElement opcaoComboEstrangeira;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/input")
            protected WebElement opcaoComboNaturalidadeEstado;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[1]/a")
            protected WebElement opcaoComboEstadoAcre;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[2]/a")
            protected WebElement opcaoComboEstadoAlagoas;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[3]/a/span")
            protected WebElement opcaoComboEstadoAmazonas;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[4]/a/span")
            protected WebElement opcaoComboEstadoAmapa;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[5]/a")
            protected WebElement opcaoComboEstadoBahia;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[6]/a")
            protected WebElement opcaoComboEstadoCeara;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[7]/a/span")
            protected WebElement opcaoComboEstadoDistritoFederal;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[8]/a/span")
            protected WebElement opcaoComboEstadoEspiritoSanto;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[9]/a")
            protected WebElement opcaoComboEstadoGoias;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[10]/a")
            protected WebElement opcaoComboEstadoMaranhao;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[11]/a/span")
            protected WebElement opcaoComboEstadoMinasGerais;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[12]/a/span")
            protected WebElement opcaoComboEstadoMatoGrossoDoSul;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[13]/a")
            protected WebElement opcaoComboEstadoMatoGrosso;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[14]/a/span")
            protected WebElement opcaoComboEstadoPara;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[15]/a/span")
            protected WebElement opcaoComboEstadoParaiba;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[16]/a/span")
            protected WebElement opcaoComboEstadoPernambuco;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[17]/a/span")
            protected WebElement opcaoComboEstadoPiaui;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[18]/a/span")
            protected WebElement opcaoComboEstadoParana;

            @FindBy@(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[19]/a/span")
    protected WebElement opcaoComboEstadoRioDeJaneiro;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[20]/a/span")
    protected WebElement opcaoComboEstadoRioGrandeDoNorte;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[21]/a/span")
    protected WebElement opcaoComboEstadoRondonia;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[22]/a/span")
    protected WebElement opcaoComboEstadoRoraima;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[23]/a/span")
    protected WebElement opcaoComboEstadoRioGrandeDoSul;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[24]/a/span")
    protected WebElement opcaoComboEstadoSantaCatarina;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[25]/a/span")
    protected WebElement opcaoComboEstadoSergipe;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[26]/a/span")
    protected WebElement opcaoComboEstadoSaoPaulo;

    @FindBy(how = How.XPATH, xppath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[7]/app-control-field/ngx-select/div/ul/li[27]/a/span")
    protected WebElement opcaoComboEstadoTocantins;

    //naturalidade cidade
    @FindBy(how = How.XPATH, xpath = "//input[@placeholder=\"Selecione\"]")
    protected WebElement campoCidade;

    //Nome da mãe
    @FindBy(how = How.ID, id = "motherName")
    protected WebElement campoNomeDaMae;

    //documento do proponente
    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[1]/div[6]/app-control-field/ngx-select/div/div[2]/div/span[2]")
    protected WebElement botaoDocumentoDoProponente;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[1]/a")
    protected WebElement campoComboRg;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[2]/a/span"
            protected WebElement campoComboCnh;

            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[4]/a/span"
                    protected WebElement campoComboPassaporte;

                    @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[5]/a/span"
                            protected WebElement campoComboOab;

                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[6]/a/span")
                            protected WebElement campoComboCra;

                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[7]/a/span")
                            protected WebElement campoComboCrc;

                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[11]/app-control-field/ngx-select/div/ul/li[8]/a/span")
                            protected WebElement campoComboCrm;

                            @FindBy(how = How.CSS, css = "//input[@formcontrolname='documentExpeditionDate']")
                            protected WebElement campoDataExpedição;

                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[1]/a/span")
                            protected WebElement campoUfAc;

                            @FindBy(hhow = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[2]/a/span")
                            protected WebElement campoUfAl;

                            @FindBy(hhow = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[3]/a/span"
                                    protected WebElement campoUfAm;

                                    @FindBy(hhow = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[4]/a/span"
                                            protected WebElement campoUfAp;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[5]/a/span")
                                            protected WebElement campoUfBa;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[6]/a/span")
                                            protected WebElement campoUfCe;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[7]/a/span")
                                            protected WebElement campoUfDf;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[8]/a/span")
                                            protected WebElement campoUfEs;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[9]/a/span")
                                            protected WebElement campoUfGo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[10]/a/span")
                                            protected WebElement campoUfMa;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[11]/a/span")
                                            protected WebElement campoUfMg;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[12]/a/span")
                                            protected WebElement campoUfMs;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[13]/a/span")
                                            protected WebElement campoUfMt;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[14]/a/span")
                                            protected WebElement campoUfPa;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[15]/a/span")
                                            protected WebElement campoUfPb;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[16]/a/span")
                                            protected WebElement campoUfPe;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[17]/a/span")
                                            protected WebElement campoUfPi;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[18]/a/span")
                                            protected WebElement campoUfPr;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[19]/a/span")
                                            protected WebElement campoUfRj;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[20]/a/span")
                                            protected WebElement campoUfRn;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[21]/a/span")
                                            protected WebElement campoUfRo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[22]/a/span")
                                            protected WebElement campoUfRr;

                                            @FindBy(how = How.How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[23]/a/span")
                                            protected WebElement campoUfRs;

                                            @FindBy(how = How.How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[24]/a/span")
                                            protected WebElement campoUfSc;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[25]/a/span")
                                            protected WebElement campoUfSe;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[26]/a/span")
                                            protected WebElement campoUfSp;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[15]/app-control-field/ngx-select/div/ul/li[27]/a/span")
                                            protected WebElement campoUfTo;

                                            //orgão emissor
                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[16]/app-control-field/input")
                                            protected WebElement CampoOrgaoEmissor;

                                            @FindBy(how = How.XPATH="//*[@id=\"bmb-page-body\"]/app-pf/form/div[1]/div[2]/div[2]/div/div[18]/ngx-select/div/div[2]/div")
                                            public WebElement comboPatrimonioEstimado;

                                            //Endereço

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[2]/div/input")
                                            public WebElement cepResidencia;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[4]/div/div[1]/app-control-field/ngx-select/div/div[2]/div")
                                            public WebElement comboTipoLogradouro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[4]/div/div[1]/app-control-field/ngx-select/div/div[2]/div")
                                            public WebElement nomeRua;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[5]/div/input")
                                            public WebElement numeroRua;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[6]/input")
                                            public WebElement complementoRua;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[7]/input")
                                            public WebElement bairroCliente;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[8]/input")
                                            public WebElement cidadeCliente;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[9]/ngx-select/div/div[2]/div")
                                            public WebElement comboEstadoCliente;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[10]/app-control-field/ngx-select/div/div[2]/div")
                                            public WebElement comboTipoResidencia;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[11]/div/input")
                                            public WebElement tempoDeResidencia;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[2]/div/div[13]/input")
                                            public WebElement cepComercial;

                                            //Dados Profissionais

                                            @FindBy(how = How.XPATH, xpath = ="//*[@id=\"bmb-page-body\"]/app-pf/form/div[5]/div/div[2]/app-control-field/ngx-select/div/div[2]/div")
                                            public WebElement comboNaturezaOcupacao;

                                            @FindBy(how = How.ID, id = "#admissionDate")
                                            public WebElement dataAdimissao;

                                            @FindBy(how = How.ID, id = "#salary")
                                            public WebElement salarioCliente;

                                            @FindBy(how = How.ID, id = "#extraIncomeSourceValue")
                                            public WebElement outrasRendas;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[5]/div/div[17]/app-control-field/input")
                                            public WebElement origemRendaExtra;

                                            //Relação de Veículos/Frota

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[6]/div/div[4]/div/input")
                                            public WebElement totalVeiculoProprio;

                                            //Avalista

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[7]/div/div[2]/label[1]/span[2]")
                                            public WebElement checkNaoHaveraAvalista;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[7]/div/div[2]/label[2]/span[2]")
                                            public WebElement checkHaveraAvalista;

                                            //Declaração de exposição política

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[8]/div/div[2]/label[3]/span[2]")
                                            public WebElement checkNaoDesempenhaCargoPolitico;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[8]/div/div[2]/label[2]/span[2]")
                                            public WebElement checkDesempenhaCargoPolitico;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[8]/div/div[4]/label[3]/span[2]")
                                            public WebElement checkSemParentescoPolitico;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[8]/div/div[4]/label[2]/span[2]")
                                            public WebElement checkParentescoPolitico;

                                            //Finalidade do financiamento

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[9]/div/div[2]/ngx-select/div/div[2]/div")
                                            public WebElement comboFinalidadeFinanciamento;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-pf/form/div[11]/div[2]/div/button")
                                            protected WebElement btnSalvarCliente;

                                            @FindBy(how = How.XPATH, xpath = "/html/body/div[3]/div/div[3]/button[1]")
                                            protected WebElement btnConfirmarClienteSalvo;

                                            //Veículo

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"manufactureYear\"]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboAnoFabricacao;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[1]/div[3]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboAnoModelo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"vehicleType\"]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboTipoVeiculo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"condition\"]/app-control-field/label[2]/input")
                                            protected WebElement checkEstadoVeiculoNovo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"condition\"]/app-control-field/label[3]/input")
                                            protected WebElement checkEstadoVeiculoUsado;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[1]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboMarcaVeiculo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"vehicle\"]/app-control-field/ngx-select/div/input")
                                            protected WebElement comboModeloVeiculo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[3]/app-control-field/input")
                                            protected WebElement inputValorDoBem;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[4]/app-control-field/div/input")
                                            protected WebElement inputQuantidadeBem;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[6]/app-control-field/label[2]/input")
                                            protected WebElement checkTemAcessorioAdicional;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"accessory\"]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboTipoAcessorio;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[8]/app-control-field/input")
                                            protected WebElement inputValorAcessorio;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"header\"]/div[3]/div[9]/app-control-field/div/input")
                                            protected WebElement inputQuantidadeAcessorio;

                                            //Financiamento

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"product\"]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboProduto;

                                            @FindBy(how = How.XPATH, xpath = "///*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[3]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboCampanha;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[4]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboPrazo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[5]/app-control-field/ngx-select/div/input")
                                            protected WebElement comboCarencia;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"entrance\"]/div/input")
                                            protected WebElement inputValorEntrada;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[8]/div/div[1]/app-control-field/label[2]/input")
                                            protected WebElement checkPrestamista;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[8]/div/div[1]/app-control-field/label[3]/input")
                                            protected WebElement checkSemPrestamista;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[8]/div/div[2]/app-control-field/input")
                                            protected WebElement inputGarantiaEstendida;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[9]/app-control-field/label[2]/input")
                                            protected WebElement checkSimularSeguro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[9]/app-control-field/label[3]")
                                            protected WebElement checkNaoSimularSeguro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/form/div[2]/div/div[10]/app-control-field/input")
                                            protected WebElement inputValorAproximadoSeguro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator/div/div/div/div/button[2]")
                                            protected WebElement btnGerarSimulacao;

                                            //FluxoFinanceiro

                                            @FindBy(how = How.XPATH, xpath = "<button _ngcontent-hct-c84=\"\" bmbgoogletagmanagerclick=\"\" type=\"button\" class=\"button-primary-bmb btn-continue\">CONTINUAR</button>")
                                            protected WebElement btnContinuarFluxo;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-financial-simulator-result/div[2]/div/div[3]/button")
                                            protected WebElement btnAvisoSeguro;

                                            //Seguro do Veiculo

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-insurances/form/div[1]/div[2]/div/label[2]/span[2]")
                                            protected WebElement checkDesejoSeguro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-insurances/form/div[1]/div[2]/div/label[3]/span[2]")
                                            protected WebElement checkNaoDesejoSeguro;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-insurances/form/div[5]/div[2]/div/button")
                                            protected WebElement btnContinuarSeguro;

                                            @FindBy(how = How.ID, Id = "#defaultCheck1")
                                            protected WebElement checkAutorizacao;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-proposal-detail/form/div/div[7]/button")
                                            protected WebElement btnEnviarPropostaCredito;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-proposal-detail/div/div/div[2]/app-control-field/ngx-select/div/div[2]/div")
                                            protected WebElement comboVendedor;

                                            @FindBy(how = How.XPATH, xpath = "//*[@id=\"bmb-page-body\"]/app-proposal-detail/div/div/div[4]/div[2]/button")
                                            protected WebElement btnConfirmarVendedorEnviar;

                                            @FindBy(how = How.XPATH, xpath = "/html/body/div[3]/div/div[3]/button[1]")
                                            protected WebElement btnEnvioConfirmado;

                                            //Mensagens
                                            @FindBy(how = How.CSS, css = ".error-msg")
                                            protected WebElement mensagemErro;

                                            public CadastroFichaPage(){
                                            super(Utils.getDriver());
                                            PageFactory.initElements(Utils.getDriver(), this);
                                    }

                                    public void clicarBotaoNovaFicha(){
                                    aguardarClickHabilitado(botaoNovaFicha);
                                    clicarElemento(botaoNovaFicha);
                                    }

                                    public void preencheCpfCnpj(String cpfCnpj){
                            inserirValor(campoCpfCnpj, cpfCnpj);
                    }

                    public String obterTextoMensagemErro(){
                    return obterValorTexto(mensagemErro);
                    }

                    public void preencherIdentificacaoCliente(String nome, String dataNascimento, String email, String celular, String estadoCivil){
            inserirValor(campoNome, nome);

    inserirValor(campoDataNascimento, dataNascimento);

    inserirValor(campoEmail, email);

    inserirValor(campoCelular, celular);

    selecionarElementoTexto(comboEstadoCivil, estadoCivil);
}
}
