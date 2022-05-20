public class TestePessoa {
    public static void main(String[] args) {
        Cliente c = new Cliente(1000.99f, "Silvio Santos", "123456");
        Fornecedor f = new Fornecedor(0, "Mappin", "4444444");
        
        c.print();
        //usa o método declarado na interface
        //e implementado na classe Fornecedor
        if (f.validar())
            f.print(); //mostra os dados se validar retornar true
    }
    
}
