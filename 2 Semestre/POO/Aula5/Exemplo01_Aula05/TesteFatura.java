
import javax.swing.JOptionPane;

public class TesteFatura {

    public static void main(String[] args) {
        // TODO code application logic here
        Fatura f1, f2, f3;
        f1 = new Fatura();
        f2 = new Fatura();
        
        f1.valor = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o valor da fatura 1"));
        f1.pontuacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a pontuação da fatura 1"));
        f3 = f1.somaCom(100);
                      
        f1.imprimeDados();
        f3.imprimeDados();
        
        f2.valor = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o valor da fatura 2"));
        f2.pontuacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a pontuação da fatura 2"));
        
        f3 = f2.somaCom(500, 700.5f);
        
        f2.imprimeDados();
        f3.imprimeDados();
        
        f3 = f1.somaCom(f2);
        f3.imprimeDados();
        
        
    }
    
}
