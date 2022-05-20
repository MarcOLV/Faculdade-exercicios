public class Professor extends Pessoa {
    private int matricula;
    private String Campus;

    public Professor(){

    }

    public Professor (int matricula, String Campus, String nome){
        super(nome);
        this.Campus = Campus;
        this.matricula = matricula;
    }

    public String getCampus() {
        return Campus;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setCampus(String campus) {
        Campus = campus;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println("Professor " + "\nNome: " + getNome() + "\nMatricula: " + matricula + "\nCampus: " + Campus);
    }

}
