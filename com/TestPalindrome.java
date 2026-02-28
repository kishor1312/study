package com;

import java.util.ArrayList;
import java.util.List;

public class TestPalindrome {
    public static void main(String[] args) {
        String inputStr = "bananas";
        List<String> palindromes = new ArrayList<>();

        int i = 0;
        int j = i + 1;
        while (i < j && j <= inputStr.length()) {
            String subStr = inputStr.substring(i, j);

            if (j == inputStr.length()) {
                i++;
                j = i + 1;
            }
            if (isThisPalindrome(subStr)) {
                palindromes.add(subStr);
            }
            j++;
        }
        System.out.println("checking list: "+palindromes.size());
        palindromes.forEach(System.out :: println);
    }

    private static boolean isThisPalindrome(String substring) {
        // return substring.equals((new StringBuffer(substring)).reverse().toString());
        int left = 0;
        int right = substring.length() - 1;
        while (left < right && substring.charAt(left) == substring.charAt(right)) {
            left++;
            right--;
            if(right <= left) {
                return true;
            }
        }
        return false;
    }
}
