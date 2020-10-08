package com.bridgelabz.testmaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum<T extends Comparable<T>> {
    T firstParameter, secondParameter, thirdParameter;

    public TestMaximum(T firstParameter, T secondParameter, T thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public TestMaximum() {
    }

    /*Welcome Message*/
    public boolean printWelcomeMessage() {
        System.out.println("Welcome to Test maximum Number Program");
        return true;
    }

    /*Find Maximum Integer from given Integers*/
    public int findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximum = firstNumber;
        if (secondNumber.compareTo(maximum) > 0)
            maximum = secondNumber;
        if (thirdNumber.compareTo(maximum) > 0)
            maximum = thirdNumber;
        return maximum;
    }

    /*Find Maximum Float from given Float Numbers*/
    public float findMaximumFloatNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximum = firstNumber;
        if (secondNumber.compareTo(maximum) > 0)
            maximum = secondNumber;
        if (thirdNumber.compareTo(maximum) > 0)
            maximum = thirdNumber;
        return maximum;
    }

    /*Find Maximum String from given Strings*/
    public String findMaximumString(String firstWord, String secondWord, String thirdWord) {
        String maximum = firstWord;
        if (secondWord.compareTo(maximum) > 0)
            maximum = secondWord;
        if (thirdWord.compareTo(maximum) > 0)
            maximum = thirdWord;
        return maximum;
    }

    /*Find Maximum Using generics by Passing variable in Constructor*/
    public T testMaximum() {
        return testMaximum(firstParameter, secondParameter, thirdParameter);
    }

    public static <T extends Comparable<T>> T testMaximum(T firstArg, T secondArg, T thirdArg) {
        T maximum = firstArg;
        if (secondArg.compareTo(maximum) > 0)
            maximum = secondArg;
        if (thirdArg.compareTo(maximum) > 0)
            maximum = thirdArg;
        return maximum;
    }

    /*Find Maximum from more than three variable*/
    public static <T extends Comparable<T>> T findMaximumForMoreThanThree(T... args) {
        List<T> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
