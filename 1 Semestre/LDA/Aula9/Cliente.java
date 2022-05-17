
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

    //atrinbutos    
    private String nome;
    private String CPF;
    private int idade;
    private String email;

    public void setNome(String a) {

        if (a.length() < 2) {
            JOptionPane.showMessageDialog(null,
                    "Digite um nome com mais de 2 letras",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

            this.nome = null;
        } else {
            this.nome = a;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String ab) {

        if (ab.length() != 11) {
            JOptionPane.showMessageDialog(null,
                    "Digite um CPF com 11 digitos",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

            this.CPF = null;
        } else {
            this.CPF = ab;
        }
    }
    
    
    public String getCPF(){
        return this.CPF;
    }

}
