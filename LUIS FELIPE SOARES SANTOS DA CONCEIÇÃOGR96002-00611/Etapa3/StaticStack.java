package Etapa3;

import java.util.Arrays;

public class StaticStack<E> implements Stack<E>{
    private Object[] elements;
    private int top;

    public StaticStack(int maxSize) {
        elements = new Object[maxSize];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (top == elements.length)
            return true;
        return false;
    }

    @Override
    public int numElements() {
        return top;
    }

    @Override
    public void push(E element) throws OverflowException {
        if (top == elements.length -1 )throw  new OverflowException();
        elements[++top] = element;
    }

    @Override
    public E pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return (E) elements[top--];
    }

    @Override
    public E top() throws UnderflowException {
        if (isEmpty()){
            throw new UnderflowException();
        }
        return (E) elements[top];
    }

    @Override
    public String toString() {
        return "StaticStack{" +
                "elements=" + Arrays.toString(elements) +
                ", top=" + top +
                '}';
    }
}
