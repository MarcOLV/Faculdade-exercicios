algoritmo exercicio3
    real bruto, liquido, vgratificacao
    início
	
	
    escreva("Qual o seu salario bruto:")
    leia(bruto)
	
	
    liquido  = salarioliquido(bruto)
    vgratificacao = gratificacao(liquido)
	
	
    escreva("O salario liquido é de: " + liquido)
    escreva("O salario com gratificação é: " + vgratificacao)
    fim
	
	real gratificacao (real liquido)
    inicio
            se(liquido < 1000){
                retorne liquido + 200
            }
            se(liquido >= 1000 e liquido < 1250){
                retorne liquido + 150
            }
            se(liquido >= 1250 e liquido < 1750){
                retorne liquido + 100
            }
            se(liquido >= 1750 ){
                retorne liquido + 75
            }
    fim
	
	
    real salarioliquido (real bruto)
    inicio
            retorne bruto - (bruto * 0.11)
    fim

    //Marco Antonio Oliveira RGM 27566340