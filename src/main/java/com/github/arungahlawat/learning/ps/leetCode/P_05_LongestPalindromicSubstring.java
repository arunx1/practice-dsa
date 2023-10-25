package com.github.arungahlawat.learning.ps.leetCode;

/*
Given a string s, return the longest palindromic substring in s.

Example 1:
    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.

Example 2:
    Input: s = "cbbd"
    Output: "bb"

Constraints:
    * 1 <= s.length <= 1000
    * s consist of only digits and English letters.
*/
public class P_05_LongestPalindromicSubstring {
    private boolean isPalindrome(char[] charArray, int left, int right) {
        while (left <= right) {
            if (charArray[left] != charArray[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    private String toString(char[] charArray, int left, int right) {
        return String.valueOf(charArray, left, (right - left) + 1);
    }

    public String longestPalindrome(String s) {
        if (s.isEmpty())
            return s;
        char[] charArray = s.toCharArray();
        int maxLeftIndex = 0, maxRightIndex = 0;
        int left = 0, right = charArray.length - 1;
        while (left < charArray.length) {
            if (left != right && charArray[left] == charArray[right]) {
                boolean isPalindrome = isPalindrome(charArray, left, right);
                if (isPalindrome && ((right - left) > (maxRightIndex - maxLeftIndex))) {
                    maxRightIndex = right;
                    maxLeftIndex = left;
                }
            }
            if (right == left) {
                left++;
                right = charArray.length;
            }
            right--;
        }
        return toString(charArray, maxLeftIndex, maxRightIndex);
    }
}
