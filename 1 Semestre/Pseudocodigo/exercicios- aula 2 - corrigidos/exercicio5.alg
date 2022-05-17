
	algoritmo exercicio5
	real x1, x2, delta, a, b, c 
	inicio
	escreva("digite o valor de A:")
	leia(a)
	escreva("digite o valor de B:")
	leia(b)
	escreva("digite o valor de C:")
	leia(c)
	delta = (b * b) - 4 * a * c
	x1 = (-b + raiz(delta)) / (2*a)
	x2 = (-b - raiz(delta)) / (2*a)
	escreva("valor da raiz 1 é de: " + x1 + "valor da raiz 2 é de: " + x2)
	fim