package com.github.arungahlawat.learning.tests.sorting;

import com.github.arungahlawat.learning.sorting.SelectionSort;

public class SelectionSortTests {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(1, 0, 0, 1, 2, 3,0);
        selectionSort.sort();
        selectionSort.print();
    }
}
