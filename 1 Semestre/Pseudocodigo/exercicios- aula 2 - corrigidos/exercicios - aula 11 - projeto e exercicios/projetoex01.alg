algoritmo projetoex01
real soma, salario, dec13, adicional
literal mes[] = {"jan", "fev", "mar",..., "nov", "dez"}
inteiro i
inicio
para(i=0;i<12;i++){
	escreva("Digite o salario do mês :" + mes[i])
		leia(salario)
		soma = soma + salario
		}
	dec13 = soma/12
	adicional = dec13 *(1/3)
	escreva("Decimo terceiro salario a receber R$: " + dec13)
	escreva("Adicional de ferias a receber R$: " + adicional)
	
	
fim