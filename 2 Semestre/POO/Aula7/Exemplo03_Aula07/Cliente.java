public class Cliente extends Pessoa{
    
    //atributos
    private float valorDivida;
    
    //construtores

    public Cliente() {
    }

    public Cliente(float valorDivida, String n, String f) {
        super(n, f); //chama o construtor com parâmetros da superclasse
        this.valorDivida = valorDivida;
    }
    //métodos de acesso
    public float getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    //método
    public void print(){
        super.print(); //chama o método print da classe pai
        System.out.println("Valor da dívida: " + valorDivida);
    }
    
    



    
    
    
}
