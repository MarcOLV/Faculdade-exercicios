
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

        String nomes[] = new String[100];
        int idade[] = new int [100];

        int qtdNomes = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de nomes que serão cadastrados",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));

        for (int i = 0; i < qtdNomes; i++) {

            nomes[i] = JOptionPane.showInputDialog(null,
                    "Digite um nome",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE).toUpperCase();
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite a idade",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE));
        }

        int index = -1;
        String pesquisar = JOptionPane.showInputDialog(null,
                    "Você deseja pesquisar qual nome?",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE).toUpperCase();

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i] != null) {
                if (nomes[i].equals(pesquisar)) {
                    index = i;
                }
            }

        }

        if (index != -1) {
            System.out.println(nomes[index]);
        }

    }

}
