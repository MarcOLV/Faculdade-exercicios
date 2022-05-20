
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonaf
 */
public class Fatura {
    //atributos
    float valor;
    int pontuacao;
    
    //métodos
    public Fatura somaCom(int pont){
        Fatura nova = new Fatura();
        nova.pontuacao = this.pontuacao + pont;
        nova.valor = this.valor;
        return nova;
    }
    public Fatura somaCom(int pont, float val){
        Fatura nova = new Fatura();
        nova.pontuacao = this.pontuacao + pont;
        nova.valor = this.valor + val;
        return nova;
    }
    public Fatura somaCom(Fatura fat){
        Fatura nova = new Fatura();
        nova.pontuacao = this.pontuacao + fat.pontuacao;
        nova.valor = this.valor + fat.valor;
        return nova;
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Pontuação: " + pontuacao + 
                "\nValor: " + valor);
    }
}
