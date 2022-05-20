public interface IPilha
{
    public boolean isEmpty();
    public boolean isFull();
    public Produto push(Produto x);
    public Produto pop();
    public Produto top();
    public String toString();
}
