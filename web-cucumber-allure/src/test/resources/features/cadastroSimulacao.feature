# language: pt
# encoding: utf-8

Funcionalidade: Nova Simulação
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Simulação
  Consiga cadastrar uma nova proposta

  Contexto: Acessar Propostas e contratos
    Dado que faço login no portal BMB Digital
    E acesso a página de Propostas e Contratos

  @CadastroSimulacao @CT006
  Cenário: Cadastrar Proposta para Ser. Publ Aut/Fund Casado com Separação Total de Bens sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
    |Campo                      |Valor|
    |Produto                    |CDC|
    |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
    |Prazo                      |36|
    |Carencia                   |0|
    |Tipo de pessoa             |Fisica|
    |Valor de entrada           |54977256|
    |Prestamista                |Sim|
    |Garantia Estendida         |000|
    |Simular seguro do veiculo  |Sim|
    |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente e cônjuge
    |Campo                      |Valor|
    |Nome                       |Carla Luciana Debora da Luz|
    |Data de Nascimento         |12061990|
    |E-mail                     |wesley.chrispim@inmetrics.com.br|
    |Celular                    |11973633233|
    |Estado Civil               |Casado|
    |Regime de Casamento|	Separação Total De Bens|
    |Nome do conjuge                    |Marcela Magno|
    |CPF do conjuge                     |18707883897|
    |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais:
    |Campo                      |Valor|
    |Sexo                       |Feminino|
    |Escolaridade               |Analfabeto|
    |Status Escolaridade        |Completo|
    |Naturalidade(Pais)         |Brasileira|
    |Naturalidade(estado)       |Sao Paulo|
    |Naturalidade(Cidade)       |Barueri|
    |Nome da mae                |Fatima Alice da Luz|
    |Documento Proponente       |OAB|
    |Numero de documento        |109527665|
    |Data de expedicao          |05102012|
    |UF                         |SP|
    |Orgao Emissor              |SSP|
    |Validade                   ||
    E preencho o patrimônio estimado com "de R$2.000.000,00 até R$5.000.000,00"
    E preencho os campos de endereço
    |Campo                      |Valor|
    |CEP                        |06474280|
    |Numero                     |506|
    |Complemento                |Casa 1|
    |Tipo de residencia         |Propria|
    |Tempo de residencia (Anos) |10|
    |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
    |Campo                      |Valor|
    |Natureza da ocupacao       |Serv. Publ Aut/Fund|
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
    |Campo |Valor|
    |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
    |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
    |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
    |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT007
  Cenário: Cadastrar Proposta para Transportador Autonomo Desquitado sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Desquitado|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRA|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Transportador Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         |Escolar|
      |Cooperativa                |Sim|
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT008
  Cenário: Cadastrar Proposta para Transportador Autonomo Divorciado sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Divorciado|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRC|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Transportador Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         |Escolar|
      |Cooperativa                |Sim|
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT009
  Cenário: Cadastrar Proposta para Transportador Autonomo Viuvo sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Viuvo|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Transportador Autonomo|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         |Escolar|
      |Cooperativa                |Sim|
      |Nome da empresa            ||
      |CNPJ da empresa            ||
      |Soma do Faturamento        ||
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT010
  Cenário: Cadastrar Proposta para Uniao Estavel sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente e cônjuge
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |UniaoEstavel|
      |Regime de Casamento        ||
      |Nome do conjuge                    |Marcela Magno|
      |CPF do conjuge                     |18707883897|
      |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Outros|
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
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT0011
  Cenário: Cadastrar Proposta para Empregado no Setor Privado Viuvo sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Viuvo|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Empregado no Setor Privado|
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
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT012
  Cenário: Cadastrar Proposta para Uniao Estavel, Proprietário sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente e cônjuge
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |UniaoEstavel|
      |Regime de Casamento        ||
      |Nome do conjuge                    |Marcela Magno|
      |CPF do conjuge                     |18707883897|
      |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Proprietario|
      |Data de Admissao           |06022017|
      |Salario/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
      |Tipo de transporte         ||
      |Cooperativa                ||
      |Nome da empresa            |teste LTDA|
      |CNPJ da empresa            |90295092000177|
      |Soma do Faturamento        |1000000|
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT0013
  Cenário: Cadastrar Proposta para Ser. Publ ADM Direta Viuvo sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Viuvo|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Ser. Publ ADM Direta|
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
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT0014
  Cenário: Cadastrar Proposta para Func. Empresa Publ/Econ Mista Solteiro com Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Analfabeto|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |CRM|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                           ||
    E preencho o patrimônio estimado com "Acima de R$5.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Func. Empresa Publ/Econ Mista|
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
    E preencho o formulário de avalista
      |Campo                          |Valor|
      |Avalista                       |Havera um avalista|
      |CPF                            |26231307794|
      |Nome                           |Luiza Luna Dias|
      |Natureza da Ocupacao           |Profissional Liberal Autonomo|
      |Estado Civil                   |Divorciado|
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a funcao exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT0015
  Cenário: Cadastrar Proposta para Solteiro Estrangeiro com Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E preencho as informações de Dados adicionais para naturalidade estrangeira:
      |Campo                              |Valor|
      |Sexo                               |Masculino|
      |Escolaridade                       |Ensino Medio|
      |Status Escolaridade                |Incompleto|
      |Naturalidade(Pais)                 |Estrangeira|
      |Nome da mae                        |Joana Joao Aragao|
      |Documento Proponente               |CNH|
      |Numero de documento                |112015|
      |Data de expedicao                  |04082021|
      |Validade                           |03082031|
      |UF                                 |SP|
      |Orgao Emissor                      |SSP|
      |Validade                           ||
    E preencho o patrimônio estimado com "até R$500.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Estudante|
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
    E preencho o formulário de avalista
      |Campo                          |Valor|
      |Avalista                       |Havera um avalista|
      |CPF                            |26231307794|
      |Nome                           |Luiza Luna Dias|
      |Natureza da Ocupacao           |Profissional Liberal Autonomo|
      |Estado Civil                   |Divorciado|
    E preencho o formulário de Declaração de exposição política:
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Nao|
      |Qualquer resposta positiva, descrever a funcao exercida                                        ||
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Sim|
      |Grau de parentesco                                                                             |Pai|
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT016
  Cenário: Cadastrar Proposta para  Casado com Comunhão Total De Bens, Superior Completo,sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente e cônjuge
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Casado|
      |Regime de Casamento|	Comunhão Total De Bens|
      |Nome do conjuge                    |Marcela Magno|
      |CPF do conjuge                     |18707883897|
      |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Superior|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |RNE|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   ||
    E preencho o patrimônio estimado com "de R$500.000,00 até R$1.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Aposentado/Pensionista|
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
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Nao|
      |Qualquer resposta positiva, descrever a funcao exercida                                        ||
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Nao|
      |Grau de parentesco                                                                             ||
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CadastroSimulacao @CT017
  Cenário: Cadastrar Proposta para Casado Comunhão Parcial De Bens MBA Pós-Graduação Capitalista sem Avalista
    Dado tenha clicado no botão Nova Simulação
    Quando preencho os campos de veiculo:
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
    E preencho o formulário de Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15979 - PC Taxa - 0% a.m FEV/2022|
      |Prazo                      |36|
      |Carencia                   |0|
      |Tipo de pessoa             |Fisica|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão Gerar Simulação
    E o sistema apresenta o fluxo financeiro
    E clico em CONTINUAR
    E o sistema informa a não solicitação de seguro do veículo
    E que preencho o campo CPF com valor válido
    E que preencho os campos de identificação do cliente e cônjuge
      |Campo                      |Valor|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Casado|
      |Regime de Casamento|	Comunhão Total De Bens|
      |Nome do conjuge                    |Marcela Magno|
      |CPF do conjuge                     |18707883897|
      |Data de nascimento do conjuge      |23101994|
    E preencho as informações de Dados adicionais:
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |MBA PÓS-GRADUAÇÃO|
      |Status Escolaridade        |Completo|
      |Naturalidade(Pais)         |Brasileira|
      |Naturalidade(estado)       |Sao Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fatima Alice da Luz|
      |Documento Proponente       |Passaporte|
      |Numero de documento        |109527665|
      |Data de expedicao          |05102012|
      |UF                         |SP|
      |Orgao Emissor              |SSP|
      |Validade                   |03082031|
    E preencho o patrimônio estimado com "de R$1.000.000,00 até R$2.000.000,00"
    E preencho os campos de endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Numero                     |506|
      |Complemento                |Casa 1|
      |Tipo de residencia         |Propria|
      |Tempo de residencia (Anos) |10|
      |CEP comercial (Opcional)   ||
    E preencho o formulário de Dados profissionais:
      |Campo                      |Valor|
      |Natureza da ocupacao       |Capitalista|
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
      |Campo |Valor|
      |Desempenhou funcao ou cargo publico relevante nos ultimos 5 anos?                              |Não|
      |Qualquer resposta positiva, descrever a funcao exercida                                        ||
      |Possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos? |Sim|
      |Grau de parentesco                                                                             |Pai|
    E seleciono a Finalidade do financiamento com "Uso particular"
    E clico no botão Salvar Cliente
    E seleciono que não desejo o seguro do veículo
    E clico no botão ENVIAR PROPOSTA DE CRÉDITO
    E preencho com o vendedor "gerente"
    E clico no botão ENVIAR
    E confirmo o envio de proposta de crédito
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada