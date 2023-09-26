package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.ps.StringProblems;
import org.testng.annotations.Test;

public class StringProblemTests {

    @Test(description = "Check if a string has all the unique chars")
    public void checkStringHasAllUniqueChars() {
        StringProblems stringProblems = new StringProblems();
        String input = "HelLo";
        boolean isUnique = stringProblems.isUnique(input);
        System.out.printf("Input has all unique chars? :  %s", isUnique);
    }
}
