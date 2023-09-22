package com.github.arungahlawat.learning.searching;

public class BinarySearch {
    int[] data;
    int item;

    public BinarySearch(int item, int... data) {
        this.data = data;
        this.item = item;
    }

    public int search() {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid] == item)
                return mid;
            else if (item < data[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
