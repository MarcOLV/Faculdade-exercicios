/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonaf
 */
public class ContaCorrente{ 
        //lista de atributos
        String nome;
        float saldo;
        float limite;
        char tipo;
        
        //construtores
        ContaCorrente(String n, float s, float l, char t){
            nome = n;
            saldo = s;
            limite = l;
            tipo = t;
        }
        ContaCorrente(String n, float s, char t){
            this.nome = n;
            this.saldo = s;
            this.tipo = t;
        }
    
}
