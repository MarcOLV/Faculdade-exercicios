
import javax.swing.JOptionPane;

public class ContaCorrente {

    String nome;
    float saldo;
    float limite;
    char tipo;

    public ContaCorrente(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public ContaCorrente() {
    }

    public void cadastraDados() {
        nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta"));
        limite = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta"));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (F ou J)").charAt(0);
    }

    public String imprimeDados() {
        return "Dados da Conta Corrente: "
                + "\nNome: " + nome
                + "\nSaldo: " + saldo
                + "\nLimite: " + limite
                + "\nTipo: " + tipo;
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void sacar(float valor) {
        if(saldo >= valor){
           saldo = saldo - valor;    
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    public float maiorSaldo(ContaCorrente c){
        if(this.saldo > c.saldo){
            return this.saldo; //this refere-se ao objeto que chamar o método
        }else{
            return c.saldo;
        }
    }
}
