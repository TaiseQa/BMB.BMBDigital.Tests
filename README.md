# Software e Configuração:
- Neste projeto estou fazendo automação de testes web usando [Java](https://www.java.com/pt-BR/) como linguagem de programação, [Maven](https://mvnrepository.com/) como gerenciador de dependencias, [Cucumber](https://cucumber.io/) para interpretação de Scenarios, Steps e construção da estrutura.
	
# Repositorio:
- [Repositorio TFS](http://tfs.br800.corpintra.net:8080/tfs/BMB/BancoMercedesBenz/_git/BMB.BMBDigital.Tests)

# Os testes estão rodando nos ambientes:
	- DEV
	- QA

## Options
* `AMB` - Em qual ambiente o teste deve ser executado
  * `ti`
  * `qa` <- default

## Executar testes via termial
*	`$ mvn test` <- Comando para executar todos os testes
*	`$ mvn test -Dcucumber.options="--tags @AprovaUploadBanco"` <- Comando para executar um testes especifico
*	`$ mvn clean` 
* `$ mvn clean test`

## BDD Fluxo Completo de Aprovação de proposta
	- @AprovaUploadBanco
	- Cenario: Cadastro pessoa fisica Solteiro
	-  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	-    | Campo                   | Valor                         |
	-    | EstadoCivil             | Solteiro                      |
	-    | RegimeCivil             | Comunhão Parcial De Bens      |
	-    | TipoResidencia          | Alugada                       |
	-    | NaturezaOcupacao        | Outros                        |
	-    | FinalidadeFinanciamento | Uso particular		            |
	-  Quando efetuo cadastro Simulação com sucesso usando:
	-    | Campo          | Valor                                      			|
	-    | AnoFabricacao  | 2021                                       			|
	-    | AnoModelo      | 2021                                       			|
	-    | TipoVeiculo    | Carro Passeio			                              |
	-    | EstadoVeiculo  | Novo                                       			|
	-    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico 				|
	-    | Produto        | CDC                                        			|
	-    | Campanha       | 15104 - PC Taxa 0,59% PPI JUL/2021								|
	-    | Prazo          | 12                                         			|
	-    | PrestamistaPPI | Sim                                        			|
	-  Quando efetuo cadastro Seguros com sucesso usando:
	-    | Campo               | Valor |
	-    | SeguroVeiculo       | Não   |
	-    | SeguroFinanciamento | Não   |
	-  Então finalizo Proposta com sucesso Aprova Banco











