package pilhaComGenericos;

public class Node<E> {
    private E value;
    private Node next;

    public E getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
