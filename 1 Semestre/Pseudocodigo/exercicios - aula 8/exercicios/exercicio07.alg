algoritmo exercicio07
	inteiro ano, bi, i
    início
	ano = 0
	bi = 0
	para(i = 1901; i <= 2020; i++){
	ano++
	se(ano%4 == 0){
	bi++
	}
	escreva("Ano bissexto: " + bi)

    fim
    