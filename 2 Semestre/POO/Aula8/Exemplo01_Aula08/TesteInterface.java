public class TesteInterface {
    public static void main(String[] args) {
        Produto prod = new Produto("Macarrão", -1);
        Usuario teste = new Usuario("silvio.santos", "123", "Silvio Santos", 94);
        
        if(prod.validar()){
            prod.formatoSystemOut();
        }
        if(teste.validar()){
            System.out.println(teste.formatoString());
        }
    }
    
}
