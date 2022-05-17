
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
public class Exemplo2 {
    
    public static void main(String arg[]) {

        int idade = 37;

        if (idade < 18) {
            JOptionPane.showMessageDialog(null,
                    "Olá, você não pode entrar em nosso Lounge",
                    "Teste Função", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null,
                    "Opa, Pode entrar!!",
                    "Teste Função", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
