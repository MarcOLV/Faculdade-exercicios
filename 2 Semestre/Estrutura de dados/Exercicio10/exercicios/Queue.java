
public class Queue implements TAD_Queue {

    public int total = 0;	//Total de Elementos na fila (convenção: 0 se a fila estiver vazia)
    public int head = -1;  //Começo da Queue  (convenção: -1 se a fila estiver vazia)
    public int tail = -1;	//Final da fila (convenção: -1 se fila vazia)
    public Compra memo[];  //Vetor para armazenar os elementos
    public int MAX;        //Capacidade máxima da Queue Estática

    //Inicializa a Queue em estado vazia
    public Queue() {
        MAX = 3;
        memo = new Compra[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    //Inicializa a fila em estado vazia, com um tamanho inicial para o vetor
    public Queue(int qtde) {
        MAX = qtde;
        memo = new Compra[MAX];
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

    //Insere um elemento na fila
    public Compra enqueue(Compra x) {
        if (!isFull() && x != null) {  // pré-condições
            if (++tail >= MAX) {
                tail = 0;
            }
            if (head == -1) head = tail;
            memo[tail] = x;
            total++;
            return x;
        } 
        else return null;
    }

    //Remove um elemento do início da fila
    public Compra dequeue() {
        if (!isEmpty()) {
            Compra objeto = memo[head];
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
    public Compra dequeue1() {
        if (!isEmpty()) {
            Compra objeto = memo[tail];
            if (++tail >= MAX) {
                tail = 0;
            }
            total--;
            if (total == 0) {
                tail = -1;
                head = -1;
            }
            return objeto;
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    public Compra peek() {
        if (!isEmpty()) {
            return (memo[head]);
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar
    //Mostramos aqui outra estratégia para verificar os casos de erro: lançar uma exception.
    //Veja um exemplo de utilização na classe principal FilaEstaticaSequencial.
    public Compra peek2() throws Exception {
        if (!isEmpty()) {
            return (memo[head]);
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
            saida += memo[pos].toString();
            if (i != total) {
                saida += "\n";
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
