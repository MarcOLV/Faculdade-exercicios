
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
public class Desafio1 {

    public static void main(String arg[]) {

        float a, b, c;

        a = solicitaNumero();
        b = solicitaNumero();
        c = solicitaNumero();

        if (getDelta(a, b, c) < 0) {
            JOptionPane.showMessageDialog(null,
                    "Delta retornou negativo, dessa forma as raízes"
                    + " não serão calculadas",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {

            double x1, x2;
            x1 = getX1(a, b, c);
            x2 = getX2(a, b, c);

            JOptionPane.showMessageDialog(null,
                    x1,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,
                    x2,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);

        }

    }
    
    
    
    

    static float solicitaNumero() {

        return Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }

    static float getDelta(float a, float b, float c) {

        return ((b * b) - (4 * a * c));

    }

    static Double getX1(float a, float b, float c) {

        return (-b + Math.sqrt(getDelta(a, b, c))) / (2 * a);
    }

    static Double getX2(float a, float b, float c) {
        return (-b - Math.sqrt(getDelta(a, b, c))) / (2 * a);
    }

    
}
