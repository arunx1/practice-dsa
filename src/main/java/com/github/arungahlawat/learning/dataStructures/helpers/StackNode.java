package com.github.arungahlawat.learning.dataStructures.helpers;

public class StackNode<T> {
    public final T data;
    public StackNode<T> next;

    public StackNode(T data){
        this.data = data;
    }
}
