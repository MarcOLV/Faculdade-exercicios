
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
public class Desafio {

    public static void main(String arg[]) {

        String resposta = "SIM";
        String nome, nomeIdadeMaior;
        int idade, idadeMaior, contador;

        contador = 1;
        idadeMaior = 0;
        nomeIdadeMaior = "";

        while (resposta.equals("SIM")) {

            idade = solicitaNumero("Digite sua idade");
            nome = solicitaString("Digite seu nome");

            if (contador == 1) {
                idadeMaior = idade;
                nomeIdadeMaior = nome;
            } else {

                if (idadeMaior < idade) {

                    idadeMaior = idade;
                    nomeIdadeMaior = nome;
                }

            }

            contador++;
            resposta = JOptionPane.showInputDialog(null,
                    "Deseja inserir um novo número? (SIM/NÃO)",
                    "Entrada de Dados",
                    JOptionPane.WARNING_MESSAGE).toUpperCase();
        }

        exibeResultado("A idade maior digitada foi " + idadeMaior);
        exibeResultado("Pertecente ao nome = " + nomeIdadeMaior);

    }

    static int solicitaNumero(String msg) {

        return Integer.parseInt(JOptionPane.showInputDialog(null,
                msg,
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE));
    }

    static String solicitaString(String msg) {

        return JOptionPane.showInputDialog(null,
                msg,
                "Entrada de Dados",
                JOptionPane.WARNING_MESSAGE);
    }

    static void exibeResultado(String msg) {
        JOptionPane.showMessageDialog(null,
                msg,
                "Cálculo da Média",
                JOptionPane.WARNING_MESSAGE);
    }
}
