package com.github.arungahlawat.learning.dataStructures;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class LinkedList {
    private ListNode head;

    public LinkedList(int... data) {
        ListNode lastNode = null;
        for (int datum : data) {
            ListNode node = new ListNode(datum);
            if (head == null) {
                head = node;
                lastNode = head;
            } else {
                lastNode.next = node;
                lastNode = lastNode.next;
            }
        }
    }

    public ListNode getHead(){
        return this.head;
    }

    public void setHead(ListNode head){
        this.head=head;
    }

    public void add(int data) {
        ListNode currentNode = new ListNode(data);
        if (head == null) {
            head = currentNode;
            return;
        }
        ListNode pointer = head;
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
        if (head.val == data) {
            System.out.println(data + " removed.");
            head = head.next;
            return;
        }
        ListNode pointer = head;
        while (pointer.next != null) {
            if (pointer.next.val == data) {
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
        ListNode pointer = head;
        System.out.print("\nHEAD");
        while (pointer != null) {
            System.out.print(" ---> ");
            System.out.print(pointer.val);
            pointer = pointer.next;
        }
        System.out.println(" ---> X");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
