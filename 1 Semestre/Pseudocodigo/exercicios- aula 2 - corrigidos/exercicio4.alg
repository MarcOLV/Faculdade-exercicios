algoritmo exercicio4
	real area, base, volume, raio, altura
	inicio
	escreva("digite a altura:")
	leia(altura)
	escreva("digite o raio(metade do comprimento de seu diâmetro):")
	leia(raio)
	area = 3.14 * (raio * raio)
	volume = altura * 3.14 * ((raio) * (raio))
	escreva("Área da base: " + area + ", O volume do cilindro é de: " + volume)
	fim