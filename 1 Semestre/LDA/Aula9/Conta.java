
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
public class Conta extends ContaBancaria{
    
    private String titular;
    private float saldo;
    private int numeroConta;

    public void setTitular(String a) {
        this.titular = a;
    }

    public void setSaldo(float a) {
        this.saldo = a;
    }

    public void setNumeroConta(int a) {
        this.numeroConta = a;
    }

    public String getTitular() {
        return this.titular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void imprimiDados() {

        JOptionPane.showMessageDialog(null,
                "Titular " + this.titular + "\n"
                + " Saldo " + this.saldo + "\n"
                + " Numero da Conta " + this.numeroConta+ "\n"
                +" Agência" + this.nrAgencia ,
                "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
    }

    public void sacarSaldo(float valor) {
        this.saldo = this.saldo - valor;
       // imprimiDados();

    }

    public void depositarValor(float valor) {
        this.saldo = this.saldo + valor;
       // imprimiDados();
    }

    public void saldoIgual(Conta obj) {

        if (this.saldo == obj.saldo) {

            JOptionPane.showMessageDialog(null,
                    "Os saldos são iguais",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
             JOptionPane.showMessageDialog(null,
                    "Os saldos NÃO são iguais",
                    "MENSAGEM", JOptionPane.INFORMATION_MESSAGE); 
        }
    }
}
