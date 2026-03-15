package com.dsa.rnb;

public class GetMaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,-5,2,8,2,1};
        System.out.println(getMaximum(arr, arr.length));
    }

    private static int getMaximum(int[] arr, int size) {
        //exit condition
        if(size == 1)
            return arr[0];

        //current position
        int last = arr[size-1];

        //rest of the answer
        int answer = getMaximum(arr, size -1);
        return Math.max(last, answer);
    }
}
