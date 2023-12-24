package com.github.arungahlawat.learning.ps.leetCode;

/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
Example 4:

Input: arr = [0,2,3,4,5,2,1,0]
Output: true
 */
public class P_941_ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        boolean isIncline = false;
        boolean isDecline = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!isDecline && arr[i] < arr[i + 1])
                isIncline = true;
            else if (isIncline && arr[i] > arr[i + 1])
                isDecline = true;
            else
                return false;
        }
        return isDecline;
    }
}
