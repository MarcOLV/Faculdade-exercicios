
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Home
 */
public class Exemplo1 {

    public static void main(String arg[]) {

        int idade[] = new int[20];

        System.out.println("Gravando números no vetor");
        for (int i = 0; i < 3; i++) {
            idade[i] = solicitaNumero("Digite um valor");
        }

        System.out.println("------------");

        String resp = "";
        
        for (int i = 0; i < 3; i++) {
           
            resp += idade[i]+"\n";           
          
        }
        
        JOptionPane.showMessageDialog(null,
                resp,
                "Resposta",
                JOptionPane.WARNING_MESSAGE);

    }

    static int solicitaNumero(String msg) {

        return Integer.parseInt(JOptionPane.showInputDialog(null,
                msg,
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }
}
