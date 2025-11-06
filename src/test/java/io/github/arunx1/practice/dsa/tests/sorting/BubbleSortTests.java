package io.github.arunx1.practice.dsa.tests.sorting;

import io.github.arunx1.practice.dsa.sorting.BubbleSort;

public class BubbleSortTests {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(3,0,0,0,0,0,2,1,1,-1);
        bubbleSort.sort();
        bubbleSort.print();
    }
}
