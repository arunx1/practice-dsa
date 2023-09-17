package com.github.arungahlawat.learning;

public class StackNode<T> {
    final T data;
    StackNode<T> next;

    public StackNode(T data){
        this.data = data;
    }
}
