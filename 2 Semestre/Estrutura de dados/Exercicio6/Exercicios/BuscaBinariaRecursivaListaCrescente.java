public class BuscaBinariaRecursivaListaCrescente {

    public static void main(String[] args) {
        new BuscaBinariaRecursivaListaCrescente();  // para chamar o método construtor a seguir
    }

    public BuscaBinariaRecursivaListaCrescente() {
        String vet[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai", "Venezuela"};
        String buscado = "Espanha";
        System.out.println(buscado + ", país encontrado na posição " + buscaRecursiva(vet, buscado, 0, vet.length - 1));
    }

    public static int buscaRecursiva(String vet[], String buscado, int menor, int maior) { // menor e maior índices
        int resp;
        if (menor > maior) return -1;  // ou:   { resp=-1; return resp; }
        int meio = (menor + maior) / 2;
        if (buscado.compareTo(vet[meio]) == 0) resp = meio;
        else if (buscado.compareTo(vet[meio]) > 0) { //se buscado for maior
            resp = buscaRecursiva(vet, buscado, meio + 1, maior);   //buscar no trecho superior
        } else {
            resp = buscaRecursiva(vet, buscado, menor, meio - 1);  //buscar no trecho inferior
        }
        return resp;
    }
}
