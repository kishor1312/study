package com.dsa.twop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Square of sorted array containing negative numbers
// two pointer
public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -2, -1, 1, 3, 5}; //mix of pos and negatives
        // int[] arr = new int[]{-6, -4, -3, -2}; //all negatives
        // int[] arr = new int[]{1, 3, 5, 7}; //all positives

        // filter negatives into negative list
        // positives into positive list
        List<Integer> negList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();
        for (int i=0; i< arr.length; i++) {
            if (arr[i] < 0) {
                negList.add(arr[i] * arr[i]);
            } else {
                posList.add(arr[i] * arr[i]);
            }
        }
        // if negative list is empty, all inputs are positive
        // print sorted squares
        if(negList.isEmpty()) {
            posList.forEach(System.out::println);
        }  else {
            Collections.reverse(negList);
            // if positive list is empty, all inputs are negative, print sorted squares
            if(posList.isEmpty()) {
                negList.forEach(System.out::println);
            } else {
                // else go for two pointer approach, merge two sorted approach
                int i=0;
                int j=0;
                List<Integer> outputList = new ArrayList<>();
                while(i< posList.size() && j< negList.size()) {
                    if(posList.get(i) < (negList.get(j))) {
                        outputList.add(posList.get(i++));
                    } else {
                        outputList.add(negList.get(j++));
                    }
                }
                while(i<posList.size()) {
                    outputList.add(posList.get(i++));
                } while(j<negList.size()) {
                    outputList.add(negList.get(j++));
                }
                outputList.forEach(System.out::println);
            }
        }
    }
}
