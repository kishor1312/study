package com.twop;

// find two numbers from given array having sum equal to given target sum
// using two pointer
public class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 5, 7};
        int targetSum = 12;

        for (int i=0, j=input.length-1; j>i;) {
            int sum = input[i] + input[j];
            if (sum < targetSum) {
                i++;
            } else if (sum > targetSum) {
                j--;
            } else if (sum == targetSum){
                System.out.println(input[i] + "_" + input[j]);
                break;
            }
        }
    }
}
