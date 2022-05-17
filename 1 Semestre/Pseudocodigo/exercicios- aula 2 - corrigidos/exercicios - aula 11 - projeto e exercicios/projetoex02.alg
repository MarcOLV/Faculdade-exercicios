algoritmo projetoEx02
    real valorc, valorv, taxae
    início
	faça{
        escreva("Digite o valor de compra")
        leia(valorc)
	}enquanto(valorc<0)
        se(valorc <= 100)
            taxae = 10
        senao se(valorc <= 250)
            taxae = 17
        senao se(valorc <= 950)
            taxae = 20
        senao 
            taxae = 25
        valorv = valorc*1.15 + taxae
        escreva("A valor total a pagar é de R$" + valorv)
    fim
    
    
  
  
