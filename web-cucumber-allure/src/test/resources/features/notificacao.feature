# language: pt
# encoding: utf-8

@notificacao @emProducao
Funcionalidade: Notificacao
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Notificacao
  Consiga verificar as notificacoes

  Contexto: fazer login no BMB Digital e acessar notificacoes
    Dado que faço login no portal BMB Digital
    Quando clico em notificacoes


  @CT34
  Cenario:  validar se existem notificações recebidas
    Entao verifico se existe ou nao notificacoes

  @CT35
  Cenario: validar filtro de notificações
    E clico no filtro de notificacoes
    Entao valido que o filtro foi alterado