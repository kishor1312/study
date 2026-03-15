package com.dsa.rec;

import java.util.Arrays;
import java.util.Scanner;

public class FibbonacciSeriesOfGivenSize {
    static int totalSize;
    public static void main(String[] args) {
        totalSize = new Scanner(System.in).nextInt();

        int[] arr = new int[totalSize];
        arr[0] = 0;
        arr[1] = 1;
        getNextElement(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void getNextElement(int[] arr, int index) {
        if(index < totalSize){
            arr[index] = arr[index-1] + arr[index-2];
            getNextElement(arr, ++index);
        }
    }
}
