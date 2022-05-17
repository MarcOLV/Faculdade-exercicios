
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
public class Principal {

    public static void main(String arg[]) {

        // declarado um objeto do tipo cliente
        Cliente c1 = new Cliente();
        c1.CPF = "299.266.555-85";
        c1.idade = 18;
        c1.nome = "Hugo";
        c1.email = "aa@msn.com";

        // declarado um objeto do tipo cliente
        Cliente x2 = new Cliente("Raul",20);
        x2.CPF = "299.333.222-99";
        x2.email = "raul@msn.com";

        x2.ExibeDadosCliente();

    }
}
