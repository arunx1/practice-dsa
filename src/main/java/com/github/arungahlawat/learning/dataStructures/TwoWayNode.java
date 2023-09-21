package com.github.arungahlawat.learning.dataStructures;

public class TwoWayNode {
    private int data;
    private TwoWayNode next = null;
    private TwoWayNode prev = null;

    public TwoWayNode(int data){
        this.data = data;
    }

    public void insert(int data){
        TwoWayNode node = new TwoWayNode(data);
        TwoWayNode currentHead = this;
        while(currentHead.next != null){
            currentHead = currentHead.next;
        }
        currentHead.next = node;
        node.prev = currentHead;
    }

    public TwoWayNode remove(TwoWayNode head, int data){
        if (head.data == data){
            head = head.next;
            head.prev = null;
            return head;
        }
        TwoWayNode currentNode = head;
        while (currentNode.next != null){
            if (currentNode.next.data == data){
                currentNode.next.prev = currentNode.prev;
                if (currentNode.prev != null){
                    currentNode.prev.next = currentNode.next;
                }
                currentNode.next = null;
                currentNode.prev = null;
                break;
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    public void print(TwoWayNode head){
        System.out.print("X <---> ");
        TwoWayNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data);
            System.out.print(" <---> ");
            currentNode = currentNode.next;
        }
        System.out.println(" X");
    }
}
