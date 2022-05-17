algoritmo exercicio01
	inteiro i,menor,maior
	real venda[10],soma,mediavendida
	inicio
	soma = 0
	mediavendida = 0
	para(i=0; i<10; i++){
		escreva("Digite O quanto você vendeu? ") 
		leia(venda[i])
		soma = soma + venda[i]
	}
	media = soma/10
	se(media > mediavendida){
	mediavendida = mediavendida + 1
	}
	maior = venda[0]
	para(i=1; i<10; i++){
		se(venda[i] > maior){
		maior = venda[i]
		}
	}
	menor = venda[0]
	para(i=0; i<10; i++){
		se(venda[i] < menor){
		menor = venda[i]
		}
	} 
	escreva("A menor quantidade é " + menor + " a maior quantidade é " + maior )
	escreva("A media da quantidade é " + media)
	escreva("A media foi superada em " + mediavendida + " dias")
	fim