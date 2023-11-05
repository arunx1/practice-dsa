package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.ps.helpers.ArrayUtils;
import com.github.arungahlawat.learning.sorting.QuickSort;

import java.util.*;

public class ArrayProblems extends ArrayUtils {
    public int[] data;

    public ArrayProblems(int... data) {
        this.data = data;
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

    public int[] mergeTwoSortedArrays(int... secondSortedArray) {
        int firstArrayIndex = 0, secondArrayIndex = 0, mergedArrayIndex = 0;
        int[] mergedArray = new int[data.length + secondSortedArray.length];
        while (mergedArrayIndex < mergedArray.length) {
            if (firstArrayIndex < data.length && secondArrayIndex < secondSortedArray.length) {
                if (data[firstArrayIndex] <= secondSortedArray[secondArrayIndex]) {
                    mergedArray[mergedArrayIndex] = data[firstArrayIndex];
                    firstArrayIndex++;
                } else {
                    mergedArray[mergedArrayIndex] = secondSortedArray[secondArrayIndex];
                    secondArrayIndex++;
                }
            } else if (firstArrayIndex < data.length) {
                mergedArray[mergedArrayIndex] = data[firstArrayIndex];
                firstArrayIndex++;
            } else if (secondArrayIndex < secondSortedArray.length) {
                mergedArray[mergedArrayIndex] = secondSortedArray[secondArrayIndex];
                secondArrayIndex++;
            }
            mergedArrayIndex++;
        }
        return mergedArray;
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

    public int[] findTwoSum(int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (numsMap.containsKey(target - data[i]))
                return new int[]{numsMap.get(target - data[i]), i};
            numsMap.put(data[i], i);
        }
        return new int[]{-1, -1};
    }

    public double findMedianOfTwoSortedArrays(int... secondSortedArray) {
        int mergedArrayLength = (data.length + secondSortedArray.length) / 2 + 1;
        int[] mergedArray = new int[mergedArrayLength];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        for (int i = 0; i < mergedArrayLength; i++) {
            if (firstArrayIndex < data.length && secondArrayIndex < secondSortedArray.length)
                if (data[firstArrayIndex] <= secondSortedArray[secondArrayIndex]) {
                    mergedArray[i] = data[firstArrayIndex];
                    firstArrayIndex++;
                } else {
                    mergedArray[i] = secondSortedArray[secondArrayIndex];
                    secondArrayIndex++;
                }
            else if (firstArrayIndex < data.length) {
                mergedArray[i] = data[firstArrayIndex];
                firstArrayIndex++;
            } else {
                mergedArray[i] = secondSortedArray[secondArrayIndex];
                secondArrayIndex++;
            }
        }
        double median = mergedArray[mergedArrayLength - 1];
        if ((data.length + secondSortedArray.length) % 2 == 0) {
            median = (median + mergedArray[mergedArrayLength - 2]) / 2.0;
        }
        return median;
    }

    public int findContainerWithMostWater() {
        int left = 0, right = data.length - 1, maxArea = 0;
        int width, minHeight;
        while (left < right) {
            width = right - left;
            minHeight = min(data[left], data[right]);
            int currentArea = width * minHeight;
            maxArea = max(currentArea, maxArea);
            if (data[left] <= data[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public List<List<Integer>> findThreeSum(int target) {
        new QuickSort(this.data).sort();
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < this.data.length; i++) {
            int j = i + 1;
            int k = this.data.length - 1;
            while (j < k) {
                int sum = this.data[i] + this.data[j] + this.data[k];
                if (sum == target) {
                    s.add(Arrays.asList(this.data[i], this.data[j], this.data[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else
                    k--;
            }
        }
        return new ArrayList<>(s);
    }

    public void rotateMatrixClockwise(int[][] matrix) {
        System.out.printf("matrix length: %d\n", matrix.length);
        if (matrix.length == 0 || matrix[0].length != matrix.length)
            return;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
                print(matrix);
            }
        }
    }
}
