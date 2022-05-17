algoritmo exemplo7		
	inteiro num, quadrado, i
	inicio
		faça{
		escreva("Digite um número, (0 para sair): ")
		leia(num)
		para(i = 0; i <= num; i++){
		quadrado = i*i
			escreva("Quadrado de " + i + " ao quadrado é" + quadrado)
		}
		}enquanto (num != 0)
	fim