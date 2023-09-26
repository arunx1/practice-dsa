package com.github.arungahlawat.learning.ps;

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
}
