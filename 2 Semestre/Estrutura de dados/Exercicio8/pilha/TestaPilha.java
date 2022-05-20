package pilha;

public class TestaPilha {

    public static void main(String[] args) {
        new TestaPilha();
    }
    
    public TestaPilha() {
        Pilha pilha = new Pilha();  // cria uma pilha, inicialmente vazia
        
        if( pilha.isEmpty() ) {
            System.out.println("A pilha está vazia");
        }
    	
        pilha.push(5);
        pilha.push(9);
        pilha.push(12);
        pilha.push(6);
        pilha.push(4);
        // ou pilha.push(7.3f); ou pilha.push("janela"); porque poderíamos também inserir 
        // outros tipos de dados, já que a pilha armazena Object, mas não seria o mais correto
        
        if( !pilha.isEmpty() ) {
            System.out.println("A pilha não está vazia\n");
        }
        
        System.out.println("O valor no topo da pilha é " + pilha.top() );     
        System.out.println("O conteúdo da pila é " + pilha.toString() + "\n");

        while( !pilha.isEmpty() ) {
                //int valor = (Integer)pilha.pop();
                //System.out.println("Retirado o valor " + valor + " da pilha");
                //ou simplesmente assim:
                System.out.println("Retirado o valor " + pilha.pop() + " da pilha");	
        }

    }
    
}
