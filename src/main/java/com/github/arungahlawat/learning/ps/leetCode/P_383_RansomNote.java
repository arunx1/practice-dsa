package com.github.arungahlawat.learning.ps.leetCode;

public class P_383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineTable = new int[26];
        for (char currentChar : magazine.toCharArray()) {
            magazineTable[currentChar - 'a']++;
        }
        for (char currentRansomNoteChar : ransomNote.toCharArray()) {
            if (magazineTable[currentRansomNoteChar - 'a'] == 0)
                return false;
            else
                magazineTable[currentRansomNoteChar - 'a']--;
        }
        return true;
    }
}
