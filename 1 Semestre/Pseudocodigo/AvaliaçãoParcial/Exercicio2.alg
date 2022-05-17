algoritmo exercicio2
    inteiro i, nota, aprovado
	real soma,media
    início
	soma = 0
	aprovado = 0
	
    para(i = 1; i <= 20 ; i++){ 
        escreva("Digite a nota aluno" + i)
        leia(nota)
        se(nota >= 6)){ 
            aprovado++
        }
        soma += nota
		}
        media = soma/20
        escreva("A quantidade de alunos com nota acima de 6 e aprovados é de: " + aprovado)
        escreva("A media geral das notas da turma é: " + media)
    fim
	
		//Marco Antonio Oliveira RGM 27566340