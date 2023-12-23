package com.github.arungahlawat.learning.tests.ps.dataProviders;

import org.testng.annotations.DataProvider;

public class ArrayDataProviders {
    @DataProvider(name = "TwoSumTestData")
    public Object[][] getTwoSumTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, 3},
                {new int[]{2, 2, 6}, 4},
                {new int[]{0, 2, 6}, 6},
                {new int[]{0, 2, 6, 9, 1, 13}, 14},
                {new int[]{0, 2, 6, 9, 1, 13}, 16},
        };
    }

    @DataProvider(name = "AddTwoNumbersTestData")
    public Object[][] getAddTwoNumbersTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{9, 7, 9}}
        };
    }

    @DataProvider(name = "LongestSubstringTestData")
    public Object[] getLongestSubstringTestData() {
        return new Object[]{
                "aabbcd",
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                " ",
                "au",
                "tmmzuxt"
        };
    }

    @DataProvider(name = "MedianOfSortedArraysTestData")
    public Object[][] getMedianOfSortedArraysTestData() {
        return new Object[][]{
                {new int[]{}, new int[]{2, 3}},
                {new int[]{1, 3}, new int[]{2}},
                {new int[]{1, 2}, new int[]{3, 4}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{4}}
        };
    }

    @DataProvider(name = "LongestPalindromeSubstringTestData")
    public Object[] getLongestPalindromeSubstringTestData() {
        return new Object[]{
                "heahaehxtxheahhzo",
                "hi naman",
                "oh hi naman ih!",
                "",
                " ",
                "a"
        };
    }

    @DataProvider(name = "ZigzagConversionTestData")
    public Object[][] getZigzagConversionTestData() {
        return new Object[][]{
                {"PAYPALISHIRING", 3},
                {"PAYPALISHIRING", 4},
                {"A", 1},
        };
    }

    @DataProvider(name = "ReverseIntegerTestData")
    public Object[] getReverseIntegerTestData() {
        return new Object[]{
                1,
                123456789,
                1999999999,
                1999999990,
                -2147483648,
                2147483647,
                -846384741,
                -1,
                0,
                -121,
                121
        };
    }

    @DataProvider(name = "StringToIntegerTestData")
    public Object[] getStringToIntegerTestData() {
        return new Object[]{
                "42",
                "   -42",
                "4193 with words",
                "words and 987",
                "+1",
                "+-1",
                "++1",
                "--1",
                "  --1",
                "  - 1",
                "2147483648",
                "2147483647",
                "-2147483648",
                "-2147483649",
                "-2147483647",
                "-6147483648"
        };
    }

    @DataProvider(name = "PalindromeNumberTestData")
    public Object[] getPalindromeNumberTestData() {
        return new Object[]{
                1,
                123456789,
                1999999999,
                1999999990,
                -2147483648,
                2147483647,
                -846384741,
                -1,
                0,
                -121,
                121,
                1234554321,
                123454321,
        };
    }

    @DataProvider(name = "ContainerWithMaxWaterTestData")
    public Object[] getContainerWithMaxWaterTestData() {
        return new Object[]{
                new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7},
                new int[]{1, 1},
        };
    }

    @DataProvider(name = "IntegerToRomanTestData")
    public Object[] getIntegerToRomanTestData() {
        return new Object[]{
                9913,
                3,
                58,
                1994,
                20000
        };
    }

    @DataProvider(name = "RomanToIntegerTestData")
    public Object[] getRomanToIntegerTestData() {
        return new Object[]{
                "III",
                "LVIII",
                "MCMXCIV"
        };
    }


    @DataProvider(name = "LetterCombinationOfANumberTestData")
    public Object[] getLetterCombinationOfANumberTestData() {
        return new Object[]{
                "234",
                "23",
                "2",
                "",
                "2345",
                "79",
                "798",
                "7985"
        };
    }

    @DataProvider(name = "LongestCommonPrefixTestData")
    public Object[] getLongestCommonPrefixTestDataTestData() {
        return new Object[][]{
                {"arun", "aru", "arunk", "arunkum"},
                {"flower", "flow", "flight"},
                {"dog", "racecar", "car"},
        };
    }

    @DataProvider(name = "ThreeSumTestData")
    public Object[] getThreeSumTestDataTestData() {
        return new Object[]{
                new int[]{-1, 0, 1, 2, -1, -4},
                new int[]{0, 1, 1},
                new int[]{0, 0, 0},
                new int[]{0, 0, 0, 0},
        };
    }

    @DataProvider(name = "ThreeSumClosestTestData")
    public Object[] getThreeSumClosestTestData() {
        return new Object[][]{
                {new int[]{-1, 2, 1, -4}, 1},
                {new int[]{-12, -2, 10, -4, -18, 20, 2, 0}, 1},
                {new int[]{0, 0, 0}, 0},
        };
    }

    @DataProvider(name = "FourSumTestData")
    public Object[] getFourSumTestData() {
        return new Object[][]{
                {new int[]{1, 0, -1, 0, -2, 2}, 0},
                {new int[]{2, 2, 2, 2, 2}, 8},
                {new int[]{0, 0, 0}, 0},
                {new int[]{0, 0, 0, 0}, 0},
                {new int[]{-2, -5, -6, 0, 2, 4, 6, 1, 12, 3, 9, 2, 8, 1}, 8},
                {new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296},
        };
    }

    @DataProvider(name = "RemoveNthNodeTestData")
    public Object[][] getRemoveNthNodeTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 2},
                {new int[]{1, 2, 3, 4, 5}, 1},
                {new int[]{1, 2, 3, 4, 5}, 5},
                {new int[]{1}, 1},
                {new int[]{1, 2}, 1},
                {new int[]{1, 2}, 2},
        };
    }

    @DataProvider(name = "ValidParenthesesTestData")
    public Object[] getValidParenthesesTestData() {
        return new Object[]{
                "()",
                "()[]{}",
                "(]",
                "{[()]}",
                "]",
                "(",
        };
    }

    @DataProvider(name = "MergeTwoSortedListsTestData")
    public Object[][] getMergeTwoSortedListsTestData() {
        return new Object[][]{
                {new int[]{1, 2, 4}, new int[]{1, 3, 4}},
                {new int[]{}, new int[]{}},
                {new int[]{}, new int[]{0}},
                {new int[]{1, 2, 3}, new int[]{4}},
                {new int[]{1, 2, 3}, new int[]{4, 5, 6, 7, 8}},
        };
    }

    @DataProvider(name = "MergeKSortedListsTestData")
    public Object[][] getMergeKSortedListsTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{3, 4}, new int[]{5}, new int[]{6, 7, 8}, new int[]{9, 10, 11}},
                {new int[]{1, 4, 5}, new int[]{1, 3, 4}, new int[]{2, 6}},
                {new int[]{1, 2, 3}},
                {new int[]{}},
        };
    }

    @DataProvider(name = "SwapNodesInPairsTestData")
    public Object[] getSwapNodesInPairsTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4},
                new int[]{},
                new int[]{1},
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5, 6},
                new int[]{1, 2},
        };
    }

    @DataProvider(name = "RemoveDuplicatesFromSortedArrayTestData")
    public Object[][] getRemoveDuplicatesFromSortedArrayTestData() {
        return new Object[][]{
                {new int[]{}},
                {new int[]{1}},
                {new int[]{1, 1, 2}},
                {new int[]{1, 2, 3}},
                {new int[]{1, 2, 2, 3}},
                {new int[]{1, 2, 2, 3, 3}},
                {new int[]{1, 1, 1, 1}},
                {new int[]{-100, -100, -100, -100, -99, -98, -97, 97, 98, 99, 100, 100, 100}},
        };
    }

    @DataProvider(name = "RemoveElementTestData")
    public Object[][] getRemoveElementTestData() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{1}, 1},
                {new int[]{1}, 2},
                {new int[]{1, 1, 2}, 1},
                {new int[]{1, 2, 3}, 0},
                {new int[]{1, 2, 2, 3}, 1},
                {new int[]{1, 2, 2, 3, 3}, 2},
                {new int[]{1, 1, 1, 1}, 1},
                {new int[]{-100, -100, -100, -100, -99, -98, -97, 97, 98, 99, 100, 100, 100}, -97},
        };
    }

    @DataProvider(name = "MergeSortedArrayTestData")
    public Object[][] getMergeSortedArrayTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3},
                {new int[]{1, 0, 0, 0}, 1, new int[]{2, 5, 6}, 3},
                {new int[]{1}, 1, new int[]{}, 0},
                {new int[]{0}, 0, new int[]{1}, 1},
        };
    }
}
