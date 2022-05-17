
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
public class TestaCliente {
    public static void main(String arg[]) {
        
        Cliente cli1 = new Cliente();
        cli1.setCPF("33345612311");
        
        
       JOptionPane.showMessageDialog(null,
                cli1.getCPF(),
                "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
