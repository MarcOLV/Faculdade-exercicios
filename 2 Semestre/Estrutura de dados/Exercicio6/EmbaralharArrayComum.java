import java.util.Random;

public class EmbaralharArrayComum {

    public void embaralhar(double[] v) {
        //Esta solução para "embaralhar", mais simples, é diferente do algoritmo de Fisher-Yates.
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            int j = random.nextInt(v.length); //gera uma posição j aleatória
            //troca os valores das posições i e j:
            double temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }

    public static void main(String[] args) {
        new EmbaralharArrayComum();
    }

    public EmbaralharArrayComum() { //construtor, com a lógica principal
        double[] numeros = {
            100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
        };
        System.out.print("Antes de embaralhar: ");
        for (double n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
        embaralhar(numeros);
        System.out.print("Depois de embaralhar: ");
        for (double n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
