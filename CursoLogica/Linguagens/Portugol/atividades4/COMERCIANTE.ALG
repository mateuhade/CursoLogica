Algoritmo "comerciante"

Var

qnt, i, abaixo, entre, acima: inteiro
compraTotal, vendaTotal, lucroTotal: real
nome: vetor [0..99] de caractere
compra: vetor [0..99] de real
venda: vetor [0..99] de real

Inicio

escreva("Serão digitados os dados de quantos produtos? ")
leia(qnt)

para i de 0 ate (qnt - 1) faca
     escreval("Produto ", i+1, ":")
     escreva("Nome: ")
     leia(nome[i])
     escreva("Preço de compra: ")
     leia(compra[i])
     escreva("Preço de venda: ")
     leia(venda[i])
fimpara

abaixo <- 0
entre <- 0
acima <- 0
para i de 0 ate (qnt-1) faca
     se ((venda[i] - compra[i]) / compra[i] * 100) < 10 entao
        abaixo <- abaixo + 1
     senao
        se ((venda[i] - compra[i]) / compra[i] * 100) <= 20 entao
           entre <- entre + 1
        senao
           acima <- acima + 1
        fimse
     fimse
fimpara

compraTotal <- 0
vendaTotal <- 0
para i de 0 ate (qnt - 1) faca
     compraTotal <- compraTotal + compra[i]
     vendaTotal <- vendaTotal + venda[i]
fimpara
lucroTotal <- vendaTotal - compraTotal

escreval()
escreval("RELATORIO:")
escreval("Lucro abaixo de 10%:", abaixo)
escreval("Lucro entre 10% e 20%: ", entre)
escreval("Lucro acima de 20%: ", acima)
escreval("Valor total de compra: ", compraTotal:5:2)
escreval("Valor total de venda: ", vendaTotal:5:2)
escreval("Lucro total: ", lucroTotal:5:2)


Fimalgoritmo