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

    @Test(description = "Verify sorting string")
    public void verifySortingString() {
        StringProblems stringProblems = new StringProblems();
        String sortedString = stringProblems.sort("zxcvasddsa");
        System.out.println(sortedString);
    }

    @Test(description = "Verify string 1 is permutation of second")
    public void verifyPermutation() {
        StringProblems stringProblems = new StringProblems();
        boolean isPermutation = stringProblems.isPermutation("hellox", "olhelx");
        System.out.printf("String 2 is permutation of 1? %s", isPermutation);
    }

    @Test(description = "Verify string 1 is permutation of second using map")
    public void verifyPermutationUsingMap() {
        StringProblems stringProblems = new StringProblems();
        boolean isPermutation = stringProblems.isPermutationUsingMap("helloxp", "olhelzp");
        System.out.printf("String 2 is permutation of 1? %s", isPermutation);
    }

    @Test(description = "URLify the string. Replace every space with %20")
    public void verifyUrlifyTheString() {
        StringProblems stringProblems = new StringProblems();
        String urlifiedString = stringProblems.urlifyString("Hello World!  Hi..         ", 18);
        System.out.printf("Urlified string is: %s", urlifiedString);
    }

    @Test(description = "URLify the string. Replace a given character with it's given encoded value")
    public void verifyGenericUrlifyTheString() {
        StringProblems stringProblems = new StringProblems();
        String urlifiedString = stringProblems.urlifyStringGeneric("Hello@World!@@Hi..",'@',"%40");
        System.out.printf("URLified string is: %s", urlifiedString);
    }
}
