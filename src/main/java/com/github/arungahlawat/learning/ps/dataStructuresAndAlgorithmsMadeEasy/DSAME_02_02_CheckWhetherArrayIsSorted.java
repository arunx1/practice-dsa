package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.ps.helpers.ArrayUtils;

public class DSAME_02_02_CheckWhetherArrayIsSorted extends ArrayUtils {
    public void checkWhetherTheArrayIsSorted(int[] array, boolean isAscending) {
        System.out.println("Input array:");
        print(array);
        if (isAscending)
            System.out.printf("The array is sorted in ascending order? %s\n", checkWhetherTheArrayIsSorted(array, array.length));
        else
            System.out.printf("The array is sorted in descending order? %s\n", checkWhetherTheArrayIsSortedInDescendingOrder(array, array.length));
    }

    private boolean checkWhetherTheArrayIsSorted(int[] array, int n) {
        if (n == 1)
            return true;
        return array[n - 1] >= array[n - 2] && checkWhetherTheArrayIsSorted(array, n - 1);
    }

    private boolean checkWhetherTheArrayIsSortedInDescendingOrder(int[] array, int n) {
        if (n == 1)
            return true;
        return array[n - 1] <= array[n - 2] && checkWhetherTheArrayIsSortedInDescendingOrder(array, n - 1);
    }
}
