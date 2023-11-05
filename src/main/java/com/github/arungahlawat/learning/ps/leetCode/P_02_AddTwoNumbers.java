package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;
import com.github.arungahlawat.learning.ps.helpers.LinkedListUtils;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:
    [2] -> [4] -> [3]
    [5] -> [6] -> [4]

    [7] -> [0] -> [8]

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

Example 2:
    Input: l1 = [0], l2 = [0]
    Output: [0]

Example 3:
    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]

Constraints:
    * The number of nodes in each linked list is in the range [1, 100].
    * 0 <= Node.val <= 9
    * It is guaranteed that the list represents a number that does not have leading zeros.
*/
public class P_02_AddTwoNumbers {
    public LinkedList addTwoNumbers(LinkedList first, LinkedList second) {
        LinkedListUtils linkedListUtils = new LinkedListUtils();
        linkedListUtils.reverse(first);
        linkedListUtils.reverse(second);
        LinkedList result = new LinkedList();
        int carry = 0;
        ListNode firstListCurrentNode = first.getHead();
        ListNode secondListCurrentNode = second.getHead();
        while (firstListCurrentNode != null || secondListCurrentNode != null) {
            int firstDigit = firstListCurrentNode == null ? 0 : firstListCurrentNode.val;
            int secondDigit = secondListCurrentNode == null ? 0 : secondListCurrentNode.val;
            int realSum = firstDigit + secondDigit + carry;
            result.add(realSum % 10);
            carry = realSum / 10;
            if (firstListCurrentNode != null)
                firstListCurrentNode = firstListCurrentNode.next;
            if (secondListCurrentNode != null)
                secondListCurrentNode = secondListCurrentNode.next;
        }

        if (carry != 0)
            result.add(carry);
        return result;
    }

    public ListNode addTwoNumbers1(ListNode firstListCurrentNode, ListNode secondListCurrentNode) {
        LinkedListUtils linkedListUtils = new LinkedListUtils();
        firstListCurrentNode = linkedListUtils.reverse(firstListCurrentNode);
        secondListCurrentNode = linkedListUtils.reverse(secondListCurrentNode);
        ListNode resultHead = null;
        ListNode resultCurrent = null;
        int carry = 0;
        while (firstListCurrentNode != null || secondListCurrentNode != null) {
            int firstDigit = firstListCurrentNode == null ? 0 : firstListCurrentNode.val;
            int secondDigit = secondListCurrentNode == null ? 0 : secondListCurrentNode.val;
            int realSum = firstDigit + secondDigit + carry;
            ListNode temp = new ListNode(realSum % 10);
            if (resultHead == null) {
                resultHead = temp;
                resultCurrent = resultHead;
            } else {
                resultCurrent.next = temp;
                resultCurrent = resultCurrent.next;
            }
            carry = realSum / 10;
            if (firstListCurrentNode != null)
                firstListCurrentNode = firstListCurrentNode.next;
            if (secondListCurrentNode != null)
                secondListCurrentNode = secondListCurrentNode.next;
        }

        if (carry != 0) {
            resultCurrent.next = new ListNode(carry);
        }
        return resultHead;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int realSum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            tail.next = new ListNode(realSum % 10);
            tail = tail.next;
            carry = realSum / 10;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return dummyHead.next;
    }
}
