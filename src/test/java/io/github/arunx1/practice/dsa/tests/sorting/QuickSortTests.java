package io.github.arunx1.practice.dsa.tests.sorting;

import io.github.arunx1.practice.dsa.sorting.QuickSort;

public class QuickSortTests {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(1, 2, 1, 33, 1, 4, 1, 0, 1, 2);
        quickSort.sort();
        quickSort.print();
    }
}
