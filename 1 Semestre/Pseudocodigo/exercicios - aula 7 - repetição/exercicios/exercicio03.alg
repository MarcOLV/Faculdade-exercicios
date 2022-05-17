algoritmo exercicio3
	inteiro i,n
	real soma
    início
	soma = 0
	escreva("Digite um numero inteiro: ")
	leia(n)
	para(i = 1; i <= n; i++){
	soma = soma + 1/i
	}
	escreva("A soma é: " + soma)
    fim
	
   /*Teste de mesa
   n = 4
   i = 1 => soma = 0 + 1/1 = 1
   i = 2 => soma = 1 + 1/2 = 1.5
   i = 3 => soma = 1 + 1/2 + 1/3
   i = 4 => soma = 1 + 1/2 + 1/3 + i/4