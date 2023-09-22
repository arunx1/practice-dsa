package com.github.arungahlawat.learning.tests.sorting;

import com.github.arungahlawat.learning.sorting.QuickSort;

public class QuickSortTests {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(1, 2, 1, 33, 1, 4, 1, 0, 1, 2);
        quickSort.sort();
        quickSort.print();
    }
}
