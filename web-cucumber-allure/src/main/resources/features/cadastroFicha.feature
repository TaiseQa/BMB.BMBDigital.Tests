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
