
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

        float nota1, nota2, media;

        nota1 = solicitaNota();
        nota2 = solicitaNota();

        media = Calculamedia(nota1, nota2);

        exibeMensagem(" " + media);

    }

    static float Calculamedia(float x, float y) {

        return (x + y) / 2;
    }

    static void exibeMensagem(String msg) {

        JOptionPane.showMessageDialog(null,
                "O resultado é " + msg,
                "Saída de dados",
                JOptionPane.WARNING_MESSAGE);

    }

    static float solicitaNota() {

        return Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite a nota",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }
}
