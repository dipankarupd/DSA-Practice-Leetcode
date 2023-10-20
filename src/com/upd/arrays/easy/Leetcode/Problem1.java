package com.upd.arrays.easy.Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i=0; i< arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return true;
        }
        return false;
    }
}
