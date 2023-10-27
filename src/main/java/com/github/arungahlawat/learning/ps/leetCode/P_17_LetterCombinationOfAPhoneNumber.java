package com.github.arungahlawat.learning.ps.leetCode;

import java.util.*;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below.
Note that 1 does not map to any letters.
Example 1:
    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
    Input: digits = ""
    Output: []

Example 3:
    Input: digits = "2"
    Output: ["a","b","c"]

Constraints:
    * 0 <= digits.length <= 4
    * digits[i] is a digit in the range ['2', '9'].
 */
public class P_17_LetterCombinationOfAPhoneNumber {
    Map<Character, String> keyDigitMap = new HashMap<Character, String>() {{
        put('2', "a,b,c");
        put('3', "d,e,f");
        put('4', "g,h,i");
        put('5', "j,k,l");
        put('6', "m,n,o");
        put('7', "p,q,r,s");
        put('8', "t,u,v");
        put('9', "w,x,y,z");
    }};

    private List<String> generateWords(String firstDigit, String secondDigit) {
        List<String> result = new ArrayList<>();
        for (String firstChar : firstDigit.split(",")) {
            for (String secondChar : secondDigit.split(",")) {
                result.add(firstChar + secondChar);
            }
        }
        return result;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        if (digits.length() == 1) {
            return Arrays.asList(keyDigitMap.get(digits.charAt(0)).split(","));
        }
        List<String> combinations = Arrays.asList(keyDigitMap.get(digits.charAt(0)).split(","));
        int j = 1;
        while (j < digits.length()) {
            combinations = generateWords(String.join(",", combinations), keyDigitMap.get(digits.charAt(j)));
            j++;
        }
        return combinations;
    }
}
