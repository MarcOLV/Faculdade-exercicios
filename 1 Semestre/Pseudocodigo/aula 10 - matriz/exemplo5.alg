algoritmo exemplo5
    literal nome[2][3], q
    inteiro i, j
    início
        //Leitura e armazenamento de nomes
        para(i=0; i<2; i++){​
            para(j; j<3; j++){​ 
                escreva("Digite o nome: ")
                leia(nome[i][j])                
            }​
        }​   
        escreva("Escreva digite um nome para pesquisar: ")
        leia(q)
        para(i=0; i<2; i++){​
            para(j; j<3; j++){​ 
                se(nome[i][j] == q){​
                    escreva("Achei")
                    pare
                }​ senao{​
                    escreva("Nome não encontrado")
                }​
            }​
        }​ 
    fim
    
    
  
  
