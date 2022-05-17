algoritmo exercicio3
	real area1, area2, area3, altura1, base1, base2
	inicio
	escreva("digite a altura do retangulo:")
	leia(altura1)
	escreva("digite a base do retangulo:")
	leia(base1)
	area1 = base1 * altura1
	escreva("digite a base do retangulo 2:")
	leia(base2 )
	area2 = base2 * altura1
	area3 = area1 + area2
	escreva("Área total: " + area3 + "Área do retangulo 1:" + area1 + " Área do retangulo 2: " + area2)
	fim