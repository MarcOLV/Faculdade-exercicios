algoritmo exercicio3
	caractere tipo
	real num1,num2,operacao
	
	inicio
		escreva("Digite o primeiro numero:")
		leia(num1)
		escreva("Digite o segundo numero:")
		leia(num2)
		escreva("Digite qual operação, você quer realizar: 1 - Soma, 2 - Subtração,  - Multiplicação, 4 - Divisão)
		leia(tipo)
	
		escolha(tipo){
	
			caso '1':
				escreva("Voce escolheu soma")
				operacao = num1 + num2
				escreva("O valor da " + tipo + " é de: " + operacao)
				pare

			caso '2':
				escreva("Voce escolheu subtração")
				operacao = num1 - num2
				escreva("O valor da " + tipo + " é de: " + operacao)
				pare

			caso '3':
				escreva("Voce escolheu multiplicação")
				operacao = num1 * num2
				escreva("O valor da " + tipo + " é de: " + operacao)
				pare
			
			caso '4':
				escreva("Voce escolheu divisão")
				operacao = num1 / num2
				escreva("O valor da " + tipo + " é de: " + operacao)
				pare
				
			
			padrão:
				escreva("Opção inválida! Tente outra vez!!!")
		}
	fim
	
	