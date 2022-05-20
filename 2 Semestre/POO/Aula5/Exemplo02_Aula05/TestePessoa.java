public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //atribuição de valores
        //p.nome = "Silvio Santos";
        p.setNome("Silvio Santos");
        p.setIdade(94);
        p.setRenda(1000);
        
        p.imprimeDados();
    }
    
}
