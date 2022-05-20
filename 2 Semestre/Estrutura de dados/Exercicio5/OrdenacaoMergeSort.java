// Implementação: Ledón (implementação baseada no algoritmo de Mark Allen Weiss)
// Neste exemplo, temos uma simplificação colocando os vetores como atributos da classe (para eliminar os parâmetros).
// Também, mostramos, no método merge, os trechos sendo misturados.

public class OrdenacaoMergeSort {
     // Para simplificar, colocamos os vetores como atributos da classe:
     private double vet[] = {71.2, 0.3, 6.3, -1.2, 5.4, 0.5, 0.2, 91.5, 33.3, 0.9};  //vetor que queremos ordenar
     private double tempVet [] = new double[vet.length];  // vetor auxiliar temporário
    
    public static void main(String[] args) {   
        new OrdenacaoMergeSort();   
    }
    
    public OrdenacaoMergeSort() {              
        System.out.println("Vetor desordenado:");
        visualizarVetor(vet);        
        mergeSort(0, vet.length-1);    // ordenamos o vetor completo       
        System.out.println("Vetor ordenado:");
        visualizarVetor(vet);
    }
    
    public void mergeSort( int esq, int dir ){
        if (esq < dir) { // caso contrário (se o trecho do vetor tiver mais de um elemento) abandonaremos este método (fim da recursão)
            int centro = (esq + dir)/2;
            mergeSort(esq, centro);     //ordenar (dividir) o trecho esquerdo
            mergeSort(centro+1, dir);  //ordenar (dividir) o trecho direito
            merge(esq, centro+1, dir);  //misturar-fusionar dois sub-trechos 
        }
    }

    /*
        Este método fusiona em tempVet os elementos do vetor vet dos trechos entre esq, centro, dir.
        vet - é o vetor original que queremos ordenar
        tempVet - é o vetor temporário para colocar os elementos fusionados
        esq - é o índice mais à esquerda do trecho do vetor
        centro - é o índice onde começa a segunda metade do trecho do vetor
        dir  - é o índice mais à direita do trecho do vetor
     */
    public void merge( int esq, int centro, int dir ) {
        System.out.println("Misturando trechos entre esq, dir: " + esq + ", " + dir + " com centro em " + centro);
        int fimTrechoEsquerdo = centro - 1;
        int i = esq;
        int qtdeElementos = dir - esq + 1;
        
        //------------ Mistura, fusão inicial de elementos:
        while( esq <= fimTrechoEsquerdo && centro <= dir )  //ciclo enquanto não acabe algum dos trechos
            if( vet[ esq ] <= vet[ centro ] )
                tempVet[ i++ ] = vet[ esq++ ]; //pegamos o valor do trecho esquerdo e o colocamos em tempVet
            else
                tempVet[ i++ ] = vet[centro++]; //pegamos o valor do trecho direito e o colocamos em tempVet
        
        //------------- Ciclo para copiar o possível resto da metade esquerda:
        while( esq <= fimTrechoEsquerdo )  
            tempVet[ i++ ] = vet[ esq++ ];
        
        //------------- Ciclo para copiar o possível resto da metade direita:
        while( centro <= dir )  
            tempVet[ i++ ] = vet[centro++];
        
        //-------- Finalmente, copiamos o trecho ordenado do vetor auxiliar para o vetor original:
        for( i = 0; i < qtdeElementos; i++, dir-- )
             vet[dir] = tempVet[dir];
    }
    
    public void visualizarVetor(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }    
    
}
