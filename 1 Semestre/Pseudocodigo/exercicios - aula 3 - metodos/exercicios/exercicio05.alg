algoritmo exercicio5
	real distancia,tempo
	
	inicio
	escreva("Digite a distancia do objeto 1: ")
	leia(distancia)
	escreva("Digite o tempo que percorreu o objeto 1: ")
	leia(tempo)
	escreva("A velocidade do primeiro objeto é: " + velocidade(distancia, tempo))

	escreva("Digite a distancia do objeto 2: ")
	leia(distancia)
	escreva("Digite o tempo que percorreu o objeto 2: ")
	leia(tempo)
	escreva("A velocidade do segundo objeto é: " + velocidade(distancia, tempo))
	
	escreva("Digite a distancia do objeto 3: ")
	leia(distancia)
	escreva("Digite o tempo que percorreu o objeto 3: ")
	leia(tempo)
	escreva("A velocidade do terceiro objeto é: " + velocidade(distancia3, tempo3))
	

	fim
	
	real velocidade(real distancia, real tempo)
	inicio

		retorne distancia / tempo
	
	fim
