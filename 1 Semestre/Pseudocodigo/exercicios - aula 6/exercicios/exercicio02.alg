algoritmo exercicio2
	inteiro digito
	inicio
		escreva("Digite o digito final de sua placa:")
		leia(digito)
	
		se(digito == 1 ou digito == 2)
			escreva("Rodizio de segunda-feira")
		
		senao se(digito == 3 ou digito == 4)
			escreva("Rodizio de terça-feira")
			
		senao se(digito == 5 ou digito == 6)
			escreva("Rodizio de quarta-feira")
			
		senao se(digito == 7 ou digito == 8)
			escreva("Rodizio na quinta-feira")
			
		senao se(digito == 9 ou digito == 0)
			escreva("Rodizio de sexta-feira")
			
		senao
			escreva("Final da placa, digito invalido")
	fim
	
	