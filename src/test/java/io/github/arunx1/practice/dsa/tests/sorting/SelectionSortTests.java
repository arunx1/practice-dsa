package io.github.arunx1.practice.dsa.tests.sorting;

import io.github.arunx1.practice.dsa.sorting.SelectionSort;

public class SelectionSortTests {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(1, 0, 0, 1, 2, 3,0);
        selectionSort.sort();
        selectionSort.print();
    }
}
