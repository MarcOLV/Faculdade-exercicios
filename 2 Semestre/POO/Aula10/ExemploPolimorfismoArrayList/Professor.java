public class Professor extends Pessoa{
    private int matricula;
    private String campus;

    public Professor() {
    }

    public Professor(int matricula, String campus, String nome) {
        super(nome);
        this.matricula = matricula;
        this.campus = campus;
    }
    

    public String getCampus() {
        return campus;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String mostraClasse() {
        return "Nome: " + this.getNome() + "\nMatricula: " + matricula  
                + "\nCampus: " + campus;
    }
    
    
}
