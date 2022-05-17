algoritmo exemplo
	literal aluno[3]
	real nota[3][2]
	inteiro i,j
	
	inicio
		para(i=0;i<3;i++){
			escreva("Digite o nome:")
				leia(aluno[i])
			para(j=0;j<2;j++){
			escreva("Digite a nota do aluno:" + aluno[i])
				leia(nota[i][j])
			
		}
		}
		
		para(i=0;i<3;i++){
			para(j=0;j<2;j++){
			escreva(nota[i][j])
			}
			}
fim