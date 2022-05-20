
public class Pilha implements IPilha, Cloneable
{
    private int topo;	//Topo da Pilha
    private int MAX;	//Tamanho da Pilha
    private Produto memo[];	//Elementos da Pilha (objeto genérico)

    //Método construtor que inicializa a Pilha no estado vazia
    public Pilha() 
    {
        topo = -1;
        MAX = 30;
        memo = new Produto[MAX];
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public Pilha(int qtde) 
    {
        topo = -1;
        MAX = qtde;
        memo = new Produto[MAX];
    }

    public void setMemo(Produto[] memo) {
        this.memo = memo;
    }

    public Produto[] getMemo() {
        return memo;
    }
    //Método que verifica se a Pilha está Vazia
    public boolean isEmpty()
    {
        return(topo == -1);
    }

    //Método que verifica se a Pilha está cheia
    public boolean isFull() 
    {
        return(topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    public Produto push(Produto x) 
    {
        if(!isFull()) {
            memo[++topo] = x;
            return x;
        }
        else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    public String toString () 
    {
        if(!isEmpty()) {
            String msg = "";
            for(int i=0; i<=topo; i++) {
                msg += "\n  " + memo[i].toString();
            }
            return ("P: [ " + msg + "\n]");
        }
        else return "Pedido não pago!";
    }

    //Método para retornar o topo da Pilha e remove-lo
    public Produto pop() 
    {
        if(!isEmpty())
            return memo[topo--];
        else
            return null;
    }

    //Método que retorna o topo da pilha sem removê-lo
    public Produto top() 
    {
        if(!isEmpty())
            return memo[topo];
        else
            return null;
    }

    public double valorTotal()
    {
        double total = 0;
        for(int i=0; i<=topo; i++) {
            total += memo[i].getValorTotal();
        }
        return total;
    }   
    @Override
    public Pilha clone() throws CloneNotSupportedException {
        return (Pilha) super.clone();
    }
}
