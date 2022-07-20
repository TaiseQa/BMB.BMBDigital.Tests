# language: pt
# encoding: utf-8

@retencao
Funcionalidade: Retenção
  eu como usuario do sistema BMB Digital
  estando logado na aplicação e acessando
  o ambiente de retenção devo ser capaz de
  fazer operações de retenção

  @CT22
  Cenario: validar texto no corpo da pagina ao acessar a opção condições especiais e não houver propostas
    Dado que faço login no portal BMB Digital
    Quando clico no botao retencao
    Entao valido se existe ou não uma proposta na pagina

  @CT23
  Cenario: validar texto no corpo da pagina ao acessar a opoção sem limites e não houver propostas
    Dado que faço login no portal BMB Digital
    Quando clico no botao retencao
    E clico na aba sem limite disponivel
    Entao valido se existe ou não uma proposta na pagina


  @CT24
  Cenario: validar texto no corpo da página ao acessar a opção favoritos e não houver propostas
    Dado que faço login no portal BMB Digital
    Quando clico no botao retencao
    E clico na aba favoritos
    Entao valido se existe ou não uma proposta na pagina


  @CT25
  Cenario: validar texto no corpo da pagina ao acessar a opção gerenciar leads e não houver propostas
    Dado que faço login no portal BMB Digital
    Quando clico no botao retencao
    E clico na aba gerenciar leads
    Entao valido se existe ou não uma proposta na pagina em gerenciar leads
