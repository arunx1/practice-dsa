package com.github.arungahlawat.learning.sorting;

public class MergeSort {
    int[] data;

    public MergeSort(int... data) {
        this.data = data;
    }

    public void sort() {
        sort(new int[data.length], 0, data.length - 1);
    }

    private void sort(int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(temp, low, mid);
            sort(temp, mid + 1, high);
            merge(temp, low, mid, high);
        }
    }

    private void merge(int[] temp, int low, int mid, int high) {
        if (high + 1 - low >= 0) System.arraycopy(data, low, temp, low, high + 1 - low);
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                data[k] = temp[i];
                i++;
            } else {
                data[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            data[k] = temp[i];
            i++;
            k++;
        }

        while (j <= high) {
            data[k] = temp[j];
            j++;
            k++;
        }
    }

    public void print() {
        if (data == null)
            return;
        for (int datum : data) {
            System.out.printf("%2d\t", datum);
        }
    }
}
