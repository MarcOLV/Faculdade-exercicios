package filasetaticaSequencial;

/**
 *
 * @author Ledón
 */

public class FilaEstaticaSequencial {

    public static void main(String[] args) {
        Queue f = new Queue();
        System.out.println( f.toString() ); //fila vazia neste momento
        if(f.peek() == null)System.out.println( "Não foi possível peek, porque a fila está vazia..." );
        /*
        try {
            Object ob = f.peek2();
        } catch (Exception err) {
            System.out.println( "Não foi possível peek, porque " + err.getMessage() );
        }
        */
        f.enqueue("mouse");
        System.out.println( f.toString() );
        f.enqueue("pendrive");
        f.enqueue("smartphone");
        System.out.println( f.toString() );
        System.out.println("Retirado: " + f.dequeue());
        System.out.println( f.toString() );
        System.out.println("Retirado: " + f.dequeue());
        System.out.println( f.toString() );
        System.out.println("Retirado: " + f.dequeue());
        System.out.println( f.toString() );
        f.enqueue("notebook");
        f.enqueue("tablet");
        f.enqueue("smartwatch");
        if ( f.enqueue("drone") == null ) System.out.println( "Não foi possível inserir...");
        System.out.println( f.toString() );
        System.out.println( "Como primeiro da fila se encontra: " + f.peek() );
        System.out.println( "Retirando (eliminando) um item da fila de cada vez:" );
        while ( !f.isEmpty() ) {
            System.out.println("--- retirado: " + f.dequeue());
        }
        System.out.println( f.toString() );
   }

    
}
