package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class DSAME_03_15_InsertNodeInSortedLinkedList {
    public ListNode addNode(ListNode head, ListNode newNode) {
        if (head == null) {
            head = newNode;
            return head;
        }
        if (head.val > newNode.val){
            newNode.next = head;
            head = newNode;
            return head;
        }
        ListNode currentNode = head;
        while (currentNode.next != null && currentNode.next.val < newNode.val) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }
}
