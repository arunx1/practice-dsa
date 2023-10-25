package com.github.arungahlawat.learning.ps.leetCode;

import java.util.HashMap;
import java.util.Map;
/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
    * 0 <= s.length <= 5 * 104
    * s consists of English letters, digits, symbols and spaces.
*/
public class P_03_LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        int i = 0, j = 0, count = 1;
        Map<Character, Integer> charMap = new HashMap<>();
        while (j < s.length()) {
            char currentChar = s.charAt(j);
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= i) {
                i = charMap.remove(currentChar) + 1;
            } else
                count = Math.max(count, (j - i) + 1);
            charMap.put(currentChar, j);
            j++;
        }
        return count;
    }

    public int lengthOfLongestSubstring2(String s) {
        int result = 0;
        int[] cache = new int[256];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}
