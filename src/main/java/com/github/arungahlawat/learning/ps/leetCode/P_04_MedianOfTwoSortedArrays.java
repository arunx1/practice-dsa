package com.github.arungahlawat.learning.ps.leetCode;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
    * nums1.length == m
    * nums2.length == n
    * 0 <= m <= 1000
    * 0 <= n <= 1000
    * 1 <= m + n <= 2000
    * -10^6 <= nums1[i], nums2[i] <= 10^6
*/
public class P_04_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArrayRequiredLength = (nums1.length + nums2.length) / 2 + 1;
        int[] result = new int[mergedArrayRequiredLength];
        int k = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length && k < mergedArrayRequiredLength) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (k < mergedArrayRequiredLength) {
            if (i < nums1.length) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        double median = result[mergedArrayRequiredLength - 1];
        if ((nums1.length+nums2.length) % 2 == 0) {
            median = (median + result[mergedArrayRequiredLength - 2]) / 2.0;
        }
        return median;
    }
}
