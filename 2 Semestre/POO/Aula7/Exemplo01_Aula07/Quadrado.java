public class Quadrado extends Forma {
    
    //atributo
    private float base;
    
    //construtor
    public Quadrado(float base) {
        this.base = base;
    }
    //métodos de acesso
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    //implementação dos métodos abstratos
    public float area(){
        return base*base;
    }
    public void mostra(){
        System.out.println("Base: " + base + 
                "\nÁrea: " + area() + 
                "\nPerimetro: " + perimetro());
    }
    public float perimetro(){
        return base*4;
    }
   
    
    
}
