package com.github.arungahlawat.learning.sorting;

public class SelectionSort {
    private final int[] data;

    public SelectionSort(int... data) {
        this.data = data;
    }

    public void sort() {
        if (data == null || data.length < 2)
            return;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int k = data[j];
                    data[j] = data[i];
                    data[i] = k;
                }
            }
        }
    }

    public void print() {
        if (data == null || data.length < 2)
            return;
        for (int datum : data)
            System.out.printf(" %d ", datum);
    }
}
