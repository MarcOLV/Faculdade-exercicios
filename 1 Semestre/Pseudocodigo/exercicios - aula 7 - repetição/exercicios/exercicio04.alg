algoritmo exercicio04
	inteiro i,n
	real soma,media,valor
    início
	soma = 0
	escreva("Digite a quantidade de valores processados: ")
	leia(n)
	para(i = 0; i <= n; i++){
		 escreva("Digite o valor: ")
		 leia(valor)
		 soma = soma + valor
	}
	media = soma/n
	escreva("A média dos valores digitados é: " + media)

    fim
    
    