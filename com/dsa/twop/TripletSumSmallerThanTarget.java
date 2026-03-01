package com.dsa.twop;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TripletSumSmallerThanTarget {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 1, 3};
        int target = 2;
        //start
        System.out.println("Before Sorting : "+ Arrays.toString(nums));
        Arrays.sort(nums); //TC: nLog(n)
        System.out.println("After Sorting : "+Arrays.toString(nums));
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int count=-0;
        for(int i =0; i< nums.length-2; i++) { //TC: n-2
            int left=i+1;
            int right=nums.length-1;

            while(left < right){ //TC: n
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum < target) {
                    count += right-left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
