public class OrdenacaoQuickSort {

    public static void main(String[] args) {
        new OrdenacaoQuickSort();
    }
    
    public OrdenacaoQuickSort() {
        double vetnulo[] = null;        
        if (!quickSort(vetnulo, 0, 4) ) {
           System.out.println("vetnulo n�o pode ser ordenado em quickSort...\n"); 
        }
        
        //declaramos um vetor; experimentemos com v�rias situa��es diferentes:
        
        //double vet[] = {9.5, 6.3, 1.2, 5.4, 0.5, 4.3};
        //double vet[] = {9 , 5,  1,  7,  2,  12,  11,  10};
        //double vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        
        //neste exemplo, na primeira 'separa��o', sair� do ciclo quando i > f, com f apontando para o valor 11, 
        //depois de acabar o ciclo troca o valor 11 com o 15 que est� em 'inicio', posicaoPivo=6: 
        //double vet[] = {15, 2, 3, 4, 5, 6, 11, 16, 17};  
        
        //este � o 1� exemplo (figura) que est� no material
        //double vet[] = {5, 3, 9, 8, 7, 2, 4, 1, 6};
        
        //este � o 2� exemplo (figura) que est� no material
        //na primeira 'separa��o' troca o 2 com o 9, sair� do ciclo quando i > f, com f apontando para o valor 1, 
        //depois de acabar o ciclo troca o valor 1 com o 5 que est� em 'inicio', posicaoPivo=4: 
        double vet[] = {5, 3, 9, 4, 1, 2, 8, 7, 6};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        quickSort(vet, 0, vet.length-1); 
        
        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }
    
    public boolean quickSort(double[] vetor, int inicio, int fim) {
        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar(vetor, inicio, fim);
           //tire o comen�rio da seguinte linha se quiser ver passo a passo:
           //System.out.println("Separa��o - posicaoPivo " + posicaoPivo + ":"); visualizar(vetor);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }
    
   private int separar(double[] vetor, int inicio, int fim) {
      double pivo = vetor[inicio];
      int i = inicio + 1, f = fim; // come�amos em inicio+1 porque o piv� � vetor[inicio]
      while (i <= f) {
         if (vetor[i] <= pivo)
            i++;
         else if (pivo < vetor[f])
            f--;
         else {  //troca vetor[i] com vetor[f]
            double troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }    
    
    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println("\n");
    }

}

