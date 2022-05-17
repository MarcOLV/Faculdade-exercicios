/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class TesteConta {
    public static void main(String arg[]) {
             
        Conta c1 = new Conta();
        c1.nrAgencia = "006";
        c1.setTitular("Hugo Fernandes");
        c1.setNumeroConta(0002);
        c1.setSaldo(100);
        c1.imprimiDados(); 
        
        Conta conta2 = new Conta();
        conta2.setTitular("Raul");
        conta2.setNumeroConta(3332);
        conta2.setSaldo(100);
        
        conta2.imprimiDados(); 
        
        c1.saldoIgual(conta2);
        
      /*  c1.imprimiDados();       
        
        c1.sacarSaldo(3);  
            
        
        
        c1.depositarValor(20);*/
       
        
        
    }
}
