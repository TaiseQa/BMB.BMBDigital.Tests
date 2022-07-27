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
    Dado que faço login no portal BMB Digital
    Quando acesso a página de Propostas e Contratos
    E clico na proposta CDC que esteja em analise


  @CT37
  Cenario: aprovar contrato da proposta CDC

  @CT38
  Cenario: validar modal ao clicar em assinar contrato da proposta CDC

  @CT39
  Cenario: validar documento PDF de proposta CDC ao acessar informacoes de faturamento

  @CT40
  Cenario: fazer proposta com campanha Flexibility e aprovar proposta e contrato
