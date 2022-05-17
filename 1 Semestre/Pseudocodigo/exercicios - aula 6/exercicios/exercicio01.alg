algoritmo exercicio1
	real salario,novosal
	inteiro codigo
	inicio
		escreva("Digite o seu salario:")
		leia(salario)
		escreva("Digite o codigo do seu cargo:")
		leia(codigo)
	
		escolha(codigo){
	
			caso 1:
				escreva("Voce é escriturario")
				novosal = salario * 1.50
				escreva("Seu novo salario é de: " + novosal)
				pare

			caso 2:
				escreva("Voce é secretario")
				novosal = salario * 1.35
				escreva("Seu novo salario é de: " + novosal)
				pare

			caso 3:
				escreva("Voce é caixa")
				novosal = salario * 1.20
				escreva("Seu novo salario é de: " + novosal)
				pare
			
			caso 4:
				escreva("Voce é gerente")
				novosal = salario * 1.10
				escreva("Seu novo salario é de: " + novosal)
				pare
				
			caso 5:
				escreva("Voce é diretor")
				novosal = salario
				escreva("Você não tem aumento de salario)
				pare
			padrão:
				escreva("Codigo inválido! Tente outra vez!!!")
		}
	fim
	
	