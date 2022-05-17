algoritmo exercicio11
	inteiro i,nome
	real salario, reajuste10,reajuste2,aumento,valorreajuste
    início
	reajuste10 =0
	reajuste2 =0
	valorreajuste = 0
	para(i = 0; i <= 10; i++){
	escreva("Digite seu nome")
	leia(nome)
	escreva("Digite o seu salario")
	leia(salario)
	se(salario > 1500){
	reajuste10 = salario + (salario * 10%)
	valorreajuste = reajuste10
	escreva("Seu nome é " + nome + "e voce ganhou um novo salario com reajuste de " + valorreajuste)
	}
	senao se(salario >=1500 e salario <= 3000){
	reajuste2 = salario + (salario * 2%)
	valorreajuste = reajuste2
	escreva("Seu nome é " + nome + "e voce ganhou um novo salario com reajuste de " + valorreajuste)
	}
	senao{
	escreva("Voce não tem direito a reajuste")
	}

    fim
    