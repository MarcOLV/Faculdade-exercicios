public class TesteAssociacao {
    public static void main(String[] args) {
       Curso ccp = new Curso(16,"Ciência da Computação");
       Disciplina poo = new Disciplina("Fulano", ccp);
       poo.imprimir();
    }
    
}
