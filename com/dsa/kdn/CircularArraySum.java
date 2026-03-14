package com.dsa.kdn;

public class CircularArraySum {
    public static void main(String[] args) {
        int[] input = new  int[]{5, -2, -3, -6, 3};
        int lastMaxSum = input[0];
        int lastMinSum = input[0];
        int maxSum = input[0];
        int minSum = input[0];
        for(int i=1; i< input.length; i++) {
            // negative number, calculate minSum
            lastMaxSum = Math.max(lastMaxSum + input[i], input[i]);
            lastMinSum = Math.min(lastMinSum + input[i], input[i]);
            maxSum = Math.max(maxSum, lastMaxSum);
            minSum = Math.min(minSum, lastMinSum);

            // additional condition to link end of array to start of array
            if(i == input.length-1) {
                lastMaxSum = Math.max(lastMaxSum + input[0], input[0]);
                lastMinSum = Math.min(lastMinSum + input[0], input[0]);
                maxSum = Math.max(maxSum, lastMaxSum);
                minSum = Math.min(minSum, lastMinSum);
            }
        }

        System.out.println(maxSum);
        System.out.println(minSum);
    }
}
