algoritmo exemplo5_2
    real num, media, soma
    inteiro qtNum
    caractere resp
    início
        soma = 0
        qtNum = 0
        faça{
            escreva("Digite um número ou 0 para encerrar: ")
            leia(num)
            soma = soma + num
            qtNum++
        }enquanto(num !=0 )
        media = soma/qtNum
        escreva("A média dos números digitados é: " + media)
    fim