algoritmo exemplo4
    real nota[10][3], soma, media
    inteiro i, j
    início
        para(i=0; i<10; i++){
            para(j=0; j<3; j++){
                escreva("Digite a"+(j+1)+"ª nota do "+(i+1)+ "º aluno: ")
                leia(nota[i][j])
            }
        }
        para(i=0; i<10; i++){
            soma=0
            para(j=0; j<3; j++){
                soma = soma + nota[i][j]
            }
            media = soma/3
            escreva("Media do " +(i+1)+"º aluno: " + media)
        }
    fim