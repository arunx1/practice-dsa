package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.Stack;
import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class DSAME_0316_ReverseASinglyLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null)
            return null;
        ListNode prev = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverseUsingRecursion(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode secondNode = head.next;
        head.next = null;
        ListNode reverseList = reverseUsingRecursion(secondNode);
        secondNode.next = head;
        return reverseList;
    }

    public ListNode reverseUsingStack(ListNode head) {
        if (head == null || head.next == null)
            return head;
        Stack<ListNode> nodeStack = new Stack<>();
        while (head != null) {
            nodeStack.push(head);
            head = head.next;
        }

        ListNode prev = null, current;
        while (!nodeStack.isEmpty()) {
            current = nodeStack.pop();
            if (head == null)
                head = current;
            if (prev != null)
                prev.next = current;
            prev = current;
        }
        if (prev!=null)
            prev.next=null;
        return head;
    }
}
