//By Ledón

package fila1;

public class Fila1 {

    public static void main(String[] args) {
        new Fila1();
    }
    
    public Fila1() {
        Queue fila = new Queue();
        
     	if( fila.isEmpty() ) {
    		System.out.println("Inicialmente: a fila está vazia");
    	}
    	
    	fila.enqueue(5);
    	fila.enqueue(12);
    	fila.enqueue(6);
   	fila.enqueue(4);
    	if( !fila.isEmpty() ) {
    	   System.out.println("Agora a fila não está vazia: " + fila.toString());
    	}
    	
        System.out.println("O valor na cabeça da fila é " + fila.peek());

    	while( !fila.isEmpty() ) {
    	  int valor = (Integer)fila.dequeue();
    	  System.out.println("Retirando o valor " + valor + " da fila");	
    	}
  
        System.out.println("Finalmente: " + fila.toString());
    }
    
}
