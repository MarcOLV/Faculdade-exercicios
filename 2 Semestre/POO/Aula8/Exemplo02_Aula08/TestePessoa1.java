public class TestePessoa1 {
   
    public static void main(String[] args) {
        Pessoa s = new Aluno("29801-8", "Leo");
        //a chamada abaix irá ocasionar um erro de compilação
        //System.out.println(s.getRgm());
        //correta - casting
        System.out.println( ((Aluno)s).getRgm() );
    }
    
}
