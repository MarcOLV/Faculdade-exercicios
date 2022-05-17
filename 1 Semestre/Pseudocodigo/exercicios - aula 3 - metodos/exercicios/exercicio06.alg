algoritmo exercicio06
	real valor,novovalor
	
	inicio
	
	escreva("Digite valor do produto:")
	leia(valor)
	novovalor = (valorfinal(valor)) - valor
	escreva("o valor final do produto é de: " + novovalor)
	
	fim
	
	real valorfinal(real valor)
	inicio

		retorne valor - (valor*0.9)
	
	fim