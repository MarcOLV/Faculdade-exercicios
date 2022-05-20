//Ledón, Jan/2021

public class Fibonacci {

    public static void main(String args[]) {
        new Fibonacci();
    }

    public Fibonacci() {
        System.out.println("Fibo de 5: "   + fibo(5));
        System.out.println("Fibo de 10: " + fibo(10));
        System.out.println("Fibo de 30: " + fibo(30));
        System.out.println("Fibo de 40: " + fibo(40));  //demora alguns segundos
        System.out.println("Fibo de 47: " + fibo(47)); // demora uns 26 segundos (depende do computador)
    }

    public long fibo(int n) {
        //função fibo em forma recursiva
        if (n < 0) return -1;  // opcional: não definido para valores negativos
        else if (n == 0) return 0;
        else if (n == 1) return 1;
        else return (fibo(n - 1) + fibo(n - 2)); //observe que temos duas chamadas recursivas a fibo
    }
    
}

