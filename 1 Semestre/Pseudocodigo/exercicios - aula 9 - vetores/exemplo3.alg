algoritmo exemplo03
	inteiro i, cont
	real num[8],soma, media,acima[8]
	inicio
	soma = 0
	para(i=0; i<8; i++){
		escreva("Digite um numero") 
		leia(num[i])
		soma = soma + num[i]
	}
	media = soma /8
	para(i=0; i <8; i++){
		se(num[i] > media){
			acima[cont] = num[i]
			cont++
			}
	}
	escreva("A media dos valores é de : "  + media)
	escreva("existem : "  + cont + "numeros acima da media ")
	escreva("Numeros acima da media: ")
	para(i=0; i<cont; i++){
		escreva(acima[i] + "\n " )
	}
	
	fim
	