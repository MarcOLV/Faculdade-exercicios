public class Aluno extends Pessoa{
    private String rgm;
    private Funcionario funcionario;

    public Aluno(){
       
    }
    
    public Aluno(String rgm, Funcionario funcionario, String nome){
        super(nome);
        this.rgm = rgm;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public void imprimir(){
        System.out.println("Aluno "+ "\nNome: " +getNome() + "\nRGM: " + rgm + "\nFuncionario: " + funcionario);
    }

}
