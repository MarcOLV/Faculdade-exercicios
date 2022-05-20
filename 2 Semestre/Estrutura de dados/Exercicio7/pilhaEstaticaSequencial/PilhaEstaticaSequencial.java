package pilhaEstaticaSequencial;

public class PilhaEstaticaSequencial {

    public static void main(String[] args) {
       Pilha p = new Pilha(100);
       p.push(45);
       p.push(78);
       p.push(14);
       p.push(41);
       p.push(98);
       p.push(71);
       System.out.println("Pilha inicial:");
       System.out.println(p.toString());
       System.out.println("Retiremos dois elementos da pilha:");
       System.out.println(p.pop());
       System.out.println(p.pop());
       System.out.println(p.toString());
       System.out.println("Adicionamos 20:");
       p.push(20);
       System.out.println(p.toString());
       System.out.println("No topo está:");
       System.out.println(p.top());
       System.out.println("Depois de executar top() fica igual:");
       System.out.println(p.toString());
       System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           System.out.println(p.pop());
       }
       if ( p.isEmpty() )System.out.println("Impossível retirar da pilha. Pilha vazia.");
       //ou também podemos perguntar:  if ( p.pop()==null ) System.out.println("Impossível retirar da pilha. Pilha vazia.");
    }
    
}
