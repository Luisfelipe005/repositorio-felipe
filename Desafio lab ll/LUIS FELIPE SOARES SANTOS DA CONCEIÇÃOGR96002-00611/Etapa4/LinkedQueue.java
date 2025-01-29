package Etapa4;

public class LinkedQueue<E> implements Etapa4.Queue {
    private int numElements;
    private Etapa4.Node<E> inicio;
    private Etapa4.Node<E> ultimo;

    @Override
    public boolean isEmpty() {
        if (numElements == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public void enqueue(Object element) throws Etapa4.OverflowException {
        Etapa4.Node<E> celula = (Etapa4.Node<E>) new Etapa4.Node<>(element);
        if (isEmpty()) {
            inicio = celula;
        } else{
            this.ultimo.setNext(celula);
            this.ultimo.setPrevious(ultimo);
        }
        ultimo = celula;
        numElements++;
    }

    @Override
    public Object dequeue() throws Etapa4.UnderflowException {
        if (isEmpty())
            throw new Etapa4.UnderflowException();
        E removido = inicio.getData();
        inicio = inicio.getNext();
        numElements--;
        return removido;

    }

    @Override
    public Object front() throws Etapa4.UnderflowException {
        return inicio.getData();
    }

    @Override
    public Object back() throws Etapa4.UnderflowException {
        return ultimo.getData();
    }
}
