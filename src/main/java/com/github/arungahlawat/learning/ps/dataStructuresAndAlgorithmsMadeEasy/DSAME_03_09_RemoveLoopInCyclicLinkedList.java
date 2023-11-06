package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class DSAME_03_09_RemoveLoopInCyclicLinkedList {
    public void removeCycle(ListNode head) {
        if (head == null || head.next == null) {
            System.out.println("No cycle exists");
            return;
        }
        if (head.next == head) {
            head.next = null;
            return;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        boolean isCyclic = false;
        while (fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                isCyclic = true;
                break;
            }
        }
        if (isCyclic) {
            slowPointer = head;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            fastPointer = fastPointer.next;
            while (fastPointer.next != slowPointer){
                fastPointer = fastPointer.next;
            }
            fastPointer.next = null;
        } else {
            System.out.println("No cycle exist");
        }
    }
}
