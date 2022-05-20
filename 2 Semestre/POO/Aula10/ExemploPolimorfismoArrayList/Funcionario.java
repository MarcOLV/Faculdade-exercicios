public class Funcionario extends Pessoa{
    private int matricula;
    private String setor;

    public Funcionario() {
    }

    public Funcionario(int matricula, String setor, String nome) {
        super(nome);
        this.matricula = matricula;
        this.setor = setor;
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

    @Override
    public String mostraClasse() {
        return "Nome: " + this.getNome() + "\nMatricula: " + matricula +
                "\nSetor: " + setor;
    }
    
    
    
}
