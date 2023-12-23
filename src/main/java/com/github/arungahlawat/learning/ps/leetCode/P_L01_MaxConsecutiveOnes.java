package com.github.arungahlawat.learning.ps.leetCode;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */
public class P_L01_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int currentMax = 0;
        for (int num : nums) {
            if (num == 1) {
                currentMax++;
            } else {
                maxConsecutives = Math.max(maxConsecutives, currentMax);
                currentMax = 0;
            }
        }
        return Math.max(maxConsecutives, currentMax);
    }

    public int findMaxConsecutiveOnesUsingSlidingWindow(int[] nums) {
        int maxConsecutives = 0;
        int previousIndex = 0;
        int nextIndex = 0;
        while (nextIndex < nums.length) {
            if (nums[nextIndex] == 0)
                previousIndex = nextIndex + 1;
            nextIndex++;
            maxConsecutives = Math.max(maxConsecutives, nextIndex - previousIndex);
        }
        return maxConsecutives;
    }
}
