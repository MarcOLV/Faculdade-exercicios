package pilhaComGenericos;

public class TestaPilha {

    public static void main(String[] args) {
        new TestaPilha();
    }

    public TestaPilha() {
        Pilha<Integer> pilha = new Pilha<Integer>();

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        }

        pilha.push(5);
        pilha.push(12);
        pilha.push(6);
        pilha.push(4);
        pilha.push(7);
        pilha.push(21);
        // não permitiria pilha.push(7.3f);    
        // porque não podemos inserir outros tipos de dados,
        // já que a pilha armazena valores inteiros!

        if (!pilha.isEmpty()) {
            System.out.println("A pilha não está vazia");
        }

        System.out.println("O valor no topo da pilha é " + pilha.top() + "\n");

        while (!pilha.isEmpty()) {
            System.out.println("Retirado o valor " + pilha.pop() + " da pilha");
        }
    }

}
