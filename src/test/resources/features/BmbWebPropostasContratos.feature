 	#language: pt
@AllTest
Funcionalidade: Testar Funcionalidades Propostas e Contratos

	Contexto: Acessar Propostas e contratos
		Dado que faço login no portal BMB Digital
		Quando acesso a pagina de "Propostas e contratos"
		
		
	@75996
	Cenario: Cadastro pessoa fisica Solteiro
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Solteiro				   				 |
			| RegimeCivil			  			| Comunhão Parcial De Bens   |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
	
	@75997
	Cenario: Cadastro pessoa fisica Casado com Comunhão Total De Bens
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Casado					   				 |
			| RegimeCivil			  			| Comunhão Total De Bens		 |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
	
	@76005
	Cenario: Cadastro pessoa fisica Casado com Comunhão Parcial De Bens
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Casado					   				 |
			| RegimeCivil			  			| Comunhão Parcial De Bens	 |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
	
	@76006
	Cenario: Cadastro pessoa fisica Casado com Separação Total De Bens
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Casado					   				 |
			| RegimeCivil			  			| Separação Total De Bens    |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
		
	@76001
	Cenario: Cadastro pessoa fisica Divorciado
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Divorciado					   		 |
			| RegimeCivil			  			| Comunhão Parcial De Bens   |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
		
	@76002
	Cenario: Cadastro pessoa fisica Desquitado
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Desquitado					   		 |
			| RegimeCivil			  			| Comunhão Parcial De Bens   |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
		
	@76003
	Cenario: Cadastro pessoa fisica Viuvo
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| Viuvo     					   		 |
			| RegimeCivil			  			| Comunhão Parcial De Bens   |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
		
	@76004
	Cenario: Cadastro pessoa fisica Uniao Estavel
		Quando efetuo cadastro Ficha Cadastral com sucesso usando:
			| Campo					  				| Valor					   					 |
			| EstadoCivil			  			| UniaoEstavel				   		 |
			| RegimeCivil			  			| Comunhão Parcial De Bens   |
			| TipoResidencia		  		| Alugada					   				 |
			| NaturezaOcupacao		  	| Empregado no Setor Privado |
			| FinalidadeFinanciamento | Uso particular			   		 |
		Quando efetuo cadastro Simulação com sucesso usando:
			| Campo					 | Valor					   					 							 |
			| AnoFabricacao	 | 2021											 								 |
			| AnoModelo 		 | 2021											 								 |
			| TipoVeiculo 	 | Carro Passeio 						 								 |
			| EstadoVeiculo	 | Novo											 								 |
			| ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
			| Produto 			 | CDC																			 |
			| Campanha			 | 14491 - PC Taxa 0,59% JUN/2021						 |
			| Prazo 				 | 12																				 |
			| Carencia			 | 0																				 |
			| PrestamistaPPI | Não																			 |
		Quando efetuo cadastro Seguros com sucesso usando:
			| Campo 							| Valor |
			| SeguroVeiculo 			| Sim		|
			| SeguroFinanciamento |	Não		|
		Então finalizo Proposta com sucesso
		
	@76345
	Cenario: Cadastro pessoa fisica Solteiro - Empregado no Setor Privado
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                      |
	    | EstadoCivil             | Solteiro                   |
	    | RegimeCivil             | Comunhão Parcial De Bens   |
	    | TipoResidencia          | Alugada                    |
	    | NaturezaOcupacao        | Empregado no Setor Privado |
	    | FinalidadeFinanciamento | Uso particular             |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
			
	@76346
	Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Profissional Liberal/Autonomo |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	 
	 @76347
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Proprietário                  |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
		
	@76349
	Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Serv. Publ ADM Direta         |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
		
	@76350
	Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Serv. Publ Aut/Fund           |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso	
		
	@76351
	Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Func. Empresa Públ/Econ Mista |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	  
	 @76352
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Capitalista                   |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	  
	@76353
	Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Aposentado/Pensionista        |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	  
	 @76354
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Transportador Autônomo        |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	  
	 @76355
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Estudante                     |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso
	 
	 @76356 
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Outros                        |
	    | FinalidadeFinanciamento | Uso particular                |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                     |
	    | AnoFabricacao  | 2021                                      |
	    | AnoModelo      | 2021                                      |
	    | TipoVeiculo    | Carro Passeio                             |
	    | EstadoVeiculo  | Novo                                      |
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico |
	    | Produto        | CDC                                       |
	    | Campanha       | 14491 - PC Taxa 0,59% JUN/2021            |
	    | Prazo          | 12                                        |
	    | PrestamistaPPI | Não                                       |
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Sim   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso 
	  
	 
	 @AprovaUploadBanco
	 Cenario: Cadastro pessoa fisica Solteiro
	  Quando efetuo cadastro Ficha Cadastral com sucesso usando:
	    | Campo                   | Valor                         |
	    | EstadoCivil             | Solteiro                      |
	    | RegimeCivil             | Comunhão Parcial De Bens      |
	    | TipoResidencia          | Alugada                       |
	    | NaturezaOcupacao        | Outros                        |
	    | FinalidadeFinanciamento | Uso particular		            |
	  Quando efetuo cadastro Simulação com sucesso usando:
	    | Campo          | Valor                                      			|
	    | AnoFabricacao  | 2021                                       			|
	    | AnoModelo      | 2021                                       			|
	    | TipoVeiculo    | Carro Passeio			                              |
	    | EstadoVeiculo  | Novo                                       			|
	    | ModeloVeiculo  | A 200 SEDAN ADVANCE 1.3 TB Gas. 4P Basico 				|
	    | Produto        | CDC                                        			|
	    | Campanha       | 15104 - PC Taxa 0,59% PPI JUL/2021								|
	    | Prazo          | 12                                         			|
	    | PrestamistaPPI | Sim                                        			|
	  Quando efetuo cadastro Seguros com sucesso usando:
	    | Campo               | Valor |
	    | SeguroVeiculo       | Não   |
	    | SeguroFinanciamento | Não   |
	  Então finalizo Proposta com sucesso Aprova Banco
	  
	  
	  
	  
	  
	  