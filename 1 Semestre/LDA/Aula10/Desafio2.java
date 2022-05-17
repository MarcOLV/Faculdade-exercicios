
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

        String nomes[] = new String[100];
        float nota[] = new float[100];

        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de Notas que serão cadastrados",
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));

        for (int i = 0; i < qtdAlunos; i++) {

            nomes[i] = JOptionPane.showInputDialog(null,
                    "Digite um nome",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE).toUpperCase();

            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Digite a nota do aluno",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE));

        }

        float maior = 0;
        int index = -1;

        for (int i = 0; i < qtdAlunos; i++) {

            if (i == 0) {
                maior = nota[i];
                index = i;
            } else {

                if (nota[i] > maior) {
                    maior = nota[i];
                    index = i;
                }
            }

        }

        System.out.println("A maior nota é " + maior);
        System.out.println("Aluno: " + nomes[index]);

    }

}
