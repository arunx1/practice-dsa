package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListProblems {
    public void removeDuplicates(LinkedList linkedList) {
        ListNode currentNode = linkedList.getHead();
        if (currentNode == null || currentNode.next == null)
            return;
        while (currentNode != null && currentNode.next != null) {
            ListNode previousPointer = currentNode;
            ListNode pointer = currentNode.next;
            while (pointer != null) {
                if (currentNode.val == pointer.val) {
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
        ListNode currentNode = linkedList.getHead();
        ListNode previousNode = null;
        Set<Integer> uniqueNodeData = new HashSet<>();
        while (currentNode != null) {
            if (uniqueNodeData.contains(currentNode.val)) {
                previousNode.next = currentNode.next;
            } else {
                uniqueNodeData.add(currentNode.val);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void reverse(LinkedList linkedList){
        ListNode head = linkedList.getHead();
        head = reverse(head);
        linkedList.setHead(head);
    }

    public ListNode reverse(ListNode head){
        if (head == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        while (current!=null){
            ListNode temp = current.next;
            current.next=prev;
            prev=current;
            current = temp;
        }
        head = prev;
        return head;
    }
}
