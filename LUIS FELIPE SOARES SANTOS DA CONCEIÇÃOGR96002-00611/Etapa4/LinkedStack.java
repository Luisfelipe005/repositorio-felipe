package Etapa4;

public class LinkedStack<E>  implements Stack{
    private int numElements;
    private Node<E> inicio;
    private Node<E> ultimo;

    @Override
    public boolean isEmpty() {
        if (numElements == 0)
            return true;
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
    public void push(Object element) throws OverflowException {
        Node<E> celula = (Node<E>) new Node<>(element);
        if (isEmpty()){
            inicio = celula;
        }
        else{
            this.ultimo.setNext(celula);
            this.ultimo.setPrevious(ultimo);
        }
        ultimo = celula;
        numElements++;


    }

    @Override
    public Object pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        E removido = ultimo.getData();
        ultimo = ultimo.getPrevious();
        numElements--;
        return removido;
    }

    @Override
    public Object top() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return ultimo.getData();
    }
}
