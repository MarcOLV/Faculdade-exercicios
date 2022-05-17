algoritmo exercicio08
	inteiro i, aprovado
	real nota,soma, media
    início
	aprovado = 0
	soma = 0
	para(i=1;i <=80;i++){
		faça{
		escreva("Digite a nota do " + i + " aluno")
		leia(nota)
		se(nota < 0 ou nota >10)
			escreva("Nota invalida!")
		}enquanto(nota < 0 ou nota >10)
		
		soma = soma + nota
		se (nota >=6){
		aprovado++
		}
	}
		media = soma/80
		escreva("A quantidade de alunos aprovados é: " + aprovado)
		escreva("A media da turma é: " + media)
    fim
    
    