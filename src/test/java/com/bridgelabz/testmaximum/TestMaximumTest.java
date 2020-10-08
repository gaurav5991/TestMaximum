package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaximumTest {
    TestMaximum testMaximum = new TestMaximum();

    @BeforeClass
    public static void beforeClass() {
        TestMaximum testMaximum = new TestMaximum();
        boolean welcomeMessage = testMaximum.printWelcomeMessage();
        Assert.assertTrue(welcomeMessage);
    }
    /*Test Cases for Integer Numbers*/
    @Test
    public void givenThreeIntegers_ifMaxIsFirstInteger_shouldReturnFirstNumber() {
        int maximumNumber = testMaximum.findMaximumNumber(60, 30, 30);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(60, maximumNumber);
    }

    @Test
    public void givenThreeIntegers_ifMaxIsSecondInteger_shouldReturnSecondNumber() {
        int maximumNumber = testMaximum.findMaximumNumber(30, 80, 30);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(80, maximumNumber);
    }

    @Test
    public void givenThreeIntegers_ifMaxIsThirdInteger_shouldReturnThirdNumber() {
        int maximumNumber = testMaximum.findMaximumNumber(30, 10, 70);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(70, maximumNumber);
    }
    /*Test Cases for Float Numbers*/
    @Test
    public void givenThreeFloatNumbers_ifMaxIsFirstNumber_shouldReturnFirstNumber() {
        float maximumNumber = testMaximum.findMaximumFloatNumber(9.5F, 5.5F, 2.5F);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(9.5f, maximumNumber, 0.0f);
    }

    @Test
    public void givenThreeFloatNumbers_ifMaxIsSecondNumber_shouldReturnSecondNumber() {
        float maximumNumber = testMaximum.findMaximumFloatNumber(2.5F, 9.5F, 5.5F);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(9.5f, maximumNumber, 0.0f);
    }

    @Test
    public void givenThreeFloatNumbers_ifMaxIsThirdNumber_shouldReturnThirdNumber() {
        float maximumNumber = testMaximum.findMaximumFloatNumber(2.5F, 5.5F, 9.5F);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(9.5f, maximumNumber, 0.0f);
    }
}
