public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vetor de objetos
        Pessoa p[] = new Pessoa[3]; //define a qtde de elementos do vetor
        //instancia um objeto em cada posição do vetor
        p[0] = new Pessoa("José");
        p[1] = new Aluno("Silvio Santos", "123456-4");
        p[2] = new Professor(123,"Pelé");
        
        for(int i=0; i < p.length; i++){
            System.out.println(p[i].toString());
        }
    }
    
}
