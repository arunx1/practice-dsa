package com.github.arungahlawat.learning.ps.leetCode;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */
public class P_L11_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int currentPointer = 0;
        for (int nextPointer = 0; nextPointer < nums.length; nextPointer++) {
            if (nums[nextPointer] % 2 == 0) {
                if (nextPointer > currentPointer) {
                    int temp = nums[currentPointer];
                    nums[currentPointer] = nums[nextPointer];
                    nums[nextPointer] = temp;
                }
                currentPointer++;
            }
        }
        return nums;
    }
}
