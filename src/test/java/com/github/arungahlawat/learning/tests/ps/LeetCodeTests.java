package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;
import com.github.arungahlawat.learning.ps.helpers.ArrayUtils;
import com.github.arungahlawat.learning.ps.leetCode.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LeetCodeTests {
    @BeforeMethod()
    public void beforeMethod() {
        System.out.println("===============================================");
    }

    @Test(description = "01 Two Sum : Using bruit force",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingBruitForce(int[] nums, int target) {
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingBruitForce(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result indices: ");
            arrayUtils.print(twoSum);
        }
    }

    @Test(description = "01 Two Sum : Using two pointers on sorted array",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingTwoPointersInSortedArray(int[] nums, int target) {
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingTwoPointersOnSortedArray(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result : ");
            arrayUtils.print(twoSum);
        }
    }

    @Test(description = "01 Two Sum : Using hashtable",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingHashtable(int[] nums, int target) {
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingHashTable(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result indices: ");
            arrayUtils.print(twoSum);
        }
    }

    @Test(description = "02 Add Two Numbers : Find sum of two numbers represented in linked list in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC02", "Linked Lists", "Add Two Numbers"})
    public void addTwoNumbers(int[] first, int[] second) {
        LinkedList firstLinkedList = new LinkedList(first);
        System.out.print("First list: ");
        firstLinkedList.print();
        LinkedList secondLinkedList = new LinkedList(second);
        System.out.print("Second list: ");
        secondLinkedList.print();
        P_02_AddTwoNumbers p02AddTwoNumbers = new P_02_AddTwoNumbers();
        LinkedList result = p02AddTwoNumbers.addTwoNumbers(firstLinkedList, secondLinkedList);
        System.out.print("Result list: ");
        result.print();
    }

    @Test(description = "02 Add Two Numbers : 04 Find sum of two numbers represented in linkedlist in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC02", "Linked Lists", "Add Two Numbers"})
    public void addTwoNumbersUsingNodes(int[] first, int[] second) {
        LinkedList firstLinkedList = new LinkedList(first);
        System.out.print("First list: ");
        firstLinkedList.print();
        LinkedList secondLinkedList = new LinkedList(second);
        System.out.print("Second list: ");
        secondLinkedList.print();
        P_02_AddTwoNumbers p02AddTwoNumbers = new P_02_AddTwoNumbers();
        ListNode result = p02AddTwoNumbers.addTwoNumbers(firstLinkedList.getHead(), secondLinkedList.getHead());
        System.out.print("Result list: ");
        LinkedList resultList = new LinkedList();
        resultList.setHead(result);
        resultList.print();
    }

    @Test(description = "03 Longest Substring Without Repeating Characters : Find length of longest substring without duplicate chars",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC03", "Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstring(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s\n", length);
    }

    @Test(description = "03 Longest Substring Without Repeating Characters : Find length of longest substring without duplicate chars",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC03", "Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstringUsingCharTable(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring2(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s\n", length);
    }

    @Test(description = "04 Median of Two Sorted Arrays : Find median of 2 sorted arrays",
            dataProvider = "MedianOfSortedArraysTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC04", "Strings", "Median of Two Sorted Arrays"})
    public void findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        P_04_MedianOfTwoSortedArrays p_04_medianOfTwoSortedArrays = new P_04_MedianOfTwoSortedArrays();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("First array:");
        arrayUtils.print(nums1);
        System.out.print("Second array:");
        arrayUtils.print(nums2);
        double median = p_04_medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.printf("Median: %2f\n", median);
    }

    @Test(description = "05 Longest Palindromic Substring : Find longest palindromic substring",
            dataProvider = "LongestPalindromeSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC05", "Strings", "Longest Palindromic Substring"})
    public void findLongestPalindromicSubstring(String input) {
        P_05_LongestPalindromicSubstring p05LongestPalindromicSubstring = new P_05_LongestPalindromicSubstring();
        System.out.printf("Input: %s\n", input);
        String longestPalindromicSubstring = p05LongestPalindromicSubstring.longestPalindrome(input);
        System.out.printf("Longest palindromic substring: %s\n", longestPalindromicSubstring);
    }

    @Test(description = "06 Zigzag Conversion : Get string in zigzag conversion",
            dataProvider = "ZigzagConversionTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC06", "Strings", "Zigzag Conversion"})
    public void convertStringInZigZag(String s, int numRows) {
        P_06_ZigzagConversion p06ZigzagConversion = new P_06_ZigzagConversion();
        System.out.printf("Input string: '%s' rows: %d\n", s, numRows);
        String convertedString = p06ZigzagConversion.convert(s, numRows);
        System.out.printf("Converted string: '%s'\n", convertedString);
    }

    @Test(description = "07 Reverse Integer : Reverse the given integer",
            dataProvider = "ReverseIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC07", "Numbers", "Reverse Integer"})
    public void reverseInteger(int x) {
        P_07_ReverseInteger p07ReverseInteger = new P_07_ReverseInteger();
        System.out.printf("Input number: %d\n", x);
        int convertedNumber = p07ReverseInteger.reverse(x);
        System.out.printf("Reverted number: %d\n", convertedNumber);
    }

    @Test(description = "08 String to integer (atoi) : Parse and convert string to integer",
            dataProvider = "StringToIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC08", "Numbers", "String to Integer"})
    public void stringToInteger(String s) {
        P_08_StringToIntegerConversion p08StringToIntegerConversion = new P_08_StringToIntegerConversion();
        System.out.printf("Input string: '%s'\n", s);
        int convertedNumber = p08StringToIntegerConversion.myAtoi(s);
        System.out.printf("Parsed number: '%d'\n", convertedNumber);
    }

    @Test(description = "09 Palindrome Number : Check if a number is palindrome or not",
            dataProvider = "PalindromeNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC09", "Numbers", "Palindrome Number"})
    public void findIfNumberIsPalindrome(int x) {
        P_09_PalindromeNumber p09PalindromeNumber = new P_09_PalindromeNumber();
        System.out.printf("Input number: %d\n", x);
        boolean isPalindrome = p09PalindromeNumber.isPalindrome(x);
        System.out.printf("Input number is palindrome? : %s\n", isPalindrome);
    }

    @Test(description = "11 Container With Most Water : Find max water container area",
            dataProvider = "ContainerWithMaxWaterTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC11", "Arrays", "Container With Most Water"})
    public void getContainerWithMaxArea(int[] height) {
        P_11_ContainerWithMostWater p11ContainerWithMostWater = new P_11_ContainerWithMostWater();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input height array : ");
        arrayUtils.print(height);
        int maxArea = p11ContainerWithMostWater.maxArea(height);
        System.out.printf("Container area with max water : %d\n", maxArea);
    }

    @Test(description = "12 Integer to Roman : Return roman representation of a number",
            dataProvider = "IntegerToRomanTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC12", "Strings", "Integer to Roman"})
    public void printRomanRepresentationOfANumber(int x) {
        P_12_IntegerToRoman p12IntegerToRoman = new P_12_IntegerToRoman();
        System.out.printf("Input number: %d\n", x);
        String romanString = p12IntegerToRoman.intToRoman(x);
        System.out.printf("Roman number for %d is '%s'\n", x, romanString);
    }

    @Test(description = "13 Roman to Integer : Return integer representation of a roman number",
            dataProvider = "RomanToIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC13", "Strings", "Roman to Integer"})
    public void printIntegerRepresentationOfARomanNumber(String s) {
        P_13_RomanToInteger p13RomanToInteger = new P_13_RomanToInteger();
        System.out.printf("Input string: %s\n", s);
        int integerNumber = p13RomanToInteger.romanToInt(s);
        System.out.printf("Roman number to integer for %s is '%d'\n", s, integerNumber);
    }

    @Test(description = "14 Longest Common Prefix : Find longest common prefix from array of strings",
            dataProvider = "LongestCommonPrefixTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC14", "Strings", "Longest Common Prefix"})
    public void findLongestCommonPrefix(String[] strs) {
        P_14_LongestCommonPrefix p14LongestCommonPrefix = new P_14_LongestCommonPrefix();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input strings: ");
        arrayUtils.print(strs);
        String commonPrefix = p14LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.printf("Longest common prefix is: '%s'\n", commonPrefix);
    }

    @Test(description = "15 Three Sum : Find all the triplets whose sum is 0",
            dataProvider = "ThreeSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC15", "Arrays", "Three Sum"})
    public void findTripletsWithSumEqualToZero(int[] nums) {
        P_15_ThreeSum p15ThreeSum = new P_15_ThreeSum();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(nums);
        List<List<Integer>> result = p15ThreeSum.threeSum(nums);
        System.out.printf("Three sum indices for %d are : \n", 0);
        arrayUtils.printListOfList(result);
    }

    @Test(description = "16 Three Sum closest : Find the closest triplet sum to target",
            dataProvider = "ThreeSumClosestTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC16", "Arrays", "Three Sum Closest"})
    public void findTripletsWithSumClosestToTarget(int[] nums, int target) {
        P_16_ThreeSumClosest p16ThreeSumClosest = new P_16_ThreeSumClosest();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        int closestSum = p16ThreeSumClosest.threeSumClosest(nums, target);
        System.out.printf("Three sum closest to %d is : %d\n", target, closestSum);
    }

    @Test(description = "17 Letter combination of a phone number : return list of letter combinations",
            dataProvider = "LetterCombinationOfANumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC17", "Strings", "Letter combination of a phone number"})
    public void findLetterCombinationOfANumber(String digits) {
        P_17_LetterCombinationOfAPhoneNumber p17LetterCombinationOfAPhoneNumber = new P_17_LetterCombinationOfAPhoneNumber();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Input strings: %s\n", digits);
        List<String> combinations = p17LetterCombinationOfAPhoneNumber.letterCombinations(digits);
        System.out.println("Combinations:");
        arrayUtils.print(combinations);
    }

    @Test(description = "18 Four Sum : Find quadruplets with sum equal to target",
            dataProvider = "FourSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC18", "Arrays", "Four Sum"})
    public void findQuadrupletsWithSumEqualToTarget(int[] nums, int target) {
        P_18_FourSum p18FourSum = new P_18_FourSum();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        List<List<Integer>> result = p18FourSum.fourSum(nums, target);
        System.out.printf("Four sum items for %d are : \n", target);
        arrayUtils.printListOfList(result);
    }

    @Test(description = "19 Remove Nth Node From End of List",
            dataProvider = "RemoveNthNodeTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC19", "Linked Lists", "Remove Nth Node From End of List"})
    public void removeNthNode(int[] list, int n) {
        LinkedList linkedList = new LinkedList(list);
        System.out.print("First list: ");
        linkedList.print();
        System.out.printf("Node index from last which is to be removed: %d\n", n);
        P_19_RemoveNthNode p19RemoveNthNode = new P_19_RemoveNthNode();
        ListNode result = p19RemoveNthNode.removeNthFromEnd(linkedList.getHead(), n);
        System.out.print("List after removal:");
        linkedList.setHead(result);
        linkedList.print();
    }

    @Test(description = "20 Valid Parentheses",
            dataProvider = "ValidParenthesesTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC20", "Strings", "Valid Parentheses"})
    public void validIfInputHasValidParentheses(String s) {
        P_20_Valid_Parentheses p20ValidParentheses = new P_20_Valid_Parentheses();
        System.out.printf("Input strings: %s\n", s);
        Boolean isValid = p20ValidParentheses.isValid(s);
        System.out.printf("Input has valid parentheses? : %s\n", isValid);
    }

    @Test(description = "21 Merge Two Sorted Lists",
            dataProvider = "MergeTwoSortedListsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC21", "Linked Lists", "Merge Two Sorted Lists"})
    public void mergeTwoSortedLists(int[] first, int[] second) {
        LinkedList firstLinkedList = new LinkedList(first);
        System.out.print("First list: ");
        firstLinkedList.print();
        LinkedList secondLinkedList = new LinkedList(second);
        System.out.print("Second list: ");
        secondLinkedList.print();
        P_21_Merge_Two_Sorted_List p21MergeTwoSortedList = new P_21_Merge_Two_Sorted_List();
        ListNode result = p21MergeTwoSortedList.mergeTwoLists(firstLinkedList.getHead(), secondLinkedList.getHead());
        System.out.print("Result list: ");
        LinkedList resultList = new LinkedList();
        resultList.setHead(result);
        resultList.print();
    }

    @Test(description = "23 Merge k Sorted Lists",
            dataProvider = "MergeKSortedListsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC23", "Linked Lists", "Merge K Sorted Lists"})
    public void mergeKSortedLists(int[]... lists) {
        ListNode[] listHeads = new ListNode[lists.length];
        for (int i = 0; i < lists.length; i++) {
            LinkedList linkedList = new LinkedList(lists[i]);
            listHeads[i] = linkedList.getHead();
            System.out.printf("List %d : ", i + 1);
            linkedList.print();
        }
        P_23_MergeKSortedLists p23MergeKSortedLists = new P_23_MergeKSortedLists();
        ListNode result = p23MergeKSortedLists.mergeKLists(listHeads);
        System.out.print("Result list: ");
        LinkedList resultList = new LinkedList();
        resultList.setHead(result);
        resultList.print();
    }

    @Test(description = "24 Swap Nodes in Pairs",
            dataProvider = "SwapNodesInPairsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC24", "Linked Lists", "Swap Nodes in Pairs"})
    public void swapNodesInPairs(int[] list) {
        LinkedList linkedList = new LinkedList(list);
        System.out.print("List: ");
        linkedList.print();
        P_24_SwapNodesInPairs p24SwapNodesInPairs = new P_24_SwapNodesInPairs();
        ListNode result = p24SwapNodesInPairs.swapPairs(linkedList.getHead());
        System.out.print("List after swap:");
        linkedList.setHead(result);
        linkedList.print();
    }

    @Test(description = "26 Remove Duplicates from Sorted Array",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC26", "Arrays", "Remove Duplicates from Sorted Array"})
    public void removeDuplicatesFromSortedArray(int[] nums) {
        P_26_RemoveDuplicatesFromSortedArray p26RemoveDuplicatesFromSortedArray = new P_26_RemoveDuplicatesFromSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int length = p26RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "27 Remove all occurrences of val from array",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC27", "Arrays", "Remove Element"})
    public void removeAllOccurrencesOfElement(int[] nums, int val) {
        P_27_RemoveAllOccurrences p27RemoveAllOccurrences = new P_27_RemoveAllOccurrences();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d, Input array: ", val);
        arrayUtils.print(nums);
        int length = p27RemoveAllOccurrences.removeElement(nums, val);
        System.out.print("Array after removing occurrences: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "27 Remove all occurrences of val from array",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC27", "Arrays", "Remove Element"})
    public void removeAllOccurrencesOfElementSimple(int[] nums, int val) {
        P_27_RemoveAllOccurrences p27RemoveAllOccurrences = new P_27_RemoveAllOccurrences();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d, Input array: ", val);
        arrayUtils.print(nums);
        int length = p27RemoveAllOccurrences.removeElementSimple(nums, val);
        System.out.print("Array after removing occurrences: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "88 Merge Sorted Array",
            dataProvider = "MergeSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC88", "Arrays", "Merge Sorted Array"})
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        P_88_Merge_Sorted_Array p88MergeSortedArray = new P_88_Merge_Sorted_Array();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("nums1 [%d]: ", m);
        arrayUtils.print(nums1, m);
        System.out.printf("nums2 [%d]: ", n);
        arrayUtils.print(nums2, n);
        p88MergeSortedArray.merge(nums1, m, nums2, n);
        System.out.print("Merged array: ");
        arrayUtils.print(nums1, m + n);
    }

    @Test(description = "80 Remove Duplicates from Sorted Array II",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC80", "Arrays", "Remove Duplicates from Sorted Array II"})
    public void removeMoreThanTwoDuplicatesFromSortedArray(int[] nums) {
        P_80_RemoveMoreThanTwoDuplicates p80RemoveMoreThanTwoDuplicates = new P_80_RemoveMoreThanTwoDuplicates();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int length = p80RemoveMoreThanTwoDuplicates.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "88 Merge Sorted Array",
            dataProvider = "MergeSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC88", "Arrays", "Merge Sorted Array"})
    public void mergeSortedArrayWithNoAdditionalSpace(int[] nums1, int m, int[] nums2, int n) {
        P_88_Merge_Sorted_Array p88MergeSortedArray = new P_88_Merge_Sorted_Array();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("nums1 [%d]: ", m);
        arrayUtils.print(nums1, m);
        System.out.printf("nums2 [%d]: ", n);
        arrayUtils.print(nums2, n);
        p88MergeSortedArray.mergeWithoutAdditionalSpace(nums1, m, nums2, n);
        System.out.print("Merged array: ");
        arrayUtils.print(nums1, m + n);
    }

    @Test(description = "169 Majority Element",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC169", "Arrays", "Majority Element"})
    public void findMajorityElement(int[] nums) {
        P_169_Majority_Element p169MajorityElement = new P_169_Majority_Element();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int majorityElement = p169MajorityElement.majorityElement(nums);
        System.out.printf("Majority element: %d\n", majorityElement);
    }

    @Test(description = "L01.01 Max consecutive ones",
            dataProvider = "MaxConsecutiveOnesTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL01.01", "Arrays", "Max consecutive ones"})
    public void findMaxConsecutiveOnes(int[] input) {
        P_L01_MaxConsecutiveOnes pL01MaxConsecutiveOnes = new P_L01_MaxConsecutiveOnes();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int maxConsecutive = pL01MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        System.out.printf("Max consecutive ones : %d\n", maxConsecutive);
    }

    @Test(description = "L01.02 Max consecutive ones",
            dataProvider = "MaxConsecutiveOnesTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL01.02", "Arrays", "Max consecutive ones"})
    public void findMaxConsecutiveOnesUsingSlidingWindow(int[] input) {
        P_L01_MaxConsecutiveOnes pL01MaxConsecutiveOnes = new P_L01_MaxConsecutiveOnes();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int maxConsecutive = pL01MaxConsecutiveOnes.findMaxConsecutiveOnesUsingSlidingWindow(input);
        System.out.printf("Max consecutive ones : %d\n", maxConsecutive);
    }

    @Test(description = "L02 Find Numbers with Even Number of Digits",
            dataProvider = "getNumbersWithEvenNumberOfDigitsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL02", "Arrays", "Numbers with Even Number of Digits"})
    public void findNumbersWithEvenNumberOfDigits(int[] input) {
        P_L02_NumbersWithEvenNumberOfDigits pL02NumbersWithEvenNumberOfDigits = new P_L02_NumbersWithEvenNumberOfDigits();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int count = pL02NumbersWithEvenNumberOfDigits.findNumbers(input);
        System.out.printf("Numbers with Even Number of Digits : %d\n", count);
    }

    @Test(description = "L03.01 Squares of a Sorted Array",
            dataProvider = "SortedSquaresTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL03.01", "Arrays", "Squares of a Sorted Array"})
    public void getSortedSquares(int[] input) {
        P_L03_SquaresOfSortedArray pL03SquaresOfSortedArray = new P_L03_SquaresOfSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = pL03SquaresOfSortedArray.sortedSquares(input);
        System.out.print("Array of Sorted Squares: :");
        arrayUtils.print(input);
    }

    @Test(description = "L03.02 Squares of a Sorted Array",
            dataProvider = "SortedSquaresTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL03.02", "Arrays", "Squares of a Sorted Array"})
    public void getSortedSquaresOptimised(int[] input) {
        P_L03_SquaresOfSortedArray pL03SquaresOfSortedArray = new P_L03_SquaresOfSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = pL03SquaresOfSortedArray.sortedSquaresOptimised(input);
        System.out.print("Array of Sorted Squares: :");
        arrayUtils.print(input);
    }

    @Test(description = "L04 Duplicate Zeros",
            dataProvider = "DuplicateZerosTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL04", "Arrays", "Duplicate Zeros"})
    public void getDuplicateZeros(int[] input) {
        P_L04_DuplicateZeros pL04DuplicateZeros = new P_L04_DuplicateZeros();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        pL04DuplicateZeros.duplicateZerosUsingAdditionalArray(input);
        System.out.print("Array with duplicate zeros:");
        arrayUtils.print(input);
    }

    @Test(description = "L05 Remove element",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LL05", "Arrays", "Remove element"})
    public void removeElement(int[] input, int val) {
        P_L05_RemoveElement pL05RemoveElement = new P_L05_RemoveElement();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d\nInput array : ", val);
        arrayUtils.print(input);
        int length = pL05RemoveElement.removeElementOptimised(input, val);
        System.out.print("Array after removing elements:");
        arrayUtils.print(input, length);
    }
}
