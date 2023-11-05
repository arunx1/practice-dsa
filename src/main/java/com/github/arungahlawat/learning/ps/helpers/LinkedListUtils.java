package com.github.arungahlawat.learning.ps.helpers;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class LinkedListUtils {
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
