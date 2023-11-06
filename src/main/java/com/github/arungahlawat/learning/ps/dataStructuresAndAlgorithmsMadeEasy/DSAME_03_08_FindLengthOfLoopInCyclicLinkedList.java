package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

public class DSAME_03_08_FindLengthOfLoopInCyclicLinkedList {
    public void findCycleLength(ListNode head) {
        if (head == null || head.next == null) {
            System.out.println("No cycle exists");
            return;
        }
        if (head.next == head) {
            System.out.println("Cycle length is 1");
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
            int cycleLength = 1;
            slowPointer = slowPointer.next;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                cycleLength++;
            }
            System.out.printf("Cycle length is %d\n", cycleLength);
        } else {
            System.out.println("No cycle exist");
        }
    }
}
