algoritmo exercicio03
	inteiro i,num[10],maior,armazenar,soma
	real media
	inicio
	soma = 0
	escreva("Quantos numeros deseja digitar")
	leia(armazenar)

		para(i = 0; i <armazenar; i++){
		escreva("Digite um numero para entrar no vetor:")
		leia(num[i])
		soma = soma + num[i]

		}
	media = soma/armazenar
	escreva("Os valores seguintes estao acima da media")
	para(i=0;i<armazenar;i++){
	se(num[i]>media){
	escreva(num[i])
	}}
	fim