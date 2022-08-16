# language: pt
# encoding: utf-8

@proposta @emProducao
Funcionalidade: Propostas
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela propostas e contratos
  Consiga alterar os status das propostas

#  Contexto: Acessar Propostas e contratos



  @CT36
  Cenario: aprovar proposta CDC que esteja em analise
#    Dado que faço login no portal BMB Digital
#    Quando acesso a página de Propostas e Contratos
#    E clico na proposta CDC que esteja em analise


  @CT37
  Cenario: aprovar contrato da proposta CDC

  @CT38
  Cenario: validar modal ao clicar em assinar contrato da proposta CDC
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    Quando filtro as propostas por "Aguardando Formalização"
    E clico na proposta que esteja aprovada "SPM039648"
    E recupero nome cpf ou cnpj email e telefone
    E clico no botao assinar contrato
    E valido que um modal foi apresentado
    Entao verifico que o nome cpf ou cnpj email e telefone sao os mesmos na hora do cadastro


  @CT39
  Cenario: validar documento PDF de proposta CDC ao acessar informacoes de faturamento
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    Quando filtro as propostas por "Aguardando Formalização"
    E clico na proposta que esteja aprovada "SPM039648"
    E clico em informacoes de faturamento
    Entao valido que um documento PDF eh apresentado


  @CT40
  Cenario: fazer proposta com campanha Flexibility e aprovar proposta e contrato
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    Quando filtro as propostas por "Em processamento"
    E clico na proposta que esteja aprovada "SPM039733"
    Entao valido que a ficha cadastral documentos e contrato estejam com status completo