package com.github.arungahlawat.learning.dataStructures;

public class ArrayQueue {
    int front, rear, capacity;
    int[] array;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public int size() {
        return (this.capacity - this.front + this.rear + 1) % this.capacity;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.capacity == this.front;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.printf("Queue is full. Front: %2d | Rear: %2d | Capacity: %2d\n", this.front, this.rear, this.capacity);
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = data;
        if (this.front == -1)
            this.front = this.rear;
        System.out.printf("En-Queued %d\n", data);
        print();
    }

    public void enQueue(int... data) {
        for (int datum : data)
            enQueue(datum);
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.printf("Queue is empty. Front: %2d | Rear: %2d | Capacity: %2d\n", this.front, this.rear, this.capacity);
            return -1;
        }
        int data = this.array[this.front];
        if (this.front == this.rear)
            this.front = this.rear = -1;
        else
            this.front++;
        System.out.printf("De-Queued %d\n", data);
        print();
        return data;
    }

    public void clear() {
        this.front = this.rear = -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.printf("Queue is empty. Front: %2d | Rear: %2d | Capacity: %2d\n", this.front, this.rear, this.capacity);
            return -1;
        }
        return this.array[this.front];
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Queue is empty. Front: %2d | Rear: %2d | Capacity: %2d\n", this.front, this.rear, this.capacity);
            return;
        }
        for (int i = this.front; i < (this.front > this.rear ? this.rear + this.capacity : this.rear) + 1; i++){
            System.out.printf("%2d  ", this.array[i % this.capacity]);
        }
        System.out.printf("Front: %2d | Rear: %2d | Capacity: %2d", this.front, this.rear, this.capacity);
        System.out.println();
    }
}
