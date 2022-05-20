public class OrdenacaoString {

    public static void main(String[] args) {
        new OrdenacaoString();
    }
    
    public OrdenacaoString() {
        //declaramos um vetor:
        String vet[] = {"MÈxico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        bubbleSort_v05(vet); //ou executar as outras vers√µes dispon√≠veis
        
        System.out.println("Vetor ordenado com Bubble Sort:");
        visualizar(vet);
        
        String vet1[] = {"MÈxico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        try {
			insertionSort_v02(vet1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Vetor ordenado com Insertion Sort:");
        visualizar(vet);
    }
    
    public void troca(String vetor[], int posa, int posb) {
        String temp = vetor[posa];
        vetor[posa] = vetor[posb];
        vetor[posb] = temp;        
    }
    
    public  boolean  bubbleSort_v05 (String vetor []) {
        if (vetor == null) return false; 
        boolean trocou;    int i = 0; 
        do {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
              if (vetor[j].compareToIgnoreCase(vetor[j+1]) > 0) {
                    troca(vetor, j, j+1);
                    trocou = true;
               }
            }
            i++;
        } while (trocou);
        return true;
    } 
    
    public void insertionSort_v02(String a []) throws Exception {
        if (a == null) throw new Exception();     
        int i,j;  String x;
        for ( i=0; i < a.length; i++ ) {       
            x = a[i]; j = i;
            while ( j > 0  && x.compareToIgnoreCase(a[j - 1]) < 0 ) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = x;
        }
    }
    
    public void visualizar(String vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    
}
