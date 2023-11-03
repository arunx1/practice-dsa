package com.github.arungahlawat.learning.dataStructures;

public class DynamicArrayQueue {
    int front, rear, capacity;
    int[] array;

    public DynamicArrayQueue() {
        this.capacity = 1;
        this.front = this.rear = -1;
        this.array = new int[this.capacity];
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.capacity == this.front;
    }

    public int size() {
        return (this.capacity - this.front + this.rear + 1) % this.capacity;
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

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        return this.array[this.front];
    }

    public void enQueue(int... data) {
        for (int datum : data)
            enQueue(datum);
    }

    public void enQueue(int data){
        if (isFull()){
            System.out.println("Queue is full. Resizing...");
            resize();
        }
        this.rear = (this.rear+1)%this.capacity;
        this.array[this.rear] = data;
        if (this.front == -1)
            this.front = this.rear;
        System.out.printf("En-Queued %d\n", data);
        print();
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        int data = this.array[this.front % this.capacity];
        if (this.front == this.rear)
            this.front = this.rear = -1;
        else
            this.front = this.front + 1;
        System.out.printf("De-Queued %d\n", data);
        print();
        return data;
    }

    private void resize() {
        int previousCapacity = this.capacity;
        this.capacity = previousCapacity * 2;
        int[] newArray = new int[this.capacity];
        if (this.front > this.rear) {
            for (int i = 0; i < this.front; i++) {
                newArray[previousCapacity + i] = this.array[i];
            }
            this.rear = this.rear + previousCapacity;
        }
        for (int i = this.front; i < Math.min(previousCapacity, this.rear + 1); i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
}
