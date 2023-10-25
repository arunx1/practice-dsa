package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.ps.LinkedListProblems;
import org.testng.annotations.Test;

public class LinkedListProblemTests {
    @Test(description = "Remove duplicates from unsorted linked list")
    public void removeDuplicatesTest(){
        LinkedList linkedList = new LinkedList(10,10,10,23,0,10,10,23,45,18);
        linkedList.print();
        LinkedListProblems linkedListProblems = new LinkedListProblems();
        linkedListProblems.removeDuplicates(linkedList);
        linkedList.print();
    }

    @Test(description = "Remove duplicates from unsorted linked list using buffer")
    public void removeDuplicatesUsingBufferTest(){
        LinkedList linkedList = new LinkedList(10,10,10,23,0,10,10,23,45,18);
        linkedList.print();
        LinkedListProblems linkedListProblems = new LinkedListProblems();
        linkedListProblems.removeDuplicatesUsingBuffer(linkedList);
        linkedList.print();
    }

    @Test(description = "Reverse linked list")
    public void reverseLinkedList(){
        LinkedList linkedList = new LinkedList(10,10,10,23,0,10,10,23,45,18);
        linkedList.print();
        LinkedListProblems linkedListProblems = new LinkedListProblems();
        linkedListProblems.reverse(linkedList);
        linkedList.print();
    }
}
