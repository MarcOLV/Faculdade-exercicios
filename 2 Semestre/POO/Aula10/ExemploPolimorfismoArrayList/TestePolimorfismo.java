
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestePolimorfismo {

    public static void main(String[] args) {
        //declarar um ArrayList tipado
        ArrayList uni = new ArrayList<Pessoa>();
        //declarar um objeto do tipo Pessoa
        Pessoa aux;
        int tipo;
        
        while(true){
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: "
                    + "\n1 - Aluno"
                    + "\n2 - Professor"
                    + "\n3 - Funcionario"
                    + "\n4 - Sair"));
            switch(tipo){
                case 1:
                    String n = JOptionPane.showInputDialog("Digite o nome do aluno");
                    String r = JOptionPane.showInputDialog("Digite o rgm do aluno");
                    aux = new Aluno(r, n);
                    uni.add(aux); //armazena no ArrayList
                    break;
                case 2:
                    String np = JOptionPane.showInputDialog("Digite o nome do professor");
                    String c = JOptionPane.showInputDialog("Digite o campus do professor");
                    int m = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite a matricula do professor"));
                    aux = new Professor(m, c, np);
                    uni.add(aux);
                    break;
                case 3:
                    String nf = JOptionPane.showInputDialog("Digite o nome do funcionário");
                    String s = JOptionPane.showInputDialog("Digite o setor do funcionário");
                    int mf = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite a matricula do funcionário"));
                    aux = new Funcionario(mf, s, nf);
                    uni.add(aux);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    System.exit(0);
            }
            
        }
        
    }
    
}
