package com.github.arungahlawat.learning.dataStructures;

public class ArrayStack {
    public int top, capacity;
    public int[] array;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public int peek() {
        return isEmpty() ? -1 : this.array[this.top];
    }

    public int size() {
        return this.capacity;
    }

    public void push(int... data) {
        for (int datum : data)
            push(datum);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        this.top++;
        this.array[this.top] = data;
        System.out.printf("Pushed %d\n", data);
        print();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = this.array[this.top];
        this.top--;
        System.out.printf("Popped %d\n", data);
        print();
        return data;
    }

    public void clear() {
        this.top = -1;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        int pointer = this.top;
        while (pointer>=0)
            System.out.printf("%2d  ",this.array[pointer--]);
        System.out.println();
    }
}
