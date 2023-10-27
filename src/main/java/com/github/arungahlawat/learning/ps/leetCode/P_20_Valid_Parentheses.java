package com.github.arungahlawat.learning.ps.leetCode;

import java.util.Arrays;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
    * Open brackets must be closed by the same type of brackets.
    * Open brackets must be closed in the correct order.
    * Every close bracket has a corresponding open bracket of the same type.

Example 1:
    Input: s = "()"
    Output: true

Example 2:
    Input: s = "()[]{}"
    Output: true

Example 3:
    Input: s = "(]"
    Output: false

Constraints:
    * 1 <= s.length <= 104
    * s consists of parentheses only '()[]{}'.
 */
public class P_20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(' || currentChar == '{' || currentChar == '[')
                charStack.push(currentChar);
            else if (charStack.isEmpty()
                    || (currentChar == ']' && charStack.peek() != '[')
                    || (currentChar == '}' && charStack.peek() != '{')
                    || (currentChar == ')' && charStack.peek() != '('))
                return false;
            else
                charStack.pop();
        }
        return charStack.isEmpty();
    }
}
