package com.dsa.psum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualtoK {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 1};
        int k = 3;

        System.out.println(getSubarraySumK(arr, k));
    }

    private static int getSubarraySumK(int[] arr, int k) {
        int sum=0;
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num: arr) {
            sum += num;
            System.out.println(sum+"_"+k);
            if(map.containsKey(sum-k)) {
                System.out.println(map);
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
