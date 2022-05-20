import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {
        Analista a = new Analista();
        Programador p = new Programador();

        int valorPorProjeto;
        valorPorProjeto = Integer.parseInt(JOptionPane.showInputDialog(null, "quantos projetos participou o analista? "));

        p.setQtdeHoras(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas do programador : ")));
        p.setValorHora(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor das horas trabalhadas do programador : ")));


       a.setNome("ronaldo");
       a.setMatricula("12312");
       
       float valor =0; 
       float soma =0;
        Analista[] funcionarios = new Analista[valorPorProjeto];
        for(int i=0; i< funcionarios.length;i++){
        valor = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite o valor do projeto " + (i+1) + " do analista"));
            soma = valor + soma;
        }

        System.out.println("\nNome " + a.getNome() +
        "\nMatricula: " + a.getMatricula());
        System.out.println("O calculo do salario sera de: " +  a.calculaSalario(soma));



        p.setNome("Marco");
        p.setMatricula("21312");
      

        System.out.println("\nNome " + p.getNome() +
                            "\nMatricula: " + p.getMatricula());
        System.out.println("O calculo do salario sera de " + p.calculaSalario());
    }
    }