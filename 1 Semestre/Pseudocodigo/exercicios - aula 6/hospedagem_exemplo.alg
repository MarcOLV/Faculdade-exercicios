algoritmo hospedagem
	caractere tipo
	inteiro diarias
	
	inicio
		escreva("Digite a quantidade de diárias: ")
		leia(diarias)
		escreva("Digite o tipo de hospedagem (S - simples | D - dupla | T - tripla) ")
		leia(tipo)
		
		se(tipo == 's' ou tipo == 'S')
			escreva("Valor total: R$ " + (diarias*255.50))
			
		senao se(tipo == 'd' ou tipo == 'D')
			escreva("Valor total: R$ " + (diarias*305.50))
			
		senao se(tipo == 't' ou tipo == 'T')
			escreva("Valor total: R$ " + (diarias*360.50))
		
		senao
			escreva("Opção inválida! Tente outra vez!!!")
	fim