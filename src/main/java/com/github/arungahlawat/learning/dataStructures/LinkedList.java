package com.github.arungahlawat.learning.dataStructures;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {
    private int length;
    private ListNode head;
    private final boolean isCyclic;

    public LinkedList() {
        this.head = null;
        this.length = 0;
        this.isCyclic = false;
    }

    public LinkedList(int... data) {
        this(false, data);
    }

    public LinkedList(boolean isCyclic, int... data) {
        this.isCyclic = isCyclic;
        this.length = data.length;
        if (data.length > 0) {
            Map<Integer, ListNode> nodeMap = new HashMap<>();
            ListNode lastNode = null;
            for (int datum : data) {
                if (this.isCyclic && nodeMap.containsKey(datum)) {
                    lastNode.next = nodeMap.get(datum);
                    break;
                }
                ListNode node = new ListNode(datum);
                if (this.head == null) {
                    this.head = node;
                    lastNode = this.head;
                } else {
                    lastNode.next = node;
                    lastNode = lastNode.next;
                }
                if (isCyclic)
                    nodeMap.put(datum, node);
            }
        }
    }

    public ListNode getHead() {
        return this.head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode add(int data) {
        this.length = this.length + 1;
        ListNode currentNode = new ListNode(data);
        if (this.head == null) {
            this.head = currentNode;
            return this.head;
        }
        ListNode pointer = this.head;
        int lengthCounter = 0;
        while (pointer.next != null && lengthCounter++ < this.length) {
            pointer = pointer.next;
        }
        pointer.next = currentNode;
        return currentNode;
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
        int lengthCounter = 0;
        while (pointer.next != null && lengthCounter++ < this.length) {
            if (pointer.next.val == data) {
                found = true;
                System.out.println(data + " removed.");
                pointer.next = pointer.next.next;
                this.length--;
                break;
            }
            pointer = pointer.next;
        }
        if (!found)
            System.out.println(data + " not found.");
    }

    public void clear() {
        head = null;
        this.length = 0;
        System.out.println("List cleared");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        ListNode pointer = head;
        System.out.print("\nHEAD");
        int lengthCounter = 0;
        while (pointer != null && (!isCyclic || lengthCounter++ < this.length)) {
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
