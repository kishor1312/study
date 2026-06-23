package com.misc;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = new String[]{"act", "god", "cat", "dog", "ksm", "tac"};
        Map<String, String> map = new IdentityHashMap<>();
        for(String s: arr) {
            char[] everyStringArr = s.toCharArray();
            Arrays.sort(everyStringArr);
            String temp = new String(everyStringArr);
            map.put(temp, s);
        }
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).toList());
    }
}
