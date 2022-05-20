public abstract class Pessoa {
    //atributos
    protected String nomeCompleto;
    protected int idade;
    //construtores
    public Pessoa() {}
    public Pessoa(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }
    //métodos de acesso
    public int getIdade() {
        return idade;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }   
    
}
