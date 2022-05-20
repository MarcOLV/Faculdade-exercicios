
import javax.swing.JOptionPane;

public class Produto {
    //atributo
    String marca;
    float valor;
    
    //métodos
    public void cadastraDados(){
        marca = JOptionPane.showInputDialog("Digite a marca do produto");
        valor = Float.parseFloat(JOptionPane.showInputDialog(
                                               "Digite o valor do produto"));
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Marca = " + marca + 
                "\nValor = " + valor);
    }
    public Produto duplicar(){
        Produto copia = new Produto();
        copia.marca = this.marca;
        copia.valor = this.valor;
        return copia;
    }
    public boolean comparaCom(Produto p){
        return (this.marca.equalsIgnoreCase(p.marca) && this.valor == p.valor);            
    }
    
    public float calculaImposto(float p){
        return this.valor*p/100;
    }
    
}
