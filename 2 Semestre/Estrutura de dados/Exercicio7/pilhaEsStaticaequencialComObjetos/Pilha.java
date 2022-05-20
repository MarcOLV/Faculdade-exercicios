package pilhaEsStaticaequencialComObjetos;

public class Pilha implements TAD_Pilha {
	private int topo;	//Topo da Pilha
	private int MAX;	//Tamanho da Pilha
	private Object memo[];	//Elementos da Pilha (objeto genérico)

	//Método construtor que inicializa a Pilha no estado vazia
	public Pilha() {
		topo = -1;
		MAX = 30;
		memo = new Object[MAX];
	}

        //Método construtor que inicializa a Pilha com tamanho máximo desejado
	public Pilha(int qtde) {
		topo = -1;
		MAX = qtde;
		memo = new Object[MAX];
	}

	//Método que verifica se a Pilha está Vazia
	public boolean isEmpty() {
		return(topo==-1);
	}

	//Método que verifica se a Pilha está cheia
	public boolean isFull() {
		return(topo==MAX-1);
	}

	//Método para inserir um valor na Pilha
	public Object push(Object x) {
		if(!isFull()) {
			memo[++topo]=x;
			return x;
		}
                else {
			return null;
		}
	}

        //Método para retornar o conteúdo da Pilha
        public String toString () {
            if(!isEmpty()) {
                String msg = "";
                for(int i=0; i<=topo; i++) {
                   msg += "\n  " + memo[i].toString();
                }
                return ("P: [ " + msg + "\n]");
            }
            else return "Pilha Vazia!";
        }

	//Método para retornar o topo da Pilha e remove-lo
	public Object pop() {
		if(!isEmpty())
			return memo[topo--];
		else
			return null;
	}

	//Método que retorna o topo da pilha sem removê-lo
	public Object top() {
		if(!isEmpty())
			return memo[topo];
		else
			return null;
	}

}
