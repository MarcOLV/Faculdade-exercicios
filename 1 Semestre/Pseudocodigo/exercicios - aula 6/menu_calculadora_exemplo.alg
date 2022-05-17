algoritmo calculadora
	caractere tipo
	real num1,num2
	
	inicio
		escreva("Digite o primeiro numero:")
		leia(num1)
		escreva("Digite o segundo numero:")
		leia(num2)
		escreva("Digite qual operação, você quer realizar: 1 - Soma, 2 - Subtração,  - Multiplicação, 4 - Divisão, 5 - Sair" )
		leia(tipo)
	
		escolha(tipo){
	
			caso '1':
				escreva("Voce escolheu soma")
				pare

			caso '2':
				escreva("Voce escolheu subtração")
				pare

			caso '3':
				escreva("Voce escolheu multiplicação")
				pare
			
			caso '4':
				escreva("Voce escolheu divisão")
				pare
				
			caso '5':
				escreva("Voce escolheu sair")
				pare
			//não tem break por ser ultima opção,sendo no final, sendo executada quando não a escolha de caso.
			padrão:
				escreva("Opção inválida! Tente outra vez!!!")
		}
	fim
	
	