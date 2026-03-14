package com.dsa.kdn;

// find max absolute sum of a subarray from the given array
// approach:
    //find maxSum
    //find minSum
    //get absolute of minSum & compare against the maxSum
    //return max of comparison

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] input = new int[]{2, -5, 1, -4, 3, 2};
        int lastMaxProduct = input[0]; //2
        int lastMinProduct = input[0]; //2
        int maxProduct = input[0]; //2
        for(int i=1; i< input.length; i++) {
            int p1 = lastMaxProduct * input[i]; //-10, -5, -4, 120, 240
            int p2 = lastMinProduct * input[i]; //-10, -10, 40, -12, -24
            int p3 = input[i]; //-5, 1, -4, 3, 2

            lastMaxProduct = Math.max(p3, Math.max(p1, p2)); //-5, 1, 40, 120, 240
            lastMinProduct = Math.min(p3, Math.min(p1, p2)); //-10,-10, -4, -12, -24
            maxProduct = Math.max(maxProduct, Math.max(lastMaxProduct, lastMinProduct)); //40, 120, 240
        }

        System.out.println(maxProduct);
    }
}
