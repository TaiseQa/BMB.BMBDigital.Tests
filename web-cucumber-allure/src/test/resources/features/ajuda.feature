# language: pt
# encoding: utf-8

@ajuda
Funcionalidade: Ajuda
  eu como usuario do BMB Digital
  ao acessa a pagina de ajuda
  devo ser capaz de encontrar tutoriais e perguntas e respostas

  @CT30
  Cenario:  validar resultado ao buscar uma duvida
    Dado que faço login no portal BMB Digital
    Quando  clico no botao de ajuda
    E no campo de busca pesquiso "Quais são os criterios para a pontuação"
    Entao verifico se o resultado da busca e o mesmo que pesquisei

  @CT31
  Esquema do Cenario: validar que video é exibido ao clicar em algum tutorial
    Dado que faço login no portal BMB Digital
    Quando  clico no botao de ajuda
    E clico no tutorial <tutorial>
    Entao verifico que o video do tutorial é exibido
    Exemplos:
      | tutorial                                               |
      | "Vídeo Tutorial - Assinatura Eletrônica Pessoa Física" |
      | "Vídeo de Divulgação do BMB Digital 2.0"               |

  @CT32
  Cenario: validar que resposta é exibida ao clicar em uma pergunta
    Dado que faço login no portal BMB Digital
    Quando clico no botao de ajuda
    E clico em uma pergunta "O que é a Oferta Tradicional?"
    Entao que sua resposta exibida seja "Trata-se de um múlticálculo que poderá calcular e oferecer diversas opções de seguro para fechamento."