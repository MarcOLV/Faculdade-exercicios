algoritmo exercicio05
	real salario, aumento, novosal,novoaumento
	
	inicio
	
	escreva("Digite o seu salario: ")
	leia(salario)
	escreva("Digite o porcenteual de aumento: ")
	leia(aumento)
	
	novoaumento = aumento1(salario, aumento)
	novosal = aumentosal(salario, aumento)
	escreva("o novo salario será de: + novosal)
	escreva("o valor do aumento é de: + novoaumento)
	
	fim
	
 real aumentosal(real salario, real aumento)
	inicio
		
		retorne salario + (salario * (aumento/100) 
	
	fim

 real aumento1(real salario, real aumento)
	inicio
		
		retorne (salario * (aumento/100) 
	
	fim
	