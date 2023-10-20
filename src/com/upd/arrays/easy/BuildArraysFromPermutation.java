package com.upd.arrays.easy;

// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArraysFromPermutation {
    public static void main(String[] args) {

        int[] arr = {1,3,2,0};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
