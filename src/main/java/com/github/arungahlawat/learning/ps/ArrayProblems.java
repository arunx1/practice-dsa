package com.github.arungahlawat.learning.ps;

public class ArrayProblems {
    int[] data;

    public ArrayProblems(int... data) {
        this.data = data;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveAllKsToEndOfArray(int k) {
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != k && data[j] == k) {
                swap(data, i, j);
            }
            if (data[j] != k)
                j++;
        }
    }

    public void print() {
        for (int datum : data)
            System.out.printf("%2d\t", datum);
        System.out.println();
    }
}
