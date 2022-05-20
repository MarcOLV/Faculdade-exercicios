public class Caixa extends Funcionario{
    public Caixa(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }
    public Caixa(){
        
    }
     @Override
     public double bonificacao() {
         return super.bonificacao();
     }
}
