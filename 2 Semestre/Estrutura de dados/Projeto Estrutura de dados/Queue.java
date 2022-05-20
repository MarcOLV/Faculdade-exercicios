
import javax.swing.JOptionPane;


//Projeto FilaEstaticaSequencial.
//Implementação de uma Fila Estática Sequencial
//com funcionamento circular.
public class Queue implements IQueue {

    private int total = 0;	//Total de Elementos na fila (convenção: 0 se a fila estiver vazia)
    private int head = -1;  //Começo da Queue  (convenção: -1 se a fila estiver vazia)
    private int tail = -1;	//Final da fila (convenção: -1 se fila vazia)
    private Pilha[] memoFila;  //Vetor para armazenar os elementos
    private int MAX;        //Capacidade máxima da Queue Estática

    //Inicializa a Queue em estado vazia
    public Queue() {
        MAX = 1000;
        memoFila = new Pilha[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    //Inicializa a fila em estado vazia, com um tamanho inicial para o vetor
    public Queue(int qtde) {
        MAX = qtde;
        memoFila = new Pilha[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    //Verifica se a fila está vazia
    public boolean isEmpty() {
        return (total == 0);
    }

    //Verifica se a fila está cheia (se o vetor está cheio)
    public boolean isFull() {
        return (total == MAX);
    }
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    //Insere um elemento na fila
    public Pilha[] enqueue(Pilha[] x) {
        if (!isFull() && x != null) {  // pré-condições
            if (++tail >= MAX) {
                tail = 0;
            }
            if (head == -1)
            {
                head = tail;
                for(int i=0; i < x.length; i++) 
                {
                    memoFila[i] = x[i];
                    total++;
                }
            } 
            return x;
        } 
        else return null;
    }

    //Remove um elemento do início da fila
    public Pilha dequeue() {
        if (!isEmpty()) {
            Pilha objeto = memoFila[head];
            if (++head >= MAX) {
                head = 0;
            }
            total--;
            if (total == 0) {
                head = -1;
                tail = -1;
            }
            return objeto;
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    public Pilha peek() {
        if (!isEmpty()) {
            return (memoFila[head]);
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    //Mostramos aqui outra estratégia para verificar os casos de erro: lançar uma exception.
    //Veja um exemplo de utilização na classe principal FilaEstaticaSequencial.
    public Pilha peek2() throws Exception {
        if (!isEmpty()) {
            return (memoFila[head]);
        } else {
            throw new Exception("a fila está vazia");
        }
    }

    //Retorna o conteúdo da Queue
    public String toString() {
        if (!isEmpty()) {
            String saida = "";
            int pos = head;
            for (int i = 1; i <= total; i++) {
                saida += memoFila[pos].toString();
                if (i != total) {
                    saida += ", ";
                }
                pos++;
                if (pos >= MAX) {
                    pos = 0;
                }
            }
            return ("F: " + " [ " + saida + " ]");
        } else {
            return ("F: [ ]");
        }
    }
}
