package com.github.arungahlawat.learning.sorting;

public class BubbleSort {
    private int[] data;
    private int passCount;

    public BubbleSort() {
    }

    public BubbleSort(int... data) {
        this.data = data;
        this.passCount = 0;
    }

    public void sort() {
        if (data == null || data.length < 2)
            return;
        for (passCount = 0; passCount < data.length; passCount++) {
            boolean swapped = false;
            for (int j = 0; j < data.length - 1 - passCount; j++) {
                if (data[j] > data[j + 1]) {
                    swapped = true;
                    int k = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = k;
                }
            }
            if (!swapped)
                break;
        }
    }

    public void print() {
        if (data == null)
            return;
        for (int datum : data) System.out.printf(" %d ", datum);
        System.out.println("\nPass count: " + passCount);
    }
}
