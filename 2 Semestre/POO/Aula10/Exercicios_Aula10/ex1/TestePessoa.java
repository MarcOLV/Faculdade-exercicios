import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = null;
    
        while(true){
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção "
            + "\n1 - Aluno"
            + "\n2 - Professor"
            + "\n3 - Funcionario"
            + "\n4 - Sair"
            ));
        switch(tipo){
            case 1:
                System.out.println("");
                p = new Aluno("21332", null, "Russel");
                break;

            case 2:
                System.out.println("");
                p = new Professor(222, "Analia franco", "Ronaldo");
                break;

            case 3:
                System.out.println("");
                p = new Funcionario(123, "Administrativo", "Marco");
                break;

            case 4:
                System.out.println("\nBye...Bye");
                System.exit(0);
                break;
            
            default: {
                System.out.println(("Opção Invalida"));
                System.exit(0);
            }
            }
            p.imprimir();
        }


    }
}
