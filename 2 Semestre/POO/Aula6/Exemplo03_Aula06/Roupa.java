public class Roupa extends Vestuario {
    private String tecido;

    public Roupa() {
    }
    public Roupa(String tecido, String cor, String tamanho, int codigo, String descricao, float valor) {
        super(cor, tamanho, codigo, descricao, valor);
        this.tecido = tecido;
    }
    public String getTecido() {
        return tecido;
    }
    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    public String print(){
        return super.print() + "\nTecido: " + tecido;
    }
    
    
}
