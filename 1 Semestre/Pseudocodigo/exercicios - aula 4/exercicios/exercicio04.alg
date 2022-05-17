algoritmo exercicio04	
	real salariomin,salario,salariofim
	inicio
		escreva("Digite o valor do salario minimo:")
		leia(salariomin)
		escreva("Digite o valor do salario:")
		leia(salario)
		
	salariofim = calculasal(salario, salariomin)
	salariofim
fim


	void calculasal(real salariomin, real salario)
		real qntdsal
		qntdsal = salario / salariomin
		escreva("Você recebe: " + qntdsal + " salarios minimos")
fim