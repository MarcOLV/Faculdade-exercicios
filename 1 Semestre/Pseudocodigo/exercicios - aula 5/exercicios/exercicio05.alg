algoritmo exercicio5
	real bhaskara, deltax, x1, x2, a, b, c
	
	inicio
	escreva("Digite o valor de a: ")
	leia(a)
	escreva("Digite o valor de b: ")
	leia(b)
	escreva("Digite o valor de c: ")
	leia(c)
	deltax = delta(a, b, c)
	se(deltax >= 0 )
		x1 = textex1(b, deltax, a)
		x2 = textex2(b, deltax, a)
		escreva("O valor de x1 é: " + x1 + "O valor de x2 é: " + x2)
	senao 
		escreva("Não serão calculadas as raizes")



	fim
	
	real delta(real a, real b, real c)
	inicio

		retorne (b * b) - 4 * a * c
	
	fim
	
	real testex1(real b, real delta, real a)
	inicio
	
		retorne(-b + raiz(delta)) / (2*a)
				
	fim
	
	real testex2(real b, real delta, real a)
	inicio
	
		retorne(-b - raiz(delta)) / (2*a)
				
	fim