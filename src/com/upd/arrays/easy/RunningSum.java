package com.upd.arrays.easy;

// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,7,5,8,9};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    private static int[] runningSum(int[] arr) {

        int[] ans = new int[arr.length];

        for (int i = 0; i < ans.length; i++) {

            if (i == 0) {
                ans[i] = arr[i];
            } else {
                ans[i] = ans[i-1] + arr[i];
            }
        }

        return ans;
    }

}
