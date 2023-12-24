package com.github.arungahlawat.learning.ps.leetCode;

/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Can you find an O(n) solution?
 */
public class P_414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        boolean isMax = false, isSecondMax = false, isThirdMax = false;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max || (num == Integer.MIN_VALUE && !isMax)) {
                if (secondMax > thirdMax || isSecondMax) {
                    isThirdMax = true;
                    thirdMax = secondMax;
                }
                if (max > secondMax || isMax) {
                    isSecondMax = true;
                    secondMax = max;
                }
                isMax = true;
                max = num;
            } else if ((num > secondMax || (num == Integer.MIN_VALUE && !isSecondMax)) && num != max) {
                if (secondMax > thirdMax || isSecondMax) {
                    isThirdMax = true;
                    thirdMax = secondMax;
                }
                isSecondMax = true;
                secondMax = num;
            } else if ((num > thirdMax || (num == Integer.MIN_VALUE && !isThirdMax)) && num != max && num != secondMax) {
                thirdMax = num;
                isThirdMax = true;
            }
        }
        thirdMax = isThirdMax ? thirdMax : max;
        return thirdMax;
    }

    public int thirdMaxOptimised(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                if (secondMax > thirdMax) {
                    thirdMax = secondMax;
                }
                if (max > secondMax) {
                    secondMax = max;
                }
                max = num;
            } else if (num > secondMax && num != max) {
                if (secondMax > thirdMax) {
                    thirdMax = secondMax;
                }
                secondMax = num;
            } else if (num > thirdMax && num != max && num != secondMax) {
                thirdMax = num;
            }
        }
        thirdMax = thirdMax == Long.MIN_VALUE ? max : thirdMax;
        return (int) thirdMax;
    }
}
