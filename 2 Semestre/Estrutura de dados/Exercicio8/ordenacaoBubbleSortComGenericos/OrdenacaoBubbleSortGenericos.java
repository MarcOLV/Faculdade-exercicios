package ordenacaoBubbleSortComGenericos;

public class OrdenacaoBubbleSortGenericos {

    public static void main(String[] args) {
        new OrdenacaoBubbleSortGenericos();
    }
    
    public OrdenacaoBubbleSortGenericos() {
        Double vet1[] = {4.5, 6.3, 1.2, 78.3, 0.15, 4.3};
        Integer vet2[] = {4, 6, 1, 78, 15, 3};
        AtletaVelocidade atlet[] = {
            new AtletaVelocidade("Luiza","Brasil","F", 11.4f, 11.9f),
            new AtletaVelocidade("Pedro","Brasil","M", 10.4f, 10.9f),
            new AtletaVelocidade("Gilbert","EUA","M", 12.5f, 12.6f),
            new AtletaVelocidade("Stephan","Canada","M", 11.0f, 10.98f),
            new AtletaVelocidade("Ana","Argentina","F", 13.14f, 13.7f)
        };  
        
        System.out.println("Vetor desordenado:");
        visualizar(vet1);        
        bubbleSort(vet1);         
        System.out.println("Vetor ordenado:");
        visualizar(vet1);

        System.out.println("Vetor desordenado:");
        visualizar(vet2);        
        bubbleSort(vet2);         
        System.out.println("Vetor ordenado:");
        visualizar(vet2);        

        System.out.println("Vetor desordenado:");
        visualizar(atlet);        
        bubbleSort(atlet);         
        System.out.println("Vetor ordenado pelos nomes dos atletas:");
        visualizar(atlet);
                
    }
    
    //Este método ordena um vetor de tipo genérico. 
    public  <E extends Comparable<E>> boolean bubbleSort(E vetor []) 
    {
        if (vetor == null) return false;        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
              if (vetor[j].compareTo(vetor[j+1]) > 0) {
                    //A comparação anterior funciona porque as classes Integer, 
                    //Double e AtletaVelocidade possuem o método compareTo.
                    E tmp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = tmp;
               }
            }
        }
        return true;
    }
    
    public <E> void visualizar(E vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\n");
        }
        System.out.println();
    }
    
}
