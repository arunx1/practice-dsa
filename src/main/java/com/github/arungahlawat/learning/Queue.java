package com.github.arungahlawat.learning;

public class Queue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;

    public Queue() {
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(T data) {
        QueueNode<T> node = new QueueNode<>(data);
        if (last != null)
            last.next = node;
        last = node;
        if (first == null)
            first = last;
    }

    public T remove() {
        if (isEmpty())
            return null;
        T data = first.data;
        first = first.next;
        if (first == null)
            last = null;
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }
        System.out.print("FIRST");
        QueueNode<T> pointer = first;
        while (pointer != null) {
            System.out.print(" ---> ");
            System.out.print(pointer.data);
            pointer = pointer.next;
        }
        System.out.println(" <--- LAST");
    }
}
