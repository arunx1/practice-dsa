package com.github.arungahlawat.learning.ps.helpers;

import java.util.List;

public class ArrayUtils {
    public void print(int[] array) {
        for (int datum : array)
            System.out.printf("%2d  ", datum);
        System.out.println();
    }

    public void print(String[] array) {
        for (String datum : array)
            System.out.printf("%s  ", datum);
        System.out.println();
    }

    public void print(int[] array, int length) {
        for (int datum : array) {
            System.out.printf("%2d  ", datum);
            if (length-- <= 1)
                break;
        }
        System.out.println();
    }

    public void print(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0)
            return;
        int cols = matrix[0].length;
        if (cols == 0)
            return;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%2d\t", matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void print(List<?> array) {
        for (Object datum : array)
            System.out.printf("%2s  ", datum);
        System.out.println();
    }

    public void printListOfList(List<List<Integer>> array) {
        for (List<Integer> arrayList : array) {
            print(arrayList);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int min(int a, int b) {
        return Math.min(a, b);
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }
}
