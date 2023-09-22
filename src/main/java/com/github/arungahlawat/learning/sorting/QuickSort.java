package com.github.arungahlawat.learning.sorting;

public class QuickSort {
    int[] data;

    public QuickSort(int... data) {
        this.data = data;
    }

    public void sort() {
        if (data == null)
            return;
        sort(0, data.length - 1);
    }

    private void sort(int low, int high) {
        int index = partition(low, high);
        if (low < index - 1)
            sort(low, index - 1);
        if (index < high) {
            sort(index, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = data[(low + high) / 2];
        while (low <= high) {
            while (data[low] < pivot) {
                low++;
            }
            while (data[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private void swap(int i, int j) {
        int k = data[i];
        data[i] = data[j];
        data[j] = k;
    }

    public void print() {
        if (data == null)
            return;
        for (int datum : data)
            System.out.printf("%2d\t", datum);
    }
}
