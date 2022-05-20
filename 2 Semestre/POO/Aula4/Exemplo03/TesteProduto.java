
import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
       Produto p1 = new Produto();
       Produto p2 = new Produto();
       Produto p3;
       
       p1.cadastraDados();
       p2.cadastraDados();
       
       p1.imprimeDados();
       p2.imprimeDados();
       
       p3 = p2.duplicar();
       p3.imprimeDados();
       p3.marca = "HP";
       p2.imprimeDados();
       
       if(p2.comparaCom(p3)){
           JOptionPane.showMessageDialog(null, "São iguais");
       }
       else{
           JOptionPane.showMessageDialog(null, "Não são iguais");
       }
       JOptionPane.showMessageDialog(null, "Imposto = " + p1.calculaImposto(10));
    }
    
}
