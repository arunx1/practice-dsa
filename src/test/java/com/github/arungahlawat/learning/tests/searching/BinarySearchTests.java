package com.github.arungahlawat.learning.tests.searching;

import com.github.arungahlawat.learning.searching.BinarySearch;

public class BinarySearchTests {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(18, 1, 2, 9, 12, 13, 14,15,16,18,20,18, 21, 22, 27, 30, 35, 90);
        int index = binarySearch.search();
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.printf("Found at %d", index);
    }
}
