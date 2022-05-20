
import javax.swing.JOptionPane;

public class Triangulo extends Forma{
    private float base, altura;

    Triangulo(){
        
    }
   public Triangulo(float b, float h){

           base = b;

           altura = h;

   }
   public float getBase() { return base; }

   public float getAltura() { return altura; }

   public void setBase(float b) { base = b; }

   public void setAltura(float h) { altura = h; }

   public float area(){

           return (base * altura)/2;

   }
   

   public void mostra(){

           JOptionPane.showMessageDialog(null,"A base do triangulo é: "+getBase()+
                "\nA altura do trinagulo é: "+getAltura()+
                "\nO perimetro do triangulo é: "+perimetro()+
                "\nA area do triangulo é: "+area());

   }

}

