public abstract class Empregado{
    private String nome;
    private String matricula;

    public Empregado(){

    }

    public Empregado(String nome,String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calculaSalario(float valorHora,float qtdeHoras){
        return valorHora * qtdeHoras;
    }

}