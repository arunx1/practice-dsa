package com.github.arungahlawat.learning.tests.searching;

import com.github.arungahlawat.learning.searching.LinearSearch;

public class LinearSearchTests {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch(90, 10, 0, 1, 12, 2);
        int index = linearSearch.search();
        if (index == -1)
            System.out.println("Not found");
        System.out.printf("Found at index %d", index);
    }
}
