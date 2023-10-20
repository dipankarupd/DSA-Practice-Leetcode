package com.upd.arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {

        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumberThanCurrent(arr)));
    }

    static int[] smallerNumberThanCurrent(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
