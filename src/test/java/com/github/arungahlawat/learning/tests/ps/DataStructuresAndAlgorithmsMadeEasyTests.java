package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataStructuresAndAlgorithmsMadeEasyTests {
    @BeforeMethod()
    public void beforeMethod() {
        System.out.println("===============================================");
    }

    @Test(description = "02.01 Print moves for moving disks from Tower 'A' to tower 'B' using Towers of Hanoi puzzle",
            dataProvider = "OnePositiveNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0201", "Recursion", "Towers of Hanoi", "Backtracking"})
    public void printMovesForMovingNDisksInTowersOfHanoiPuzzle(int towerHeight) {
        DSAME_02_01_TowersOfHanoiPuzzle dsame0201TowersOfHanoiPuzzle = new DSAME_02_01_TowersOfHanoiPuzzle();
        System.out.printf("Tower height: %d", towerHeight);
        dsame0201TowersOfHanoiPuzzle.printTowersOfHanoiPuzzleMovesForNDisks(towerHeight);
    }

    @Test(description = "02.02 Check whether the input array is sorted",
            dataProvider = "IntegerArrayWithBooleanTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0202", "Recursion", "Arrays", "Check Sorted Array"})
    public void checkWhetherTheInputArrayIsSorted(int[] input, boolean isAscending) {
        DSAME_02_02_CheckWhetherArrayIsSorted dsame0202CheckWhetherArrayIsSorted = new DSAME_02_02_CheckWhetherArrayIsSorted();
        dsame0202CheckWhetherArrayIsSorted.checkWhetherTheArrayIsSorted(input, isAscending);
    }

    @Test(description = "02.03 Print all strings of n bits",
            dataProvider = "OnePositiveNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0203", "Recursion", "Print n bits string", "Backtracking"})
    public void printStringsOfNBits(int bits) {
        DSAME_02_03_PrintAllStringsOfNBits dsame0203PrintAllStringsOfNBits = new DSAME_02_03_PrintAllStringsOfNBits();
        System.out.printf("Bit length is: %d\n", bits);
        dsame0203PrintAllStringsOfNBits.printBinary(bits);
    }

    @Test(description = "02.04 Print all strings of length n",
            dataProvider = "TwoPositiveNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0204", "Recursion", "Print n lengths string", "Backtracking"})
    public void printNLengthsStrings(int length, int k) {
        DSAME_02_04_PrintAllStringsOfNLength dsame0204PrintAllStringsOfNLength = new DSAME_02_04_PrintAllStringsOfNLength();
        System.out.printf("String length is: %d\n", length);
        dsame0204PrintAllStringsOfNLength.printNLengthStrings(length, k);
    }

    @Test(description = "03.02 Find nth node from end of a linked list",
            dataProvider = "IntegerArrayWithIntegerValueTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0302", "Linked Lists", "Find nth from end of linked list"})
    public void findNthNodeFromEndOfLinkedListUsingRecursion(int[] linkedListData, int n) {
        LinkedList linkedList = new LinkedList(linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_02_FindNthNodeFromEndOfALinkedList dsame0302FindNthNodeFromEndOfALinkedList = new DSAME_03_02_FindNthNodeFromEndOfALinkedList();
        dsame0302FindNthNodeFromEndOfALinkedList.findNthFromEndUsingRecursion(linkedList.getHead(), n);
    }

    @Test(description = "03.02 Find nth node from end of a linked list",
            dataProvider = "IntegerArrayWithIntegerValueTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0302", "Linked Lists", "Find nth from end of linked list"})
    public void findNthNodeFromEndOfLinkedListUsingListLength(int[] linkedListData, int n) {
        LinkedList linkedList = new LinkedList(linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_02_FindNthNodeFromEndOfALinkedList dsame0302FindNthNodeFromEndOfALinkedList = new DSAME_03_02_FindNthNodeFromEndOfALinkedList();
        dsame0302FindNthNodeFromEndOfALinkedList.findNthFromEndUsingListLength(linkedList.getHead(), n);
    }

    @Test(description = "03.02 Find nth node from end of a linked list",
            dataProvider = "IntegerArrayWithIntegerValueTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0302", "Linked Lists", "Find nth from end of linked list"})
    public void findNthNodeFromEndOfLinkedListUsingTwoPointersGap(int[] linkedListData, int n) {
        LinkedList linkedList = new LinkedList(linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_02_FindNthNodeFromEndOfALinkedList dsame0302FindNthNodeFromEndOfALinkedList = new DSAME_03_02_FindNthNodeFromEndOfALinkedList();
        dsame0302FindNthNodeFromEndOfALinkedList.findNthFromEndUsingTwoPointerGap(linkedList.getHead(), n);
    }

    @Test(description = "03.06 Check whether the linked list is null terminated or has cycles",
            dataProvider = "OneIntegerArrayWithMaxOneDuplicateTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0306", "Linked Lists", "Check if linked list has cycle"})
    public void checkCycleInLinkedList(int[] linkedListData) {
        LinkedList linkedList = new LinkedList(true, linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_06_LinkedListCycleDetection dsame0306LinkedListCycleDetection = new DSAME_03_06_LinkedListCycleDetection();
        boolean isCyclic = dsame0306LinkedListCycleDetection.isCyclic(linkedList.getHead());
        System.out.printf("Linked list has cycle? %s\n", isCyclic);
    }

    @Test(description = "03.06 Check whether the linked list is null terminated or has cycles",
            dataProvider = "OneIntegerArrayWithMaxOneDuplicateTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0306", "Linked Lists", "Check if linked list has cycle"})
    public void checkCycleInLinkedListUsingHashtable(int[] linkedListData) {
        LinkedList linkedList = new LinkedList(true, linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_06_LinkedListCycleDetection dsame0306LinkedListCycleDetection = new DSAME_03_06_LinkedListCycleDetection();
        boolean isCyclic = dsame0306LinkedListCycleDetection.isCyclicUsingHashtable(linkedList.getHead());
        System.out.printf("Linked list has cycle? %s\n", isCyclic);
    }

    @Test(description = "03.07 Find start of cycle if linked list is cyclic",
            dataProvider = "OneIntegerArrayWithMaxOneDuplicateTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0307", "Linked Lists", "Find start of cycle"})
    public void findStartOfCycleInLinkedList(int[] linkedListData) {
        LinkedList linkedList = new LinkedList(true, linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_07_FindStartOfLoopInCyclicLinkedList dsame0307FindStartOfLoopInCyclicLinkedList = new DSAME_03_07_FindStartOfLoopInCyclicLinkedList();
        dsame0307FindStartOfLoopInCyclicLinkedList.findCycleStart(linkedList.getHead());
    }

    @Test(description = "03.08 Find length of cycle if linked list is cyclic",
            dataProvider = "OneIntegerArrayWithMaxOneDuplicateTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0308", "Linked Lists", "Find length of cycle"})
    public void findLengthOfCycleInLinkedList(int[] linkedListData) {
        LinkedList linkedList = new LinkedList(true, linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_08_FindLengthOfLoopInCyclicLinkedList dsame0308FindLengthOfLoopInCyclicLinkedList = new DSAME_03_08_FindLengthOfLoopInCyclicLinkedList();
        dsame0308FindLengthOfLoopInCyclicLinkedList.findCycleLength(linkedList.getHead());
    }

    @Test(description = "03.09 Remove loop if linked list is cyclic",
            dataProvider = "OneIntegerArrayWithMaxOneDuplicateTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0309", "Linked Lists", "Remove loop in linked list"})
    public void removeLoopInLinkedList(int[] linkedListData) {
        LinkedList linkedList = new LinkedList(true, linkedListData);
        System.out.print("Linked list: ");
        linkedList.print();
        DSAME_03_09_RemoveLoopInCyclicLinkedList dsame0309RemoveLoopInCyclicLinkedList = new DSAME_03_09_RemoveLoopInCyclicLinkedList();
        dsame0309RemoveLoopInCyclicLinkedList.removeCycle(linkedList.getHead());
        linkedList.print();
    }
}
