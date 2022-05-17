algoritmo exemplo5
	real media,num,soma
	inteiro qtnum
	caractere resp
	inicio
		resp = 's'
		soma = 0
		qnnum = 0
		enquanto(resp == 's' ou resp == 'S'){
		escreva("digite um numero: ")
		leia(num)
		soma = soma + num
		qtnum++
		
		escreva("Deseja continuar? S/N")
		leia(resp)
		
		}
	media = soma/qtnum
	escreva("A media dos numeros digitados é: " + media)
	
fim