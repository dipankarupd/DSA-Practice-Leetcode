package com.upd.hashing.medium;

import java.util.HashSet;

// https://leetcode.com/problems/longest-consecutive-sequence/
public class Problem5 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {}));
    }

    static int longestConsecutive(int[] arr) {

        if (arr.length == 0) return 0;
        int ans = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int val :
                arr) {
            set.add(val);
        }
        for (int val:arr) {
            int count = 1;
            if(!set.contains(val - 1)) {

                while(set.contains(val+1)) {
                    count++;
                    val++;
                }
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
