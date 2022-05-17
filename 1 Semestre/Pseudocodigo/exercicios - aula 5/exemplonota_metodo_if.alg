	algoritmo nota 
	real nota1, nota2,media
incicio
	escreva ("Digite sua  nota 1: ")
	leia(nota1)
	escreva("Digite sua nota 2: ")
	leia(nota2)
	
	media = calculamedia(nota1, nota2)
	
	se(media >= 6)
		escreva("Aprovado")
	senao
		se(media>=3)
			escreva("Avaliação final")
		senao
			escreva("Reprovado")
fim

	real calculamedia(real nota1, real nota2)
		real media
		media = (nota1+nota2)/2
		retorne(media)
		
	fim
















