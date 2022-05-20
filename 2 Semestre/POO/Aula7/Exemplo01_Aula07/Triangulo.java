public class Triangulo extends Forma{
    //atributos
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public float getBase() {
        return base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setBase(float base) {
        this.base = base;
    }
    //implementação dos métodos abstração
    public float area(){
        return base*altura/2;
    }
    public void mostra(){
        System.out.println("Base: " + base + 
                "\nAltura: " + altura + 
                "\nÁrea: " + area());
    }
    
    
}
