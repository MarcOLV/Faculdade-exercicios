public class Professor extends Pessoa{
    private int matricula;

    public Professor() {
    }

    public Professor(int matricula, String nome) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    @Override
    public String toString() {
        return matricula + ":" + getNome();
    }  
}
