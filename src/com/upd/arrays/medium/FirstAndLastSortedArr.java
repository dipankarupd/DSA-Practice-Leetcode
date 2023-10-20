package com.upd.arrays.medium;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FirstAndLastSortedArr {
    public static void main(String[] args) {
        int[] arr = {2,7,7,8,8,10};
        System.out.println(Arrays.toString(search(arr,8)));
    }

    static int[] search(int[] arr,int target) {
        int[] ans = {-1,-1};

        ans[0] = search(arr,target,true);
        if(ans[0] != -1) {
            ans[1] = search(arr,target,false);
        }
        return ans;
    }

    static int search(int[] arr, int target,boolean isFirst) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            int m = s + (e-s) /2;

            if (target < arr[m]) {
                e = m - 1;

            } else if (target > arr[m]) {
                s = m + 1;

            }
            else {
                ans = m;
                if (isFirst) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

}
