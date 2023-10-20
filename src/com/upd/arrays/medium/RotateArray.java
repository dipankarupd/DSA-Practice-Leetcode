package com.upd.arrays.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1,2};
        int k = 3;

//        rotate2(arr,k);
//
//        System.out.println(Arrays.toString(rotate(arr,k)));
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        rotate3(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] rotate(int[] nums, int k) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < k; i++) {
            ans[i] = nums[nums.length - k + i];
        }
        for (int i = 0; i < nums.length-k; i++) {
            ans[k+i] = nums[i];
        }
        return ans;

    }


    static void rotate2(int[] arr, int k) {

        if (k == 0) {
            return;
        }
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            int temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
        rotate2(arr,k-1);
    }

    static void rotate3(int[] arr, int k) {

        /*
        Algorithm to rotate:
        1.reverse from o to k-1
        2.reverse from k to end
        3. reverse the entire array
         */

        if (k < 0) {
            k = k + arr.length;
        }if (k > arr.length) {
            k = k % arr.length;
        }
        reverse(arr,0,arr.length - k - 1);
        reverse(arr,arr.length - k, arr.length - 1);
        reverse(arr,0,arr.length - 1);

    }

    static void reverse(int[] arr, int start, int end) {

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
