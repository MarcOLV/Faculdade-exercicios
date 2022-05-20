public class ExemplosRecursividade {

    public static void main(String[] args) {
        new ExemplosRecursividade();
    }
    
    public ExemplosRecursividade() {
        System.out.println("fibo(5): " + fibo(5));
        System.out.println("fibo(7): " + fibo(7));
        System.out.println("fibo(8): " + fibo(8));
        System.out.println("fibo(9): " + fibo(9));

        System.out.println("fatorial(4): " + fatorial(4));
        System.out.println("fatorial(5): " + fatorial(5));
        
        int a[] = {9, 12, 21, 89, 99, -989, 70, 12, 24, 6, 78};
        System.out.println( "Maior dos valores: " + maximo(a, 0, a.length-1) );
     }
    
    long fibo ( int n ) {
        if ( n < 0 ) return -1; // não existe para valores negativos
        else if (n == 0) return 0;
        else if (n == 1) return 1;
        else return ( fibo(n-1) + fibo(n-2) );
    }
    
    long fatorial ( int n ) {
        if ( n < 0 ) return -1; // o fatorial não existe para valores negativos
        else if (n == 0 || n == 1) return 1;
        else return ( n * fatorial(n-1) );
    }   
    
    int maximo (int vet[], int inicio, int fim) {
	if(inicio == fim) return vet[inicio];
	int meio = (inicio + fim) / 2;
	int a = maximo(vet, inicio, meio);
	int b = maximo(vet, meio+1, fim);
	return ( (a>b) ? a:b );
    }
    
}
