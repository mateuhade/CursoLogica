Algoritmo "dados_pessoas"

Var

qnt, i, homens, mulheres: inteiro
maiorAltura, menorAltura, mediaMulheres, soma, media: real
genero: vetor [0..99] de caractere
altura: vetor [0..99] de real

Inicio

escreva("Quantos alunos serão digitadas? ")
leia(qnt)

para i de 0 ate (qnt-1) faca
     escreva("Altura da ", (i + 1), "a pessoa: ")
     leia(altura[i])
     escreva("Genero da ", (i + 1), "a pessoa: ")
     leia(genero[i])
fimpara


homens <- 0
mulheres <- 0
para i de 0 ate (qnt-1) faca
     escolha genero[i]
     caso "F"
          soma <- soma + altura[i]
          mulheres <- mulheres + 1
     caso "M"
          homens <- homens + 1
     fimescolha
fimpara

maiorAltura <- 0
menorAltura <- 10
para i de 0 ate (qnt-1) faca
     se altura[i] > maiorAltura entao
          maiorAltura <- altura[i]
     senao
          se altura[i] < menorAltura entao
             menorAltura <- altura[i]
          fimse
     fimse
fimpara

media <- soma / mulheres
escreval("Menor altura = ", menorAltura)
escreval("Maior altura = ", maiorAltura)
escreval("Media das alturas das mulheres = ", media)
escreva("Numero de homens = ", homens)

Fimalgoritmo