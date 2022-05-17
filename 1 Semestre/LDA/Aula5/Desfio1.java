
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
public class Desfio1 {

    public static void main(String arg[]) {

        int dias = 0;
        dias = solicitaNumerointeiro();

        if (dias <= 30) {

            JOptionPane.showMessageDialog(null,
                    "O desconto é de 10%",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if (dias <= 50) {

                JOptionPane.showMessageDialog(null,
                        "O desconto é de 20%",
                        "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            } else {

                if (dias <= 100) {

                    JOptionPane.showMessageDialog(null,
                            "O desconto é de 30%",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    if (dias <= 120) {
                        JOptionPane.showMessageDialog(null,
                                "O desconto é de 40%",
                                "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                    }
                }

            }

        }

    }

    static int solicitaNumerointeiro() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }
}
