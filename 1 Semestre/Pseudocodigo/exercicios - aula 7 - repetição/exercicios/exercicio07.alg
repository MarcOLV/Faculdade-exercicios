algoritmo exercicio7
	caractere sexo, resposta
	real altura, somaM, somaF
	inteiro m, f
	
    início
		resposta = 's'
		somaM = 0
		somaF = 0
		m = 0
		f = 0
		enquanto(resposta == 's' ou resposta == 'S'){
		escreva("Digite o sexo M/F: ")
		leia(sexo)
		escreva("Digite a altura: ")
		leia(altura)
			se(sexo == 'm' ou sexo == 'M'){
				m++
				somaM = somaM + altura
			}
			senao{
				f++
				somaF = somaF + altura
			}
			
		escreva("Deseja continuar s/n?")
		leia(resposta)
	}
	escreva("A media da altura das mulheres é: " + (somaF/f))
	escreva("A media da altura dos homens é: " + (somaM/m))
	 fim
    
    
  