public class Vestuario extends Produto{
    private String cor;
    private String tamanho;

    public Vestuario() {
    }

    public Vestuario(String cor, String tamanho, int codigo, String descricao, float valor) {
        super(codigo, descricao, valor);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String print(){
        return super.print() + "\nCor: " + cor +
                "\nTamanho: " + tamanho;
    }
    
}
