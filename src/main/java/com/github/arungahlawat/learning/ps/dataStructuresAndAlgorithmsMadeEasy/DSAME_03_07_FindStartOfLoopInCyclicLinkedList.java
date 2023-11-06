package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class DSAME_03_07_FindStartOfLoopInCyclicLinkedList {
    public void findCycleStart(ListNode head) {
        if (head == null || head.next == null) {
            System.out.println("No cycle exists");
            return;
        }
        if (head.next == head) {
            System.out.printf("Cycle starts at %d\n", head.val);
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
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
            System.out.printf("Cycle starts at %d\n", slowPointer.val);
        } else {
            System.out.println("No cycle exist");
        }
    }
}
