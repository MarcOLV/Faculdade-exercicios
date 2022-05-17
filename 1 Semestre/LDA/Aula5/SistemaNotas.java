
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
public class SistemaNotas {

    public static void main(String arg[]) {

        float A1, A2, AF, notaMaior, NF;

        A1 = solicitaNumero("Digite a nota A1");
        A2 = solicitaNumero("Digite a nota A2");

        NF = A1 + A2;

        if (NF >= 6) {

            JOptionPane.showMessageDialog(null,
                    "APROVADO",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if (NF >= 1) {

                AF = solicitaNumero("Digite a nota AF");

                if (A1 > A2) {
                    notaMaior = A1;
                } else {
                    notaMaior = A2;
                }

                NF = AF + notaMaior;

                if (NF >= 6) {

                    JOptionPane.showMessageDialog(null,
                            "APROVADO" + " NOTA = " + NF,
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null,
                            "REPROVADO",
                            "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "REPROVADO DIRETO",
                        "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }

    static float solicitaNumero(String msg) {

        return Float.parseFloat(JOptionPane.showInputDialog(null,
                msg,
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }

}
