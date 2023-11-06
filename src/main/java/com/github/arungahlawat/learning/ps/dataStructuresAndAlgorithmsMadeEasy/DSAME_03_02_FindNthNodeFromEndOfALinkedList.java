package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;
import com.github.arungahlawat.learning.ps.helpers.LinkedListUtils;

public class DSAME_03_02_FindNthNodeFromEndOfALinkedList extends LinkedListUtils {
    public int findNthFromEndUsingRecursion(ListNode head, int n) {
        if (head == null) {
            return 0;
        } else {
            int counter = 1 + findNthFromEndUsingRecursion(head.next, n);
            if (counter == n) {
                System.out.printf("%dth from end is %d\n", n, head.val);
            }
            return counter;
        }
    }

    public ListNode findNthFromEndUsingListLength(ListNode head, int n) {
        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        ListNode currentNode = head;
        int length = 0;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        if (length < n) {
            System.out.printf("List is shorter. Length:%d Node from end to find: %d\n", length, n);
            return head;
        }

        int currentCounter = 0;
        currentNode = head;
        while (currentCounter < length - n) {
            currentNode = currentNode.next;
            currentCounter++;
        }
        System.out.printf("%dth from end is %d\n", n, currentNode.val);
        return currentNode;
    }

    public ListNode findNthFromEndUsingTwoPointerGap(ListNode head, int n) {
        if (head == null) {
            System.out.println("Empty list");
            return null;
        }
        ListNode aheadNode = head;
        ListNode behindNode = head;
        int gap = 0;
        while (gap < n) {
            if (aheadNode == null) {
                System.out.println("List is shorter.");
                return head;
            }
            gap++;
            aheadNode = aheadNode.next;
        }

        while (aheadNode != null) {
            aheadNode = aheadNode.next;
            behindNode = behindNode.next;
        }
        System.out.printf("%dth from end is %d\n", n, behindNode.val);
        return behindNode;
    }
}
