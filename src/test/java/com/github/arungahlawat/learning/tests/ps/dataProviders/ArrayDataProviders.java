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
}
