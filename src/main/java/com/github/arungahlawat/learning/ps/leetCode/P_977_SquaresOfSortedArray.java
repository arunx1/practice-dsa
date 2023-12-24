package com.github.arungahlawat.learning.ps.leetCode;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class P_977_SquaresOfSortedArray {
    private void reverseArray(int[] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private void mergeSubArraysInPlace(int[] nums, int mid) {
        int i = 0, j = mid + 1;
        if (i == j)
            return;
        while (j < nums.length) {
            if (nums[j] <= nums[i]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (i == j)
                j++;
            else
                i++;
        }
    }

    private void mergeSubArrays(int[] nums, int mid) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        int i = 0, k = 0, j = mid + 1;
        while (i <= mid && j < nums.length) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            nums[k] = temp[i];
            i++;
            k++;
        }
        while (j < nums.length) {
            nums[k] = temp[j];
            j++;
            k++;
        }
    }

    public int[] sortedSquares(int[] nums) {
        int negativeCount = -1;
        for (int num : nums) {
            if (num < 0)
                negativeCount++;
        }
        reverseArray(nums, 0, negativeCount);
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        mergeSubArrays(nums, negativeCount);
        return nums;
    }

    public int[] sortedSquaresOptimised(int[] nums) {
        int[] temp = new int[nums.length];
        short index = (short) (nums.length - 1);
        short left = 0, right = index;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                temp[index] = nums[left] * nums[left];
                left++;
            } else {
                temp[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return temp;
    }
}
