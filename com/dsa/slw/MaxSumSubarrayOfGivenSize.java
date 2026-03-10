package com.dsa.slw;

/*
Given an array of integers arr[]  and a number k.
Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.
 */
public class MaxSumSubarrayOfGivenSize {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int subArrayLen = 4;
        int maxSum1 =0;

        //approach1
        for (int i = 0; i <= arr.length - subArrayLen; i++) {
            int currentSum = arr[i] + arr[i+1] + arr[i+2] + arr[i+3];
            if (currentSum > maxSum1) {
                maxSum1 = currentSum;
            }
        }
        System.out.println(maxSum1);


        //approach2
        int lastSum = arr[0]+arr[1]+arr[2]+arr[3];
        int i = 1;
        int j = subArrayLen;
        int maxSum2 = lastSum;
        while(i < arr.length-subArrayLen && j<arr.length){
            lastSum += arr[j] - arr[i-1];
            if (lastSum > maxSum2) {
                maxSum2 = lastSum;
            }
            i++;
            j++;
        }
        System.out.println(maxSum2);

    }
}
