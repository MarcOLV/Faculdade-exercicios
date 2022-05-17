algoritmo exercicio05
	inteiro valor,contador,valormaior,n
	real media = 0
    início
		valormaior = 0
		escreva("Digite quando valores voce deseja:")
		leia(n)
		contador = 0
		enquanto(contador < n){
		escreva("Digite um numero:")
		leia(valor)
			se(contador == 1){
			valormaior = valor
			}
			senao se(valormaior < valor){
			valormaior = valor;
			}
			media = media + valor
			contador++
		}
		escreva("A media dos valores é de: " + (media/n)
    fim
    
    
  