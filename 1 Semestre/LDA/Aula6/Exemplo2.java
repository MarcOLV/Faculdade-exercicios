
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

        float nota1, nota2, media;

        int contador = 0;

        while (contador < 4) {

            nota1 = solicitaNumero("Digite a nota A1 do aluno " 
                    + (contador + 1));
            nota2 = solicitaNumero("Digite a nota A2 do aluno " 
                    + (contador + 1));

            media = (nota1 + nota2) / 2;
            
            exibeResultado(" A média do aluno  " 
                    +(contador + 1) +" é =  "+ media);

            contador++;
        }

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
