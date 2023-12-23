package com.github.arungahlawat.learning.ps.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:
    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral.
Example 1:
    Input: num = 3
    Output: "III"
    Explanation: 3 is represented as 3 ones.

Example 2:
    Input: num = 58
    Output: "LVIII"
    Explanation: L = 50, V = 5, III = 3.

Example 3:
    Input: num = 1994
    Output: "MCMXCIV"
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:
    * 1 <= num <= 3999

 */
public class P_12_IntegerToRoman {
    public String intToRoman(int num) {
        Stack<String> romanStack = new Stack<String>() {{
            push("I");
            push("IV");
            push("V");
            push("IX");
            push("X");
            push("XL");
            push("L");
            push("XC");
            push("C");
            push("CD");
            push("D");
            push("CM");
            push("M");
        }};
        Map<String, Integer> romanMap = new HashMap<String, Integer>() {{
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            if (romanMap.get(romanStack.peek()) <= num) {
                stringBuilder.append(romanStack.peek());
                num -= romanMap.get(romanStack.peek());
            } else
                romanStack.pop();
        }
        return stringBuilder.toString();
    }

    public String intToRomanNew(int num) {
        short[] romanHashtable = new short[26];
        romanHashtable['I' - 'A'] = 1;
        romanHashtable['V' - 'A'] = 5;
        romanHashtable['X' - 'A'] = 10;
        romanHashtable['L' - 'A'] = 50;
        romanHashtable['C' - 'A'] = 100;
        romanHashtable['D' - 'A'] = 500;
        romanHashtable['M' - 'A'] = 1000;
        char[] precedenceStack = {'M','D','C','L','X','V','I'};
        StringBuilder sb = new StringBuilder();
        short substractor = 100;
        short index = 0;
        while (num > 0) {
            char top = precedenceStack[index++];
            short currentTop = romanHashtable[top - 'A'];
            while (num / currentTop > 0) {
                sb.append(top);
                num = num - currentTop;
            }
            if (currentTop <= substractor) {
                substractor /= 10;
            }
            if (substractor > 0 && num >= (currentTop - substractor)) {
                while (num / (currentTop - substractor) > 0) {
                    switch (substractor) {
                        case 100:
                            sb.append('C');
                            break;
                        case 10:
                            sb.append('X');
                            break;
                        case 1:
                            sb.append('I');
                            break;
                    }
                    sb.append(top);
                    num = num - (currentTop - substractor);
                }
            }
        }
        return sb.toString();
    }
}
