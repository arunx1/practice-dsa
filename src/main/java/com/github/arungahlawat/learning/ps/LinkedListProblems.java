package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.Node;

import java.util.HashSet;
import java.util.Set;

public class LinkedListProblems {
    public void removeDuplicates(LinkedList linkedList) {
        Node currentNode = linkedList.getHead();
        if (currentNode == null || currentNode.next == null)
            return;
        while (currentNode != null && currentNode.next != null) {
            Node previousPointer = currentNode;
            Node pointer = currentNode.next;
            while (pointer != null) {
                if (currentNode.data == pointer.data) {
                    previousPointer.next = pointer.next;
                } else {
                    previousPointer = pointer;
                }
                pointer = pointer.next;
            }
            currentNode = currentNode.next;
        }
    }

    public void removeDuplicatesUsingBuffer(LinkedList linkedList) {
        Node currentNode = linkedList.getHead();
        Node previousNode = null;
        Set<Integer> uniqueNodeData = new HashSet<>();
        while (currentNode != null) {
            if (uniqueNodeData.contains(currentNode.data)) {
                previousNode.next = currentNode.next;
            } else {
                uniqueNodeData.add(currentNode.data);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void reverse(LinkedList linkedList){
        Node head = linkedList.getHead();
        head = reverse(head);
        linkedList.setHead(head);
    }

    public Node reverse(Node head){
        if (head == null)
            return head;
        Node prev = null;
        Node current = head;
        while (current!=null){
            Node temp = current.next;
            current.next=prev;
            prev=current;
            current = temp;
        }
        head = prev;
        return head;
    }
}
