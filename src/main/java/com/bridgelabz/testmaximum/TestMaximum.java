package com.bridgelabz.testmaximum;

public class TestMaximum {
    /*Welcome Message*/
    public boolean printWelcomeMessage() {
        System.out.println("Welcome to Test maximum Number Program");
        return true;
    }
    /*Find Maximum Integer from given Integers*/
    public int findMaximumNumber(Integer firstNumber,Integer secondNumber, Integer thirdNumber){
        Integer maximum = firstNumber;
        if(secondNumber.compareTo(maximum)>0)
            maximum = secondNumber;
        if(thirdNumber.compareTo(maximum)>0)
            maximum = thirdNumber;
        return maximum;
    }
    /*Find Maximum Float from given Float Numbers*/
    public float findMaximumFloatNumber(Float firstNumber,Float secondNumber, Float thirdNumber){
        Float maximum = firstNumber;
        if(secondNumber.compareTo(maximum)>0)
            maximum = secondNumber;
        if(thirdNumber.compareTo(maximum)>0)
            maximum = thirdNumber;
        return maximum;
    }
}
