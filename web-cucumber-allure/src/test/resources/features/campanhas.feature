# language: pt
# encoding: utf-8

Funcionalidade: Campanhas
  eu como usuario do BMB Digital
  devo ser capaz de interagir com todas as funcionalidades
  existentes em campanhas

  @CT33
  Cenario: validar se existem campanhas se existir verificar existencia de modal ao clicar em ativar e se é possivel adicionar e remover vendedores
    Dado que faço login no portal BMB Digital
    Quando clico em campanhas
    Entao verifico se existe ou nao campanhas se existir faco as verificacoes caso contrario nao faco nada


#  @CT33
#  Cenario: validar se existem campanhas para serem ativadas
#    Dado que faço login no portal BMB Digital
#    Quando clico em campanhas
#    Entao verifico se existe ou nao campanhas
#
#
#  @CT34
#  Cenario: validar presença de modal ao clicar em ativar e seus inputs
#    Dado que faço login no portal BMB Digital
#    Quando clico em campanhas
#    E clico no botao ativar
#    E verifico a presenca de um modal "Termo de aceite"
#    E que modal contenha o botao radio button "Estou de acordo"
#    E que modal contenha botao "Ativar Campanha"
#    Entao que modal contenha botao "Cancelar"
#
#
#  @CT35
#  Cenario: validar se é possivel marcar e desmarcar vendendedores
#    Dado que faço login no portal BMB Digital
#    Quando clico em campanhas
#    E clico no botao ativar
#    E verifico a presenca de um modal "Termo de aceite"
#    E marco alguns vendedores
#    Entao desmarco os mesmos vendedores
#
#
#  @CT36
#  Cenario: validar que é possivel fazer download de uma campanha