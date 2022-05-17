algoritmo exercicio3
	real aceleracao
	inicio
		escreva("Digite a aceleracao do veiculo em m/s²: ")
		leia(aceleracao)    
		bateu(aceleracao)
	fim
	
	real calculoDist(real ac)
		retorne 400/2*ac
	
	void bateu(real ac)
	se(calculoDist(ac) >= 100)
		escreva("Bateu")
	senao
		escreva("Ufa")