package com.upd.arrays.easy;
// https://leetcode.com/problems/search-insert-position/

public class InsertElement {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6};
        int target = 7;
        System.out.println(searchInsert(arr,target));
    }

    static int searchInsert(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
