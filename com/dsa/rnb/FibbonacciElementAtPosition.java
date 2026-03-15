package com.dsa.rnb;

import java.util.Scanner;

public class FibbonacciElementAtPosition {
    static int totalSize;
    public static void main(String[] args) {
        totalSize = new Scanner(System.in).nextInt();
        System.out.println(getNextElement(totalSize-1));
    }

    private static int getNextElement(int n) {
        if (n ==0)
            return 0;
        if (n == 1)
            return 1;

        int last = getNextElement(n-1);
        int secondLast = getNextElement(n-2);
        return last + secondLast;
    }
}
