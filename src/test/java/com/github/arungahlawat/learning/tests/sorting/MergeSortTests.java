package com.github.arungahlawat.learning.tests.sorting;

import com.github.arungahlawat.learning.sorting.MergeSort;

public class MergeSortTests {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(121, 5, 2, 4, 3, 1, 0, 9, 99, 22, 121);
        mergeSort.sort();
        mergeSort.print();
    }
}
