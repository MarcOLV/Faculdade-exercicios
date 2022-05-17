
    algoritmo exemplo6
    real numeros[3][2], media,soma
    inteiro i, j, maiorq
    inicio
        para(i=0; i<3;i++){​​​​​​
            para(j=0; j<2;j++){​​​​​​
            escreva("Insira um numero:")
            leia(numeros[i][j])
            soma+=numeros[i][j]
            }​​​​​​
        }​​​​​​
        media=soma/6
       escreva("A media total é:" + media)

        para(i=0; i<3;i++){​​​​​​
            para(j=0; j<2;j++){​​​​​​
                se(numeros[i][j]>media){​​​​​​
                   maiorq++
                }​​​​​​
            }​​​​​​
        }​​​​​​
            escreva("A média é: "+media+"\nA quantidade de numeros maiores que a média é: "+maiorq)
    fim
