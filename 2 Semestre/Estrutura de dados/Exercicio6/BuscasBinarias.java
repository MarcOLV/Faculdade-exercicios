import javax.swing.JOptionPane;

public class BuscasBinarias {

    public static void main(String[] args) {
        new BuscasBinarias(); // para chamar o método construtor a seguir
        // desta forma os métodos não precisam ser static
    }

    public BuscasBinarias() {  //método construtor principal
        String paisesB[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França",
            "Inglaterra", "Turquia", "Uruguai", "Venezuela"};
        String x = JOptionPane.showInputDialog("Digite o país que deseja encontrar");
        int indice = buscaBinariaEmListaCrescente(paisesB, x);
        JOptionPane.showMessageDialog(null, x + " encontrado na posição " + indice);

        //... completar aqui a chamada a buscaBinariaEmListaDecrescente com o vetor que está ordenado de maior a menor
        //...
    }

    public int buscaBinariaEmListaCrescente(String paises[], String x) {
        int inicio, fim, centro; //melhor chamar de centro, em lugar de pivo
        inicio = 0;
        fim = paises.length - 1;  // a posição final é o tamanho do vetor de países - 1
        while (inicio <= fim) {
            centro = (inicio + fim) / 2;
            if (x.compareTo(paises[centro]) ==0) { //encontramos o país procurado
                return centro;
            } else if (x.compareTo(paises[centro]) > 0) {  //procurar no trecho superior
                inicio = centro + 1;
            } else if (x.compareTo(paises[centro]) < 0) {  //procurar no trecho inferior
                fim = centro - 1;
            }
        }
        return -1;  //não foi encontrado o país
    }

    public int buscaBinariaEmListaDecrescente(String paises[], String x) {
        //... completar a lógica, parecida com a anterior, mas o operador do if mudará
        //...
        return -1;
    }

}
