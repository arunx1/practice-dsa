package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.ListNode;

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
    * The number of nodes in the list is sz.
    * 1 <= sz <= 30
    * 0 <= Node.val <= 100
    * 1 <= n <= sz
 */
public class P_19_RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode aheadPointer = head;
        ListNode behindPointer = head;
        boolean isLast = false;
        for (int ahead = n + 1; ahead > 0 && aheadPointer != null; ahead--) {
            aheadPointer = aheadPointer.next;
            if (aheadPointer == null && ahead - 1 > 0)
                isLast = true;
        }
        while (aheadPointer != null) {
            aheadPointer = aheadPointer.next;
            behindPointer = behindPointer.next;
        }
        if (behindPointer == head && isLast)
            return head.next;
        behindPointer.next = behindPointer.next.next;
        return head;
    }
}
