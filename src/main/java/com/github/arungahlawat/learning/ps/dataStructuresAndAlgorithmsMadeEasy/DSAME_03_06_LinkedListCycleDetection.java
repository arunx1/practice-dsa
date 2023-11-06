package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DSAME_03_06_LinkedListCycleDetection {
    public boolean isCyclic(ListNode head) {
        if (head == null || head.next == null)
            return false;
        if (head.next == head)
            return true;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer)
                return true;
        }
        return false;
    }


    public boolean isCyclicUsingHashtable(ListNode head) {
        if (head == null || head.next == null)
            return false;
        if (head.next == head)
            return true;
        ListNode currentNode = head;
        Set<ListNode> nodeSet = new HashSet<>();
        while (currentNode != null) {
            if (nodeSet.contains(currentNode))
                return true;
            nodeSet.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}
