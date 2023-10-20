package com.upd.arrays.easy;

// https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {

        int[] nums = {3,4,2};

        int sum = 6;

        int[] result = twoSum(nums,sum);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {

        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int[] ans = search(arr,target);
        int[] res = new int[2];

        int a = ans[0];
        int b = ans[1];
        if(ans[0] == -1 && ans[1] == -1) {
            return ans;

        } else {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == a){
                    res[0] = i;
                    break;
                }
            }
            if(a != b){
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == b){
                        res[1] = i;
                        break;
                    }
                }
            } else{
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == b && i != res[0]){
                        res[1] = i;
                        break;
                    }
                }
            }
            return res;
        }
    }

    private static int[] search(int[] arr, int target) {

        int[] ans = {-1,-1};
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {

            int answer = arr[start] + arr[end];

            if (answer == target) {
                ans[0] = arr[start];
                ans[1] = arr[end];
                break;
            }
            else if(answer < target) {
                start++;
            } else {
                end--;
            }
        }

        return ans;
    }
}
