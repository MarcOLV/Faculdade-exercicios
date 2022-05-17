
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
public class Desafio2 {
     public static void main(String arg[]) {
         
         int parcelas = solicitaNumerointeiro();
         
         
         switch (parcelas){             
             case 1: 
                 // progração para calculçar 0%
                 
                 break;
                 
             case 2:
                  // progração para calculçar 2%
                 break;
             
             
         }
     }

         
    static int solicitaNumerointeiro() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }
}
