package com.upd.arrays.medium;

// https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0};
        List<List<Integer>> list = threesSum(arr);

        for (int i = 0; i<list.size(); i++) {
            List <Integer> list2 = list.get(i);

            for (int j = 0; j < list2.size(); j++) {
                System.out.println(list2.get(j));
            }
        }

    }

    static List<List<Integer>> threesSum(int[] arr) {

        List <List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i == 0 || arr[i-1] != arr[i]) { // prevents consecutive elements matching
                twoSum(arr,i,i+1,arr.length - 1,list);
            }
        }
        return list;
    }
    // -2,0,0,0,0,0,1
    static void twoSum(int[] arr, int i, int start, int end,List<List<Integer>> list) {
        while (start < end) {

            if (arr[start] + arr[end] + arr[i] == 0) {
                list.add(Arrays.asList(arr[i],arr[start],arr[end]));


                while (arr[start] == arr[start + 1] && start < arr.length - 2){
                    start ++;
                }
                while (arr[end] == arr[end - 1] && end > 1) {
                    end --;
                }
                start++;
                end--;
            }
            else if (arr[start] + arr[end] + arr[i] < 0) {
                start++;
            } else {
                end --;
            }

        }
    }
}
