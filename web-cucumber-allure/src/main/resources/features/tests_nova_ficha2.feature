# language: pt
#encoding: utf-8

Funcionalidade: Cadastrar CPF inválido
  Como usuário do banco Mercedes digital
  vou cadastrar uma CPF invalido

  Contexto:
    Dado estar na página principal da aplicação "http://digitalqa.br800.corpintra.net/App/login"    Quando ao inserir o usuario 'atucun0f' e 'Mercedes@2022',
    E ao clicar no botão Entre
    Então fecho a ficha de campanha

  @CT001
  Cenário: CT001 Cadastro de CPF Inválido para Proposta de Pessoa Física
    Dado que eu tenha clicado no botão <NOVA FICHA>
    Quando preencho o campo CPF/CNPJ com valor inválido    "00000011111"
    Então é apresentada a mensagem "CPF/CNPJ inválido".

Funcionalidade: Cadastrar novo cliente
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  @CT002
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Sem Dados Adicionais
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho os campos <CPF/CNPJ> <Nome> <Data de Nascimento> <E-mail> <Celular>
    E <Estado Civil> <Sexo> <Escolaridade> <Naturalidade(País)> <Naturalidade(estado)>
    E <Naturalidade(Cidade)> <Nome da mae> <Documento Proponente> <Patrimonio estimado> <CEP>
    E <Tipo de Logradouro> <Nome do Logradouro> <Número> <Complemento> <Bairro>
    E <Cidade> <Estado> <Tipo de residência> <Tempo de residência (Anos)> <CEP comercial (Opcional)>
    E <Natureza da ocupação> <Data de Admissão> <Salário/Renda Mensal> <Salário/Renda Mensal> <Outras rendas>
    E <Origem> <Total de veículos próprios> <Avalista> <Desempenhou função ou cargo público relevante nos últimos 5 anos?>
    E <Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?> <Declaração do propósito da aquisição do bem/financiamento>
      |CPF/CNPJ|	|07241225678|
      |Nome|	|Calebe Mateus Moraes|
      |Data de Nascimento|	|16031955|
      |E-mail|	|wesley.chrispim@inmetrics.com.br|
      |Celular|	|11973633233|
      |Estado Civil|	|Solteiro|
      |Sexo|	||
      |Escolaridade|	||
      |Naturalidade(País)|	||
      |Naturalidade(estado)|	||
      |Naturalidade(Cidade)|	||
      |Nome da mae|	||
      |Documento Proponente|	||
      |Patrimonio estimado|	|Não deseja informar|
      |CEP|	|06474280|
      |Tipo de Logradouro|	|Alameda|
      |Nome do Logradouro|	|Inglaterra|
      |Número|	|506|
      |Complemento|	|Casa 1|
      |Bairro|	|Alphaville Residencial Um|
      |Cidade|	|Barueri|
      |Estado|	|SP|
      |Tipo de residência|	|Propria|
      |Tempo de residência (Anos)|	|10|
      |CEP comercial (Opcional)|	|Este e o endereço de correspondencia do cliente|
      |Natureza da ocupação|	|Profissional Liberal Autonomo|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Outras rendas|	|500000|
      |Origem|	|Vendas|
      |Total de veículos próprios|	|0|
      |Avalista|	|Não havera um avalista|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?|	|Sim|
      |Qualquer resposta positiva, descrever a função exercida          |   |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?|	|Nao|
      |Declaração do propósito da aquisição do bem/financiamento|	|Uso particular|
    E clico no botão <SALVAR CLIENTE>
    E esteja na segunda tela de simulação do financiamento
    E preencho os campos <Ano de fabricação> <Ano do modelo> <Tipo de veiculo> <Estado do veiculo> <Marca>
    E <Modelo de veiculo> <Valor do bem> <Quantidade> <Adicionar acessório> <Acessório>
    E <Valor do acessório> <Quantidade> <Produto> <Produto> <Prazo> <Carência>
    E <Valor de entrada> <Prestamista> <Garantia Estendida> <Simular seguro do veiculo> <Valor aproximado do seguro>
      |Ano de fabricação|	|2022|
      |Ano do modelo|	|2022|
      |Tipo de veiculo|	|Carro Passeio|
      |Estado do veiculo|	|Novo|
      |Marca|	|Mercedes Benz|
      |Modelo de veiculo|	|GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem|	|76357300|
      |Quantidade|	|1|
      |Adicionar acessório|	|Sim|
      |Acessório|	|4º Direcional Mecânico|
      |Valor do acessório|	|1000|
      |Quantidade|	|1|
      |Produto|	|CDC|
      |Campanha|	|15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo|	|36|
      |Carência|	|0|
      |Valor de entrada|	|54977256|
      |Prestamista|	|Sim|
      |Garantia Estendida|	|000|
      |Simular seguro do veiculo|	|Sim|
      |Valor aproximado do seguro|	|543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    E o sistema habilita a solicitação de seguro do veículo
    E preencho os dados de seguro <Deseja seguro do veículo> <Selecione um vendedor>
      |Deseja seguro do veículo|	|Não|
      |Selecione um vendedor|	|Gerente|
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor e clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
  Então o sistema apresenta a tela com os detalhes da proposta cadastrada


  @CT003
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico Proposta Recusada
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho os campos <CPF/CNPJ> <Nome> <Data de Nascimento> <E-mail> <Celular>
    E <Estado Civil> <Sexo> <Escolaridade> <Naturalidade(País)> <Naturalidade(estado)>
    E <Naturalidade(Cidade)> <Nome da mae> <Documento Proponente> <Patrimonio estimado> <CEP>
    E <Tipo de Logradouro> <Nome do Logradouro> <Número> <Complemento> <Bairro>
    E <Cidade> <Estado> <Tipo de residência> <Tempo de residência (Anos)> <CEP comercial (Opcional)>
    E <Natureza da ocupação> <Data de Admissão> <Salário/Renda Mensal> <Salário/Renda Mensal> <Outras rendas>
    E <Origem> <Total de veículos próprios> <Avalista> <Desempenhou função ou cargo público relevante nos últimos 5 anos?>
    E <Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?> <Declaração do propósito da aquisição do bem/financiamento>
      |CPF/CNPJ|	|31547512709|
      |Nome|	|Geraldo Tiago Moraes|
      |Data de Nascimento|	|14021960|
      |E-mail|	|wesley.chrispim@inmetrics.com.br|
      |Celular|	|11973633233|
      |Estado Civil|	|Solteiro|
      |Sexo|	|Masculino|
      |Escolaridade|	|Ensino Fundamental|
      |Status Escolaridade|	|Completo|
      |Naturalidade(País)|	|Brasil|
      |Naturalidade(estado)|	|São Paulo|
      |Naturalidade(Cidade)|	|Barueri|
      |Nome da mae|	|Josefa Maraes|
      |Documento Proponente|	|RG|
      |Numero de documento|	|186081236|
      |Data de expedição|	|06062009|
      |UF|	|SP|
      |Orgão Emissor|	|SSP|
      |Patrimonio estimado|	|Não deseja informar|
      |CEP|	|06474280|
      |Tipo de Logradouro|	|Alameda|
      |Nome do Logradouro|	|Inglaterra|
      |Número|	|506|
      |Complemento|	|Casa 1|
      |Bairro|	|Alphaville Residencial Um|
      |Cidade|	|Barueri|
      |Estado|	|SP|
      |Tipo de residência|	|Propria|
      |Tempo de residência (Anos)|	|10|
      |CEP comercial (Opcional)|	|Este e o endereço de correspondencia do cliente|
      |Natureza da ocupação|	|Profissional Liberal Autonomo|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Outras rendas|	|500000|
      |Origem|	|Vendas|
      |Total de veículos próprios|	|0|
      |Avalista|	|Não havera um avalista|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?|	|Sim|
      |Qualquer resposta positiva, descrever a função exercida          |   |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?|	|Nao|
      |Declaração do propósito da aquisição do bem/financiamento|	|Uso particular|
    E clico no botão <SALVAR CLIENTE>
    E esteja na segunda tela de simulação do financiamento
    E preencho os campos <Ano de fabricação> <Ano do modelo> <Tipo de veiculo> <Estado do veiculo> <Marca>
    E <Modelo de veiculo> <Valor do bem> <Quantidade> <Adicionar acessório> <Acessório>
    E <Valor do acessório> <Quantidade> <Produto> <Produto> <Prazo> <Carência>
    E <Valor de entrada> <Prestamista> <Garantia Estendida> <Simular seguro do veiculo> <Valor aproximado do seguro>
      |Ano de fabricação|	|2022|
      |Ano do modelo|	|2022|
      |Tipo de veiculo|	|Carro Passeio|
      |Estado do veiculo|	|Novo|
      |Marca|	|Mercedes Benz|
      |Modelo de veiculo|	|GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem|	|76357300|
      |Quantidade|	|1|
      |Adicionar acessório|	|Sim|
      |Acessório|	|4º Direcional Mecânico|
      |Valor do acessório|	|1000|
      |Quantidade|	|1|
      |Produto|	|CDC|
      |Campanha|	|15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo|	|36|
      |Carência|	|0|
      |Valor de entrada|	|54977256|
      |Prestamista|	|Sim|
      |Garantia Estendida|	|000|
      |Simular seguro do veiculo|	|Sim|
      |Valor aproximado do seguro|	|543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    E o sistema habilita a solicitação de seguro do veículo
    E preencho os dados de seguro <Deseja seguro do veículo> <Selecione um vendedor>
      |Deseja seguro do veículo|	|Não|
      |Selecione um vendedor|	|Gerente|
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor e clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada


  @CT004
  Cenário: Cadastrar Proposta para Profissional do Setor Privado Casado Estrangeiro Com Avalista
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho os campos <CPF/CNPJ> <Nome> <Data de Nascimento> <E-mail> <Celular>
    E <Estado Civil> <Sexo> <Escolaridade> <Naturalidade(País)> <Naturalidade(estado)>
    E <Naturalidade(Cidade)> <Nome da mae> <Documento Proponente> <Patrimonio estimado> <CEP>
    E <Tipo de Logradouro> <Nome do Logradouro> <Número> <Complemento> <Bairro>
    E <Cidade> <Estado> <Tipo de residência> <Tempo de residência (Anos)> <CEP comercial (Opcional)>
    E <Natureza da ocupação> <Data de Admissão> <Salário/Renda Mensal> <Salário/Renda Mensal> <Outras rendas>
    E <Origem> <Total de veículos próprios> <Avalista> <Desempenhou função ou cargo público relevante nos últimos 5 anos?>
    E <Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?> <Declaração do propósito da aquisição do bem/financiamento>
      |CPF/CNPJ|	|16567146630|
      |Nome|	|José Anthony João Aragão|
      |Data de Nascimento|	|01021977|
      |E-mail|	|wesley.chrispim@inmetrics.com.br|
      |Celular|	|11973633233|
      |Estado Civil|	|Casado|
      |Regime de Casamento|	|Comunhão Total De Bens|
      |Sexo|	|Masculino|
      |Escolaridade|	|Ensino Médio|
      |Status Escolaridade|	|Completo|
      |Naturalidade(País)|	|Estrangeira|
      |Naturalidade(estado)|	|Rio de Janeiro|
      |Naturalidade(Cidade)|	|Duque de Caxias|
      |Nome da mae|	|Joana João Aragão|
      |Documento Proponente|	|Passaporte|
      |Numero de documento|	|CL112015|
      |Data de expedição|	|04082021|
      |Validade|	|03082031|
      |UF|	|SP|
      |Orgão Emissor|	|SSP|
      |Patrimonio estimado|	|de R$500.000,00 até R$1.000.000,00|
      |CEP|	|25041580|
      |Tipo de Logradouro|	|Rua|
      |Nome do Logradouro|	|Toledo Pisa|
      |Número|	|846|
      |Complemento|	||
      |Bairro|	|Vila Teresa|
      |Cidade|	|Duque de Caxias|
      |Estado|	|RJ|
      |Tipo de residência|	|Alugada|
      |Tempo de residência (Anos)|	|5|
      |CEP comercial (Opcional)|	|Este e o endereço de correspondencia do cliente|
      |Natureza da ocupação|	|Empregado no Setor Privado|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Outras rendas|	|500000|
      |Origem|	|Aluguéis|
      |Total de veículos próprios|	|0|
      |Avalista|	|Havera um avalista|
      |CPF| |26231307794|
      |Nome| |Luiza Luna Dias|
      |Natureza da Ocupação| |Profissional Liberal Autonomo|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Estado Civil| |Solteiro|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?|	|Não|
      |Qualquer resposta positiva, descrever a função exercida          |   |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?|	|Nao|
      |Declaração do propósito da aquisição do bem/financiamento|	|Uso particular|
    E clico no botão <SALVAR CLIENTE>
    E esteja na segunda tela de simulação do financiamento
    E preencho os campos <Ano de fabricação> <Ano do modelo> <Tipo de veiculo> <Estado do veiculo> <Marca>
    E <Modelo de veiculo> <Valor do bem> <Quantidade> <Adicionar acessório> <Acessório>
    E <Valor do acessório> <Quantidade> <Produto> <Produto> <Prazo> <Carência>
    E <Valor de entrada> <Prestamista> <Garantia Estendida> <Simular seguro do veiculo> <Valor aproximado do seguro>
      |Ano de fabricação|	|2022|
      |Ano do modelo|	|2022|
      |Tipo de veiculo|	|Carro Passeio|
      |Estado do veiculo|	|Novo|
      |Marca|	|Mercedes Benz|
      |Modelo de veiculo|	|GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem|	|76357300|
      |Quantidade|	|1|
      |Adicionar acessório|	|Não|
      |Produto|	|CDC Decrescente|
      |Campanha|	|15886 - PC Taxa- 0% a.m. PPI FEV/2022|
      |Prazo|	|12|
      |Carência|	|0|
      |Valor de entrada|	|28178800|
      |Prestamista|	|Não|
      |Garantia Estendida|	|000|
      |Simular seguro do veiculo|	|Não|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    E o sistema habilita a solicitação de seguro do veículo
    E preencho os dados de seguro <Deseja seguro do veículo> <Selecione um vendedor>
      |Deseja seguro do veículo|	|Não|
      |Selecione um vendedor|	|Gerente|
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor e clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada


  @CT005
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho os campos <CPF/CNPJ> <Nome> <Data de Nascimento> <E-mail> <Celular>
    E <Estado Civil> <Sexo> <Escolaridade> <Naturalidade(País)> <Naturalidade(estado)>
    E <Naturalidade(Cidade)> <Nome da mae> <Documento Proponente> <Patrimonio estimado> <CEP>
    E <Tipo de Logradouro> <Nome do Logradouro> <Número> <Complemento> <Bairro>
    E <Cidade> <Estado> <Tipo de residência> <Tempo de residência (Anos)> <CEP comercial (Opcional)>
    E <Natureza da ocupação> <Data de Admissão> <Salário/Renda Mensal> <Salário/Renda Mensal> <Outras rendas>
    E <Origem> <Total de veículos próprios> <Avalista> <Desempenhou função ou cargo público relevante nos últimos 5 anos?>
    E <Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?> <Declaração do propósito da aquisição do bem/financiamento>
      |CPF/CNPJ|	|56696479805|
      |Nome|	|Carla Luciana Debora da Luz|
      |Data de Nascimento|	|12061990|
      |E-mail|	|wesley.chrispim@inmetrics.com.br|
      |Celular|	|11973633233|
      |Estado Civil|	|Solteiro|
      |Sexo|	|Feminino|
      |Escolaridade|	|Ensino Fundamental|
      |Status Escolaridade|	|Completo|
      |Naturalidade(País)|	|Brasil|
      |Naturalidade(estado)|	|São Paulo|
      |Naturalidade(Cidade)|	|Barueri|
      |Nome da mae|	|Fátima Alice da Luz|
      |Documento Proponente|	|RG|
      |Numero de documento|	|109527665|
      |Data de expedição|	|05/10/2012|
      |UF|	|SP|
      |Orgão Emissor|	|SSP|
      |Patrimonio estimado|	|Não deseja informar|
      |CEP|	|06474280|
      |Tipo de Logradouro|	|Alameda|
      |Nome do Logradouro|	|Inglaterra|
      |Número|	|506|
      |Complemento|	|Casa 1|
      |Bairro|	|Alphaville Residencial Um|
      |Cidade|	|Barueri|
      |Estado|	|SP|
      |Tipo de residência|	|Propria|
      |Tempo de residência (Anos)|	|10|
      |CEP comercial (Opcional)|	|Este e o endereço de correspondencia do cliente|
      |Natureza da ocupação|	|Profissional Liberal Autonomo|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Outras rendas|	|500000|
      |Origem|	|Vendas|
      |Total de veículos próprios|	|0|
      |Avalista|	|Não havera um avalista|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?|	|Sim|
      |Qualquer resposta positiva, descrever a função exercida          |   |Presidente|
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?|	|Nao|
      |Declaração do propósito da aquisição do bem/financiamento|	|Uso particular|
    E clico no botão <SALVAR CLIENTE>
    E esteja na segunda tela de simulação do financiamento
    E preencho os campos <Ano de fabricação> <Ano do modelo> <Tipo de veiculo> <Estado do veiculo> <Marca>
    E <Modelo de veiculo> <Valor do bem> <Quantidade> <Adicionar acessório> <Acessório>
    E <Valor do acessório> <Quantidade> <Produto> <Produto> <Prazo> <Carência>
    E <Valor de entrada> <Prestamista> <Garantia Estendida> <Simular seguro do veiculo> <Valor aproximado do seguro>
      |Ano de fabricação|	|2022|
      |Ano do modelo|	|2022|
      |Tipo de veiculo|	|Carro Passeio|
      |Estado do veiculo|	|Novo|
      |Marca|	|Mercedes Benz|
      |Modelo de veiculo|	|GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem|	|76357300|
      |Quantidade|	|1|
      |Adicionar acessório|	|Sim|
      |Acessório|	|4º Direcional Mecânico|
      |Valor do acessório|	|1000|
      |Quantidade|	|1|
      |Produto|	|CDC|
      |Campanha|	|15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo|	|36|
      |Carência|	|0|
      |Valor de entrada|	|54977256|
      |Prestamista|	|Sim|
      |Garantia Estendida|	|000|
      |Simular seguro do veiculo|	|Sim|
      |Valor aproximado do seguro|	|543373|
    E clico no botão <GERAR SIMULAÇÃO>
    E o sistema apresenta o fluxo financeiro
    E clico em <CONTINUAR>
    E o sistema habilita a solicitação de seguro do veículo
    E preencho os dados de seguro <Deseja seguro do veículo> <Selecione um vendedor>
      |Deseja seguro do veículo|	|Não|
      |Selecione um vendedor|	|Gerente|
    E clico no botão <ENVIAR PROPOSTA DE CRÉDITO>
    E seleciono o vendedor e clico no botão <ENVIAR>
    E esteja na janela de mensagem de sucesso clico no botão <OK>
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada