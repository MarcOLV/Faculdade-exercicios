algoritmo exercicio4
	inteiro senha
	inicio
		escreva("Digite a senha")
		leia(senha)    
		senhavalida(senha)
	fim
	
	void senhavalida(inteiro senha){
	se(senha == 4531)
		escreva("Acesso liberado")
	senao
		escreva("Você não tem acesso ao sistema")
	}