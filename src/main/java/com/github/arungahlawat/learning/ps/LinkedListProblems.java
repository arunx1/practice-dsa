package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.Node;

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
}
