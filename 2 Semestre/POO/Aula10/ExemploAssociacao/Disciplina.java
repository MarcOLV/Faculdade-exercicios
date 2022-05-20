public class Disciplina {
    private String nomeProf;
    private Curso curso;

    public Disciplina() {
    }

    public Disciplina(String nomeProf, Curso curso) {
        this.nomeProf = nomeProf;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }
    public void imprimir(){
        System.out.println("Nome do Professor: " + nomeProf + "\nCurso: ");
        curso.imprimir();
    }
    
    
}
