
import javax.swing.JOptionPane;

public class UsaContaPoupanca {
    public static void main(String[] args) {
       //variáveis auxiliares
       String ag, num;
       float s, t, r;
       
       //declaracao dos objetos
       ContaPoupanca p1, p2, p3;
       
       //instancia objeto
       p1 = new ContaPoupanca();
       p1.imprimeDados();
       //conceito de memória
       p2 = p1;
       p2.agencia = "001";
       p1.imprimeDados();
       p1.numero = " 1234";
       p2.imprimeDados();
       
       p3 = new ContaPoupanca("002", "1111",1500.5f, 10);
       p3.depositar(100000.00f);
       p3.imprimeDados();
       
       r = p3.calculaRendimento();
       
       JOptionPane.showMessageDialog(null, "Rendimento: " + r);
       
    }
    
}
