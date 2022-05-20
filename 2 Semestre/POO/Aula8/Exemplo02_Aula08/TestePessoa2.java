public class TestePessoa2 {

    public static void main(String[] args) {
       //Pessoa s = new Pessoa("Carla");
       Pessoa s = new Aluno("123", "Maria");
       
       if (s instanceof Aluno)       
            System.out.println( ( (Aluno)s).getRgm());
    }
    
}
