
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

        int contador = 0;
        int qtdNumeros = solicitaNumero("Digite a quantidade de valores");
        float soma = 0;

        while (contador < qtdNumeros) {

            soma = soma + solicitaNumero("Digite um valor");
            
            
            contador++;
            
        }
        
        exibeResultado("O resulado é " + soma);

    }

    static int solicitaNumero(String msg) {

        return Integer.parseInt(JOptionPane.showInputDialog(null,
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
