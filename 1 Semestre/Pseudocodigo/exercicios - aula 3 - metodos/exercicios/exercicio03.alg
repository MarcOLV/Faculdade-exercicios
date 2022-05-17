algoritmo exercicio3
	real valor, qntd, valorfinal, juros
	
	inicio
	escreva("Digite o valor de compra: ")
	leia(valor)
	escreva("Digite o numero de parcelas: ")
	leia(qntd)
	juros = 0.5 * valor
	valorfinal = valorparcelado(valor, qntd) + juros
	escreva("O valor da compra parcelada é: " + valorfinal)



	fim
	
	real valorparcelado(real valor, real qntd)
	inicio

		retorne valor/qntd
	
	fim