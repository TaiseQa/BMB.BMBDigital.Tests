# language: pt
# encoding: utf-8

@notificacao
Funcionalidade: Notificacao
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Notificacao
  Consiga verificar as notificacoes

  @CT37
  Cenario:  validar se existem notificações recebidas
    Dado que faço login no portal BMB Digital
    Quando clico em notificacoes
    Entao verifico se existe ou nao notificacoes

  @CT38
  Cenario: validar filtro de notificações
    Dado que faço login no portal BMB Digital
    Quando clico em notificacoes
    E clico no filtro de notificacoes
    Entao valido que o filtro foi alterado