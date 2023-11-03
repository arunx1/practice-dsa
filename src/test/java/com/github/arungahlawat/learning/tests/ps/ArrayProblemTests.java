package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.ps.ArrayProblems;
import org.testng.annotations.Test;

import java.util.List;

public class ArrayProblemTests {
    @Test(description = "Verify moving all 0's to end of array")
    public void verifyMovingAll0ToEnd() {
        ArrayProblems arrayProblems = new ArrayProblems(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 1, 9, 2, 3, 4);
        arrayProblems.moveAllKsToEndOfArray(1);
        arrayProblems.print(arrayProblems.data);
    }

    @Test(description = "Verify finding two sum")
    public void verifyFindingTwoSum() {
        ArrayProblems arrayProblems = new ArrayProblems(4, 1, 9, 1, 3, 2, 2, 1);
        int target = 12;
        int[] indices = arrayProblems.findTwoSum(target);
        System.out.printf("Two sum indices for %d are %d, %d", target, indices[0], indices[1]);
    }

    @Test(description = "Verify finding median of 2 sorted arrays")
    public void verifyFindingMedianOfTwoSortedArrays() {
        ArrayProblems arrayProblems = new ArrayProblems(1, 4, 9, 11, 13, 21, 22, 31);
        double median = arrayProblems.findMedianOfTwoSortedArrays(4, 9, 15, 19, 24);
        System.out.printf("Median is %2f", median);
    }

    @Test(description = "Verify merging two sorted arrays")
    public void verifyMergingTwoSortedArrays() {
        ArrayProblems arrayProblems = new ArrayProblems(1, 4, 9, 11, 13, 21, 22, 31);
        int[] mergedArray = arrayProblems.mergeTwoSortedArrays(4, 9, 15, 19, 24);
        arrayProblems.print(mergedArray);
    }

    @Test(description = "Verify finding container with max water")
    public void verifyFindingContainerWithMaxWater() {
        ArrayProblems arrayProblems = new ArrayProblems(4, 1, 9, 1, 3, 2, 2, 1);
        int containerArea = arrayProblems.findContainerWithMostWater();
        System.out.println(containerArea);
    }

    @Test(description = "Verify finding three sum")
    public void verifyFindingThreeSum() {
        ArrayProblems arrayProblems = new ArrayProblems(-2,0,1,1,2);
        int target = 0;
        List<List<Integer>> indices = arrayProblems.findThreeSum(target);
        System.out.printf("Three sum indices for %d are : \n", target);
        arrayProblems.printListOfList(indices);
    }

    @Test(description = "Verify rotating a matrix 90 degrees clockwise")
    public void verifyRotatingMatrixClockWise() {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[][] matrix = {{4,7,9,2},{5,11,8,17},{6,13,21,18},{27,29,15,10}};
        arrayProblems.rotateMatrixClockwise(matrix);
        System.out.println("Rotated matrix :");
        arrayProblems.print(matrix);
    }

    @Test(description = "Verify rotating a matrix 180 degrees clockwise")
    public void verifyRotatingMatrixClockWise180() {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[][] matrix = {{4,7,9,2},{5,11,8,17},{6,13,21,18},{27,29,15,10}};
        arrayProblems.rotateMatrixClockwise(matrix);
        System.out.println("Rotated matrix :");
        arrayProblems.print(matrix);
    }
}
