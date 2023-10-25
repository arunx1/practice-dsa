package com.github.arungahlawat.learning.ps.leetCode;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
    * -2^31 <= x <= 2^31 - 1
 */
public class P_09_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        int maxDiviser = 1;
        while ((Integer.MAX_VALUE / 10 >= maxDiviser) && maxDiviser * 10 <= x) {
            maxDiviser = maxDiviser * 10;
        }
        while (x != 0) {
            int suffix = x % 10;
            int prefix = x / maxDiviser;
            if (prefix != suffix)
                return false;
            x = (x - maxDiviser * prefix) / 10;
            maxDiviser = maxDiviser / 100;
        }
        return true;
    }
}
