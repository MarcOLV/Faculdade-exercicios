
public class Funcionario extends Pessoa{
    private int matricula;
    private String setor;
    

    public Funcionario(int matricula, String setor, String nome) {
        super(nome);
        this.matricula = matricula;
        this.setor = setor;
    }

    public Funcionario(){

    } 

    public int getMatricula() {
        return matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void imprimir(){
        System.out.println("Funcionario "+ "\nNome " + getNome() + "\nMatricula: " + matricula + "\nSetor: " + setor);
    }
    
}
