# language: pt
#encoding: utf-8

Funcionalidade: Nova Ficha
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  Cenário: Cadastro de pessoa Fisica
    Dado estar na página principal da aplicação "http://digitalqa.br800.corpintra.net/App/login"
    Quando ao inserir o usuario 'atucun0f' e 'Mercedes@2022',
    E ao clicar no botão Entre
    Então fecho a ficha de campanha
