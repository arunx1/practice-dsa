package com.github.arungahlawat.learning;

public class Node {
    private final int data;
    private Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int data) {
        Node node = new Node(data);
        Node pointer = this;
        while (pointer.next != null)
            pointer = pointer.next;
        pointer.next = node;
    }

    public Node remove(Node head, int data) {
        if (head.data == data)
            return head.next;
        Node pointer = head;
        while (pointer.next != null) {
            if (pointer.next.data == data)
                pointer.next = pointer.next.next;
            pointer = pointer.next;
        }
        return head;
    }

    public void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            System.out.print(" ---> ");
            current = current.next;
        }
        System.out.println("X");
    }
}
