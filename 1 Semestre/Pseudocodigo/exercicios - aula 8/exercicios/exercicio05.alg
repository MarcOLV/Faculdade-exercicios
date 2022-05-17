algoritmo exercicio05
	inteiro i,idade,votar
	real soma,media
    início
	soma = 0
	votar = 0
	para(i = 0; i <= 200; i++){
		 escreva("Digite sua idade ")
		leia(idade)
		se(idade >=16){
		votar++
		}
		senao{
		soma++
		}
		media = soma/soma

	}
	
	escreva("A quantidade de aluno que votam é de" + votar)
	escreva("A media de idade dos alunos que nao votam é de " + media)


    fim
    