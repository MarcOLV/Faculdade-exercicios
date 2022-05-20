public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;
    

    public Funcionario(){

    }

    public Funcionario(String n, String c, double s){
        this.salario = s;
        this.nome = n;
        this.cpf = c;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean autentica(int senha){
        if(senha == 234){
            System.out.println("\nVocê tem direito ao sistema interno do banco");
            return true;
             
        }
        else{
            System.out.println("\nVocê não tem direito ao sistema interno do banco");
            return false; 
        }
    }

    public double bonificacao(){
        return (getSalario() * 0.10) + getSalario();
    }


}