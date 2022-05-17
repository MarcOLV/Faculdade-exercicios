algoritmo hospedagem2
	caractere tipo
	inteiro diarias
	
	inicio
		escreva("Digite a quantidade de diárias: ")
		leia(diarias)
		escreva("Digite o tipo de hospedagem (S - simples | D - dupla | T - tripla) ")
		leia(tipo)
		
		
		escolha(tipo){
			caso 's':
			caso 'S':
				escreva("Valor total: R$ " + (diarias*255.50))
				pare
			caso 'd':
			caso 'D':
				escreva("Valor total: R$ " + (diarias*305.50))
				pare
			caso 't':
			caso 'T':
				escreva("Valor total: R$ " + (diarias*360.50))
				pare
			padrão:
				escreva("Opção inválida! Tente outra vez!!!")
		}
	fim