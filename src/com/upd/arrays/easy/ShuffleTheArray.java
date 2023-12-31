package com.upd.arrays.easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(shuffle(arr,arr.length/2)));
    }
    static int[] shuffle(int arr[], int n) {

        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = 0; i<arr.length; i+=2) {
            ans[i] = arr[j];
            j++;
        }
        for (int i = 1; i < arr.length; i+=2) {
            ans[i] = arr[j];
            j++;
        }
        return ans;
    }
}
