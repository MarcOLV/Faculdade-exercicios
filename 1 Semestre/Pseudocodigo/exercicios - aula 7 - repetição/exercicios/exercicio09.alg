algoritmo exercicio09
    inteiro idade, i, m, salFem
    caractere sexo
    real salario, mediaIdade, somaIdade, mediaSalario, somaSalario
    início
        somaIdade = 0
        i = 0
        salFem = 0
        somaSalario = 0
        enquanto(verdadeiro){
            escreva("Digite o sexo M/F: ")
            leia(sexo)
            escreva("Digite a idade: ")
            leia(idade)
            se(idade < 0)
                pare
            somaIdade += idade
            i++
            escreva("Digite o salário: ")
            leia(salario)
            se(sexo == 'm' ou sexo == 'M'){
                m++
                somaSalario += salario
            } senao se(salario < 600){
                salFem++
            }
        }
        // letra a) 
        mediaIdade = somaIdade/i
        escreva("A média da idade do grupo é: " + mediaIdade)
        // letra b) 
        mediaSalario = somaSalario/m
        escreva("A média de salário dos homens é: R$ " + mediaSalario)
        // letra c) a quantidade de mulheres com salário abaixo de 600
        escreva("A quandidade de mulhers com salários abaixo de R$ 600 é:" + salFem)
    fim