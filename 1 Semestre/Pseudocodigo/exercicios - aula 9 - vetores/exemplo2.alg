ealgoritmo exemplo02
	inteiro i,n
	real x[200]
	inicio
	escreva("digite a quantidade de valores:")
	leia(n)
	para(i=0; i<n; i++){
		escreva("digite valor:")
		leia(x[i])
	}
	
	real soma, media
	soma = 0
	
	para(i=0; i<n; i++){
		soma = soma + x[i]
	}
	
	media = soma /n
	escreva("Media é: " + media)