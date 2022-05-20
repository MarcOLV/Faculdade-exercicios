
import java.util.Scanner;

public class TesteForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a, b;
        Quadrado q;
        Triangulo t;
        Scanner leia = new Scanner (System.in);
        
        //solicita os dados do quadrado
        System.out.println("Digite o valor do lado do quadrado: ");
        b = leia.nextFloat();
        //instancia o objeto q
        q = new Quadrado(b);
        q.mostra();
        
        //solicita os dados do triangulo
        System.out.println("Digite o valor da base do triângulo: ");
        b = leia.nextFloat();
        System.out.println("Digite o valor da altura do triângulo: ");
        a = leia.nextFloat();
        //instancia o objeto t
        t = new Triangulo(b, a);
        t.mostra();
    }
    
}
