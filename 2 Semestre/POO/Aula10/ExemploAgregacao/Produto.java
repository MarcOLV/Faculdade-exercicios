public class Produto {
    private float preco;
    public Produto() {
    }
    public Produto(float preco) {
        this.preco = preco;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void imprimir(){
        System.out.println("Preço: " + preco);
    }
    
    
}
