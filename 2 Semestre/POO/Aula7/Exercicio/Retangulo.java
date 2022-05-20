
import javax.swing.JOptionPane;


public class Retangulo extends Triangulo{
    Retangulo(){}
    Retangulo(float b, float a){
        super(b,a);
    }
    
    @Override
     public float area(){
        float area = getBase()*getAltura();
        return area;
    }
    
    @Override
    public float perimetro(){
        float perimetro = (getBase()*getAltura())*2;
        return perimetro;
    }
    
    @Override
    public void mostra(){
        JOptionPane.showMessageDialog(null,"A base do retangulo é: "+getBase()+
                "\nA altura do retangulo é: "+getAltura()+
                "\nO perimetro do retangulo é: "+perimetro()+
                "\nA area do retangulo é: "+area());
    }
}
