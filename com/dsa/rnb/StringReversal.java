package com.dsa.rnb;

import java.util.Scanner;

public class StringReversal {
    static String inputStr;
    public static void main(String[] args) {
        inputStr = new Scanner(System.in).nextLine();

        //copy string in charArray
        char[] arr = inputStr.toCharArray();

        //pass initial arguments
        reverseArr(arr, 0, arr.length -1);

        //print final result
        System.out.println("reverse of given string is : "+String.copyValueOf(arr));
    }

    private static void reverseArr(char[] arr, int left, int right) {
        //exit condition
        if(left >=right)
            return;

        // logic
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        //recursion
        reverseArr(arr, ++left, --right);
    }
}
