algoritmo exercicio07
	real telheiroqntd, quadradoqntd, valorjunto, comissaofinal
	
	inicio
	
	escreva("Digite a quantidade de prego quadrado:")
	leia(quadradoqntd)
	
	escreva("Digite a quantidade de prego telheiro:")
	leia(telheiroqntd)
	
	valorjunto = telheiro(telheiroqntd) + quadrado(quadradoqntd)
	
	escreva("O valor dos dois tipos de pregos juntos é de: " + valorjunto)
	
	comissaofinal = comissao(valorjunto)

	escreva("E a comissão dada será de: " + comissaofinal)
	
	fim
	
	real telheiro(real qntd)
	inicio

		retorne 1.05 * qntd
	
	fim
	
	real quadrado(real qntd)
	inicio

		retorne 0.51 * qntd
	
	fim
	
	real comissao(real valor)
	inicio

		retorne valor - (valor*0.10)
	
	fim