package com.upd.arrays.medium;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
    // 24,12,8,6
    static int[] productExceptSelf(int[] arr) {

        int[] ans = new int[arr.length];
        Arrays.fill(ans,1);
        for (int i = 1; i < arr.length ; i++) {
            ans[i-1] *= arr[i];
        }
        return ans;
    }
    static void swap(Integer x) {
        x = 1;
    }
}
