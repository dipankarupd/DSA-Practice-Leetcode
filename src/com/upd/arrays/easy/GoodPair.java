package com.upd.arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-good-pairs/
public class GoodPair {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] arr) {
        Arrays.sort(arr);
        int pairs = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j< arr.length; j++) {
                if(arr[i] == arr[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
