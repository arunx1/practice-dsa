package com.github.arungahlawat.learning.dataStructures.helpers;

public class TwoWayNode {
    public int val;
    public TwoWayNode next = null;
    public TwoWayNode prev = null;

    public TwoWayNode(int val){
        this.val = val;
    }

    public void insert(int val){
        TwoWayNode node = new TwoWayNode(val);
        TwoWayNode currentHead = this;
        while(currentHead.next != null){
            currentHead = currentHead.next;
        }
        currentHead.next = node;
        node.prev = currentHead;
    }

    public TwoWayNode remove(TwoWayNode head, int val){
        if (head.val == val){
            head = head.next;
            head.prev = null;
            return head;
        }
        TwoWayNode currentNode = head;
        while (currentNode.next != null){
            if (currentNode.next.val == val){
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
            System.out.print(currentNode.val);
            System.out.print(" <---> ");
            currentNode = currentNode.next;
        }
        System.out.println(" X");
    }
}
