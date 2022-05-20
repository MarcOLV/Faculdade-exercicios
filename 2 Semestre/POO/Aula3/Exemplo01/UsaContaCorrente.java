
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsaContaCorrente {
    public static void main(String[] args) {
        // TODO code application logic here
        //variáveis auxiliares - entrada de dados
        String nome;
        float saldo, limite;
        char tipo;
        //declaração de objetos
        ContaCorrente conta1, conta2;
        Scanner leia = new Scanner(System.in);
        
        //leitura de dados para o primeiro objeto
        nome = JOptionPane.showInputDialog("Digite o nome");
        saldo = Float.parseFloat(
                           JOptionPane.showInputDialog("Digite o saldo"));
        limite = Float.parseFloat(
                           JOptionPane.showInputDialog("Digite o limite"));
        tipo = JOptionPane.showInputDialog("Digite o tipo - F - Fisico / J - Jurídico").charAt(0);
        
        //instaciando o objeto conta1
        conta1 = new ContaCorrente(nome, saldo, limite, tipo);
        
        //leitura de dados do modo texto
        System.out.println("Digite o nome");
        nome = leia.nextLine();
        System.out.println("Digite o saldo");
        saldo = leia.nextFloat();
        System.out.println("Digite o tipo - F - Fisico / J - Jurídico");
        tipo = leia.next().charAt(0);
        
        //instanciando o objeto conta2
        conta2 = new ContaCorrente(nome, saldo, tipo);
        
        //mostrando valores
        JOptionPane.showMessageDialog(null, "Nome: " + conta1.nome + 
                                                                         "\nSaldo: " + conta1.saldo + 
                                                                           "\nLimite: " + conta1.limite +
                                                                            "\nTipo: " + conta1.tipo);
        JOptionPane.showMessageDialog(null, "Nome: " + conta2.nome + 
                                                                         "\nSaldo: " + conta2.saldo + 
                                                                           "\nLimite: " + conta2.limite +
                                                                            "\nTipo: " + conta2.tipo);
    }
    
}
