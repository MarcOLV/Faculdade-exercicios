public class Fornecedor extends Pessoa implements Seguranca {
    //atributo
    private float valorCompra;

    public Fornecedor() {
    }
    public Fornecedor(float valorCompra, String n, String f) {
        super(n, f);
        this.valorCompra = valorCompra;
    }
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Valor Compra: " + valorCompra);
    }

    @Override
    public boolean validar() {
        return valorCompra > 0;
    }
    
    
}
