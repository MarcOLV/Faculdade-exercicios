public class Aluno extends Pessoa{
    private String rgm;

    public Aluno() {
    }

    public Aluno(String rgm, String nome) {
        super(nome);
        this.rgm = rgm;
    }
    

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }   
 
    public String mostraClasse() {
        return "Nome: " + this.getNome() + "\nRGM: " + rgm;
    }
    
    
}
