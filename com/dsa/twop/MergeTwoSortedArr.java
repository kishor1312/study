package com.dsa.twop;

import java.util.Arrays;

// Merge two sorted arrays using two pointer
public class MergeTwoSortedArr {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4};
        int[] arr2 = new int[]{-5, -4, -3};

        int i = 0;
        int j = 0;
        int[] outputArr = new int[arr1.length + arr2.length];
        int k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                outputArr[k] = arr1[i];
                i++;
                k++;
            } else if (arr2[j] < arr1[i]) {
                outputArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length) {
            outputArr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
            outputArr[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(outputArr));
    }
}
