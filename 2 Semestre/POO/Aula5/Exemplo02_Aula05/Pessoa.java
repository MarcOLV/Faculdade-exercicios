
import javax.swing.JOptionPane;

public class Pessoa {
    //atributos com modificadores de acesso
    private String nome;
    private int idade;
    private double renda;
    
    //construtores
    public Pessoa (){}
    public Pessoa (String n, int i, double r){
        nome = n;
        idade = i;
        renda = r;
    }
    
    //métodos de acesso
    //leitura - get
    public String getNome(){
        return nome;
    }
    public double getRenda(){
        return renda;
    }
    public int getIdade(){
        return idade;
    }
    //escrita/gravação - set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else{
            JOptionPane.showMessageDialog(null,"Idade inválida");
        }
    }
    public void setRenda(double r){
        renda = r;
    }
    //método
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome = " + nome +
                "\nIdade = " + idade + "\nRenda = " + renda);
    }
    
}
