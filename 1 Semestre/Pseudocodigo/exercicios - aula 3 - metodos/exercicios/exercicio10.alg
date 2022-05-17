algoritmo exercicio10
	real reais1, cotacao1, dolar
	
	inicio
	
	escreva("Digite o valor total de reais: ")
	leia(reais1)
	escreva("Digite a cotação do dolar atual: ")
	leia(cotacao1)
	
	dolar = dolares(reais1, cotacao1)
	
	escreva("O valor de reais em dolar será de: " + dolar)
	
	
	
	fim
	
	real dolares(real reais, real cotacao)
	inicio

		retorne reais * cotacao
	
	fim