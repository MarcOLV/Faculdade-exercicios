 algoritmo calculemedias
	real nota1,nota2,ponde,arit
	caractere tipo
	inicio
		escreva("Digite a nota 1:")
        leia(nota1)
        escreva("Digite a nota 2:")
        leia(nota2)
		escreva("Digite o tipo de metodo que você gostaria, A - Aritmetica, P - ponderada:")
        leia(tipo)
		
	escolha(tipo)
		caso 'A':
			arit = (nota1 + nota2) /2
			escreva("A media aritmetica do aluno é de: " + arit )
			pare
		caso 'P':
			ponde = (nota1*3 + nota2*7)/10 
			escreva("A media ponderada do aluno é de: " + ponde )
			pare
		padrao:
			escreva("Não Fazemos esse tipo de media")
	}
fim