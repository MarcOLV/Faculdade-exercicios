algoritmo exercicio08
	real valor25, valor10, valor5, reais1
	
	inicio
	
	escreva("Digite quantas moedas de 25 foram inseridas:")
	leia(valor25)
	escreva("Digite quantas moedas de 10 foram inseridas:")
	leia(valor10)
	escreva("Digite quantas moedas de 5 foram inseridas:")
	leia(valor5)
	
	reais1 = reais(valor25, valor10, valor5)
	
	escreva("o valor em reais é de: " + reais)
	
	fim
	
	real reais(inteiro valor25, inteiro valor10, inteiro valor5)
	inicio

		retorne ((valor25 + valor10 + valor5)/100)
	
	fim