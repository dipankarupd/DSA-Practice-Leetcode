package com.upd.greedy.medium;

import java.util.Arrays;
import java.util.Collections;

// https://leetcode.com/problems/largest-number/description/
public class Problem5 {
    public static void main(String[] args) {
        System.out.println(largestNums(new int[] {4,7,22,9,31,33,3}));
    }

    static String largestNums(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = ""+nums[i];
        }
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        if (arr[0].equals("0")) return "0";
        else return String.join("",arr);
    }
}
