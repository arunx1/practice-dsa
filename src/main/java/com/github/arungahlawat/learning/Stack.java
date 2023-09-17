package com.github.arungahlawat.learning;

public class Stack<T> {
    private StackNode<T> top;

    public Stack() {
    }

    public void push(T data) {
        StackNode<T> node = new StackNode<>(data);
        node.next = top;
        top = node;
    }

    public T pop() {
        if (top == null)
            return null;
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return null;
        }
        return top.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        System.out.print("TOP");
        StackNode<T> pointer = top;
        while (pointer != null) {
            System.out.print(" ---> ");
            System.out.print(pointer.data);
            pointer = pointer.next;
        }
        System.out.println(" ----> X");
    }
}
