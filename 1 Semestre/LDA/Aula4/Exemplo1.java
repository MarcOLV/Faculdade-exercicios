
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

        int a = 1;
        int b = 3;

        if (a > b) {
            // aqui será executado apenas se a condição for
            // verdadeira            
            JOptionPane.showMessageDialog(null,
                    "A é maior que B",
                    "Teste Função", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "A não é maior que B",
                    "Teste Função", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
