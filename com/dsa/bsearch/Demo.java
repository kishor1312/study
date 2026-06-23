package com.dsa.bsearch;

public class Demo {
    public static void main(String[] args) {
        int[] inputArr = new int[]{2,5,6,11,23,39,41,45,49};
        int searchFor = 49;
        int left=0;
        int right=inputArr.length-1;

        int iterationCounter=1;
        while(left<=right){
            int mid = (left + right)/2;
            if(inputArr[mid] == searchFor){
                System.out.println("element found at pos : "+mid+" in "+iterationCounter+" iterations");
                break;
            } else if(inputArr[mid] < searchFor){
                left=mid+1;
            } else if(inputArr[mid] > searchFor){
                right=mid-1;
            }
            iterationCounter++;
        }
    }
}
