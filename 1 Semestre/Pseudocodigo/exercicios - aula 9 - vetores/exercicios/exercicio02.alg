algoritmo exercicio01
	inteiro i,num[10],maior
	inicio
	para(i = 0; i <10; i++){
		escreva("Digite um numero para entrar no vetor:")
		leia(num[i])
		se(i == 0){
			maior = num[i]
		}
		senao se(num[i] > maior){
		maior = num[i]
		}
		}
		
		para(i = 0; i < 10; i++){
		num[i] = num[i] /maior
		}
		
		escreva("O maior valor é " + maior)
		escreva("O valor pelo vetor é de " + num[i]
	fim