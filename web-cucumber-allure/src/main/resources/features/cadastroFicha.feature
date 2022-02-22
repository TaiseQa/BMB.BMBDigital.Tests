# language: pt
# encoding: utf-8

Funcionalidade: Nova Ficha
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  Contexto: Acessar Propostas e contratos
    Dado que faço login no portal BMB Digital
    Quando acesso a pagina de Propostas e Contratos

  @CT001
  Cenário: Validar CPF Inválido para Proposta de Pessoa Física
    Dado que eu tenha clicado no botão Nova Ficha
    Quando preencho o campo CPF ou CNPJ com valor inválido "00000011111"
    Então é apresentada a mensagem "CPF/CNPJ inválido".

    
  @CT002
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando Preencho o formulário: Ficha Cadastral - identificação do cliente
      |Campo                      |Valor|
      |CPF/CNPJ                   |56696479805|
      |Nome                       |Carla Luciana Debora da Luz|
      |Data de Nascimento         |12061990|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E Preencho o formulário: Dados adicionais - Identificação
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Ensino Fundamental|
      |Status Escolaridade        |Completo|
      |Naturalidade(País)         |Brasil|
      |Naturalidade(estado)       |São Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fátima Alice da Luz|
      |Documento Proponente       |RG|
      |Numero de documento        |109527665|
      |Data de expedição          |05102012|
      |UF                         |SP|
      |Orgão Emissor              |SSP|
    E Preencho o formulário: Dados adicionais - Patrimônio
      |Campo                      |Valor|
      |Patrimonio estimado        |Não deseja informar|
    E Preencho o formulário: Endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Tipo de Logradouro         |Alameda|
      |Nome do Logradouro         |Inglaterra|
      |Número                     |506|
      |Complemento                |Casa 1|
      |Bairro                     |Alphaville Residencial Um|
      |Cidade                     |Barueri|
      |Estado                     |SP|
      |Tipo de residência         |Propria|
      |Tempo de residência (Anos) |10|
      |CEP comercial (Opcional)   |Este e o endereço de correspondencia do cliente|
    E Preencho o formulário: Dados profissionais
      |Campo                      |Valor|
      |Natureza da ocupação       |Profissional Liberal Autonomo|
      |Data de Admissão           |06022017|
      |Salário/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
      |Atividade principal        |Q.A|
    E Preencho o formulário: Relação de Veículos/Frota
      |Campo                      |Valor|
      |Total de veículos próprios |0|
    E Preencho o formulário: Avalista
      |Campo                      |Valor|
      |Avalista                   |Não havera um avalista|
    E Preencho o formulário: Declaração de exposição política
      |Campo                                                                                          |Valor|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a função exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos? |Nao|
    E Preencho o formulário: Finalidade do financiamento
      |Campo                                                                                          |Valor|
      |Declaração do propósito da aquisição do bem/financiamento                                      |Uso particular|
    E clico no botão <SALVAR CLIENTE>
    Então o sistema habilita a próxima tela de: simulação do financiamento

    E Preencho o formulário: Veículo
      |Campo                      |Valor|
      |Ano de fabricação          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessório        |Sim|
      |Acessório                  |4º Direcional Mecânico|
      |Valor do acessório         |1000|
      |Quantidade                 |1|
    E Preencho o formulário: Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                      |36|
      |Carência                   |0|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Seguros

    E Preencho o formulário: Seguro do Veículo
      |Campo                      |Valor|
      |Deseja seguro do veículo   |Não|
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Proposta

    E Flego a autorização dos termos juridicos de contactação para ofertas por telefone e SMS
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor
      |Campo                      |Valor|
      |Selecione um vendedor      |Gerente|
    E clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema habilita a próxima tela de: detalhes da proposta cadastrada


    @CT003
  Cenário: Cadastrar Proposta para Profissional do Setor Privado Casado Estrangeiro Com Avalista
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando Preencho o formulário: Ficha Cadastral - identificação do cliente
      |Campo                      |Valor|
      |CPF/CNPJ                   |16567146630|
      |Nome                       |José Anthony João Aragão|
      |Data de Nascimento         |01021977|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Casado|
    E Preencho o formulário: Dados adicionais - Identificação
      |Campo                      |Valor|
      |Sexo                       |Masculino|
      |Escolaridade               |Ensino Médio|
      |Status Escolaridade        |Completo|
      |Naturalidade(País)         |Estrangeira|
      |Naturalidade(estado)       ||
      |Naturalidade(Cidade)       ||
      |Nome da mae                |Joana João Aragão|
      |Documento Proponente       |Passaporte|
      |Numero de documento        |CL112015|
      |Data de expedição          |04082021|
      |Validade                   |03082031|
      |UF                         |SP|
      |Orgão Emissor              |SSP|
    E Preencho o formulário: Dados adicionais - Patrimônio
      |Campo                      |Valor|
      |Patrimonio estimado        |de R$500.000,00 até R$1.000.000,00|
    E Preencho o formulário: Endereço
      |Campo                      |Valor|
      |CEP                        |25041580|
      |Tipo de Logradouro         |Rua|
      |Nome do Logradouro         |Toledo Pisa|
      |Número                     |846|
      |Complemento                ||
      |Bairro                     |Vila Teresa|
      |Cidade                     |Duque de Caxias|
      |Estado                     |RJ|
      |Tipo de residência         |Alugada|
      |Tempo de residência (Anos) |5|
      |CEP comercial (Opcional)   |Este e o endereço de correspondencia do cliente|
    E Preencho o formulário: Dados profissionais
      |Campo                      |Valor|
      |Natureza da ocupação       |Empregado no Setor Privado|
      |Data de Admissão           |06022017|
      |Salário/Renda Mensal       |950000|
      |Outras rendas              |500000|
       |Origem                    |Aluguéis|
      |Atividade principal        |Q.A|
    E Preencho o formulário: Relação de Veículos/Frota
      |Campo                      |Valor|
      |Total de veículos próprios |0|
    E Preencho o formulário: Avalista
      |Campo                      |Valor|
      |Avalista                   |Havera um avalista|
      |CPF                        |26231307794|
      |Nome                       |Luiza Luna Dias|
      |Natureza da Ocupação       |Profissional Liberal Autonomo|
      |Estado Civil               |Solteiro|
    E Preencho o formulário: Declaração de exposição política
      |Campo                                                                                          |Valor|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a função exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos? |Nao|
    E Preencho o formulário: Finalidade do financiamento
      |Campo                                                                                          |Valor|
      |Declaração do propósito da aquisição do bem/financiamento                                      |Uso particular|
    E clico no botão <SALVAR CLIENTE>
    Então o sistema habilita a próxima tela de: simulação do financiamento

    E Preencho o formulário: Veículo
      |Campo                      |Valor|
      |Ano de fabricação          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessório        |Não|
      
    E Preencho o formulário: Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                      |12|
      |Carência                   |0|
      |Valor de entrada           |28178800|
      |Prestamista                |Não|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Não|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Seguros

    E Preencho o formulário: Seguro do Veículo
      |Campo                      |Valor|
      |Deseja seguro do veículo   |Não|
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Proposta

    E Flego a autorização dos termos juridicos de contactação para ofertas por telefone e SMS
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor
      |Campo                      |Valor|
      |Selecione um vendedor      |Gerente|
    E clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema habilita a próxima tela de: detalhes da proposta cadastrada

    
    @CT004
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico Proposta Recusada
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando Preencho o formulário: Ficha Cadastral - identificação do cliente
      |Campo                      |Valor|
      |CPF/CNPJ                   |31547512709|
      |Nome                       |Geraldo Tiago Moraes|
      |Data de Nascimento         |14021960|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E Preencho o formulário: Dados adicionais - Identificação
      |Campo                      |Valor|
      |Sexo                       |Masculino|
      |Escolaridade               |Ensino Fundamental|
      |Status Escolaridade        |Completo|
      |Naturalidade(País)         |Brasil|
      |Naturalidade(estado)       |São Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Fátima Alice da Luz|
      |Documento Proponente       |RG|
      |Numero de documento        |186081236|
      |Data de expedição          |06062009|
      |UF                         |SP|
      |Orgão Emissor              |SSP|
    E Preencho o formulário: Dados adicionais - Patrimônio
      |Campo                      |Valor|
      |Patrimonio estimado        |Não deseja informar|
    E Preencho o formulário: Endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Tipo de Logradouro         |Alameda|
      |Nome do Logradouro         |Inglaterra|
      |Número                     |506|
      |Complemento                |Casa 1|
      |Bairro                     |Alphaville Residencial Um|
      |Cidade                     |Barueri|
      |Estado                     |SP|
      |Tipo de residência         |Propria|
      |Tempo de residência (Anos) |10|
      |CEP comercial (Opcional)   |Este e o endereço de correspondencia do cliente|
    E Preencho o formulário: Dados profissionais
      |Campo                      |Valor|
      |Natureza da ocupação       |Profissional Liberal Autonomo|
      |Atividade principal        |Agricultor|
      |Data de Admissão           |06022017|
      |Salário/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem									    |Vendas|

    E Preencho o formulário: Relação de Veículos/Frota
      |Campo                      |Valor|
      |Total de veículos próprios |0|
    E Preencho o formulário: Avalista
      |Campo                      |Valor|
      |Avalista                   |Não havera um avalista|
    E Preencho o formulário: Declaração de exposição política
      |Campo                                                                                          |Valor|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a função exercida                                        |(?)|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos? |Nao|
    E Preencho o formulário: Finalidade do financiamento
      |Campo                                                                                          |Valor|
      |Declaração do propósito da aquisição do bem/financiamento                                      |Uso particular|
    E clico no botão <SALVAR CLIENTE>
    Então o sistema habilita a próxima tela de: simulação do financiamento

    E Preencho o formulário: Veículo
      |Campo                      |Valor|
      |Ano de fabricação          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessório        |Sim|
      |Acessório                  |4º Direcional Mecânico|
      |Valor do acessório         |1000|
      |Quantidade                 |1|
    E Preencho o formulário: Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                      |36|
      |Carência                   |0|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Seguros

    E Preencho o formulário: Seguro do Veículo
      |Campo                      |Valor|
      |Deseja seguro do veículo   |Não|
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Proposta

    E Flego a autorização dos termos juridicos de contactação para ofertas por telefone e SMS
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor
      |Campo                      |Valor|
      |Selecione um vendedor      |Gerente|
    E clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema habilita a próxima tela de: detalhes da proposta cadastrada


    @CT005
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Sem Dados Adicionais
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando Preencho o formulário: Ficha Cadastral - identificação do cliente
      |Campo                      |Valor|
      |CPF/CNPJ                   |75391759749|
      |Nome                       |Calebe Mateus Moraes|
      |Data de Nascimento         |16031955|
      |E-mail                     |wesley.chrispim@inmetrics.com.br|
      |Celular                    |11973633233|
      |Estado Civil               |Solteiro|
    E Preencho o formulário: Dados adicionais - Identificação
      |Campo                      |Valor|
      |Sexo                       |Feminino|
      |Escolaridade               |Ensino Fundamental|
      |Status Escolaridade        |Completo|
      |Naturalidade(País)         |Brasil|
      |Naturalidade(estado)       |São Paulo|
      |Naturalidade(Cidade)       |Barueri|
      |Nome da mae                |Maria de Lourdes Moraes|
      |Documento Proponente       |RG|
      |Numero de documento        |403298428|
      |Data de expedição          |05052012|
      |UF                         |SP|
      |Orgão Emissor              |SSP|
    E Preencho o formulário: Dados adicionais - Patrimônio
      |Campo                      |Valor|
      |Patrimonio estimado        |Não deseja informar|
    E Preencho o formulário: Endereço
      |Campo                      |Valor|
      |CEP                        |06474280|
      |Tipo de Logradouro         |Alameda|
      |Nome do Logradouro         |Inglaterra|
      |Número                     |506|
      |Complemento                |Casa 1|
      |Bairro                     |Alphaville Residencial Um|
      |Campo                      |Valor|
      |Cidade                     |Barueri|
      |Estado                     |SP|
      |Tipo de residência         |Propria|
      |Tempo de residência (Anos) |10|
      |CEP comercial (Opcional)   |Este e o endereço de correspondencia do cliente|
    E Preencho o formulário: Dados profissionais
      |Campo                      |Valor|
      |Natureza da ocupação       |Profissional Liberal Autonomo|
      |Data de Admissão           |06022017|
      |Salário/Renda Mensal       |950000|
      |Outras rendas              |500000|
      |Origem                     |Vendas|
    E Preencho o formulário: Relação de Veículos/Frota
      |Campo                      |Valor|
      |Total de veículos próprios |0|
    E Preencho o formulário: Avalista
      |Campo                      |Valor|
      |Avalista                   |Não havera um avalista|
    E Preencho o formulário: Declaração de exposição política
      |Campo                                                                                          |Valor|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?                              |Sim|
      |Qualquer resposta positiva, descrever a função exercida                                        |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos? |Nao|
    E Preencho o formulário: Finalidade do financiamento
      |Campo                                                                                          |Valor|
      |Declaração do propósito da aquisição do bem/financiamento                                      |Uso particular|
    E clico no botão <SALVAR CLIENTE>
    Então o sistema habilita a próxima tela de: simulação do financiamento

    E Preencho o formulário: Veículo
      |Campo                      |Valor|
      |Ano de fabricação          |2022|
      |Ano do modelo              |2022|
      |Tipo de veiculo            |Carro Passeio|
      |Estado do veiculo          |Novo|
      |Marca                      |Mercedes Benz|
      |Modelo de veiculo          |GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem               |76357300|
      |Quantidade                 |1|
      |Adicionar acessório        |Sim|
      |Acessório                  |4º Direcional Mecânico|
      |Valor do acessório         |1000|
      |Quantidade                 |1|
    E Preencho o formulário: Financiamento
      |Campo                      |Valor|
      |Produto                    |CDC|
      |Campanha                   |15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo                      |36|
      |Carência                   |0|
      |Valor de entrada           |54977256|
      |Prestamista                |Sim|
      |Garantia Estendida         |000|
      |Simular seguro do veiculo  |Sim|
      |Valor aproximado do seguro |543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Seguros

    E Preencho o formulário: Seguro do Veículo
      |Campo                      |Valor|
      |Deseja seguro do veículo   |Não|
    E clico em <CONTINUAR>
    Então o sistema habilita a próxima tela de: Proposta

    E Flego a autorização dos termos juridicos de contactação para ofertas por telefone e SMS
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor
      |Campo                      |Valor|
      |Selecione um vendedor      |Gerente|
    E clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema habilita a próxima tela de: detalhes da proposta cadastrada