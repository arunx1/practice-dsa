package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.ps.ArrayProblems;

public class ArrayProblemTests {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 1, 9, 2, 3, 4);
        arrayProblems.moveAllKsToEndOfArray(1);
        arrayProblems.print();
    }
}
