public class TestePessoa {
    public static void main(String[] args) {
        Cliente c = new Cliente(1000.99f, "Silvio Santos", "123456");
        Fornecedor f = new Fornecedor(3500.5f, "Mappin", "4444444");
        
        c.print();
        f.print();
    }
    
}
