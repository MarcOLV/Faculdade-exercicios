package filaEstaticaSequencial;

public interface TAD_Queue {  // tipo abstrato de dado que descreve a Fila        
    //Verifica se a Queue está vazia:
    public boolean isEmpty();
    //Verifica se a Queue está cheia:
    public boolean isFull();
    //Insere um elemento na fila:
    public Filme enqueue(Filme x);
    //Remove um elemento do início da fila:
    public Filme dequeue();
    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar:
    public Filme peek();
    //Retorna o conteúdo (todos os elementos) da Queue
    public String toString();
}
