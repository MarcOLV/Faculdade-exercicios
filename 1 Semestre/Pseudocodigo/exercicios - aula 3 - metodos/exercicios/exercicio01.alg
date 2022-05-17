algoritmo exercicio1	
	real kminicial,kmfinal,qntdl, preco, gasto,distancia,consumo
	
	inicio
	
	escreva("Digite o KM inicial:")
	leia(kminicial)
	escreva("Digite o KM final:")
	leia(kmfinal)
	escreva("Digite o Preço da gasolina:")
	leia(preco)
	distancia = distanciaperco(kminicial, kmfinal)
	escreva("A distancia percorrida foi de: " + distancia))
	escreva("Digite a quantidade de litros que foi abastecida:")
	leia(qntdl)
	consumo = consumomedio(distancia, qntdl)
	escreva("O consumo medio do veiculo foi: " + consumo)
	gasto = valorgasto(qntdl, preco)
	escreva("O valor gasto foi de: " + gasto)
	
	
	
	fim
	
	real distanciaperco(real kminicial, real kmfinal)
	inicio

		retorne kminicial - kmfinal
	
	fim
	
	real consumomedio(real qntdl, real distancia)
	inicio
		
		retorne distancia / qntdl

	fim
	
	real valorgasto(real litrosgastos, real preco)
	inicio
	
		retorne litrosgastos * preco
		
	fim