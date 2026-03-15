package com.dsa.rnb;

import java.util.Scanner;

public class StringReversal {
    static String inputStr;
    public static void main(String[] args) {
        inputStr = new Scanner(System.in).nextLine();

        //pass initial arguments
        String reversedStr = reverseStr(inputStr, 0, inputStr.length()-1);

        //print final result
        System.out.println("reverse of given string is : "+reversedStr);
    }

    private static String reverseStr(String str, int left, int right) {
        // base cases
        int length = right - left + 1;
        if (length <= 0) {
            return "";
        }
        if (length == 1) {
            return String.valueOf(str.charAt(left));
        }

        char charAtLeft = str.charAt(left);
        char charAtRight = str.charAt(right);
        return new StringBuilder(String.valueOf(charAtRight))
                .append(reverseStr(str, left + 1, right - 1))
                .append(String.valueOf(charAtLeft))
                .toString();
    }
}
