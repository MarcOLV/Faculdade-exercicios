algoritmo exercicio02
	inteiro qtndh
	real valorsal
	caractere turno
	inicio
		escreva("Digite o turno trabalhado, N = noturno, demais escrever:")
		leia(turno)
		escreva("Digite quantas horas foram trabalhadas:")
		leia(qtndh)
		se (turno == N)
			valorsal = qtndh * 45 
			escreva("Seu salario é de:" + valorsal")
		senao
			valorsal = qtndh * 37.50 
			escreva("Seu salario é de:" + valorsal")
	fim