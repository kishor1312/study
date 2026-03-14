package com.dsa.kdn;

// find max absolute sum of a subarray from the given array
// approach:
    //find maxSum
    //find minSum
    //get absolute of minSum & compare against the maxSum
    //return max of comparison

public class MaxAbsoluteSum {
    public static void main(String[] args) {
        int[] input = new int[]{2, -5, 1, -4, 3, 2};
        int lastMaxSum = input[0]; //2
        int lastMinSum = input[0]; //2
        int maxSum = input[0]; //min_int_value
        int minSum = input[0]; //max_int_value
        for(int i=1; i< input.length; i++) {
            // negative number, calculate minSum
            lastMaxSum = Math.max(lastMaxSum + input[i], input[i]); //-3, 1, -3
            lastMinSum = Math.min(lastMinSum + input[i], input[i]); //-5, -4, -8
            maxSum = Math.max(maxSum, lastMaxSum); //2, 2, 1
            minSum = Math.min(minSum, lastMinSum); //-5, -5, -8
        }

        System.out.println(Math.max(Math.abs(maxSum), Math.abs(minSum)));
    }
}
