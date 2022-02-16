# language: pt
#encoding: utf-8

Funcionalidade: Nova Ficha
  Eu como usuário do Sitema BMB Digital
  Estando na tela principal da aplicação
  Ao acessar a tela Nova Ficha
  Consiga cadastrar uma nova proposta de pessoa fisica

  Contexto:
    Dado estar na página principal da aplicação "http://digitalqa.br800.corpintra.net/App/login"
    Quando ao inserir o usuario 'atucun0f' e 'Mercedes@2022',
    E ao clicar no botão Entre
    Então fecho a ficha de campanha

  @CT001
  Cenário: Validar CPF Inválido para Proposta de Pessoa Física
    Dado que eu esteja logado com um usuário com perfil para preenchimento de proposta
    E tenha clicado no botão <NOVA FICHA>
    Quando preencho o campo CPF/CNPJ com valor inválido	"00000011111"
    Então é apresentada a mensagem "CPF/CNPJ inválido".

