# language: pt
# encoding: utf-8

@NovaFicha @emProducao
Funcionalidade: Nova Ficha
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  Contexto: Acessar Propostas e contratos
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    E clico no botao Nova Ficha


  @CT01
  Cenario: cadastrar proposta de caminhão novo sem acessório finame taxa fixa sem seguro para solteiro estudante com dados adicionais informando patrimônio sem avalista sem exposição politica
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Lucas dos santos"
    E preencho a data de nascimento "15/11/1987"
    E preencho o campo email "teste@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Solteiro"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae "Sonia regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no combo patrimonio escolho "de R$500.000,00 até R$1.000.000,00"
    E no campo endereco informo o cep "59114031"
    E informo o numero da rua "112"
    E no combo tipo de residencia escolho "Alugada"
    E informo o tempo de residencia "5"
    E no combo natureza da ocupacao escolho "Estudante"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "1316 /46 ACCELO 6X2 3e Dies. 2P Basico"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "FINAME TAXA FIXA - MPME ÔNIBUS E CAMINHÕES"
    E no combo campanha escolho "16721 - FINAME Taxa Fixa - A JUL/2022"
    E no combo prazo escolho "57" e carencia "3"
    E informo o valor de entrada "100.000,00"
    E na opcao prestamista escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT02
  Cenario: cadastrar proposta de carro passeio com acessorios CDC  com seguro para casado estrangeiro em comunhão de bens com dados adicionais não informando pratrimonio empregado no setor privado com exposição politica
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Joao pedro qa"
    E preencho a data de nascimento "10/11/1991"
    E preencho o campo email "teste02@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Casado"
    E no combo regime de casamento escolho "Comunhão Total De Bens"
    E informo o nome do conjugue "Maria pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Ensino Médio" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae "Mamae regina santos"
    E no combo documento do proponente escolho "RG"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E no campo endereco informo o cep "69314-082"
    E informo o numero da rua "100"
    E no combo tipo de residencia escolho "Financiada"
    E informo o tempo de residencia "10"
    E no combo natureza da ocupacao escolho "Empregado no Setor Privado"
    E informo a atividade principal "QA"
    E informo data de admissao "20/02/2018"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Haverá um avalista"
    E informo CPF do avalista
    E informo nome do avalista "Avaliador de moura"
    E no combo natureza da ocupacao do avalista escolho "Profissional Liberal/Autonomo"
    E informo data de admissao do avalista "14/12/2021"
    E no campo salario e renda do avalista mensal informo "7.500,00"
    E escolho o estado civil do avalista "Casado"
    E no combo regime de casamento escolho do avalista "Comunhão Total De Bens"
    E informo o nome do conjugue do avalista "Luana souza silva"
    E informo o CPF do conjugue do avalista
    E informo a data de nascimento do conjugue do avalista "10/08/1992"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Sim"
    E escrevo a funcao politica "Governador"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Sim"
    E informo o grau de parentesco "Primo"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Carro Passeio"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "GLC 300 COUPE AMG LINE 2.0 16V TB 4MATIC Gas. 4P B"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "AGRIBOMBA"
    E informo o valor do acessorio "1.500,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16698 - PC Taxa 1,44% à 1,51% - A JUL/2022"
    E no combo prazo escolho "12" e carencia "0"
    E informo o valor de entrada "150.000,00"
    E na opcao prestamista escolho "Sim"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Sim"
    E na opcao deseja incluir seguro do veiculo no financiamento escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    E guardo o numero da proposta para recuperar depois
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT03
  Cenario: cadastrar proposta de van nova sem acessorio CDC Decrescente com seguro para pessoa em uniãoestavel sem dados adicionais informando novo endereço e proprietário sem avalista com exposição politica
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Luciana fernandes de arruda"
    E preencho a data de nascimento "05/02/1989"
    E preencho o campo email "teste03@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "UniaoEstavel"
    E informo o nome do conjugue "Sandro pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1990"
    E no campo endereco informo o cep "13506-731"
    E informo o numero da rua "15"
    E no combo tipo de residencia escolho "Outros"
    E informo o tempo de residencia "3"
    E clico no botao novo endereco de correspondencia
    E informo o novo cep "29016-739"
    E informo o novo numero da rua "30"
    E no combo natureza da ocupacao escolho "Proprietário"
    E informo a atividade principal "QA solutions"
    E informo o nome da empresa "Qualidade SA"
    E informo o CNPJ da empresa
    E informo a soma do faturamento do ultimos 12 meses "1.000.000,00"
    E informo a porcentagem de participacao "30,00"
    E informo a data de inicio de atividade "25/12/2010"
    E informo a data de entrada "03/02/2011"
    E no campo salario e renda mensal informo "7.500,00"
    E em relacao do veiculos e frota clico em adicionar novo
    E informo o modelo "SCANIA R-450 19/19"
    E informo o ano de fabricacao "2019"
    E na opcoes possui onus informo "Não"
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Sim"
    E escrevo a funcao politica "Governador"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Único veículo"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "SPRINTER 315-CDI CHASSI STREET LONGO 2.0 TB Dies."
    E no combo utilizacao do veiculo escolho "Ambulância"
    E no combo tipo de carga escolho "Pessoas"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC Decrescente"
    E no combo campanha escolho "16743 - Vans Taxa 1,52% a 1,58% A PPI JUL/2022"
    E no combo prazo escolho "60" e carencia "0"
    E informo o valor de entrada "200.000,00"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Sim"
    E na opcao deseja incluir seguro do veiculo no financiamento escolho "Sim"
    E clico em continuar
    E valido um modal de atencao informando que cotacao de seguros nao permite cobertura do veiculo
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada


  @CT04
  Cenario: cadastrar proposta de onibus usado com acessorios CDC sem seguro para pessoa desquitada estrangeiro com dados adicionais informando patrimonio trabalha com transporte autonomo com avalista
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Edson pereira"
    E preencho a data de nascimento "15/11/1980"
    E preencho o campo email "teste04@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Desquitado"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "MBA Pós-Graduação" e informo o estatus do mesmo "Completo"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae "Vitoria regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no combo patrimonio escolho "Acima de R$5.000.000,00"
    E no campo endereco informo o cep "54275170"
    E informo o numero da rua "25"
    E no combo tipo de residencia escolho "Alugada"
    E informo o tempo de residencia "5"
    E no combo natureza da ocupacao escolho "Transportador Autônomo"
    E informo a atividade principal "QA"
    E informo a data de inicio de atividade "25/12/2010"
    E informo as receitas mensais "12.000,00"
    E no combo tipo de transporte escolho "Escolar"
    E nas opcoes cooperativa informo "Sim"
    E no campo avalista escolho "Haverá um avalista"
    E informo CPF do avalista
    E informo nome do avalista "Avaliador de moura"
    E no combo natureza da ocupacao do avalista escolho "Transportador Autônomo"
    E informo data de admissao do avalista "14/12/2021"
    E informo receitas mensais do avalista "10.000,00"
    E informo o tipo de transporte do avalista "Transportador Alternativo De Passageiros"
    E escolho o estado civil do avalista "Solteiro"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Sim"
    E informo o grau de parentesco "Primo"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Renovação de frota"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Ônibus"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "O-500RSDD 2741 RODOVIARIO 8X2 4e Dies. 1P Basico"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "4º DIRECIONAL MECÂNICO"
    E informo o valor do acessorio "2.000,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16724 - Truck/Bus A - PPI JUL/2022"
    E no combo prazo escolho "48" e carencia "0"
    E informo o valor de entrada "518.300,00"
    E nas opcoes simular seguro do veiculo escolho "Sim"
    E informo o valor aproximado do seguro "35.000,00"
    E clico em gerar simulacao
    E clico em continuar
    E valido modal de atencao informando que valores do seguro serao removidos do processo
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT05
  Cenario: validar quando informa um cpf invalido
    Dado que preencho o campo CPF ou CNPJ com valor inválido "00000011111"
    Então é apresentada a mensagem "CPF/CNPJ inválido".

  @CT06
  Cenario: cadastrar proposta de caminhão novo sem acessorio finame taxa fixa sem seguro para empresa com socio pf o representante legal não é socio, com beneficiario e com empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Qualidade e soluções"
    E no combo constituicao escolho "EI"
    E informo a data de fundacao "10/11/2016"
    E informo a data da ultima alteracao contratual societaria "15/10/2018"
    E informo o telefone "1199999999"
    E preencho o campo email "teste04@gmail.com"
    E escolho o CNAE "Cultivo de teca"
    E no combo regime de tributacao "Lucro Real"
    E informo o capital social "8.500.000,00"
    E informo a quantidade de funcionarios "150"
    E no combo natureza juridica "Associação Pública"
    E no campo endereco informo o cep "54275170"
    E informo o numero da rua "25"
    E informo o nome ou raza social do socio "Joao cladio ferreiora"
    E informo cpf do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "250.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Solteiro"
    E na opcao representante legal escolho "Haverá um representante legal"
    E nas opcoes o representante e socio escolho "Não"
    E informo o CPF do representante legal
    E informo o nome do representante legal "Claudio luiz"
    E na opcao avalista informo o socio
    E na opcao beneficiario final clico em adicionar "Sim"
    E informo se o beneficiario final e socio "Sim"
    E na aopcao beneficiario final escolho qual o socio
    E na opcao empresas coligadas e controladoras clico em adicionar "Sim"
    E informo os participantes
    E informo o CNPJ da empresa coligada e controladora
    E informo a razao social da empresa "Solucoes em testes LTDA"
    E informo o capital total "30,00"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "15.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Ampliação de frota"
    E informo a data de inicio de atividade "04/03/2012"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "2430 /36 ATEGO(P.Shift) 8X2 3e Dies. 2P Basico"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "FINAME TAXA FIXA - BK ÔNIBUS E CAMINHÕES"
    E no combo campanha escolho "16722 - FINAME Taxa Fixa - A PPI JUL/2022"
    E no combo prazo escolho "30" e carencia "6"
    E informo o valor de entrada "150.000,00"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT07
  Cenario: cadastrar proposta de van usada com acessorio CDC taxa sem ppi com seguro para empresa que possui socio cnpj sem representante legal, o beneficiario é pf e não é sócio e sem empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Qualidade e soluções"
    E no combo constituicao escolho "EIRELI"
    E informo a data de fundacao "10/11/2017"
    E informo a data da ultima alteracao contratual societaria "15/10/2019"
    E informo o telefone "1199999999"
    E preencho o campo email "teste07@gmail.com"
    E escolho o CNAE "Cultivo de cereais"
    E no combo regime de tributacao "Lucro Presumido"
    E informo o capital social "10.500.000,00"
    E informo a quantidade de funcionarios "250"
    E no combo natureza juridica "Autarquia Municipal"
    E no campo endereco informo o cep "54275170"
    E informo o numero da rua "25"
    E informo o nome ou raza social do socio "limpezas LTDA"
    E informo o cnpj do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "250.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E na opcao representante legal escolho "Não haverá um representante legal"
    E na opcao avalista informo o socio
    E na opcao beneficiario final clico em adicionar "Sim"
    E informo se o beneficiario final e socio "Não"
    E informo cpf do beneficiario final
    E informo nome do beneficiario final "Luan pereira"
    E no combo natureza da ocupacao do beneficiario final escolho "Serv. Publ Aut/Fund"
    E informo a data de admissao do beneficiario final "14/12/2018"
    E no campo salario e renda mensal do beneficiario final informo "6.500,00"
    E escolho o estado civil "Casado"
    E no combo regime de casamento do beneficiario final escolho "Comunhão Parcial De Bens"
    E informo o nome do conjugue "Luana pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E clico em dados adicionais
    E informo o email do beneficiario final "qaqa@gmail.com"
    E informo o celular do beneficiario final "1188888-8888"
    E nas opcoes sexo escolho "Masculino"
    E informo dataNascimento do beneficiario final "28/04/1976"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae do beneficiario final "Sonia regina santos"
    E no combo documento do proponente escolho "RNE"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF cidades escolho "Alagoas"
    E informo o orgao emissor "SSP"
    E no combo patrimonio escolho "de R$1.000.000,00 até R$2.000.000,00"
    E no campo endereco informo o cep do beneficiario final "54275170"
    E informo o numero da rua do beneficiario final "48"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final "Não"
    E na opcao empresas coligadas e controladoras clico em adicionar "Não"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "15.000,00"
    E em relacao do veiculos e frota clico em adicionar novo
    E informo o modelo "SCANIA R-450 19/19"
    E informo o ano de fabricacao "2019"
    E na opcoes possui onus informo "Sim"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Renovação de frota"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "SPRINTER 314-CDI CHASSI STREET LONGO TETO BAIXO 2."
    E no combo utilizacao do veiculo escolho "Auto-Escola"
    E no combo tipo de carga escolho "Pessoas"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "AR CONDICIONADO AUTOMOTIVO KIT SPRINTER 416 SEGUND"
    E informo o valor do acessorio "1.500,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16742 - Vans Taxa 1,52% a 1,58% A JUL/2022"
    E no combo prazo escolho "12" e carencia "0"
    E informo o valor de entrada "201.384,36"
    E na opcao prestamista escolho "Sim"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT08
  Cenario: cadastrar proposta de carro passeio, sem acessorio CDC Decrescente com seguro para empresa que possui socio pf, o representante legal é sócio, o avalista é sócio e com empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "protevi seguranças"
    E no combo constituicao escolho "LTDA"
    E informo a data de fundacao "10/11/2020"
    E informo a data da ultima alteracao contratual societaria "15/10/2021"
    E informo o telefone "1199999999"
    E preencho o campo email "teste08@gmail.com"
    E escolho o CNAE "Cultivo de tomate rasteiro"
    E no combo regime de tributacao "Simples"
    E informo o capital social "7.500.000,00"
    E informo a quantidade de funcionarios "120"
    E no combo natureza juridica "Sociedade De Economia Mista"
    E no campo endereco informo o cep "29303-017"
    E informo o numero da rua "40"
    E informo o nome ou raza social do socio "Fabricio sensato"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "450.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Casado"
    E no combo regime de casamento do beneficiario final escolho "Comunhão Parcial De Bens"
    E informo o nome do conjugue "Luana pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E clico em dados adicionais
    E informo o email do beneficiario final "qaqa@gmail.com"
    E informo o celular do beneficiario final "1188888-8888"
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae do beneficiario final "Sonia regina santos"
    E no combo documento do proponente escolho "CRA"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF cidades escolho "São Paulo"
    E informo o orgao emissor "SSP"
    E no campo endereco informo o cep do beneficiario final "54275170"
    E informo o tipo de residencia do beneficiario final "Financiada"
    E informo o numero da rua do beneficiario final "48"
    E informo a atividade principal "Pesquisador"
    E no campo salario e renda mensal informo "6.000,00"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho "Sim"
    E escrevo a funcao politica do beneficiario final "Governador"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final "Sim"
    E informo o grau de parentesco do beneficiario final "Cunhado"
    E na opcao representante legal escolho "Haverá um representante legal"
    E nas opcoes o representante e socio escolho "Sim"
    E escolho o socio no combo representante legal
    E na opcao avalista informo o socio
    E clico na opcao de adicionar avalista "Sim"
    E informo se o avalista e socio "Não"
    E informo CPF do avalista pj
    E informo nome do avalista pj "Avaliador de moura"
    E no combo natureza da ocupacao pj informo "Capitalista"
    E informo data de admissao do avalista pj "14/12/2021"
    E no campo salario e renda do avalista mensal pj informo "7.500,00"
    E escolho o estado civil do avalista pj "UniaoEstavel"
    E informo o nome do conjugue do pj "Luana souza silva"
    E informo o CPF do conjugue do avalista pj
    E informo a data de nascimento do conjugue do avalista pj "10/08/1992"
    E na opcao beneficiario final clico em adicionar "Não"
    E na opcao empresas coligadas e controladoras clico em adicionar "Sim"
    E informo os participantes
    E informo o CNPJ da empresa coligada e controladora
    E informo a razao social da empresa "Solucoes em testes LTDA"
    E informo o capital total "30,00"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "15.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Único veículo"
    E informo a data de inicio de atividade "04/03/2012"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "SPRINTER 314-CDI CHASSI STREET LONGO TETO BAIXO 2."
    E no combo utilizacao do veiculo escolho "Auto-Escola"
    E no combo tipo de carga escolho "Pessoas"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "AR CONDICIONADO AUTOMOTIVO KIT SPRINTER 416 SEGUND"
    E informo o valor do acessorio "1.500,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16742 - Vans Taxa 1,52% a 1,58% A JUL/2022"
    E no combo prazo escolho "12" e carencia "0"
    E informo o valor de entrada "201.384,36"
    E na opcao prestamista escolho "Sim"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT09
  Cenario: cadastrar proposta de onibus novo com acessorio CDC sem seguro e sem prestamista para empresa com dois socios pf, com tres avalistas com tres beneficiarios final, sem empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "construtora de seguranças"
    E no combo constituicao escolho "LTDA"
    E informo a data de fundacao "10/11/2019"
    E informo a data da ultima alteracao contratual societaria "15/10/2020"
    E informo o telefone "1199999999"
    E preencho o campo email "teste09@gmail.com"
    E escolho o CNAE "Cultivo de batatainglesa"
    E no combo regime de tributacao "Lucro Presumido"
    E informo o capital social "5.500.000,00"
    E informo a quantidade de funcionarios "120"
    E no combo natureza juridica "Sociedade De Economia Mista"
    E no campo endereco informo o cep "29303-017"
    E informo o numero da rua "40"
    E informo o nome ou raza social do socio "Fabricio sensato"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "450.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Divorciado"
    E clico em dados adicionais
    E informo o email do beneficiario final "qaqa@gmail.com"
    E informo o celular do beneficiario final "1188888-8888"
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae do beneficiario final "Sonia regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF cidades escolho "São Paulo"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no campo endereco informo o cep do beneficiario final "54275170"
    E informo o tipo de residencia do beneficiario final "Financiada"
    E informo o numero da rua do beneficiario final "48"
    E informo a atividade principal "Pesquisador"
    E no campo salario e renda mensal informo "6.000,00"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final "Sim"
    E informo o grau de parentesco do beneficiario final "Cunhado"
    E na opcao representante legal escolho "Não haverá um representante legal"
    E na opcao avalista informo o socio
    E clico na opcao de adicionar avalista "Sim"
    E informo se o avalista e socio "Não"
    E informo CPF do avalista pj
    E informo nome do avalista pj "Avaliador de moura"
    E no combo natureza da ocupacao pj informo "Proprietário"
    E informo data de admissao do avalista pj "14/12/2021"
    E no campo salario e renda do avalista mensal pj informo "7.500,00"
    E escolho o estado civil do avalista pj "Divorciado"
    E clico na opcao de adicionar avalista "Sim"
    E informo se o segundo avalista e socio "Não"
    E informo os dados obrigatorio dos socios
    E na opcao beneficiario final clico em adicionar "Não"
    E na opcao empresas coligadas e controladoras clico em adicionar "Não"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "15.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Único veículo"
    E informo a data de inicio de atividade "04/03/2012"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Ônibus"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "O-500M 1826/59 URBANO AT 4X2 Dies. 2P Basico"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "BASCULANTE REBAIXADO AMERICA 3e(C/Pneus) Basico"
    E informo o valor do acessorio "4.500,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16723 - Truck/Bus - A JUL/2022"
    E no combo prazo escolho "45" e carencia "3"
    E informo o valor de entrada "350.000,00"
    E na opcao prestamista escolho "Não"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT10
  Cenario: cadastrar proposta de caminhão novo, sem acessorio sem seguro finame taxa fixa bk onibus para empresa que possui socio estrangeiro casado em comunhão total de bens, sem empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Hortifruit importação"
    E no combo constituicao escolho "SA"
    E informo a data de fundacao "10/11/2019"
    E informo a data da ultima alteracao contratual societaria "15/10/2020"
    E informo o telefone "1199999999"
    E preencho o campo email "teste10@gmail.com"
    E escolho o CNAE "Produção de lavouras permanentes"
    E no combo regime de tributacao "Lucro Real"
    E informo o capital social "12.500.000,00"
    E informo a quantidade de funcionarios "120"
    E no combo natureza juridica "Fundação Ou Associação Dimiciliada No Exterior"
    E no campo endereco informo o cep "29303-017"
    E informo o numero da rua "40"
    E informo o nome ou raza social do socio "Claudio pereira yamamato"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2013"
    E informo a data de inicio de atividade "04/03/2015"
    E informo o valor de patrimonio imobiliario "850.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Casado"
    E no combo regime de casamento do beneficiario final escolho "Comunhão Total De Bens"
    E informo o nome do conjugue "Priscila pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E clico em dados adicionais
    E informo o email do beneficiario final "qaqa@gmail.com"
    E informo o celular do beneficiario final "1188888-8888"
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae do beneficiario final "Sonia regina santos"
    E no combo documento do proponente escolho "CNH"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF cidades escolho "São Paulo"
    E informo o orgao emissor "SSP"
    E no combo patrimonio escolho "Acima de R$5.000.000,00"
    E no campo endereco informo o cep do beneficiario final "64033-640"
    E informo o tipo de residencia do beneficiario final "Própria"
    E informo o numero da rua do beneficiario final "48"
    E informo a atividade principal "Mecanico"
    E no campo salario e renda mensal informo "6.000,00"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final "Não"
    E na opcao representante legal escolho "Não haverá um representante legal"
    E na opcao avalista informo o socio
    E na opcao beneficiario final clico em adicionar "Sim"
    E na aopcao beneficiario final escolho qual o socio
    E na opcao empresas coligadas e controladoras clico em adicionar "Não"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "25.000,00"
    E em relacao do veiculos e frota clico em adicionar novo
    E informo o modelo "Fox Comfortline"
    E informo o ano de fabricacao "2019"
    E na opcoes possui onus informo "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Ampliação de frota"
    E informo a data de inicio de atividade "04/03/2015"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "3344 /48 AXOR CABINE ESTENDIDA 6X4 3e Dies. 2P Bas"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "FINAME TAXA FIXA - BK ÔNIBUS E CAMINHÕES"
    E no combo campanha escolho "16721 - FINAME Taxa Fixa - A JUL/2022"
    E no combo prazo escolho "60" e carencia "0"
    E informo o valor de entrada "387.000,00"
    E na opcao prestamista escolho "Sim"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT11
  Cenario: cadastrar proposta de van usada, sem acessorio, CDC, sem seguro para empresa que possui socio casado em comunhão parcial de bens com representante pf, sem empresas coligadas
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Hortifruit importação"
    E no combo constituicao escolho "SA"
    E informo a data de fundacao "10/11/2019"
    E informo a data da ultima alteracao contratual societaria "15/10/2020"
    E informo o telefone "1199999999"
    E preencho o campo email "teste10@gmail.com"
    E escolho o CNAE "Cultivo de feijão"
    E no combo regime de tributacao "Lucro Presumido"
    E informo o capital social "11.200.000,00"
    E informo a quantidade de funcionarios "320"
    E no combo natureza juridica "Fundação Ou Associação Dimiciliada No Exterior"
    E no campo endereco informo o cep "29303-017"
    E informo o numero da rua "40"
    E informo o nome ou raza social do socio "Claudio pereira yamamato"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2013"
    E informo a data de inicio de atividade "04/03/2015"
    E informo o valor de patrimonio imobiliario "850.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Casado"
    E no combo regime de casamento do beneficiario final escolho "Comunhão Parcial De Bens"
    E informo o nome do conjugue "Priscila pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E na opcao representante legal escolho "Haverá um representante legal"
    E nas opcoes o representante e socio escolho "Não"
    E informo o CPF do representante legal
    E informo o nome do representante legal "Claudio luiz"
    E na opcao avalista informo o socio
    E na opcao beneficiario final clico em adicionar "Não"
    E na opcao empresas coligadas e controladoras clico em adicionar "Não"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "25.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Renovação de frota"
    E informo a data de inicio de atividade "04/03/2015"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "SPRINTER 516-CDI FURGAO TETO ALTO 15.5m3 2.2 TB Di"
    E no combo utilizacao do veiculo escolho "Bombeiro"
    E no combo tipo de carga escolho "Inflamável"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16743 - Vans Taxa 1,52% a 1,58% A PPI JUL/2022"
    E no combo prazo escolho "24" e carencia "0"
    E informo o valor de entrada "169.156,00"
    E clico em gerar simulacao
    E clico em continuar
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT12
  Cenario: preencher proposta e validar cenario de emprimir fluxo financeiro
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Lucas dos santos"
    E preencho a data de nascimento "15/11/1987"
    E preencho o campo email "teste@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Solteiro"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae "Sonia regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no combo patrimonio escolho "de R$500.000,00 até R$1.000.000,00"
    E no campo endereco informo o cep "59114031"
    E informo o numero da rua "112"
    E no combo tipo de residencia escolho "Alugada"
    E informo o tempo de residencia "5"
    E no combo natureza da ocupacao escolho "Estudante"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "1316 /46 ACCELO 6X2 3e Dies. 2P Basico"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "FINAME TAXA FIXA - MPME ÔNIBUS E CAMINHÕES"
    E no combo campanha escolho "16721 - FINAME Taxa Fixa - A JUL/2022"
    E no combo prazo escolho "57" e carencia "3"
    E informo o valor de entrada "100.000,00"
    E na opcao prestamista escolho "Não"
    E clico em gerar simulacao
    E clico em imprimir
    Então valido que nova aba com documento pdf para imprimir foi aberto na url

  @CT13
  Cenario: preencher proposta e validar tela de operação
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Lucas dos santos"
    E preencho a data de nascimento "15/11/1987"
    E preencho o campo email "teste@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Solteiro"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Superior" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae "Sonia regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no combo patrimonio escolho "de R$500.000,00 até R$1.000.000,00"
    E no campo endereco informo o cep "59114031"
    E informo o numero da rua "112"
    E no combo tipo de residencia escolho "Alugada"
    E informo o tempo de residencia "5"
    E no combo natureza da ocupacao escolho "Estudante"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E clico no botao Salvar Cliente
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Carro Passeio"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "A 35 SEDAN AMG 2.0 16V TB 4MATIC Gas. 4P Basico"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC"
    E no combo campanha escolho "16698 - PC Taxa 1,44% à 1,51% - A JUL/2022"
    E no combo prazo escolho "60" e carencia "0"
    E informo o valor de entrada "150.000,00"
    E na opcao prestamista escolho "Não"
    E clico em gerar simulacao
    E clico na aba operações
    E valido que data da simulação é a data atual
    E valido que o produto é "CDC"
    E valido que a quantidade de parcelas e "60" e a carencia "0"
    E valido o prazo total "60"
    E valido o valor total "R$ 449.900,00"
    E Valido porcentagem de entrada "33.34074239%"
    E valido o valor de entrada "R$ 150.000,00"
    Então valido a campanha escolhida

  @CT14
  Cenario: validar quando informar cnpj invalido
    Dado que preencho o campo CPF ou CNPJ com valor inválido "0000005411111"
    Então é apresentada a mensagem "CPF/CNPJ inválido".