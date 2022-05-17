
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

        Cliente c1 = new Cliente();

        c1.idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a idade",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));

        c1.nome = JOptionPane.showInputDialog(null,
                "Digite o nome",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE);

        c1.CPF = JOptionPane.showInputDialog(null,
                "Digite o CPF",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE);

        c1.email = JOptionPane.showInputDialog(null,
                "Digite o EMAIL",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "A seguir será exibido os valores do objeto",
                "Saída de dados",
                JOptionPane.WARNING_MESSAGE);
        
        
        c1.exibeDadosCliente();

    }

}
