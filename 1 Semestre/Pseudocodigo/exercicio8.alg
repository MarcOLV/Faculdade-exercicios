algoritmo exercicio8
	inteiro hora, minutos
	
	
	inicio
	escreva("Digite a hora de inicio:")
	leia(hora)
	escreva ("Digite os minutos:")
	leia(minutos)
	
	escreva("Passaram - se o total de:  " + horario(hora, minuto))
	fim
	
	
	real horario(inteiro hora, inteiro minutos)
	inicio
	retorno = (hora*60) + minutos
	fim
	
	