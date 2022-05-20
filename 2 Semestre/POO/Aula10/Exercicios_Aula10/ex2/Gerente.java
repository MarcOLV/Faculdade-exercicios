public class Gerente extends Funcionario{
    private int senha;
    private int funcionariosGerenciados;

    public Gerente(){
    }

    public Gerente(int senha, int funcionariosGerenciados, String nome, String cpf, double salario){
        super(nome,cpf,salario);
        this.senha = senha;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public int getSenha(){
       return senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public int getFuncionariosGerenciados(){
        return funcionariosGerenciados;
     }
 
     public void setfuncionariosGerenciados(int funcionariosGerenciados){
         this.funcionariosGerenciados = funcionariosGerenciados;
     }
     
    @Override
    public boolean autentica(int senha) {
        return super.autentica(senha);
    }

    @Override
    public double bonificacao() {
        return (getSalario() * 0.15) + getSalario();
    }

}
