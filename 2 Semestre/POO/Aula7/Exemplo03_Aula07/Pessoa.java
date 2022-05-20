public class Pessoa {
    //atributos
    private String nome;
    private String fone;
    
    //construtor padrão
    public Pessoa(){}
    
    //construtor com parâmetros
    public Pessoa(String n, String f){
        nome = n;
        fone = f;
    }
    //métodos de acesso
    public String getFone() {
        return fone;
    }
    public String getNome() {
        return nome;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void print(){
        System.out.println("Nome: " + nome + 
                "\nTelefone: " + fone);
    }  
}
