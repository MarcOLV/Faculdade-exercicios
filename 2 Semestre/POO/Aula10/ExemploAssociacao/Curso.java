public class Curso {
    private int codigo;
    private String nome;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Curso() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    public void imprimir(){
        System.out.println("Codigo: " + codigo + "\nNome: " + nome);
    }
    
}
