
public interface TAD_Queue {  // tipo abstrato de dado que descreve a Fila        
    //Verifica se a Queue está vazia:
    public boolean isEmpty();
    //Verifica se a Queue está cheia:
    public boolean isFull();
    //Insere um elemento na fila:
    public Compra enqueue(Compra x);
    //Remove um elemento do início da fila:
    public Compra dequeue();
    public Compra dequeue1();
    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar:
    public Compra peek();
    //Retorna o conteúdo (todos os elementos) da Queue
    public String toString();
}
