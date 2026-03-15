package com.dsa.rec;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        int factorial = getFactorialOf(6);
        System.out.println(factorial);
    }

    private static int getFactorialOf(int n){
        if(n > 0)
            return n * getFactorialOf(n-1);
        else
            return 1;
    }
}
