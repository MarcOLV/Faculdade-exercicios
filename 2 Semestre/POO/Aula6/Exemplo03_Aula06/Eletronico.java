public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico() {
    }

    public Eletronico(int voltagem, int codigo, String descricao, float valor) {
        super(codigo, descricao, valor);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public String print(){
        return super.print() + "\nVoltagem: " + voltagem;
    }
    
    
}
