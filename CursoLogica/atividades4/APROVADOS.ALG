Algoritmo "aprovados"

Var

qnt, i, x: inteiro
nome, aprovados: vetor [0..99] de caractere
nota1, nota2: vetor [0..99] de real

Inicio

escreva("Quantos alunos serão digitados? ")
leia(qnt)

para i de 0 ate (qnt-1) faca
     escreval("Digite nome, primeira e segunda nota do aluno do ", (i + 1), "o aluno:")
     leia(nome[i])
     leia(nota1[i])
     leia(nota2[i])
fimpara

x <- 0
para i de 0 ate (qnt-1) faca
     se ((nota1[i] + nota2[i]) / 2) >= 6 entao
        aprovados[x] <- nome[i]
        x <- x + 1
     fimse
fimpara

escreval("Alunos aprovados: ")
para i de 0 ate x faca
     escreval(aprovados[i])
fimpara

Fimalgoritmo