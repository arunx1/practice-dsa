package io.github.arunx1.practice.dsa.tests.sorting;

import io.github.arunx1.practice.dsa.sorting.MergeSort;

public class MergeSortTests {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(121, 5, 2, 4, 3, 1, 0, 9, 99, 22, 121);
        mergeSort.sort();
        mergeSort.print();
    }
}
