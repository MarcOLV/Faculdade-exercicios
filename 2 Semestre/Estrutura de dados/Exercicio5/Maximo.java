// ©Ledón: 

public class Maximo {
	
    	public static void main(String args[]) {
		new Maximo();
    	}
	
    	public Maximo() {
		int a[] = {12, 11, 21, 89, 99, 45, 89, 12, 24, 6, 70, 1002, 999, 987};
		System.out.println( "Maior dos valores: " + maximo(a, 0, a.length-1 ) ); 
		System.out.println( "Maior dos valores: " + maximoIterativo(a) ); 
    	}
	
	public int maximo (int vet[], int inicio, int fim) { // método recursivo
	        if(inicio == fim) return vet[inicio];
	        int meio = (inicio + fim) / 2;
	        int a = maximo(vet, inicio, meio);
		int b = maximo(vet, meio+1, fim);	
		return ( (a>b) ? a:b );
	 }
	 
	public int maximoIterativo (int vet[]) {
	        int max = vet[0];
	        for(int i=1; i < vet.length; i++) {
	              if(vet[i] > max) max = vet[i];
	        }
	        return max;
	 }
}

