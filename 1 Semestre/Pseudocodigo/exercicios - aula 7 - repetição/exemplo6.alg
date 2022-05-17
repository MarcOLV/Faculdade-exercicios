algoritmo exemplo6
	inteiro num,soma
	inicio
		soma = 0
		faça{
		escreva("Digite um número inteiro (0 para sair): ")
		leia(num)
		se(num%2 !=0)
			soma = soma + num
		}enquanto(num !=0)
		
		escreva("A soma dos impares = " + soma)
fim