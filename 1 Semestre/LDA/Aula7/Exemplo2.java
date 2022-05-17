
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

        int idade;
        idade = 77;

        if (idade < 18) {

            JOptionPane.showMessageDialog(null,
                    "Menor de idade, não pode entrar",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else {

            if (idade > 30) {

                JOptionPane.showMessageDialog(null,
                        "Desconto de 30%",
                        "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            } else {

                if (idade > 20) {
                    JOptionPane.showMessageDialog(null,
                            "Desconto de 20%",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Desconto de 10%",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        }

    }

}
