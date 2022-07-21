# language: pt
# encoding: utf-8

@ajuda @emProducao
Funcionalidade: Ajuda
  eu como usuario do BMB Digital
  ao acessa a pagina de ajuda
  devo ser capaz de encontrar tutoriais e perguntas e respostas

  Contexto: fazer login no BMB Digital e acessar ajuda
    Dado que faço login no portal BMB Digital
    Quando  clico no botao de ajuda


  @CT30
  Cenario:  validar resultado ao buscar uma duvida
    E no campo de busca pesquiso "Quais são os criterios para a pontuação"
    Entao verifico se o resultado da busca e o mesmo que pesquisei

  @CT31
  Esquema do Cenario: validar que video é exibido ao clicar em algum tutorial
    E clico no tutorial <tutorial>
    Entao verifico que o video do tutorial é exibido
    Exemplos:
      | tutorial                                               |
      | "Vídeo Tutorial - Assinatura Eletrônica Pessoa Física" |
      | "Vídeo de Divulgação do BMB Digital 2.0"               |

  @CT32
  Cenario: validar que resposta é exibida ao clicar em uma pergunta
    E clico em uma pergunta "O que é a Oferta Tradicional?"
    Entao que sua resposta exibida seja "Trata-se de um múlticálculo que poderá calcular e oferecer diversas opções de seguro para fechamento."