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

  @CT002
  Cenário: : Cenário: Cadastrar Proposta para Profissional Liberal Solteiro Ex Politico
    Dado que eu tenha clicado no botão Nova Ficha
    E preenchido o campo "56696479805"
    Quando preencho os campos de identificação do cliente
      |Campo | Valor |
      |Nome|  Carla Luciana Debora da Luz|
      |Data de Nascimento|   12061990|
      |E-mail|   wesley.chrispim@inmetrics.com.br|
      |Celular|  11973633233|
      |Estado Civil| Solteiro|
    E preencho os campos de endereço
