algoritmo exercicio02
    real minimo,kw, custo,novocustodesconto,valorpago
    inicio
        escreva("Digite o valor do salario minimo: ")
        leia(minimo)
        escreva("Quantidade De quilowatts gasta: ")
        leia(kw)
       
       custo = (minimo/700)
       
        escreva("Vai custar cada kw: " + custo)
		
		valorpago = custo * kw
	
		escreva("O preço a ser pago: " + valorpago)
		
	 novocustodesconto = valorpago * 0.9
	 
		escreva("O desconto fara com que fique o preço de: " + novocustodesconto)
    fim
 