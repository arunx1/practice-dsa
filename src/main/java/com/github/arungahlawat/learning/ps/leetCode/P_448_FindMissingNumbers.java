package com.github.arungahlawat.learning.ps.leetCode;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class P_448_FindMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counters = new int[nums.length];
        for (int num : nums) {
            counters[num - 1]++;
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] == 0) missingNumbers.add(i + 1);
        }
        return missingNumbers;
    }

    public List<Integer> findDisappearedNumbersNoExtraSpace(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[nums[i] - 1] == nums[i])
                i++;
            else {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) missingNumbers.add(i + 1);
        }
        return missingNumbers;
    }
}
