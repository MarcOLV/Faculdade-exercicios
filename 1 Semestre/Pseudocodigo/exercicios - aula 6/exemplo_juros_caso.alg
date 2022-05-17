 algoritmo juros
    inteiro numparcelas
    real valorcompra,valorparce
        inicio
            escreva("Digite o valor da compra: R$")
            leia(valorcompra)
            escreva("Digite o numero de parcelas: (2/4/6/8) ")
            leia(numparcelas)
            escolha(numparcelas)
                caso 2:
                    valorparce=(valorcompra*1.03)/2
                    escreva("O total a pagar em 2 parcelas: R$"+(pagar)+"\nCada parcela: "+valorparce)
                pare
                caso 4:
                    valorparce=(valorcompra*1.07)/4
                    escreva("O total a pagar em 4 parcelas: R$"+(pagar)+"\nCada parcela: "+valorparce)
                pare
                caso 6:
                    valorparce=(valorcompra*1.09)/6
                    escreva("O total a pagar em 6 parcelas: R$"+(pagar)+"\nCada parcela: "+valorparce)
                pare
                caso 8:
                    valorparce=(valorcompra*1.12)/8
                    escreva("O total a pagar em 8 parcelas: R$"+(pagar)+"\nCada parcela: "+valorparce)
                pare
                padrao
                    escreva("Este número de parcela não é coberta! ")
				}
        fim
