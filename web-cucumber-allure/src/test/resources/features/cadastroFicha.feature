# language: pt
# encoding: utf-8

Funcionalidade: Nova Ficha
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  Contexto: Acessar Propostas e contratos
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    E clico no botao Nova Ficha

  @CadastroFicha @CT001
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico
    Dado que preencho o campo CPF com valor válido
    Quando que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Ensino Fundamental|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |RG|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho os campos de endereço sem cep comercial
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Profissional Liberal Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         ||
      |Cooperativa                ||
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo                                                                                          |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E quando estou na tela de simulação do financiamento
    E preencho os campos de veiculo:
      |Campo                      |Valor|
      |Ano de fabricacao          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessorio        |Sim|
      |Acessorio                  |4 Direcional Mecanico|
      |Valor do acessorio         |1000|
      |Quantidade                 |1|
    E preencho o formulário de Financiamento sem o tipo de pessoa
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

#  @CadastroFicha @CT002
#  Cenário: Validar CPF Inválido para Proposta de Pessoa Física
#    Dado que preencho o campo CPF ou CNPJ com valor inválido "00000011111"
#    Então é apresentada a mensagem "CPF/CNPJ inválido".

  @CadastroFicha @CT003
  Cenário: Cadastrar Proposta para Profissional do Setor Privado Casado Estrangeiro Com Avalista
    Dado que preencho o campo CPF com valor válido
    Quando que preencho os campos de identificação do cliente e cônjuge
      |Campo|	Valor|
      |Nome|	Jose Anthony Joao Aragao|
      |Data de Nascimento|	01021977|
      |E-mail|	wesley.chrispim@inmetrics.com.br|
      |Celular|	11973633233|
      |Estado Civil|	Casado|
      |Regime de Casamento|	Comunhao Total De Bens|
      |Nome do conjuge                    |Marcela Magno|
      |CPF do conjuge                     |18707883897|
      |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais para naturalidade estrangeira:
      |Campo                              |Valor|
      |Sexo                               |Masculino|
      |Escolaridade                       |Ensino Medio|
      |Status Escolaridade                |Completo|
      |Naturalidade(Pais)                 |Estrangeira|
      |Nome da mae                        |Joana Joao Aragao|
      |Documento Proponente               |Passaporte|
      |Numero de documento                |CL112015|
      |Data de expedicao                  |04082021|
      |Validade                           |03082031|
      |UF                                 |SP|
      |Orgao Emissor                      |SSP|
    E preencho o patrimônio estimado com "de R$500.000,00 até R$1.000.000,00"
    E preencho os campos de endereço sem cep comercial
      |Campo                              |Valor|
      |CEP                                |25041580|
      |Numero                             |846|
      |Complemento                        |casa 1|
      |Tipo de residencia                 |Alugada|
      |Tempo de residencia (Anos)         |5|
    E preencho o formulário de Dados profissionais:
      |Campo                              |Valor|
      |Natureza da ocupacao               |Empregado no Setor Privado|
      |Data de Admissao                   |06022017|
      |Salario/Renda Mensal               |950000|
      |Outras rendas                      |500000|
      |Origem                             |Alugueis|
      |Atividade principal                |Q.A|
      |Tipo de transporte         ||
      |Cooperativa                ||
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E seleciono total de veículos próprios "0"
    E preencho o formulário de avalista
      |Campo                          |Valor|
      |Avalista                       |Havera um avalista|
      |CPF                            |26231307794|
      |Nome                           |Luiza Luna Dias|
      |Natureza da Ocupacao           |Profissional Liberal Autonomo|
      |Estado Civil                   |Solteiro|
    E preencho o formulário de Declaração de exposição política:
      |Campo                                                                                         |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                             |Nao|
      |Qualquer resposta positiva, descrever a funcao exercida                                       ||
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos?|Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    Então quando estou na tela de simulação do financiamento
    E preencho os campos de veiculo:
      |Campo                        |Valor|
      |Ano de fabricacao            |2022|
      |Ano do modelo                |2022|
      |Tipo de veiculo              |Carro Passeio|
      |Estado do veiculo            |Novo|
      |Marca                        |Mercedes Benz|
      |Modelo de veiculo            |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem                 |76357300|
      |Quantidade                   |1|
      |Adicionar acessorio          |Nao|
      |Acessorio                    ||
      |Valor do acessorio           ||
      |Quantidade                   ||
    E preencho o formulário de Financiamento sem o tipo de pessoa
      |Campo                        |Valor|
      |Produto                      |CDC Decrescente|
      |Campanha                     |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                        |12|
      |Carencia                     |0|
      |Valor de entrada             |38799250|
      |Prestamista                  |Nao|
      |Garantia Estendida           |000|
      |Simular seguro do veiculo    |Nao|
      |Valor aproximado do seguro   ||
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroFicha @CT004
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico Proposta Recusada
    Dado que preencho o campo CPF com valor válido
    Quando que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Geraldo Tiago Moraes|
      |Data de Nascimento         |14021960|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Masculino|
      |Escolaridade               |Ensino Fundamental|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |RG|
      |Numero de documento        |186081236|
      |Data de expedicao          |06062009|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho os campos de endereço sem cep comercial
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Profissional Liberal Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem					  |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         ||
      |Cooperativa                ||
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo                                                                                          |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    Então quando estou na tela de simulação do financiamento
    E preencho os campos de veiculo:
      |Campo                      |Valor|
      |Ano de fabricacao          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessorio        |Sim|
      |Acessorio                  |4 Direcional Mecanico|
      |Valor do acessorio         |1000|
      |Quantidade                 |1|
    E preencho o formulário de Financiamento sem o tipo de pessoa
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroFicha @CT005
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Sem Dados Adicionais
    Dado que preencho o campo CPF com valor válido
    Quando que preencho os campos de identificação do cliente
      |Campo   | Valor |
      |Nome|	Calebe Mateus Moraes|
      |Data de Nascimento|	16031955|
      |E-mail|	wesley.chrispim@inmetrics.com.br|
      |Celular|	11973633233|
      |Estado Civil |   Solteiro   |
    E preencho os campos de endereço
      |Campo | Valor|
      |CEP|	06474280|
      |Numero|	506|
      |Complemento|	Casa 1|
      |Tipo de residencia|	Propria|
      |Tempo de residencia (Anos)|	10|
      |CEP comercial (Opcional)| 05315020|
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Profissional Liberal Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         ||
      |Cooperativa                ||
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo                                                                                         |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                             |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                       |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos?|Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    Então quando estou na tela de simulação do financiamento
    E preencho os campos de veiculo:
      |Campo                          |Valor|
      |Ano de fabricacao              |2022|
      |Ano do modelo                  |2022|
      |Tipo de veiculo                |Carro Passeio|
      |Estado do veiculo              |Novo|
      |Marca                          |Mercedes Benz|
      |Modelo de veiculo              |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem                   |76357300|
      |Quantidade                     |1|
      |Adicionar acessorio            |Sim|
      |Acessorio                      |4 Direcional Mecanico|
      |Valor do acessorio             |1000|
      |Quantidade                     |1|
    E preencho o formulário de Financiamento sem o tipo de pessoa
      |Campo                          |Valor|
      |Produto                        |CDC|
      |Campanha                       |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                          |36|
      |Carencia                       |0|
      |Valor de entrada               |54977256|
      |Prestamista                    |Sim|
      |Garantia Estendida             |000|
      |Simular seguro do veiculo      |Sim|
      |Valor aproximado do seguro     |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada