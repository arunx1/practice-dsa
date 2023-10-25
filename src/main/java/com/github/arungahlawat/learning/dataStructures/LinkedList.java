package com.github.arungahlawat.learning.dataStructures;

public class LinkedList {
    private Node head;

    public LinkedList(int... data) {
        Node lastNode = null;
        for (int datum : data) {
            Node node = new Node(datum);
            if (head == null) {
                head = node;
                lastNode = head;
            } else {
                lastNode.next = node;
                lastNode = lastNode.next;
            }
        }
    }

    public Node getHead(){
        return this.head;
    }

    public void setHead(Node head){
        this.head=head;
    }

    public void add(int data) {
        Node currentNode = new Node(data);
        if (head == null) {
            head = currentNode;
            return;
        }
        Node pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = currentNode;
    }

    public void remove(int data) {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        boolean found = false;
        if (head.data == data) {
            System.out.println(data + " removed.");
            head = head.next;
            return;
        }
        Node pointer = head;
        while (pointer.next != null) {
            if (pointer.next.data == data) {
                found = true;
                System.out.println(data + " removed.");
                pointer.next = pointer.next.next;
                break;
            }
            pointer = pointer.next;
        }
        if (!found)
            System.out.println(data + " not found.");
    }

    public void clear() {
        head = null;
        System.out.println("List cleared");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        Node pointer = head;
        System.out.print("\nHEAD");
        while (pointer != null) {
            System.out.print(" ---> ");
            System.out.print(pointer.data);
            pointer = pointer.next;
        }
        System.out.println(" ---> X");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
