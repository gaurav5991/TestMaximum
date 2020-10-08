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
    /*Test Cases for Strings*/
    @Test
    public void givenThreeString_ifMaxIsFirstString_shouldReturnFirstString() {
        String maximumString = testMaximum.findMaximumString("Peach", "Apple", "Banana");
        System.out.println("The Maximum String: " + maximumString);
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenThreeStrings_ifMaxIsSecondString_shouldReturnSecondString() {
        String maximumString = testMaximum.findMaximumString("Apple", "Peach", "Banana");
        System.out.println("The Maximum String: " + maximumString);
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenThreeString_ifMaxIsThirdString_shouldReturnThirdString() {
        String maximumString = testMaximum.findMaximumString("Apple", "Banana", "Peach");
        System.out.println("The Maximum String: " + maximumString);
        Assert.assertEquals("Peach", maximumString);
    }
    /*Test Cases for Integer Numbers*/
    @Test
    public void givenThreeIntegers_ifMaxIsFirstInteger_shouldReturnFirstNumberUsingGenerics() {
        TestMaximum<Integer> integerTestMaximum = new TestMaximum<>(100, 50, 80);
        Integer maximumNumber = integerTestMaximum.testMaximum();
        Assert.assertSame(100,maximumNumber);
    }

    @Test
    public void givenThreeIntegers_ifMaxIsSecondInteger_shouldReturnSecondNumberUsingGenerics() {
        TestMaximum<Integer> integerTestMaximum = new TestMaximum<>(30, 80, 50);
        Integer maximumNumber = integerTestMaximum.testMaximum();
        Assert.assertSame(80,maximumNumber);
    }

    @Test
    public void givenThreeIntegers_ifMaxIsThirdInteger_shouldReturnThirdNumberUsingGenerics() {
        TestMaximum<Integer> integerTestMaximum = new TestMaximum<>(30, 40, 50);
        Integer maximumNumber =integerTestMaximum.testMaximum();
        Assert.assertSame(50,maximumNumber);
    }
    /*Test Cases for Float Numbers*/
    @Test
    public void givenThreeFloatNumbers_ifMaxIsFirstNumber_shouldReturnFirstNumberUsingGenerics() {
        TestMaximum<Float> floatTestMaximum = new TestMaximum<>(9.5F, 5.5F, 2.5F);
        Float maximumNumber = floatTestMaximum.testMaximum();
        Assert.assertEquals(9.5F, maximumNumber, 0.0F);
    }

    @Test
    public void givenThreeFloatNumbers_ifMaxIsSecondNumber_shouldReturnSecondNumberUsingGenerics() {
        TestMaximum<Float> floatTestMaximum = new TestMaximum<>(2.5F, 9.5F, 5.5F);
        Float maximumNumber = floatTestMaximum.testMaximum();
        Assert.assertEquals(9.5F, maximumNumber, 0.0F);
    }

    @Test
    public void givenThreeFloatNumbers_ifMaxIsThirdNumber_shouldReturnThirdNumberUsingGenerics() {
        TestMaximum<Float> floatTestMaximum = new TestMaximum<>(2.5F, 5.5F, 9.5F);
        Float maximumNumber = floatTestMaximum.testMaximum();
        Assert.assertEquals(9.5F, maximumNumber, 0.0F);
    }
    /*Test Cases for Strings*/
    @Test
    public void givenThreeString_ifMaxIsFirstString_shouldReturnFirstStringUsingGenerics() {
        TestMaximum<String> stringTestMaximum = new TestMaximum<>("Peach", "Apple", "Banana");
        String  maximumString = stringTestMaximum.testMaximum();
        Assert.assertEquals("Peach",maximumString);
    }

    @Test
    public void givenThreeStrings_ifMaxIsSecondString_shouldReturnSecondStringUsingGenerics() {
        TestMaximum<String> stringTestMaximum = new TestMaximum<>("Apple", "Peach", "Banana");
        String  maximumString = stringTestMaximum.testMaximum();
        Assert.assertEquals("Peach",maximumString);
    }

    @Test
    public void givenThreeString_ifMaxIsThirdString_shouldReturnThirdStringUsingGenerics() {
        TestMaximum<String> stringTestMaximum = new TestMaximum<>("Apple", "Banana", "Peach");
        String maximumString = stringTestMaximum.testMaximum();
        Assert.assertEquals("Peach", maximumString);
    }

    /*Test Case to Find Maximum Using generics by Passing variable in Constructor*/
    @Test
    public void givenThreeIntegers_ifMaxIsFirstInteger_shouldReturnFirstNumberUsing() {
        Integer maximumNumber = TestMaximum.findMaximumForMoreThanThree(10,40,20,45,10,5,42,55,100);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertSame(100,maximumNumber);
    }
    @Test
    public void givenThreeFloatNumbers_ifMaxIsThirdNumber_shouldReturnThirdNumberUsing() {
        Float maximumNumber = TestMaximum.findMaximumForMoreThanThree(2.2f,4.5f,8.2f,1.4f,5.9f,2.5f,7.7f,8.5f,4.3f);
        System.out.println("The Maximum Number: " + maximumNumber);
        Assert.assertEquals(8.5F, maximumNumber, 0.0F);
    }
    @Test
    public void givenThreeString_ifMaxIsThirdString_shouldReturnThirdStringUsing() {
        String maximumString = TestMaximum.findMaximumForMoreThanThree("Apple","Orange","Banana","Guava","Grapes","Peach","StrawBerry");
        System.out.println("The Maximum String: " + maximumString);
        Assert.assertEquals("StrawBerry", maximumString);
    }
}
