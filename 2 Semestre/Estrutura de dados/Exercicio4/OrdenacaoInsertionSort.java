public class OrdenacaoInsertionSort {

    public static void main(String[] args) {
        new OrdenacaoInsertionSort();
    }
    
    public OrdenacaoInsertionSort() {
        double vetnulo[] = null;
        
        if (!insertionSort_v01(vetnulo) ) {
           System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em insertionSort_v01."); 
        }
        
        try {
          insertionSort_v02(vetnulo);
        }
        catch(Exception ex ){
          System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em insertionSort_v02.\n");  
        }
        
        //declaramos um vetor:
        double vet[] = {9.5, 6.3, 1.2, 5.4, 0.5, 4.3};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        insertionSort_v01(vet); 
        
        //ou chamar a insertionSort_v02:
        /*
        try {
          insertionSort_v02(vet);
        }
        catch(Exception ex ){
          System.out.println("vet não pode ser ordenado em insertionSort_v02...\n");  
        }
        */
        
        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }
    
    public boolean insertionSort_v01(double a []) {
        if (a == null) return false;   
        int i,j;  double x;
        for ( i=1; i < a.length; i++ ) {       
            x = a[i]; j = i;
            while ( j > 0  && x < a[j-1] ) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = x;
            visualizarEtapa(a,i);
        }
        return true;
    }
    
    public void insertionSort_v02(double a []) throws Exception {
        if (a == null) throw new Exception();     
        int i,j;  double x;
        for ( i=0; i < a.length; i++ ) {       
            x = a[i]; j = i;
            while ( j > 0  && x < a[j-1] ) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = x;
        }
    }

    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    
    public void visualizarEtapa(double vetor[], int pos) {
        System.out.print("i=" + pos + "      ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
        
}
