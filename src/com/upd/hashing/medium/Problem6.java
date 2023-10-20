package com.upd.hashing.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/
public class Problem6 {
    public static void main(String[] args) {
        List<List<String>>list = groupAnagrams(new String[] {"eat","tea","tan","ate","bat","nat"});
//        for(int i = 0; i<list.size(); i++) {
//            for(int j = 0; j<list.get(i).size(); i++) {
//                System.out.println(list.get(i).get(j));
//            }
//        }
        System.out.println(list);

    }

    public static List<List<String>> groupAnagrams(String arr[]) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();

        for(String s: arr) {
            int[] hash = new int[26];
            for(char c:s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key,k->new ArrayList<>());
            map.get(key).add(s);
        }
        list.addAll(map.values());
        return list;
    }


}
