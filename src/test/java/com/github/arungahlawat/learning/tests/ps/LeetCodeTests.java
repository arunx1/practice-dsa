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
        System.out.println("\n===============================================");
    }

    @Test(description = "01.01 Two Sum : Using bruit force",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Two Sum"})
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

    @Test(description = "01.02 Two Sum : Using two pointers on sorted array",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Two Sum", "Two Pointers"})
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

    @Test(description = "01.03 Two Sum : Using hashtable",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Two Sum", "Hash Table"})
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

    @Test(description = "02.01 Add Two Numbers : Find sum of two numbers represented in linked list in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Linked Lists", "Add Two Numbers"})
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

    @Test(description = "02.02 Add Two Numbers : Find sum of two numbers represented in linked list in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Linked Lists", "Add Two Numbers"})
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

    @Test(description = "03.01 Longest Substring Without Repeating Characters",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstring(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s", length);
    }

    @Test(description = "03.02 Longest Substring Without Repeating Characters",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstringUsingCharTable(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring2(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s", length);
    }

    @Test(description = "04 Median of Two Sorted Arrays",
            dataProvider = "MedianOfSortedArraysTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Median of Two Sorted Arrays"})
    public void findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        P_04_MedianOfTwoSortedArrays p_04_medianOfTwoSortedArrays = new P_04_MedianOfTwoSortedArrays();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("First array:");
        arrayUtils.print(nums1);
        System.out.print("Second array:");
        arrayUtils.print(nums2);
        double median = p_04_medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.printf("Median: %2f", median);
    }

    @Test(description = "05 Longest Palindromic Substring",
            dataProvider = "LongestPalindromeSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Longest Palindromic Substring"})
    public void findLongestPalindromicSubstring(String input) {
        P_05_LongestPalindromicSubstring p05LongestPalindromicSubstring = new P_05_LongestPalindromicSubstring();
        System.out.printf("Input: %s\n", input);
        String longestPalindromicSubstring = p05LongestPalindromicSubstring.longestPalindrome(input);
        System.out.printf("Longest palindromic substring: %s", longestPalindromicSubstring);
    }

    @Test(description = "06 Zigzag Conversion : Get string in zigzag conversion",
            dataProvider = "ZigzagConversionTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Zigzag Conversion"})
    public void convertStringInZigZag(String s, int numRows) {
        P_06_ZigzagConversion p06ZigzagConversion = new P_06_ZigzagConversion();
        System.out.printf("Input string: '%s' rows: %d\n", s, numRows);
        String convertedString = p06ZigzagConversion.convert(s, numRows);
        System.out.printf("Converted string: '%s'", convertedString);
    }

    @Test(description = "07 Reverse Integer",
            dataProvider = "ReverseIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Numbers", "Reverse Integer"})
    public void reverseInteger(int x) {
        P_07_ReverseInteger p07ReverseInteger = new P_07_ReverseInteger();
        System.out.printf("Input number: %d\n", x);
        int convertedNumber = p07ReverseInteger.reverse(x);
        System.out.printf("Reverted number: %d", convertedNumber);
    }

    @Test(description = "08 String to integer (atoi)",
            dataProvider = "StringToIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Numbers", "String to Integer"})
    public void stringToInteger(String s) {
        P_08_StringToIntegerConversion p08StringToIntegerConversion = new P_08_StringToIntegerConversion();
        System.out.printf("Input string: '%s'\n", s);
        int convertedNumber = p08StringToIntegerConversion.myAtoi(s);
        System.out.printf("Parsed number: '%d'", convertedNumber);
    }

    @Test(description = "09 Palindrome Number : Check if a number is palindrome or not",
            dataProvider = "PalindromeNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Numbers", "Palindrome Number"})
    public void findIfNumberIsPalindrome(int x) {
        P_09_PalindromeNumber p09PalindromeNumber = new P_09_PalindromeNumber();
        System.out.printf("Input number: %d\n", x);
        boolean isPalindrome = p09PalindromeNumber.isPalindrome(x);
        System.out.printf("Input number is palindrome? : %s", isPalindrome);
    }

    @Test(description = "11 Container With Most Water",
            dataProvider = "ContainerWithMaxWaterTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Container With Most Water"})
    public void getContainerWithMaxArea(int[] height) {
        P_11_ContainerWithMostWater p11ContainerWithMostWater = new P_11_ContainerWithMostWater();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input height array : ");
        arrayUtils.print(height);
        int maxArea = p11ContainerWithMostWater.maxArea(height);
        System.out.printf("Container area with max water : %d", maxArea);
    }

    @Test(description = "12 Integer to Roman",
            dataProvider = "IntegerToRomanTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Integer to Roman"})
    public void printRomanRepresentationOfANumber(int x) {
        P_12_IntegerToRoman p12IntegerToRoman = new P_12_IntegerToRoman();
        System.out.printf("Input number: %d\n", x);
        String romanString = p12IntegerToRoman.intToRoman(x);
        System.out.printf("Roman number for %d is '%s'", x, romanString);
    }

    @Test(description = "13 Roman to Integer",
            dataProvider = "RomanToIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Roman to Integer"})
    public void printIntegerRepresentationOfARomanNumber(String s) {
        P_13_RomanToInteger p13RomanToInteger = new P_13_RomanToInteger();
        System.out.printf("Input string: %s\n", s);
        int integerNumber = p13RomanToInteger.romanToInt(s);
        System.out.printf("Roman number to integer for %s is '%d'", s, integerNumber);
    }

    @Test(description = "14 Longest Common Prefix",
            dataProvider = "LongestCommonPrefixTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Longest Common Prefix"})
    public void findLongestCommonPrefix(String[] strs) {
        P_14_LongestCommonPrefix p14LongestCommonPrefix = new P_14_LongestCommonPrefix();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input strings: ");
        arrayUtils.print(strs);
        String commonPrefix = p14LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.printf("Longest common prefix is: '%s'", commonPrefix);
    }

    @Test(description = "15 Three Sum",
            dataProvider = "ThreeSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Three Sum"})
    public void findTripletsWithSumEqualToZero(int[] nums) {
        P_15_ThreeSum p15ThreeSum = new P_15_ThreeSum();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(nums);
        List<List<Integer>> result = p15ThreeSum.threeSum(nums);
        System.out.printf("Three sum indices for %d are : ", 0);
        arrayUtils.printListOfList(result);
    }

    @Test(description = "16 Three Sum closest",
            dataProvider = "ThreeSumClosestTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Three Sum Closest"})
    public void findTripletsWithSumClosestToTarget(int[] nums, int target) {
        P_16_ThreeSumClosest p16ThreeSumClosest = new P_16_ThreeSumClosest();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(nums);
        System.out.printf("Target: %d\n", target);
        int closestSum = p16ThreeSumClosest.threeSumClosest(nums, target);
        System.out.printf("Three sum closest to %d is : %d", target, closestSum);
    }

    @Test(description = "17 Letter combination of a phone number",
            dataProvider = "LetterCombinationOfANumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Strings", "Letter combination of a phone number"})
    public void findLetterCombinationOfANumber(String digits) {
        P_17_LetterCombinationOfAPhoneNumber p17LetterCombinationOfAPhoneNumber = new P_17_LetterCombinationOfAPhoneNumber();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Input strings: %s\n", digits);
        List<String> combinations = p17LetterCombinationOfAPhoneNumber.letterCombinations(digits);
        System.out.println("Combinations:");
        arrayUtils.print(combinations);
    }

    @Test(description = "18 Four Sum",
            dataProvider = "FourSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Four Sum"})
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
            groups = {"Linked Lists", "Remove Nth Node From End of List"})
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
            groups = {"Strings", "Valid Parentheses"})
    public void validIfInputHasValidParentheses(String s) {
        P_20_Valid_Parentheses p20ValidParentheses = new P_20_Valid_Parentheses();
        System.out.printf("Input strings: %s\n", s);
        Boolean isValid = p20ValidParentheses.isValid(s);
        System.out.printf("Input has valid parentheses? : %s", isValid);
    }

    @Test(description = "21 Merge Two Sorted Lists",
            dataProvider = "MergeTwoSortedListsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Linked Lists", "Merge Two Sorted Lists"})
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
            groups = {"Linked Lists", "Merge K Sorted Lists"})
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
            groups = {"Linked Lists", "Swap Nodes in Pairs"})
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

    @Test(description = "26.01 Remove Duplicates from Sorted Array",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Remove Duplicates from Sorted Array"})
    public void removeDuplicatesFromSortedArray(int[] nums) {
        P_26_RemoveDuplicatesFromSortedArray p26RemoveDuplicatesFromSortedArray = new P_26_RemoveDuplicatesFromSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int length = p26RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "26.02 Remove duplicates from sorted array",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Remove duplicates from sorted array"})
    public void removeDuplicatesFromSortedArrayInAsc(int[] input) {
        P_26_RemoveAllDuplicatesFromSortedArray p26RemoveAllDuplicatesFromSortedArray = new P_26_RemoveAllDuplicatesFromSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int length = p26RemoveAllDuplicatesFromSortedArray.removeDuplicatesBetter(input);
        System.out.print("Array after removing duplicates:");
        arrayUtils.print(input, length);
    }

    @Test(description = "27.01 Remove all occurrences of val from array",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Remove Element"})
    public void removeAllOccurrencesOfElement(int[] nums, int val) {
        P_27_RemoveAllOccurrences p27RemoveAllOccurrences = new P_27_RemoveAllOccurrences();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d, Input array: ", val);
        arrayUtils.print(nums);
        int length = p27RemoveAllOccurrences.removeElement(nums, val);
        System.out.print("Array after removing occurrences: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "27.02 Remove all occurrences of val from array",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Remove Element"})
    public void removeAllOccurrencesOfElementSimple(int[] nums, int val) {
        P_27_RemoveAllOccurrences p27RemoveAllOccurrences = new P_27_RemoveAllOccurrences();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d, Input array: ", val);
        arrayUtils.print(nums);
        int length = p27RemoveAllOccurrences.removeElementSimple(nums, val);
        System.out.print("Array after removing occurrences: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "27.03 Remove element",
            dataProvider = "RemoveElementTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Remove element"})
    public void removeElement(int[] input, int val) {
        P_27_RemoveElement p27RemoveElement = new P_27_RemoveElement();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.printf("Val: %d\nInput array : ", val);
        arrayUtils.print(input);
        int length = p27RemoveElement.removeElementOptimised(input, val);
        System.out.print("Array after removing elements:");
        arrayUtils.print(input, length);
    }

    @Test(description = "80 Remove Duplicates from Sorted Array II",
            dataProvider = "RemoveDuplicatesFromSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"LC80", "Array", "Remove Duplicates from Sorted Array II"})
    public void removeMoreThanTwoDuplicatesFromSortedArray(int[] nums) {
        P_80_RemoveMoreThanTwoDuplicates p80RemoveMoreThanTwoDuplicates = new P_80_RemoveMoreThanTwoDuplicates();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int length = p80RemoveMoreThanTwoDuplicates.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        arrayUtils.print(nums, length);
    }

    @Test(description = "88.01 Merge Sorted Array",
            dataProvider = "MergeSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Merge Sorted Array"})
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

    @Test(description = "88.02 Merge Sorted Array",
            dataProvider = "MergeSortedArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Merge Sorted Array"})
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
            groups = {"Array", "Majority Element"})
    public void findMajorityElement(int[] nums) {
        P_169_Majority_Element p169MajorityElement = new P_169_Majority_Element();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array: ");
        arrayUtils.print(nums);
        int majorityElement = p169MajorityElement.majorityElement(nums);
        System.out.printf("Majority element: %d", majorityElement);
    }

    @Test(description = "283 Move Zeros",
            dataProvider = "MoveZerosTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Move Zeros"})
    public void moveZeros(int[] input) {
        P_283_MoveZeroes p283MoveZeroes = new P_283_MoveZeroes();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        p283MoveZeroes.moveZeroes(input);
        System.out.print("Array after moving all zeros to right:");
        arrayUtils.print(input);
    }

    @Test(description = "412 Fizz Buzz",
            dataProvider = "FizzBuzzTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Fizz Buzz"})
    public void fizzBuzz(int n) {
        P_412_FizzBuzz p412FizzBuzz = new P_412_FizzBuzz();
        System.out.printf("n : %d\n", n);
        List<String> answer = p412FizzBuzz.fizzBuzz(n);
        new ArrayUtils().print(answer);
    }

    @Test(description = "414 Third Maximum Number",
            dataProvider = "ThirdMaxNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Third Maximum Number"})
    public void findThirdMaxNumber(int[] input) {
        P_414_ThirdMaximumNumber p414ThirdMaximumNumber = new P_414_ThirdMaximumNumber();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int thirdMax = p414ThirdMaximumNumber.thirdMaxOptimised(input);
        System.out.printf("Third max number: %d", thirdMax);
    }

    @Test(description = "448 Find missing numbers",
            dataProvider = "FindMissingNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Counters"})
    public void findMissingNumbers(int[] input) {
        P_448_FindMissingNumbers p448FindMissingNumbers = new P_448_FindMissingNumbers();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        List<Integer> missingNumbers = p448FindMissingNumbers.findDisappearedNumbersNoExtraSpace(input);
        System.out.println("Missing numbers:");
        arrayUtils.print(missingNumbers);
    }

    @Test(description = "485.01 Max consecutive ones",
            dataProvider = "MaxConsecutiveOnesTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Max consecutive ones"})
    public void findMaxConsecutiveOnes(int[] input) {
        P_485_MaxConsecutiveOnes p485MaxConsecutiveOnes = new P_485_MaxConsecutiveOnes();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int maxConsecutive = p485MaxConsecutiveOnes.findMaxConsecutiveOnes(input);
        System.out.printf("Max consecutive ones : %d", maxConsecutive);
    }

    @Test(description = "485.02 Max consecutive ones",
            dataProvider = "MaxConsecutiveOnesTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Max consecutive ones"})
    public void findMaxConsecutiveOnesUsingSlidingWindow(int[] input) {
        P_485_MaxConsecutiveOnes p485MaxConsecutiveOnes = new P_485_MaxConsecutiveOnes();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int maxConsecutive = p485MaxConsecutiveOnes.findMaxConsecutiveOnesUsingSlidingWindow(input);
        System.out.printf("Max consecutive ones : %d", maxConsecutive);
    }

    @Test(description = "905 Sort Array By Parity",
            dataProvider = "SortArrayByParityTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Sort Array By Parity"})
    public void sortArrayByParity(int[] input) {
        P_905_SortArrayByParity p905SortArrayByParity = new P_905_SortArrayByParity();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = p905SortArrayByParity.sortArrayByParity(input);
        System.out.print("Array after sorting by parity:");
        arrayUtils.print(input);
    }

    @Test(description = "941 Valid Mountain Array",
            dataProvider = "CheckMountainArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Valid Mountain Array"})
    public void checkIfValidMountainArray(int[] input) {
        P_941_ValidMountainArray p941ValidMountainArray = new P_941_ValidMountainArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        boolean isExist = p941ValidMountainArray.validMountainArray(input);
        System.out.printf("Valid mountain array? %b", isExist);
    }

    @Test(description = "977.01 Squares of a Sorted Array",
            dataProvider = "SortedSquaresTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Squares of a Sorted Array"})
    public void getSortedSquares(int[] input) {
        P_977_SquaresOfSortedArray p977SquaresOfSortedArray = new P_977_SquaresOfSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = p977SquaresOfSortedArray.sortedSquares(input);
        System.out.print("Array of Sorted Squares: :");
        arrayUtils.print(input);
    }

    @Test(description = "977.02 Squares of a Sorted Array",
            dataProvider = "SortedSquaresTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Squares of a Sorted Array"})
    public void getSortedSquaresOptimised(int[] input) {
        P_977_SquaresOfSortedArray pL03SquaresOfSortedArray = new P_977_SquaresOfSortedArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = pL03SquaresOfSortedArray.sortedSquaresOptimised(input);
        System.out.print("Array of Sorted Squares: :");
        arrayUtils.print(input);
    }

    @Test(description = "1051 Height Checker",
            dataProvider = "HeightCheckerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Height Checker"})
    public void heightChecker(int[] input) {
        P_1051_HeightChecker p1051HeightChecker = new P_1051_HeightChecker();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int misMatchedHeights = p1051HeightChecker.heightChecker(input);
        System.out.printf("Mismatched heights: %d", misMatchedHeights);
    }

    @Test(description = "1089 Duplicate Zeros",
            dataProvider = "DuplicateZerosTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Duplicate Zeros"})
    public void getDuplicateZeros(int[] input) {
        P_1089_DuplicateZeros p1089DuplicateZeros = new P_1089_DuplicateZeros();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        p1089DuplicateZeros.duplicateZerosUsingAdditionalArray(input);
        System.out.print("Array with duplicate zeros:");
        arrayUtils.print(input);
    }

    @Test(description = "1295 Find Numbers with Even Number of Digits",
            dataProvider = "getNumbersWithEvenNumberOfDigitsTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Numbers with Even Number of Digits"})
    public void findNumbersWithEvenNumberOfDigits(int[] input) {
        P_1295_NumbersWithEvenNumberOfDigits p1295NumbersWithEvenNumberOfDigits = new P_1295_NumbersWithEvenNumberOfDigits();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        int count = p1295NumbersWithEvenNumberOfDigits.findNumbers(input);
        System.out.printf("Numbers with Even Number of Digits : %d", count);
    }

    @Test(description = "1299 Replace Elements with Greatest Element on Right Side",
            dataProvider = "ReplaceWithGreatestTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Replace with Greatest"})
    public void replaceWithGreatest(int[] input) {
        P_1299_ReplaceElementsWithGreatestElementOnRightSide p1299ReplaceElementsWithGreatestElementOnRightSide = new P_1299_ReplaceElementsWithGreatestElementOnRightSide();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = p1299ReplaceElementsWithGreatestElementOnRightSide.replaceElementsOptimised(input);
        System.out.print("Array after replacements:");
        arrayUtils.print(input);
    }

    @Test(description = "1342.01 Number of Steps to Reduce a Number to Zero",
            dataProvider = "NumberOfStepsToReduceANumberToZeroTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Math", "Number of Steps to Reduce a Number to Zero"})
    public void numberOfStepsToReduceANumberToZero(int n) {
        P_1342_NumberOfStepsToReduceANumberToZero p1342NumberOfStepsToReduceANumberToZero = new P_1342_NumberOfStepsToReduceANumberToZero();
        System.out.printf("n : %d\n", n);
        int steps = p1342NumberOfStepsToReduceANumberToZero.numberOfSteps(n);
        System.out.printf("Steps to reduce number to 0: %d", steps);
    }

    @Test(description = "1342.02 Number of Steps to Reduce a Number to Zero",
            dataProvider = "NumberOfStepsToReduceANumberToZeroTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Math", "Number of Steps to Reduce a Number to Zero"})
    public void numberOfStepsToReduceANumberToZeroUsingBitwise(int n) {
        P_1342_NumberOfStepsToReduceANumberToZero p1342NumberOfStepsToReduceANumberToZero = new P_1342_NumberOfStepsToReduceANumberToZero();
        System.out.printf("n : %d\n", n);
        int steps = p1342NumberOfStepsToReduceANumberToZero.numberOfStepsUsingBitwise(n);
        System.out.printf("Steps to reduce number to 0: %d", steps);
    }

    @Test(description = "1346 Check if N and it's double exist in array",
            dataProvider = "CheckNAndDoubleTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Check N and Double"})
    public void checkNAndDoubleExist(int[] input) {
        P_1346_CheckIfNAndDoubleExistInArray p1346CheckIfNAndDoubleExistInArray = new P_1346_CheckIfNAndDoubleExistInArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        boolean isExist = p1346CheckIfNAndDoubleExistInArray.checkIfExistN2(input);
        System.out.printf("N and it's double exist in array? %b", isExist);
    }

    @Test(description = "1480 Running Sum of 1d Array",
            dataProvider = "RunningSumOfOneDArrayTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Running Sum of 1d Array"})
    public void runningSumOf1dArray(int[] input) {
        P_1480_RunningSumOfOneDArray p1480RunningSumOfOneDArray = new P_1480_RunningSumOfOneDArray();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : ");
        arrayUtils.print(input);
        input = p1480RunningSumOfOneDArray.runningSum(input);
        System.out.print("Running sum: ");
        arrayUtils.print(input);
    }

    @Test(description = "1672 Richest Customer Wealth",
            dataProvider = "RichestCustomerWealthTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Array", "Richest Customer Wealth"})
    public void richestCustomerWealth(int[][] input) {
        P_1672_RichestCustomerWealth p1672RichestCustomerWealth = new P_1672_RichestCustomerWealth();
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print("Input array : \n");
        arrayUtils.print(input);
        int richest = p1672RichestCustomerWealth.maximumWealth(input);
        System.out.printf("Richest : %d", richest);
    }

    @Test(description = "2235 Add two numbers",
            dataProvider = "AddTwoNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            groups = {"Math", "Add Two Numbers"})
    public void sumOfTwoNumbers(int a, int b) {
        P_2235_AddTwoNumbers p2235AddTwoNumbers = new P_2235_AddTwoNumbers();
        System.out.printf("a : %d, b : %d ", a, b);
        int sum = p2235AddTwoNumbers.sum(a, b);
        System.out.printf("Sum : %d", sum);
    }
}
