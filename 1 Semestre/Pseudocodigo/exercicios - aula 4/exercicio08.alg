algoritmo exercicio08
	real degraualt, desejadaalt, qtnddegrau
	inicio
	
	escreva("Digite a altura do degraus: ")
	leia(degraualt)
	escreva("Digite a altura que quer subir junto a escada: ")
	leia(desejadaalt)

	qntddegrau = quantidadedegraus(degraualt, desejadaalt)
	
	escreva("A quantidade de degraus é: + qntddegrau)
	
	fim
	
	real quantidadedegraus(real altura, real desejada )
	inicio
		
		retorne (altura * 100)/desejada
	
	fim