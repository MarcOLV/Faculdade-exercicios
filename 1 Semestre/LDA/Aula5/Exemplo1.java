
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

        int x = solicitaNumerointeiro();

        if (x < 0) {
            JOptionPane.showMessageDialog(null,
                    "x é negativo",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else {

            if (x >= 9) {
                if (x <= 11) {

                    JOptionPane.showMessageDialog(null,
                            "x  é maior ou igual a 9 e menor ou igual a 11",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "X é maior que 11",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(null,
                        "x é menor que 9",
                        "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
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
