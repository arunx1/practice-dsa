package io.github.arunx1.practice.dsa.tests.sorting;

import io.github.arunx1.practice.dsa.sorting.InsertionSort;

public class InsertionSortTests {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(true, 12, 3, 9, 2, 14, 11, 1, 0, 8);
        insertionSort.sort();
    }
}
