algoritmo exemplo01
	inteiro i,contador
	real salario[5]
	inicio
	//armazenamento de dados
	para(i=0; i<5; i++){
		escreva("Digite o salario do " + (i+1) + " funcionario: ") 
		leia(salario[i])
	}
	//Processamento de dados
	para(i=0; i<5; i++){
		se(salario[i] > 1000)
		contador++
	}
		//apresentando valores
	para(i=0; i<5; i++){
		escreva("Salario do " + (i+1) + " funcionario " + salario[i])
	}
	
	
	fim