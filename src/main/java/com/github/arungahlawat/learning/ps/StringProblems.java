package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.sorting.QuickSort;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {

    // To determine if all chars in string are unique. Assuming input can consist any of 128 ASCII chars
    public boolean isUnique(String input) {
        if (input.length() > 128)
            return false;
        boolean[] charPresenceArray = new boolean[128];
        int i = 0, j = input.length() - 1;
        while (i <= j) {
            int currentIChar = input.charAt(i);
            int currentJChar = input.charAt(j);
            if (charPresenceArray[currentIChar] || charPresenceArray[currentJChar])
                return false;
            charPresenceArray[currentIChar] = true;
            charPresenceArray[currentJChar] = true;
            i++;
            j--;
        }
        return true;
    }

    public String sort(String input) {
        int[] inputAsciiArray = new int[input.length()];
        char[] inputCharArray = input.toCharArray();
        for (int x = 0; x < input.toCharArray().length; x++)
            inputAsciiArray[x] = inputCharArray[x];
        new QuickSort(inputAsciiArray).sort();
        for (int x = 0; x < inputAsciiArray.length; x++)
            inputCharArray[x] = (char) inputAsciiArray[x];
        return new String(inputCharArray);
    }

    // To determine if a string is permutation of another
    public boolean isPermutation(String input, String target) {
        if (input.length() != target.length())
            return false;
        int i = 0;
        input = sort(input);
        target = sort(target);
        while (i < input.length()) {
            if (input.charAt(i) != target.charAt(i))
                return false;
            i++;
        }
        return true;
    }

    // To determine if a string is permutation of another
    public boolean isPermutationUsingMap(String input, String target) {
        if (input.length() != target.length())
            return false;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (characterIntegerMap.containsKey(input.charAt(i)))
                characterIntegerMap.put(input.charAt(i), characterIntegerMap.get(input.charAt(i)) + 1);
            else
                characterIntegerMap.put(input.charAt(i), 1);
        }
        for (int i = 0; i < target.length(); i++) {
            if (characterIntegerMap.containsKey(target.charAt(i))) {
                if (characterIntegerMap.get(target.charAt(i)) == 1)
                    characterIntegerMap.remove(target.charAt(i));
                else
                    characterIntegerMap.put(target.charAt(i), characterIntegerMap.get(target.charAt(i)) - 1);
            } else
                return false;
        }
        return characterIntegerMap.isEmpty();
    }

    // URLify the string. replace all spaces with %20. O(n^2) solution
    public String urlifyString(String input, int trueLength) {
        char[] inputCharArray = input.toCharArray();
        int i = 0;
        while (i < trueLength) {
            if (inputCharArray[i] == ' ') {
                int j = trueLength - 1;
                trueLength = trueLength + 2;
                while (j >= i) {
                    inputCharArray[j + 3] = inputCharArray[j + 2];
                    inputCharArray[j + 2] = inputCharArray[j + 1];
                    inputCharArray[j + 1] = inputCharArray[j];
                    j--;
                }
                inputCharArray[i] = '%';
                inputCharArray[i + 1] = '2';
                inputCharArray[i + 2] = '0';
                i = i + 2;
            }
            i++;
        }
        return new String(inputCharArray);
    }

    public String urlifyString(char[] input, int trueLength, char find, String replaceWith) {
        int charCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (input[i] == find)
                charCount++;
        }
        int index = trueLength + (charCount * (replaceWith.length() - 1));
        char[] replaceWithArray = replaceWith.toCharArray();
        for (int i = trueLength - 1; i >= 0; i--, index--) {
            if (input[i] == find) {
                for (int j = replaceWithArray.length - 1; j >= 0; j--) {
                    input[index - (replaceWithArray.length - j)] = replaceWithArray[j];
                }
                index = index - (replaceWith.length() - 1);
            } else {
                input[index - 1] = input[i];
            }
        }
        return new String(input);
    }

    public String urlifyStringGeneric(String input, char find, String replaceWith) {
        int charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == find)
                charCount++;
        }
        char tempReplaceChar = '-';
        int trueLength = input.length();
        StringBuilder stringBuilder = new StringBuilder(trueLength + (charCount * (replaceWith.length() - 1)));
        stringBuilder.append(input);
        for (int i = 0; i < charCount * (replaceWith.length() - 1); i++) {
            stringBuilder.append(tempReplaceChar);
        }
        char[] inputCharArray = stringBuilder.toString().toCharArray();
        return urlifyString(inputCharArray, trueLength, find, replaceWith);
    }


}
