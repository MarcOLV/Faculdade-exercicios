
public class TestePublicacao {

    public static void main(String[] args) {
        //Polimorfismo
        Publicacao p1, p2; //declaração a partir da classe pai
        //instanciando a partir da classe filho
        p1 = new Livro("Pearson", "Java", "09/11/2003"); 
        p2 = new Revista("Globo", "São Paulo", "Caras");
        //uso dos métodos
        p1.imprimir();
        p2.imprimir();
    }
    
}
