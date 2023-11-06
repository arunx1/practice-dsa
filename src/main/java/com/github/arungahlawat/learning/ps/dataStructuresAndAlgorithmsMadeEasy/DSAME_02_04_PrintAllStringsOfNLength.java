package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

import com.github.arungahlawat.learning.ps.helpers.ArrayUtils;

public class DSAME_02_04_PrintAllStringsOfNLength extends ArrayUtils {
    int[] array;
    public void printNLengthStrings(int n, int k){
        array = new int[n];
        printKArray(n, k);
    }

    private void printKArray(int n, int k){
        if (n<1){
            print(array);
            return;
        }
        for (int i=0;i<k;i++){
            array[n-1]=i;
            printKArray(n-1,k);
        }
    }
}
