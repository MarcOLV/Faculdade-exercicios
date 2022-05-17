algoritmo exercicio06
	inteiro valor,contador,qtndposi,qtndnega,n,valormenor
    início
		valormenor = 0
		qtndposi = 0
		qtndnega = 0
		escreva("Digite quando valores voce deseja:")
		leia(n)
		para(i = 1; i <= n ; i++){
		escreva("digite um valor: ")
		leia(valor)
		
		se(i == 1){
		valormenor = valor
		}
		senao se(valor<valormenor){
		valormenor = valor
		}
		
		se(valor > 0){
              qtndposi = qtndposi + 1;
          }
         senao se(valor< 0){
              qtndnega = qtndnega + 1;
          }
		  
		  }
		  escreva("O valor menor é de: " + valormenor)
		  escreva("Existem: " + qtndposi + " Valores positivos")
		   escreva("Existem: " + qtndnega + " Valores negativos")
    fim
    
    
  