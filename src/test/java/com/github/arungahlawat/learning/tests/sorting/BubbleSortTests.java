package com.github.arungahlawat.learning.tests.sorting;

import com.github.arungahlawat.learning.sorting.BubbleSort;

public class BubbleSortTests {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(3,0,0,0,0,0,2,1,1,-1);
        bubbleSort.sort();
        bubbleSort.print();
    }
}
