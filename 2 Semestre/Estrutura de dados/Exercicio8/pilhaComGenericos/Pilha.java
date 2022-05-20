package pilhaComGenericos;

class Pilha<E> { //usando uma classe genérica: a pilha armazenará elementos do tipo E

    private Node topo = null;

    public Pilha() {
    }

    public Node push(E novo) {
        Node nodo = new Node();
        nodo.setValue(novo);
        nodo.setNext(null);
        if (topo == null) {
            topo = nodo;
        } else {
            nodo.setNext(topo);
            topo = nodo;
        }
        return nodo;
    }

    public E pop() {
        if (topo == null) {
            return null;
        }
        E value = (E) topo.getValue();
        Node temp = topo;
        topo = topo.getNext();
        temp.setNext(null); //liberar mem�ria
        temp = null;  //liberar mem�ria
        return value;
    }

    public boolean isEmpty() {
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public E top() {
        if (topo == null) {
            return null;
        } else {
            return (E) topo.getValue();
        }
    }

}
