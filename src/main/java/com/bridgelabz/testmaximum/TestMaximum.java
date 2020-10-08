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
    /*Find Maximum String from given Strings*/
    public String findMaximumString(String firstWord, String secondWord, String thirdWord) {
        String maximum = firstWord;
        if(secondWord.compareTo(maximum)>0)
            maximum = secondWord;
        if(thirdWord.compareTo(maximum)>0)
            maximum = thirdWord;
        return maximum;
    }
    /*Generic Method to find Maximum for All Objects*/
    public <T extends Comparable<T>> T findMaximum(T FirstParameter,T SecondParameter,T ThirdParameter){
        T maximum = FirstParameter;
        if(SecondParameter.compareTo(maximum)>0)
            maximum = SecondParameter;
        if(ThirdParameter.compareTo(maximum)>0)
            maximum = ThirdParameter;
        return maximum;
    }
}
