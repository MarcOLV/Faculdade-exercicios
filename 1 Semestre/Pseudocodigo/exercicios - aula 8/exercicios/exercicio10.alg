algoritmo exercicio09
	real salario, vendas, salariofinal, comissao;
    início
	escreva("Informe o salario fixo: ");
	leia(salario);
	escreva("Informe o total de vendas: ");
	leia(vendas);
	comissao = vendas + (vendas * 0.4)
	salariofinal = salario + comissao
	escreva("Comissão: " + comissao)
	escreva("Salario final: "+ salariofinal)
    fim
    