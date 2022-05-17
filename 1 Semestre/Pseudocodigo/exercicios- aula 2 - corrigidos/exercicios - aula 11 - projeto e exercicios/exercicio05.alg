algoritmo exercicio5aula11
    inteiro i, controle = 0
    real numero[10]
    início
	para(i=0; i <10; i++){
		escreva("Digite um numero inteiro: " )
		leia(num[i])
	}
	
	para(i=0; i <10; i++){
		se(num[i] > 50){
			se(num[i]%2 != 0 ){
			escreva("Achei" + num[i] + " posição: " + i)
			controle++
			}
			}
	}
	se(controle==0){
	escreva("não a numeros impares maiores que 50")
	}
	fim
	
	