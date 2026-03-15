package com.dsa.rnb;

import java.util.ArrayList;
import java.util.List;

public class PrintArraySubsets {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        List<Integer> list = new ArrayList<>();
        printSubsets(arr, arr.length, 0, list);
    }

    private static void printSubsets(int[] arr, int length, int i, List<Integer> list) {
        if (i == length) {
            System.out.println("printSubsets : "+list);
            return;
        }

        // exclude current index position
        System.out.println("excluding current value at index: "+i);
        printSubsets(arr, length, i + 1, list);

        // include current index position
        System.out.println("including current value at index: "+i);
        list.add(arr[i]);
        printSubsets(arr, length, i + 1, list);
        list.remove(list.size()-1);
    }
}
