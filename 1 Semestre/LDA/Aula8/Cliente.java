
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
public class Cliente {

    // atributos da classe
    String nome;
    String CPF;
    int idade;
    String email;

    //método de construção da classe
    public Cliente() {
        this.CPF = "0000000";
        this.email = "aaaa@sss.com";
    }
    
    // métdo de construção da classe com parâmetros
    public Cliente (String xnome, int xidade){        
        this.nome = xnome;
        this.idade = xidade;        
    }

    //metodo
    public void exibeDadosCliente() {

        JOptionPane.showMessageDialog(null,
                "Nome " + nome + "\n"
                + " CPF " + CPF + "\n"
                + " Idade " + idade + "\n"
                + " Email " + email,
                "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

    }

}
