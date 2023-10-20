package com.upd.arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/
public class ConcatinationArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];
        }
        return ans;
    }
}
