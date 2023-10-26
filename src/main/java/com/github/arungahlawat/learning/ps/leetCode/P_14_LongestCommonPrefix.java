package com.github.arungahlawat.learning.ps.leetCode;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

Constraints:
    * 1 <= strs.length <= 200
    * 0 <= strs[i].length <= 200
    * strs[i] consists of only lowercase English letters.
 */
public class P_14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        String longestCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            longestCommonPrefix = getCommonPrefix(longestCommonPrefix, strs[i]);
            if (longestCommonPrefix.isEmpty())
                return "";
        }
        return longestCommonPrefix;
    }

    private String getCommonPrefix(String longestCommonPrefix, String nextString) {
        StringBuilder commonPrefix = new StringBuilder();
        int i = 0;
        while (i < longestCommonPrefix.length() && i < nextString.length()) {
            if (longestCommonPrefix.charAt(i) == nextString.charAt(i))
                commonPrefix.append(longestCommonPrefix.charAt(i));
            else
                break;
            i++;
        }
        return commonPrefix.toString();
    }
}
