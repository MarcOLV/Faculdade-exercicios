algoritmo exemplo5
	real b, h
	escreva("escreva a base do triângulo:")
	leia(b)
	escreva("escreva a altura do triângulo:")
	leia(h)
	escreva("A area do triangulo é: " + areadotriangulo(b, h)+ "cm2")
	
	fim
	
	real areadotriangulo(real h, real b)
	
	
	inicio
	retorne = ((b*h)/2)
	fim