package com.github.arungahlawat.learning.ps.leetCode;

import java.util.Hashtable;

/*
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]


Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.


Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103
 */
public class P_L07_CheckIfNAndDoubleExistInArray {
    public boolean checkIfExist(int[] arr) {
        Hashtable<Integer, Boolean> existingItems = new Hashtable<>();
        for (int item : arr) {
            if (existingItems.containsKey(item * 2) || (existingItems.containsKey(item / 2) && item % 2 == 0))
                return true;
            else
                existingItems.put(item, true);
        }
        return false;
    }

    public boolean checkIfExistN2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] * 2 == arr[i])
                    return true;
            }
        }
        return false;
    }
}
