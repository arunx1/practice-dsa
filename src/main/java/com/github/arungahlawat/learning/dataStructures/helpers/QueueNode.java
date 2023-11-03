package com.github.arungahlawat.learning.dataStructures.helpers;

public class QueueNode<T> {
    public T data;
    public QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
    }
}
