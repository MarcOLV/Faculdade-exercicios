
public class Triangulo {
    //atributos
    float base;
    float altura;
    
    //construtores
    //padrão
    Triangulo(){}
    //com parâmetros
    Triangulo(float b, float a){
        base = b;
        altura = a;
    }
    //métodos
    float calculaArea(){
        return (base*altura)/2;
    }
    String imprimeDados(){
        String texto="";
        texto = "Altura = " + altura + "\nBase = " + base + 
                "\nÁrea = " + calculaArea();
        return texto;
    }
    
}
