
import javax.swing.JOptionPane;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda;        
        agenda = new Agenda();
        String [][] matrizDados = {{JOptionPane.showInputDialog(null, "digite seu nome:"),JOptionPane.showInputDialog(null, "digite seu numero:")},
                {JOptionPane.showInputDialog(null, "digite seu nome:"), JOptionPane.showInputDialog(null, "digite seu numero:")},
                {JOptionPane.showInputDialog(null, "digite seu nome:"), JOptionPane.showInputDialog(null, "digite seu numero:")},
        };
        agenda = new Agenda();
    
        agenda.setDados(matrizDados);
        agenda.imprimir();
        agenda.busca();
    }
    
}