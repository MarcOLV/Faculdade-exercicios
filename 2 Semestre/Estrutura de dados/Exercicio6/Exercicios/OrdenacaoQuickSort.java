public class OrdenacaoQuickSort {

    public static void main(String[] args) {
        new OrdenacaoQuickSort();
    }
    
    public OrdenacaoQuickSort() {
        double vet[] = {11.0, 9.5, 0.1, 9.8, 6.3, 1.2, 5.4, 0.5, 4.3, 10.1, 0.1};
        System.out.println("\nVetor double vet[] desordenado:");
        visualizarVetor(vet);        
        quickSort(vet, 0, vet.length-1);        
        System.out.println("Vetor double vet[] ordenado - em ordem crescente:");
        visualizarVetor(vet);
        
        int vet2[] = {11, 9, 1, 8, 6, 2, 5, 51, 4, 10, 11, 3};
        System.out.println("\nVetor int vet2[] desordenado:");
        visualizarVetor(vet2);        
        quickSort(vet2, 0, vet2.length-1);        
        System.out.println("Vetor int vet2[] ordenado - em ordem decrescente:");
        visualizarVetor(vet2);
    }
    
    // --------- versões para ordenar um double vetor[] em ordem crescente ------------
    
    public boolean quickSort(double[] vetor, int inicio, int fim) {
        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar(vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }
    
   private int separar(double[] vetor, int inicio, int fim) {
      // Este método deixará os itens menores que o pivô  á esquerda e os maiores à direita.
      // O método medianaDeTres determina a mediana de três valores, troca os três valores e
      // deixa o pivô (a mediana de três) na posição inicio, para não alterar a lógica
      // original deste método.
      double pivo = medianaDeTres(vetor, inicio, fim);  // única alteração neste método
      int i = inicio+1, f = fim;
      while (i <= f) {
         if (vetor[i] <= pivo)
            i++;
         else if (pivo < vetor[f])
            f--;
         else {
            double temp = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = temp;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }    
    
   public double medianaDeTres (double vetor[], int esq, int dir) {
        int centro = (esq + dir) / 2;
        if ( vetor[esq] > vetor[centro] ) troca( vetor, esq, centro );
        if ( vetor[esq] > vetor[dir] ) troca( vetor, esq, dir );
        if ( vetor[centro] > vetor[dir] ) troca( vetor, centro, dir );
        double pivot = vetor[centro];
        // mas colocamos o pivô à esquerda, para manter a lógica original no método separar:
        troca( vetor, esq, centro );  
        return pivot;  // retorna o pivô (a mediana de três)
   }

   public void troca (double vetor[], int i, int j) {
        if(i==j)return;
        double temp = vetor[i];    
        vetor[i] = vetor[j];    
        vetor[j] = temp;          
   }

    public void visualizarVetor(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) System.out.print(vetor[i] + "   ");
        System.out.println();
    }

    // --------- versões para ordenar um int vetor[] em ordem decrescente ------------
    
    public boolean quickSort(int vetor [], int inicio, int fim) {
        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar(vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }
    
   private int separar(int vetor [], int inicio, int fim) {
      // Este método deixará os itens maiores que o pivô á esquerda e 
      // os menores à direita, porque solicitaram ordenar em ordem decrescente!
      // O método medianaDeTres determina a mediana de três valores inteiros, troca os três valores e
      // deixa o pivô (a mediana de três) na posição inicio, para não alterar a lógica original deste método.
      int pivo = medianaDeTres(vetor, inicio, fim);  //  alteração importante neste método
      int i = inicio+1, f = fim;
      while (i <= f) {
         if (vetor[i] > pivo)  i++;  //avança i, veja que a comparação é diferente: ordem decrescente
         else if (vetor[f] <= pivo) f--; //retrocede j, veja que a comparação é diferente: ordem decrescente
         else {
            int temp = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = temp;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }    
    
   public int medianaDeTres (int vetor[], int esq, int dir) {
        int centro = (esq + dir) / 2;
        if ( vetor[esq] > vetor[centro] ) troca( vetor, esq, centro );
        if ( vetor[esq] > vetor[dir] ) troca( vetor, esq, dir );
        if ( vetor[centro] > vetor[dir] ) troca( vetor, centro, dir );
        int pivot = vetor[centro];
        troca( vetor, esq, centro );  
        return pivot;  // retorna o pivô (a mediana de três)
   }

   public void troca (int vetor[], int i, int j) {
        if(i==j)return;
        int temp = vetor[i];    
        vetor[i] = vetor[j];    
        vetor[j] = temp;          
   }

    public void visualizarVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) 
             System.out.print(vetor[i] + "   ");
        System.out.println();
    }

}

