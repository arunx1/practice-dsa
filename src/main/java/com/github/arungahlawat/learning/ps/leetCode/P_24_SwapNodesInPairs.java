package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.ListNode;

/*
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
Example 1:
    Input: head = [1,2,3,4]
    Output: [2,1,4,3]

Example 2:
    Input: head = []
    Output: []

Example 3:
    Input: head = [1]
    Output: [1]

Constraints:
    * The number of nodes in the list is in the range [0, 100].
    * 0 <= Node.val <= 100
 */
public class P_24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode currentNode = head;
        ListNode previousNode = null;
        while (currentNode != null && currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            ListNode temp = nextNode.next;
            nextNode.next = currentNode;
            currentNode.next = temp;
            if (previousNode == null)
                head = nextNode;
            else
                previousNode.next = nextNode;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return head;
    }
}
