package io.github.arunx1.practice.dsa.ps.dataStructuresAndAlgorithmsMadeEasy;

import io.github.arunx1.practice.dsa.ps.helpers.ArrayUtils;

public class DSAME_02_03_PrintAllStringsOfNBits extends ArrayUtils {
    int[] array;

    public void printBinary(int n) {
        array = new int[n];
        binary(n);
    }

    private void binary(int n) {
        if (n < 1) {
            print(array);
            return;
        }
        array[n - 1] = 0;
        binary(n - 1);
        array[n - 1] = 1;
        binary(n - 1);
    }
}
