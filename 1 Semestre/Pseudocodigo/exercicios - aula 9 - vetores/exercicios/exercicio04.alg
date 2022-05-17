algoritmo exercicio04
	inteiro i,notas[10],soma,cursotads,alunosacima
	real media
	caractere nomes[10],curso[10]
	inicio
	soma = 0
	alunosacima = 0
	cursotads = 0
	para(i=0;i<10;i++){
	escreva("Digite o nome do aluno")
		leia(nomes[i])
	escreva("Digite a nota final somada do aluno:")
		leia(notas[i])
    escreva("Digite o CURSO(CCP OU TADS)")
		leia(curso[i])
	
	soma = soma + notas[i]
	}
	media = soma/10
	
	para(i=0;i<10;i++){
	se(curso[i] == "TADS"){
	cursotads = cursotads + 1
	}
	}
	para(i=0;i<10;i++){
	se(notas[i]>media){
	alunosacima= alunosacima + 1
	}
	}
	escreva("Existem " + cursotads + " alunos no curso de TADS")
	escreva("A media dos alunos é de" + media)
	escreva("Existem " + alunosacima + " acima da media")

	fim