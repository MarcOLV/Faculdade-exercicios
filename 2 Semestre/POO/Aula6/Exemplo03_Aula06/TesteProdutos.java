public class TesteProdutos {
    public static void main(String[] args) {
        Eletronico e = new Eletronico(110, 1, "TV", 1500.75f);
        System.out.println(e.print());
        
        Roupa r = new Roupa("Linho", "Azul", "M", 2, "Linda blusa de verão", 150.99f);
        System.out.println(r.print());
    }
    
}
