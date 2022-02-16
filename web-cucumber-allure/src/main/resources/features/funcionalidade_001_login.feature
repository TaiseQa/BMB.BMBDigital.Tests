# language: pt
#encoding: utf-8

Funcionalidade: Login
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao informo os dados nos campos referente a:
  - usuario e
  - senha,
  Ao clicar no botão Entre
  Finalizo a operação sendo direcionado a para cadastro de CPF

  Cenário: Logar com sucesso no BMB Digital
    Dado que estou na página principal da aplicação "https://digitalqa.br800.corpintra.net/App/login"
    E quando ignoro o certificado
    Quando ao inserir o usuario 'atucun0f' e 'Mercedes@2022',
    E ao clicar no botão Entre
    Então fecho a ficha de campanha
