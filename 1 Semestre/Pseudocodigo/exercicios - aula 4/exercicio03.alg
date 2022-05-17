algoritmo exercicio03
	inteiro data, dia, mes, ano
	inicio
		escreva("Digite a data que quer separar: ")
		leia(data)
	
		dia = data / 10000
		mes = data%1000/100
		ano = dara%100
		escreva("Dia: " + dia)
		escreva("Mes: " + mes)
		escreva("Ano: " + ano)
	fim