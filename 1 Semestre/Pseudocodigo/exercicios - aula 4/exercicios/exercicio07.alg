algoritmo exercicio07
	real tamanho, altura, distancia
	inicio
	
	escreva("Digite o tamanho da escada: ")
	leia(tamanho)
	escreva("Digite a altura em que deseja pregar o quadro: ")
	leia(altura)

	distancia = raiz(tamanho*tamanho - altura*altura)
	escreva("A distancia será de: "+ distancia)
	
	fim
	