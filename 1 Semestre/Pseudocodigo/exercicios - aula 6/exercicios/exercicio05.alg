algoritmo exercicio5
	real ida,volta,passagem
	inteiro destino,meio
	inicio
		escreva("A tabela a seguir mostrara os destinos disponiveis")
		escreva("1 - Região Norte:")
		escreva("2 - Região Nordeste:")
		escreva("3 - Região Centro-Oeste:")
		escreva("4 - Região Sul:")
		escreva("Digite para onde ira viajar, digite o número apresentado:")
		leia(destino)
	
		escolha(destino){
	
			caso 1:
				escreva("Se desejar ir ida somente,digite 1")
				escreva("Se desejar ir ida e volta,digite 2")
				leia(meio)
				
				se(meio == 1)
					passagem == 500
					escreva("Sua passagem de ida para " + destino + "ficara no valor de: " + passagem)

				senao se(meio == 2)
					passagem == 900
					escreva("Sua passagem de ida e volta para " + destino + "ficara no valor de: " + passagem)

				senao
					escreva("Não a opções sem ser 1 e 2")

				pare

			caso 2:
				escreva("Se desejar ir ida somente,digite 1")
				escreva("Se desejar ir ida e volta,digite 2")
				leia(meio)
				
				se(meio == 1)
					passagem == 350
					escreva("Sua passagem de ida para " + destino + "ficara no valor de: " + passagem)

				senao se(meio == 2)
					passagem == 650
					escreva("Sua passagem de ida e volta para " + destino + "ficara no valor de: " + passagem)

				senao
					escreva("Não a opções sem ser 1 e 2")

				pare

			caso 3:
				escreva("Se desejar ir ida somente,digite 1")
				escreva("Se desejar ir ida e volta,digite 2")
				leia(meio)
				
				se(meio == 1)
					passagem == 350
					escreva("Sua passagem de ida para " + destino + "ficara no valor de: " + passagem)

				senao se(meio == 2)
					passagem == 600
					escreva("Sua passagem de ida e volta para " + destino + "ficara no valor de: " + passagem)

				senao
					escreva("Não a opções sem ser 1 e 2")

				pare
			caso 4:
				escreva("Se desejar ir ida somente,digite 1")
				escreva("Se desejar ir ida e volta,digite 2")
				leia(meio)
				
				se(meio == 1)
					passagem == 600
					escreva("Sua passagem de ida para " + destino + "ficara no valor de: " + passagem)

				senao se(meio == 2)
					passagem == 550
					escreva("Sua passagem de ida e volta para " + destino + "ficara no valor de: " + passagem)

				senao
					escreva("Não a opções sem ser 1 e 2")

				pare
		
			padrão:
				escreva("Codigo inválido! Não temos nenhum destino para esse codigo!!!")
		}
	fim
	