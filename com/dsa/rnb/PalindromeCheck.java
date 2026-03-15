package com.dsa.rnb;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(checkIfPalindrome(inputStr, 0, inputStr.length() - 1));
    }

    private static boolean checkIfPalindrome(String inputStr, int left, int right) {
        int length = right - left + 1;

        //base case
        if (length == 0 || length == 1)
            return true;

        // exit condition
        if(inputStr.charAt(left) != inputStr.charAt(right))
            return false;

        // logic to continue and leave output to recursion
        return checkIfPalindrome(inputStr, left + 1, right - 1);
    }
}
