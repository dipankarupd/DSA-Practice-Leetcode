package com.upd.arrays.hard;

import java.util.Arrays;

// https://leetcode.com/problems/trapping-rain-water/
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
    static int trap(int[] height) {
        int result = 0;

        for(int i=1; i<height.length-1; i++) {
            int l = findMaxLeft(height, i);
            int r = findMaxRight(height, i);

            int h = Math.min(l,r) - height[i];

            if(h > 0) result += h;
        }
        return result;
    }

    static int findMaxLeft(int[] arr, int i) {
        int max = arr[0];

        for (int j = 0; j < i; j++) {
            if(arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

    static int findMaxRight(int[] arr, int i) {
        int max = arr[i+1];

        for (int j = i+1; j < arr.length; j++) {
            if(arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}
