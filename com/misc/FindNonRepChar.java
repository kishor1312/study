package com.misc;

import java.util.*;

public class FindNonRepChar {
    public static void main(String[] args) {
        String str = "carnrack";
        /*Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.remove(str.charAt(i));
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        System.out.println(map.keySet().stream().findFirst().get());*/

        int i=0;
        int j=1;
        while(i<j && j < str.length()) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j=i+1;
            } else {
                j++;
            }
        }
        System.out.println(str.charAt(i));
    }
}
