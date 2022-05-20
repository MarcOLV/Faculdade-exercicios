public class Vendedor {
    private float comissao;
    public Vendedor() {
    }
    public Vendedor(float comissao) {
        this.comissao = comissao;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    public void imprimir(){
        System.out.println("Comissão: " + comissao);
    }    
}
