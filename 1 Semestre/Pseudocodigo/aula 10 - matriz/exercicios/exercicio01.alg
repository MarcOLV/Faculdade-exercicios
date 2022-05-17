	algoritmo exercicio01
	real vendas[6][4] //linha vendedor, coluna semana
	inteiro i,j
	real soma,media,totalmes
	inicio
	//entrada de dados e armazenamento na matriz
	 para(i=0; i<6;i++){​​​​​​
            para(j=0; j<4;j++){​​​​​​
            escreva("Digite o valor da venda do" + (i+1) + " na semana:" + (j+1))
            leia(vendas[i][j])
            }​​​​​​
        }​​​​​​
	//processamento das linhas (vendedor)
	 para(i=0; i<6;i++){​​​​​​
	 soma = 0
            para(j=0; j<4;j++){​​​​​​
			soma = soma + vendas[i][j]
			}
			media = soma/4
			escreva("total vendedor " + (i+1) + " R$" +  soma + " e sua media: " + media))
		}
	totalmes = 0 //acumulador total do mês
	//processamento das colunas(semanas)
	 para(j=0; j<4;j++){​​​​​​
	 soma = 0
            para(i=0; i<6;i++){​​​​​​
			soma = soma + vendas[i][j]
			}
			totalmes = totalmes + soma//soma para verificar o total do mês
			escreva("total da semana " + (j+1) + " R$" +  soma)
		}
		escreva("O total do mes foi de R$: " + totalmes)
		
		
		fim