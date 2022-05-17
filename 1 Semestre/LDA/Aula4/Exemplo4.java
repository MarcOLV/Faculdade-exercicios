
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
public class Exemplo4 {

    public static void main(String arg[]) {

        int idade = solicitaNumerointeiro();     
       
              

        switch (idade) {
            case 18:
                //aqui vai o nosso código
                JOptionPane.showMessageDialog(null,
                        "Pode entrar em nosso Lounge, porém na sala 1",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 25:
                JOptionPane.showMessageDialog(null,
                        "Pode entrar em nosso Lounge, liberado todas as salas",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:

                if (idade > 18) {
                    JOptionPane.showMessageDialog(null,
                            "Pode entrar",
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Proibido",
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);

                }

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
