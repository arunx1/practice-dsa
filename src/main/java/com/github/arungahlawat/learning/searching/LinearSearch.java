package com.github.arungahlawat.learning.searching;

public class LinearSearch {
    int[] data;
    int item;

    public LinearSearch(int item, int... data) {
        this.data = data;
        this.item = item;
    }

    public int search() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item)
                return i;
        }
        return -1;
    }
}
