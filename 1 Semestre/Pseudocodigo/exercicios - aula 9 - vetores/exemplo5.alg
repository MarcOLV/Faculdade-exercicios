algoritmo exemplo05
	inteiro vendedor[10], i
	real valor[10],soma,valortotal, valorfinal
	inicio
	//armazenamento de dados
	soma = 0
	valorfinal = 0
	para(i=0; i<10; i++){
		escreva("Digite quantidade vendida: ") 
		leia(vendedor[i])
		escreva("Digite o valor da peça: ") 
		leia(valor[i])
		soma = soma + vendedor[i]
	}
	para(i=0; i<10; i++){
		valortotal = vendedor[i] * valor[i]
		escreva("O vendedor" + (i+1) + "vendeu : " + venda
		valorfinal = valorfinal + venda
	}
	
	escreva("O valor total da venda foi de : " + valorfinal)
	fim