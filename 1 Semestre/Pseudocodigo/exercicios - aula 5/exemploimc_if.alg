algoritmo exemplo5imc
	real peso, altura, imc
	inicio
		escreva("Digite seu peso em kg:")
		leia(peso)
		escreva("Digite sua altura em m:")
		leia(altura)
		
		imc = peso/(altura*altura)
		
		se (imc < 20)
			escreva("Abaixo do peso")
		senao se(imc < 25)
			escreva("Peso normal")
		senao se(imc < 30)
			escreva("Sobrepeso")
		senao se(imc < 40)
			escreva("Obeso")
		senao
			escreva("Obeso Morbido")
			
	fim