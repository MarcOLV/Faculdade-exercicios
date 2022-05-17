 algoritmo exercicio10
    inteiro opcao
    real num1,num2,soma,sub,mult
        inicio
            escreva("Digite um numero")
            leia(num1)
			 escreva("Digite um numero")
            leia(num2)
            escreva("Digite uma opção(1/2/3/4) ")
            leia(opcao)
            escolha(opcao)
                caso 1:
                   soma = num1 + num2
                    escreva("A soma dos numeros é de " + soma)
                pare
                caso 2:
					sub = num1 - num2
                    escreva("A subtração dos numeros é de " + sub) 
                caso 3:
                    mult = num1 * num2
                    escreva("A multiplicação dos numeros é de " + mult) 
                caso 4:
                    escreva("Voce saiu")
                pare
                padrao
                    escreva("Escolha uma opção correta ")
				}
        fim
