package com.dsa.twop;

import java.util.*;

public class TripletSumCloseToTarget {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int targetSumOfAllThree = 1;
        //start
        System.out.println("Before Sorting : "+ Arrays.toString(nums));
        Arrays.sort(nums); //TC: nLog(n)
        System.out.println("After Sorting : "+Arrays.toString(nums));
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int maxDiff = Integer.MAX_VALUE;
        for(int i =0; i< nums.length-2; i++) { //TC: n-2
            if (i>0 && nums[i] == nums[i-1]) {
                break;
            }
            int left=i+1;
            int right=nums.length-1;
            int targetSumOfPairs = Math.abs(targetSumOfAllThree - nums[i]);
            while(left < right){ //TC: n
                int sumOfLeftRight = nums[left] + nums[right];
                int currentGap = Math.abs(targetSumOfPairs-sumOfLeftRight);
                if (currentGap > maxDiff) {
                    left++;
                    break;
                } else {
                    map.remove(maxDiff);
                    if (currentGap == 0) {
                        map.put(currentGap, List.of(nums[i], nums[left++], nums[right--]));
                        maxDiff = 0;
                        while(left<right && nums[left] == nums[left-1]) {
                            left++;
                        }
                        while(right>left && nums[right] == nums[right+1]) {
                            right--;
                        }
                    } else if (currentGap < maxDiff){
                        map.put(currentGap, List.of(nums[i], nums[left], nums[right]));
                        maxDiff = currentGap;
                        if (sumOfLeftRight < targetSumOfPairs) {
                            left++;
                        } else if (sumOfLeftRight > targetSumOfPairs) {
                            right--;
                        }
                    }
                }
            }
        }
        map.forEach((key, integers) -> System.out.println(key+"--"+integers));
    }
}
