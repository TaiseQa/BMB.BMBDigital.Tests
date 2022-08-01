# language: pt
# encoding: utf-8

@novaSimulacao @emProducao
Funcionalidade: Nova Simulação
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Simulação
  Consiga cadastrar uma nova proposta de pessoa fisica e juridica

  Contexto: Acessar Propostas e contratos
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    E clico no botao nova simulacao


  @CT15
  Cenario: cadastrar proposta de carro passeio novo com acessorio CDC taxa sem ppi sem seguro para pessoa fisica brasileira solteira  com dados adicionais sem informe de patrimonio sendo um proprietario sem avalista com exposição politica
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Carro Passeio"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "GLA 35 AMG 2.0 16V TB 4MATIC Gas. 4P Basico"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "CARGA SECA 2e(C/Pneus) Basico"
    E informo o valor do acessorio "3.550,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho uma taxa sem ppi
    E no combo prazo escolho "13" e carencia "0"
    E nas opcoes tipo pessoa escolho "Física"
    E informo o valor de entrada "120.000,00"
    E na opcao prestamista escolho "Sim"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Joao pedro qa"
    E preencho a data de nascimento "10/11/1991"
    E preencho o campo email "teste02@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Solteiro"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Analfabeto" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Brasileira"
    E no combo naturalidade estado escolho "São Paulo"
    E no combo naturalidade cidade escolho "Sao Paulo"
    E informo o nome da mae "Mamae regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no campo endereco informo o cep "69314-082"
    E informo o numero da rua "100"
    E no combo tipo de residencia escolho "Financiada"
    E informo o tempo de residencia "10"
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
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Sim"
    E escrevo a funcao politica "Governador"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT16
  Cenario: cadastrar proposta de van usada sem acessorio CDC Decrescente taxa ppi sem seguro para pessoa fisica casada em comunhão total de bens sem dados adicionais empregado no setor privado com avalista com exposição politica
    E no combo ano fabricacao do veiculo escolho "2021"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "SPRINTER 314-CDI FURGAO STREET EXTRA-LONGO TETO AL"
    E no combo utilizacao do veiculo escolho "Carga Mista"
    E no combo tipo de carga escolho "Comum"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC Decrescente"
    E no combo campanha escolho uma taxa com ppi
    E no combo prazo escolho "12" e carencia "0"
    E nas opcoes tipo pessoa escolho "Física"
    E informo o valor de entrada "180.000,00"
    E clico em gerar simulacao
    E clico em continuar
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Paulo santos oliveira"
    E preencho a data de nascimento "10/11/1991"
    E preencho o campo email "teste016@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Casado"
    E no combo regime de casamento escolho "Comunhão Total De Bens"
    E informo o nome do conjugue "Maria pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E no campo endereco informo o cep "69314-082"
    E informo o numero da rua "100"
    E no combo tipo de residencia escolho "Financiada"
    E informo o tempo de residencia "10"
    E clico no botao novo endereco de correspondencia
    E informo o novo cep "29016-739"
    E informo o novo numero da rua "30"
    E no combo natureza da ocupacao escolho "Empregado no Setor Privado"
    E informo a atividade principal "QA"
    E informo data de admissao "20/02/2018"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Haverá um avalista"
    E informo CPF do avalista
    E informo nome do avalista "Aleda de moura"
    E no combo natureza da ocupacao do avalista escolho "Capitalista"
    E informo data de admissao do avalista "14/12/2021"
    E no campo salario e renda do avalista mensal informo "7.500,00"
    E escolho o estado civil do avalista "Solteiro"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Sim"
    E informo o grau de parentesco "Primo"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Único veículo"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT17
  Cenario: cadastrar proposta de caminhão novo com acessorio finame taxa fixa taxa sem ppi sem seguro para pessoa fisica estrageira em uniãoEstavel informando patrimonio ocupação transporte autonomo com avalista com exposição politica
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "4144K AXOR(PowerShift) 6X4 3e Dies. 2P Basico"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "BOIADEIRO 2e(S/Pneus) Basico"
    E informo o valor do acessorio "3.125,00"
    E no combo produto escolho "FINAME TAXA FIXA - MPME ÔNIBUS E CAMINHÕES"
    E no combo campanha escolho uma taxa sem ppi
    E no combo prazo escolho "42" e carencia "6"
    E nas opcoes tipo pessoa escolho "Física"
    E informo o valor de entrada "250.000,00"
    E na opcao prestamista escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Paulo santos oliveira"
    E preencho a data de nascimento "10/11/1991"
    E preencho o campo email "teste016@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "UniaoEstavel"
    E informo o nome do conjugue "Maria pereira"
    E informo o CPF do conjugue
    E informo a data de nascimento do conjugue "15/08/1993"
    E clico em dados adicionais
    E nas opcoes sexo escolho "Masculino"
    E no combo escolaridade escolho "Analfabeto" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae "Mamae regina santos"
    E no combo documento do proponente escolho "RG"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF escolho "SP"
    E informo o orgao emissor "SSP"
    E no combo patrimonio escolho "até R$500.000,00"
    E no campo endereco informo o cep "69314-082"
    E informo o numero da rua "100"
    E no combo tipo de residencia escolho "Financiada"
    E informo o tempo de residencia "10"
    E no combo natureza da ocupacao escolho "Transportador Autônomo"
    E informo a atividade principal "Carreto"
    E informo a data de inicio de atividade "25/12/2010"
    E informo as receitas mensais "10.000,00"
    E no combo tipo de transporte escolho "Transportador Autônomo De Cargas"
    E informo o numero da ANTT "1245"
    E nas opcoes cooperativa informo "Sim"
    E no campo avalista escolho "Haverá um avalista"
    E informo CPF do avalista
    E informo nome do avalista "Aleda de moura"
    E no combo natureza da ocupacao do avalista escolho "Estudante"
    E escolho o estado civil do avalista "Casado"
    E no combo regime de casamento escolho do avalista "Comunhão Parcial De Bens"
    E informo o nome do conjugue do avalista "Luana souza silva"
    E informo o CPF do conjugue do avalista
    E informo a data de nascimento do conjugue do avalista "10/08/1992"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Sim"
    E escrevo a funcao politica "Prefeito"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Sim"
    E informo o grau de parentesco "Irmão"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Ampliação de frota"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT18
  Cenario: cadastrar proposta de onibus usado sem acessorio CDC taxa ppi sem seguro para pessoa fisica divorciado sem dados adicionais estudante sem avalista com exposição politica
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Ônibus"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "OF-1621 /59 FRETAMENTO 4X2 Dies. 1P Basico"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC"
    E no combo campanha escolho uma taxa sem ppi
    E no combo prazo escolho "57" e carencia "3"
    E nas opcoes tipo pessoa escolho "Física"
    E informo o valor de entrada "189.000,00"
    E na opcao prestamista escolho "Não"
    E nas opcoes simular seguro do veiculo escolho "Sim"
    E informo o valor aproximado do seguro "45.000,00"
    E clico em gerar simulacao
    E clico em continuar
    E valido modal de atencao informando que valores do seguro serao removidos do processo
    Dado que preencho o campo CPF com valor valido
    E preencho o campo nome "Tiago luciano oliveira"
    E preencho a data de nascimento "10/11/1992"
    E preencho o campo email "teste018@gmail.com"
    E preencho o campo celular "11999999999"
    E escolho o estado civil "Divorciado"
    E no campo endereco informo o cep "69314-082"
    E informo o numero da rua "150"
    E no combo tipo de residencia escolho "Financiada"
    E informo o tempo de residencia "10"
    E no combo natureza da ocupacao escolho "Estudante"
    E no campo salario e renda mensal informo "6.500,00"
    E no campo avalista escolho "Não haverá um avalista"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos escolho "Não"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos "Sim"
    E informo o grau de parentesco "Irmão"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Único veículo"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT19
  Cenario: cadastrar proposta de caminhão usado sem acessorio CDC taxa ppi sem seguro para empresa com socio pf o representante legal é socio, sem beneficiario e sem empresas coligadas
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Caminhão"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "2430 /36 ATEGO(Cabine Leito Teto Alto P.Shift) 6X2"
    E nas opcoes adicionar acessorio escolho "Não"
    E no combo produto escolho "CDC"
    E no combo campanha escolho uma taxa com ppi
    E no combo prazo escolho "18" e carencia "6"
    E nas opcoes tipo pessoa escolho "Jurídica"
    E informo o valor de entrada "250.000,00"
    E nas opcoes simular seguro do veiculo escolho "Não"
    E clico em gerar simulacao
    E clico em continuar
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Super soluções impresariais"
    E no combo constituicao escolho "EPP"
    E informo a data de fundacao "10/11/2010"
    E informo a data da ultima alteracao contratual societaria "15/10/2011"
    E informo o telefone "1199999999"
    E preencho o campo email "teste19@gmail.com"
    E escolho o CNAE "Cultivo de milho"
    E no combo regime de tributacao "Lucro Presumido"
    E informo o capital social "6.200.050,00"
    E informo a quantidade de funcionarios "350"
    E no combo natureza juridica "Comissão Polinacional"
    E no campo endereco informo o cep "69090-372"
    E informo o numero da rua "25"
    E informo o nome ou raza social do socio "Di Ferreira yamamato"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "350.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E informo a data nascimento do socio "14/11/1990"
    E escolho o estado civil "Solteiro"
    E na opcao representante legal escolho "Haverá um representante legal"
    E nas opcoes o representante e socio escolho "Sim"
    E escolho o socio no combo representante legal
    E na opcao avalista informo o socio
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "15.000,00"
    E em relacao do veiculos e frota clico em adicionar novo
    E informo o modelo "Perua Kombi"
    E informo o ano de fabricacao "2019"
    E na opcoes possui onus informo "Não"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Ampliação de frota"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT20
  Cenario: cadastrar proposta de carro passeio usado com acessorio CDC Decrescente taxa sem ppi sem seguro para empresa com socio pj sem representante legal o beneficiario não é socio e é pj, com empresas coligadas
    E no combo ano fabricacao do veiculo escolho "2022"
    E no combo tipo de veiculo escolho "Carro Passeio"
    E escolho o estado do veiculo "Usado"
    E no combo modelo do veiculo escolho "GLS 450 3.0 V6 BI-TB 4MATIC Gas. 4P Basico"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "BITREM"
    E informo o valor do acessorio "5.125,00"
    E no combo produto escolho "CDC Decrescente"
    E no combo campanha escolho uma taxa sem ppi
    E no combo prazo escolho "60" e carencia "0"
    E nas opcoes tipo pessoa escolho "Jurídica"
    E informo o valor de entrada "372.649,00"
    E na opcao prestamista escolho "Sim"
    E clico em gerar simulacao
    E clico em continuar
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "acordo em geral"
    E no combo constituicao escolho "MEI"
    E informo a data de fundacao "10/11/2010"
    E informo a data da ultima alteracao contratual societaria "15/10/2011"
    E informo o telefone "1199999999"
    E preencho o campo email "teste20@gmail.com"
    E escolho o CNAE "Cultivo de flores e plantas ornamentais"
    E no combo regime de tributacao "Simples"
    E informo o capital social "7.200.050,00"
    E informo a quantidade de funcionarios "320"
    E no combo natureza juridica "Contribuinte Individual"
    E no campo endereco informo o cep "69090-372"
    E informo o numero da rua "25"
    E informo o nome ou raza social do socio "Musica SA"
    E informo o cnpj do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
    E informo o valor de patrimonio imobiliario "1.000.000,00"
    E informo a porcentagem de participacao do socio "100,00"
    E na opcao representante legal escolho "Não haverá um representante legal"
    E na opcao avalista informo o socio
    E na opcao beneficiario final clico em adicionar "Sim"
    E informo se o beneficiario final e socio "Não"
    E informo cnpj do beneficiario final
    E informo nome do beneficiario final "Controle e segurança de pessoas"
    E na opcao empresas coligadas e controladoras clico em adicionar "Sim"
    E informo os participantes
    E informo o CNPJ da empresa coligada e controladora
    E informo a razao social da empresa "Solucoes em testes LTDA"
    E informo o capital total "30,00"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "20.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Renovação de frota"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada

  @CT21
  Cenario: cadastrar proposta de van nova com acessorio CDC taxa sem ppi sem seguro para empresa com sócio pf o representante legal não é socio, sem beneficiario e com empresas coligadas
    E no combo ano fabricacao do veiculo escolho "2020"
    E no combo tipo de veiculo escolho "Van"
    E escolho o estado do veiculo "Novo"
    E no combo modelo do veiculo escolho "SPRINTER 416-CDI VAN LUXO 15+1 T.ALTO 2.2 TB Dies."
    E no combo utilizacao do veiculo escolho "Lotação"
    E no combo tipo de carga escolho "Pessoas"
    E nas opcoes adicionar acessorio escolho "Sim"
    E no combo acessorio escolho "KIT EIXO AUTODIRECIONAL"
    E informo o valor do acessorio "5.125,00"
    E no combo produto escolho "CDC"
    E no combo campanha escolho uma taxa sem ppi
    E no combo prazo escolho "48" e carencia "0"
    E nas opcoes tipo pessoa escolho "Jurídica"
    E informo o valor de entrada "131.549,27"
    E na opcao prestamista escolho "Não"
    E nas opcoes simular seguro do veiculo escolho "Sim"
    E informo o valor aproximado do seguro "50.000,00"
    E clico em gerar simulacao
    E clico em continuar
    E valido modal de atencao informando que valores do seguro serao removidos do processo
    E informo um CNPJ valido
    E informo o nome da empresa do cliente juridico "Segurança patrimonial"
    E no combo constituicao escolho "MEI"
    E informo a data de fundacao "10/11/2010"
    E informo a data da ultima alteracao contratual societaria "15/10/2011"
    E informo o telefone "1199999999"
    E preencho o campo email "teste21@gmail.com"
    E escolho o CNAE "FABRICAÇÃO DE OUTROS EQUIPAMENTOS DE TRANSPORTE, EXCETO VEÍCULOS AUTOMOTORES"
    E no combo regime de tributacao "Simples"
    E informo o capital social "9.200.050,00"
    E informo a quantidade de funcionarios "320"
    E no combo natureza juridica "Estabelecimento, No Brasil, De Fundação Ou Associação Estrangeira"
    E no campo endereco informo o cep "69090-372"
    E informo o numero da rua "25"
    E informo o nome ou raza social do socio "livinho Ferreira xing ling"
    E informo o cpf do socio
    E informo a data de entrada "03/02/2011"
    E informo a data de inicio de atividade "04/03/2012"
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
    E no combo escolaridade escolho "MBA Pós-Graduação" e informo o estatus do mesmo "Incompleto"
    E no combo naturalidade pais escolho "Estrangeira"
    E informo o nome da mae do beneficiario final "Sonia regina santos"
    E no combo documento do proponente escolho "Passaporte"
    E informo o numero do documento "12345678"
    E informo a data de expedicao do documento "02/10/2018"
    E no combo UF cidades escolho "São Paulo"
    E informo o orgao emissor "SSP"
    E informo a validade do documento "10/11/2025"
    E no combo patrimonio escolho "de R$500.000,00 até R$1.000.000,00"
    E no campo endereco informo o cep do beneficiario final "64033-640"
    E informo o tipo de residencia do beneficiario final "Própria"
    E informo o numero da rua do beneficiario final "48"
    E informo a atividade principal "Mecanico"
    E no campo salario e renda mensal informo "6.000,00"
    E nas opcoes desempenhou funcao ou cargo publico relevante nos ultimos 5 anos  do beneficiario final escolho "Sim"
    E escrevo a funcao politica do beneficiario final "Governador"
    E nas opcoes possui parentesco com pessoa que exerceu funcao ou cargo publico relevante nos ultimos 5 anos do beneficiario final "Sim"
    E informo o grau de parentesco do beneficiario final "Cunhado"
    E na opcao representante legal escolho "Haverá um representante legal"
    E nas opcoes o representante e socio escolho "Sim"
    E escolho o socio no combo representante legal
    E na opcao avalista informo o socio
    E na opcao empresas coligadas e controladoras clico em adicionar "Sim"
    E informo os participantes
    E informo o CNPJ da empresa coligada e controladora
    E informo a razao social da empresa "Solucoes em testes LTDA"
    E informo o capital total "30,00"
    E escolho o periodo de faturamento
    E nos meses de faturamento informo o valor "40.000,00"
    E no combo declaracao do proposito da aquisicao do bem financiamento escolho "Uso particular"
    E informo a data de inicio de atividade "04/03/2012"
    E clico no botao Salvar Cliente
    E na opcao deseja seguro do veiculo escolho "Não"
    E clico em continuar
    E clico em enviar proposta de credito
    E no modal selecione o vendedor escolho "GERENTE"
    Então o sistema apresenta a tela com os detalhes da proposta cadastrada
