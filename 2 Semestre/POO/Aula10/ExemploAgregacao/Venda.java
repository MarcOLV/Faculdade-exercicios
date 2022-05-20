public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private float vfinal;

    public Venda() {
    }
    public Venda(Produto produto, Vendedor vendedor) {
        this.produto = produto;
        this.vendedor = vendedor; 
    }
    public Produto getProduto() {
        return produto;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public float getVfinal() {
        return vfinal;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public void concretizaVenda(){
        vfinal = produto.getPreco()+produto.getPreco()*vendedor.getComissao()/100;
    }
    public void imprimir(){
        produto.imprimir();
        vendedor.imprimir();
        System.out.println("Valor final: " + vfinal);
    }
    
}
