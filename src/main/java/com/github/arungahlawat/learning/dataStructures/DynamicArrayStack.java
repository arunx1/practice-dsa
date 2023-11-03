package com.github.arungahlawat.learning.dataStructures;

public class DynamicArrayStack {
    public int top, capacity;
    public int[] array;

    public DynamicArrayStack() {
        this.capacity = 1;
        this.array = new int[this.capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public int size() {
        return this.capacity;
    }

    public void clear() {
        this.top = -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.array[this.top];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int pointer = this.top;
        while (pointer >= 0)
            System.out.printf("%2d  ", this.array[pointer--]);
        System.out.println();
    }

    public void resize() {
        int previousCapacity = this.capacity;
        this.capacity = previousCapacity * 2;
        int[] newArray = new int[this.capacity];
        for (int i = 0; i < Math.min(this.top + 1, previousCapacity); i++)
            newArray[i] = this.array[i];
        this.array = newArray;
    }

    public void push(int... data){
        for (int datum : data)
            push(datum);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.print("Stack is full. Resizing... ");
            resize();
            System.out.printf("[%d]\n", this.capacity);
        }
        this.top++;
        this.array[this.top] = data;
        System.out.printf("Pushed %d\n", data);
        print();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int data = this.array[this.top];
        this.top--;
        System.out.printf("Popped %d\n", data);
        print();
        return data;
    }
}
