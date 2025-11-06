package io.github.arunx1.practice.dsa.dataStructures.helpers;

public class QueueNode<T> {
    public T data;
    public QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
    }
}
