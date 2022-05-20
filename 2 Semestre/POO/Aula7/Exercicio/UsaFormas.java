
import javax.swing.JOptionPane;


public class UsaFormas {
    public static void main(String args[]){
        Circunferencia c;
        c = new Circunferencia(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a circunferencia: ")));
        Retangulo r = new Retangulo(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retangulo: ")),
        (Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retangulo: "))));
        c.mostra();
        r.mostra();
    }
}
