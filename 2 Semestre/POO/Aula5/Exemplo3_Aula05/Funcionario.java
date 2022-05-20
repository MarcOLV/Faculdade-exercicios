
import javax.swing.JOptionPane;

public class Funcionario {
    //atributos
    private int cracha;
    private float salario;
    private String cargo;
    
    //construtores
    public Funcionario(){
        cargo = "Assistente";
    }
    public Funcionario(int c, float s, String car){
        cracha = c;
        salario = s;
        cargo = car;
    }
    //métodos de acesso
    public int getCracha(){
        return cracha;
    }
    public void setCracha(int c){
        cracha = c;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        salario = s;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String c){
        cargo = c;
    }
    //sobrecarga de métodos
    public void calculaAumento(float porcentagem){
        salario = salario + salario*porcentagem/100;
    }
    public void calculaAumento(int tempo){
        salario = salario + tempo*150;
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Cracha = " + cracha + 
                "\nSalário = " + salario + "\nCargo = " + cargo);
    }
            
    
}
