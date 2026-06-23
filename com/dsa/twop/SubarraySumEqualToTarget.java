package com.dsa.twop;

public class SubarraySumEqualToTarget {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        int target = 2;

        int left=0;
        int sum=0;
        int count=0;

        for (int right=0; right< arr.length; right++) {
            sum = sum + arr[right];
            while (sum > target && left <= right ) {
                sum = sum - arr[right];
                left++;
            }
            if (sum == target) {
                count++;
            }
        }
        System.out.println(count);

    }
}
