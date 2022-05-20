public class Aluno extends Pessoa {
    private String rgm;
    public Aluno(String rgm, String nome) {
        super(nome);
        this.rgm = rgm;
    }
    public Aluno() {
    }
    public String getRgm() {
        return rgm;
    }
    @Override
    public String toString() {
        return rgm + ":" + getNome();
    }
    
    
}
