package com.github.arungahlawat.learning.tests.sorting;

import com.github.arungahlawat.learning.sorting.InsertionSort;

public class InsertionSortTests {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(true, 12, 3, 9, 2, 14, 11, 1, 0, 8);
        insertionSort.sort();
    }
}
