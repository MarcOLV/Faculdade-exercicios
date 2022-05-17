
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
        
       int i,j;
        
        i = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de dados",JOptionPane.WARNING_MESSAGE));
        j = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite outro número",
                "Entrada de dados",JOptionPane.WARNING_MESSAGE));
        
        int total;
        
        total = i/j;
        
        String A, B, Final;
        
        A = "Hugo";
        B = "Fernandes";
        
        Final = A +" " + i;
        
        JOptionPane.showMessageDialog(null,Final,  "Saída de dados",
                JOptionPane.WARNING_MESSAGE );
        
        
        
        JOptionPane.showMessageDialog(null,"Olá, o resultado é " + total, 
                "Saída de dados",JOptionPane.WARNING_MESSAGE );
    }

}
