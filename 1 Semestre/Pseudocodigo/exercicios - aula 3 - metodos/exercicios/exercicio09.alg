algoritmo exercicio09
	real peso, altura, imc1
	
	inicio
	
	escreva("Digite o peso: ")
	leia(peso)
	escreva("Digite a altura: ")
	leia(altura)
	
	imc1 = imc(peso, altura)
	
	escreva("O IMC É DE: " + imc)
	
	
	
	fim
	
void real imc(real peso, real altura)
	inicio

		retorne peso/altura²
	
	fim