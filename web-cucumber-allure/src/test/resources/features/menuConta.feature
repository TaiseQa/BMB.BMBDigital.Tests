# language: pt
# encoding: utf-8

@menuConta
Funcionalidade: Menu Conta
  eu como usuario do BMB Digital
  ao acessar o menu conta
  devo ser capaz de usar suas funcionalidade


  @CT26
  Cenario: validar que é informado usuario e concessionario
    Dado que faço login no portal BMB Digital
    Quando clico no menu conta
    Entao valido que os suarios e concessionarios informados sao
      | campo           | valor              |
      | usuario         | ATUCUN0F           |
      | concessrionario | DRA. LAÍS NOGUEIRA |


  @CT27
  Cenario: validar que ao clicar em trocar senha um modal de atenção é exibido
    Dado que faço login no portal BMB Digital
    Quando clico no menu conta
    E clico em trocar senha
    Entao um modal de atencao e apresentado
    E clico em ok entendi
    Entao valido redirecionamento para pagina de troca de senha "Alterar Senha"


  @CT28
  Cenario:validar redirecionamento de página ao clicar em privacidade e proteção de dados
    Dado que faço login no portal BMB Digital
    Quando clico no menu conta
    E clico em privacidade e protecao de dados
    Entao  valido redirecionamento para pagina de protecao de dados "Privacidade e Proteção de Dados"

  @CT29
  Cenario:validar comportamento ao clicar em sair
    Dado que faço login no portal BMB Digital
    Quando clico no menu conta
    E clico em sair
    Entao valido que estou na pagina de login
