//Autor: Ledón, 2019.

public class BuscaBinariaRecursiva {

    public static void main(String[] args) {
        new BuscaBinariaRecursiva();
    }

    public BuscaBinariaRecursiva() {
        double vetex[] = {-30, 1, 6, 8, 9, 12, 34, 41, 67, 78, 92};
        System.out.println("8 encontrado na posição " + busca(vetex, 8));
        System.out.println("34 encontrado na posição " + busca(vetex, 34));
        System.out.println("67 encontrado na posição " + busca(vetex, 67));
        System.out.println("9 encontrado na posição " + busca(vetex, 9));
        System.out.println("15 encontrado na posição " + busca(vetex, 15));
    }

    public int busca(double vetor[], double chave) {
        return buscaBinaria(vetor, 0, vetor.length - 1, chave);
    }

    private int buscaBinaria(double vetor[], int inf, int sup, double chave) {  // função recursiva    
        if (inf > sup) return -1;  //não foi encontrado o valor buscado (chave)
        int centro = (inf + sup) / 2;
        if (chave == vetor[centro]) {
              return centro;  //encontramos o valor procurado (chave) na posição centro
        } else if (chave < vetor[centro]) {
              return buscaBinaria(vetor, inf, centro - 1, chave);  //buscamos a chave no trecho inferior
        } else {
              return buscaBinaria(vetor, centro + 1, sup, chave);  //buscamos a chave no trecho superior
        }
    }

}
