package tdapila;

public interface Ilista<T> {
    public void append(T elemento) throws ListException;
    public void insert(T elemento, int index) throws ListException;
    public T remove(int index) throws ListException;
    public boolean removeObj(T elemento) throws ListException;
    public int indexOf(T elemento);
    public T get(int index) throws ListException;
    public void push(T elemento);
    public T pop();
    public T peek();
    boolean empty();
    int getNelementos();
}