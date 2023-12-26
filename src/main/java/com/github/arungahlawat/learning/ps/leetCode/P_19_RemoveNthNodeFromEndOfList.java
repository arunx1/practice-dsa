package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

Follow up: Could you do this in one pass?
 */
public class P_19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode nxt = head;
        ListNode current = head;
        ListNode prev = null;
        while (nxt != null) {
            nxt = nxt.next;
            if (n == 0) {
                prev = current;
                current = current.next;
            } else
                n--;
        }
        if (current == head)
            return head.next;
        else
            prev.next = current.next;
        return head;
    }
}
