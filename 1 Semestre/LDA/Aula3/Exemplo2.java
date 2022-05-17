/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

/**
 *
 * @author Home
 */
public class Exemplo2 {

    public static void main(String arg[]) {

       /* exibeResultado("Otávio");
        exibeResultado("Raul");
        exibeResultado("Raissa");

         boolean teste;
        
         teste = ehMaior_que_5(3);
        
         JOptionPane.showMessageDialog(null,
               teste ,
                "Teste Função", JOptionPane.INFORMATION_MESSAGE);*/
     float resposta, valor1, valor2;

        valor1 = solicitaNumero();

        valor2 = solicitaNumero();

        resposta = soma(valor1, valor2);

        JOptionPane.showMessageDialog(null,
                resposta,
                "Teste Função", JOptionPane.INFORMATION_MESSAGE);
    }

    static boolean ehMaior_que_5(int x) {
        boolean resp = false;

        if (x > 5) {
            resp = true;
        }

        return resp;
    }

    static float soma(float x, float y) {

        return x + y;
    }

    static void exibeResultado(String Nome) {
        JOptionPane.showMessageDialog(null,
                "Oláaaa  " + Nome,
                "Teste Procedimento",
                JOptionPane.WARNING_MESSAGE);
    }
    
    
    static float solicitaNumero(){
        
        return Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }

}
