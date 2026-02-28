package com.dsa.twop;

import java.util.Arrays;

// Remove duplicates from given sorted array
// using two pointer
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4};

        int i=0;
        int j=i+1;
        int noOfUnique = 1;
        System.out.println("Before : "+ Arrays.toString(arr));
        while (j < arr.length) {
            // check if current element (j) is equal to last element (i), if yes - move current position to next
            // if not, move i to new position++ and swap
            if (arr[j] != arr[i]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                noOfUnique++;
            }
            // in either case, move j to next position
            j++;
        }
        System.out.println("After : "+ Arrays.toString(arr));
        System.out.println("No Of Unique items: "+noOfUnique);
    }
}
