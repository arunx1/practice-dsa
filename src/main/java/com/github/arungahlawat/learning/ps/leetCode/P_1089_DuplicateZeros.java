package com.github.arungahlawat.learning.ps.leetCode;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 9
 */
public class P_1089_DuplicateZeros {
    private void shiftArray(int[] arr, int startIndex) {
        int shiftIndex = arr.length - 1;
        while (shiftIndex > startIndex) {
            arr[shiftIndex] = arr[shiftIndex - 1];
            shiftIndex--;
        }
    }

    public void duplicateZeros(int[] arr) {
        int leftPointer = 0;
        while (leftPointer < arr.length - 1) {
            if (arr[leftPointer] == 0) {
                shiftArray(arr, leftPointer + 1);
                leftPointer++;
                arr[leftPointer] = 0;
            }
            leftPointer++;
        }
    }

    public void duplicateZerosUsingAdditionalArray(int[] arr) {
        int[] temp = new int[arr.length];
        for (int index = 0, tempIndex = 0; index < arr.length && tempIndex < arr.length; index++, tempIndex++) {
            temp[tempIndex] = arr[index];
            if (arr[index] == 0 && tempIndex < arr.length - 1) {
                tempIndex++;
                temp[tempIndex] = 0;
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
