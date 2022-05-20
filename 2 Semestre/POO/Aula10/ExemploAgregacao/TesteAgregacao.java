public class TesteAgregacao {
    public static void main(String[] args) {
        Produto p = new Produto(100.5f);
        Vendedor v = new Vendedor(10);
        Venda comercio = new Venda(p, v);
        comercio.concretizaVenda();
        comercio.imprimir();
    }
    
}
