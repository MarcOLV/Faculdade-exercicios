//Ledón, 2017.

public class MedianaDeTres {
	
	public static void main (String args[]) {
		new MedianaDeTres();
	}

	public MedianaDeTres() {
		double  x [ ] = { 2,  23.45,  3.8,  6,  5.5, 72.3, 8 }; 
		visualizaVetor(x);  
		double med = medianaDeTres (x, 0, x.length-1);
		System.out.println("Mediana de três: " + med);
		visualizaVetor(x);
	}
    
	public double medianaDeTres (double vet[], int esq, int dir) {
	    int centro = (esq + dir) / 2;
	    if (vet[esq] > vet[centro])
	        troca (vet, esq, centro);
	    if (vet[esq] > vet [dir])
	        troca (vet, esq, dir);
	    if (vet [centro] > vet [dir])
	        troca (vet, centro, dir);
	    troca (vet, centro, dir-1); //esconde o pivô
	    return vet[dir - 1];  // retorna o pivô (mediana de três)
	}
    
	public void troca (double vet[], int i, int j) {    
		double temp = vet[i];    
		vet[i] = vet[j];    
		vet[j] = temp;  
	}
    
        public void visualizaVetor(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }    
    
}