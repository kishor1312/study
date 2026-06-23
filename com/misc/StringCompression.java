package com.misc;

public class StringCompression {
    public static void main(String[] args) {
        String str1 = "aabcccccaaa";
        StringBuilder sb1 = new StringBuilder("");
        int i=0;
        int j=0;
        int charCounter = 0;
        while(i<=j && j<str1.length()) {
            if(i==j) {
                sb1.append(str1.charAt(i));
                charCounter++;
                j++;
            } else if(str1.charAt(i) == str1.charAt(j)) {
                charCounter++;
                j++;
            } else {
                sb1.append(charCounter);
                i = j;
                charCounter = 0;
            }
        }
        System.out.println(sb1.append(charCounter).toString());
    }
}
