
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

        float numero;

        String resposta = "SIM";

        int resp = 0;

        while (resp == 0) {

            numero = solicitaNumero("Digite um número");
            exibeResultado("O quadrado é " + (numero * numero));

            /* resposta = JOptionPane.showInputDialog(null,
                    "Deseja inserir um novo número? (SIM/NÃO)",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE).toUpperCase();*/
            resp = JOptionPane.showConfirmDialog(null,
                    "Deseja continuar?", "Atenção!",
                    JOptionPane.YES_NO_OPTION);
        }

        exibeResultado("Até breve!!!");

    }

    static float solicitaNumero(String msg) {

        return Float.parseFloat(JOptionPane.showInputDialog(null,
                msg,
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }

    static void exibeResultado(String msg) {
        JOptionPane.showMessageDialog(null,
                msg,
                "Cálculo da Média",
                JOptionPane.WARNING_MESSAGE);
    }

}
