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
  Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Sem Dados Adicionais
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho os campos de identificação do cliente
      |Campo   | Valor |
      |CPF/CNPJ|	07241225678|
      |Nome|	Calebe Mateus Moraes|
      |Data de Nascimento|	16031955|
      |E-mail|	wesley.chrispim@inmetrics.com.br|
      |Celular|	11973633233|
    E preencho os campos de dados adicionais
      |Campo   | Valor |
      |Estado Civil	|Solteiro|
      |Sexo|	|
      |Escolaridade|	|
      |Naturalidade(País)|	|
      |Naturalidade(estado)|	|
      |Naturalidade(Cidade)|	|
      |Nome da mae|	|
      |Documento Proponente|	|
    E preencho o campo de patrimônio ""
    E <Cidade> <Estado> <Tipo de residência> <Tempo de residência (Anos)> <CEP comercial (Opcional)>
      |Campo   | Valor |
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
    E huadiaid oakwdoa diajdoiajsd
      |Campo   | Valor |
      |Natureza da ocupação|	|Profissional Liberal Autonomo|
      |Data de Admissão|	|06022017|
      |Salário/Renda Mensal|	|950000|
      |Outras rendas|	|500000|
    E <Origem> <Total de veículos próprios> <Avalista> <Desempenhou função ou cargo público relevante nos últimos 5 anos?> <Qualquer resposta positiva, descrever a função exercida>
      |Origem|	|Vendas|
      |Total de veículos próprios|	|0|
      |Avalista|	|Não havera um avalista|
      |Desempenhou função ou cargo público relevante nos últimos 5 anos?|	|Sim|
      |Qualquer resposta positiva, descrever a função exercida          |   |Presidente|
    E <Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?> <Declaração do propósito da aquisição do bem/financiamento>
      |Possui parentesco com pessoa que exerceu função ou cargo público relevante nos últimos 5 anos?|	|Nao|
      |Declaração do propósito da aquisição do bem/financiamento|	|Uso particular|
    E clico no botão <SALVAR CLIENTE>
    E esteja na segunda tela de simulação do financiamento
    E preencho os campos <Ano de fabricação> <Ano do modelo> <Tipo de veiculo> <Estado do veiculo> <Marca>
      |Ano de fabricação|	|2022|
      |Ano do modelo|	|2022|
      |Tipo de veiculo|	|Carro Passeio|
      |Estado do veiculo|	|Novo|
      |Marca|	|Mercedes Benz|
    E <Modelo de veiculo> <Valor do bem> <Quantidade> <Adicionar acessório> <Acessório>
      |Modelo de veiculo|	|GLC 43 COUPE AMG 3.0 V6 BI-TB 4MATIC Gas. 4P Blind|
      |Valor do bem|	|76357300|
      |Quantidade|	|1|
      |Adicionar acessório|	|Sim|
      |Acessório|	|4º Direcional Mecânico|
    E <Valor do acessório> <Quantidade> <Produto> <Campanha> <Prazo> <Carência>
      |Valor do acessório|	|1000|
      |Quantidade|	|1|
      |Produto|	|CDC|
      |Campanha|	|15885 - PC Taxa- 0% a.m JAN/2022|
      |Prazo|	|36|
      |Carência|	|0|
    E <Valor de entrada> <Prestamista> <Garantia Estendida> <Simular seguro do veiculo> <Valor aproximado do seguro>
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
