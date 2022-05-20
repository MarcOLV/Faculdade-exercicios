
import javax.swing.JOptionPane;

public class ContaPoupanca {
    //atributos
    String agencia;
    String numero;
    float saldo;
    float taxa;
    
    //construtores
    ContaPoupanca(){}
    ContaPoupanca(String a, String n, float s, float t){
        agencia = a;
        numero = n;
        saldo = s;
        taxa = t;
    }
    //métodos
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Agência: " + agencia + 
                                                                   "\nNúmero: " + numero + 
                                                                    "\nSaldo: " + saldo +
                                                                     "\nTaxa: " + taxa);
    }
    public void depositar(float valor){
       saldo = saldo + valor; 
    }
    public float calculaRendimento(){
        float result;
        result = saldo*taxa/100;
        return result;
    }
}
