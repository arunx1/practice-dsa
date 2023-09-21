package com.github.arungahlawat.learning.sorting;

public class InsertionSort {
    int[] data;
    boolean printPasses;

    public InsertionSort(int... data) {
        this(false, data);
    }

    public InsertionSort(boolean printPasses, int... data) {
        this.printPasses = printPasses;
        this.data = data;
    }

    public void sort() {
        if (data == null || data.length < 2)
            return;
        int j, key;
        for (int i = 1; i < data.length; i++) {
            key = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
            if (printPasses)
                print();
        }
    }

    public void print() {
        if (data == null)
            return;
        for (int datum : data) {
            System.out.printf("%2d\t", datum);
        }
        System.out.println();
    }
}
