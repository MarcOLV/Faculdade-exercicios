algoritmo exercicio11
	real num1, num2, soma, subtracao, multiplicacao, divisao,resto
	inicio
	escreva("Digite o valor do primeiro número:")
	leia(num1)
	escreva("Digite o valor do segundo número:")
	leia(num2)
	soma = num1 + num2
	subtracao = num1 - num2
	multiplicacao = num1 * num2
	divisao = num1 / num2
	resto = num1%num2
	
	escreva("O resultado das seguintes operações, soma: "+ soma+ ", subtração: "+ subtracao +", multiplicação: " + multiplicacao + ", divisão: " + divisao)
	fim