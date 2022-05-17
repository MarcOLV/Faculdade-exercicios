algoritmo exemplo04
	inteiro i,contador,menor,maior
	real salario[10],soma
	inicio
	soma = 0 
	menor = 0
	//calcular media
	para(i=0; i<10; i++){
		escreva("Digite o salario do " + (i+1) + " funcionario: ") 
		leia(salario[i])
		soma = soma + salario[i]
	}
	media = soma/10
	//maior salario
	maior = salario[0]
	para(i=1; i<10; i++){
		se(salario[i] > maior){
		maior = salario[i]
		}
	}
	//quantidade de salario menor que 850
	para(i=0; i<10; i++){
		se(salario[i] <850){
		menor++
		}
	}
	escreva("A media dos salarios é de: " + media)
	escreva("O maior dos salarios é: " + maior)
	escreva("existem " + menor + " salarios menores que 850")
	
	fim
	
	