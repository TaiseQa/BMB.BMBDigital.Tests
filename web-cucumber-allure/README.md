#~Web Automation BMB~
Este projeto visa testar o site da BMB buscando trazer melhorias continuas em seu processo de desenvolvimento.



#Pré-requisitos

# - Maven
        https://maven.apache.org/download.cgi
Após a instalação do maven, devem ser criadas duas variáveis de ambientes.

*Nas variáveis é necessário incluir o caminho de instalação do Maven.
Primeiro passo pesquisar na barra windows, "editar as variáveis do ambiente de sistema", ir em variáveis de ambiente para incluir ou editar.
*MAVEN_HOME 

*M2_HOME

*Gerado *Novo* cria a variável que é necessário incluir o caminho da pasta até a Maven

# - GIT
        https://git-scm.com/downloads

# - Java JDK
        https://www.oracle.com/java/technologies/downloads/

#Dependencias do projeto
# - Selenium-java 
       https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

# - Cucumber JVM: Java
       https://mvnrepository.com/artifact/io.cucumber/cucumber-java

#Cucumber JVM: JUnit
       https://mvnrepository.com/artifact/io.cucumber/cucumber-junit

#Estrutura do projeto
Dado que o projeto web-cucumber-allure seja importado na IDE, o primeiro passo é acessar src/main/java, e econtra-se a pasta inmetrics/automação, que dentro constam framework/steps.
Em Framework você encontra as pastas dos arquivos, pages/runners/utils.
Em steps você encontrará o arquivo de código com o passo a passo, e
na pasta resources temos a feature com o BDD.

