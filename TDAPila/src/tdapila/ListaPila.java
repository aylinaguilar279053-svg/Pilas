package tdapila;

public class ListaPila<T> implements Ilista<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> tope;
    private int nElementos;

    public ListaPila() {
        this.tope = null;
        this.nElementos = 0;
    }

    @Override
    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
        nElementos++;
    }

    @Override
    public T pop() {
        if (empty()) {
            throw new ListException("La pila esta vacia");
        }
        T datoExtraido = tope.dato;
        tope = tope.siguiente;
        nElementos--;
        return datoExtraido;
    }

    @Override
    public T peek() {
        if (empty()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        return tope.dato;
    }

    @Override
    public boolean empty() {
        return tope == null;
    }

    @Override
    public int getNelementos() {
        return nElementos;
    }

   
    @Override
    public void append(T elemento) throws ListException {
         throw new UnsupportedOperationException("No implementado aun");
    }

    @Override
    public void insert(T elemento, int index) throws ListException {
        throw new UnsupportedOperationException("No implementado aun");
    }

    @Override
    public T remove(int index) throws ListException {
        throw new UnsupportedOperationException("No implementado aun");
    }

    @Override
    public boolean removeObj(T elemento) throws ListException {
        throw new UnsupportedOperationException("No implementado aun");
    }

    @Override
    public int indexOf(T elemento) {
        throw new UnsupportedOperationException("No implementado aun");
    }

    @Override
    public T get(int index) throws ListException {
        throw new UnsupportedOperationException("No implementado aun");
    }
}