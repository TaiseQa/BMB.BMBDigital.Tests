# language: pt
# encoding: utf-8


@campanhas @emProducao
Funcionalidade: Campanhas
  eu como usuario do BMB Digital
  devo ser capaz de interagir com todas as funcionalidades
  existentes em campanhas

  @CT33
  Cenario: validar se existem campanhas se existir verificar existencia de modal ao clicar em ativar e se é possivel adicionar e remover vendedores
    Dado que faço login no portal BMB Digital
    Quando clico em campanhas
    Entao verifico se existe ou nao campanhas se existir faco as verificacoes caso contrario nao faco nada
