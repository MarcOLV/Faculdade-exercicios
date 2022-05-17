
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
public class Exemplo3 {

    public static void main(String arg[]) {

        int x = 6;

        switch (x) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "O valor de X é 1",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "O valor de X é 3",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(null,
                        "O valor de X é 9",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "O valor de X é " + x,
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break; //opcional
        }

    }

}
