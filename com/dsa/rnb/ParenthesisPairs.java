package com.dsa.rnb;

import java.util.ArrayList;

public class ParenthesisPairs {
    public static void main(String[] args) {
        int totalParenthesisPairs = 3;

        getAllWelformedCombinations(totalParenthesisPairs, 0, 0, new StringBuilder(), new ArrayList<String>());
    }

    private static void getAllWelformedCombinations(int totalParenthesisPairs, int open, int close, StringBuilder temp, ArrayList<String> objects) {
        if(open == totalParenthesisPairs && close == totalParenthesisPairs){
            objects.add(temp.toString());
            System.out.println(temp.toString());
            return;
        }

        if(open < totalParenthesisPairs) {
            temp.append("(");
            getAllWelformedCombinations(totalParenthesisPairs, open + 1, close, temp, objects);
            temp.deleteCharAt(temp.toString().length()-1);
        }

        if(close < open) {
            temp.append(")");
            getAllWelformedCombinations(totalParenthesisPairs, open, close + 1, temp, objects);
            temp.deleteCharAt(temp.toString().length()-1);
        }
    }
}
