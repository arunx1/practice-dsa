package com.github.arungahlawat.learning.tests.ps.dataProviders;

import org.testng.annotations.DataProvider;

public class DataStructuresAndAlgorithmsMadeEasyDataProviders {
    @DataProvider(name = "OnePositiveNumberTestData")
    public Object[] getOnePositiveNumberTestData() {
        return new Object[]{
                0,
                1,
                2,
                3,
                4,
                5
        };
    }

    @DataProvider(name = "TwoPositiveNumbersTestData")
    public Object[] getTwoPositiveNumbersTestData() {
        return new Object[][]{
                {0,1},
                {1,0},
                {0,2},
                {2,0},
                {1,2},
                {2,1},
                {2,2},
        };
    }
}
