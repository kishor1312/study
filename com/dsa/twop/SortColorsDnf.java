package com.dsa.twop;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
 */
public class SortColorsDnf {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0) {
                swapValues(nums, mid, low);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swapValues(nums, mid, low);
                high--;
            }
        }
    }

    private static void swapValues(int[] nums, int mid, int low) {
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
    }
}
