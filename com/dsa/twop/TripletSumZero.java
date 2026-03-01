package com.dsa.twop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,4};

        //start
        System.out.println("Before Sorting : "+Arrays.toString(nums));
        Arrays.sort(nums); //TC: nLog(n)
        System.out.println("After Sorting : "+Arrays.toString(nums));
        List<String> triplets = new ArrayList<String>();
        for(int i =0; i< nums.length-2; i++) { //TC: n-2
            if (i>0 && nums[i] == nums[i-1]) {
                break;
            }
            int left=i+1;
            int right=nums.length-1;
            int targetSumOfPairs = -1 * nums[i];
            while(left < right){ //TC: n
                int sumOfLeftRight = nums[left] + nums[right];
                if (sumOfLeftRight == targetSumOfPairs) {
                    triplets.add(nums[i]+"_"+nums[left++]+"_"+nums[right--]);
                    while(left<right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(right>left && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if (sumOfLeftRight < targetSumOfPairs) {
                    left++;
                } else if (sumOfLeftRight > targetSumOfPairs) {
                    right--;
                }
            }
        }
        triplets.forEach(System.out::println);
    }
}
