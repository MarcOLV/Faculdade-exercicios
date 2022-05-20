
import javax.swing.JOptionPane;

public class Circunferencia extends Forma{
    private float raio;
    
    Circunferencia(){
        
    }
    public Circunferencia(float raio) {
        this.raio = raio;
    }
    
    public float area(){
        float area = (float) Math.PI*(getRaio()*getRaio());
        return area;
    }
    
    public float perimetro(){
        float perimetro = (float) (2*Math.PI*getRaio());
        return perimetro;
    }
    
    public void mostra(){
        JOptionPane.showMessageDialog(null,"raio da circunferencia é: "+getRaio()+
                "\nPerimetro da circunferencia é: "+perimetro()+
                "\nArea da circunferencia é: "+area());
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
}
