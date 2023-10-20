package com.upd.arrays.easy;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidWithHighestCandy {
    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3};
        List<Boolean> list = kidsWithCandies(arr,3);
        for (boolean val:list) {
            System.out.println(val);
        }
    }
    static List<Boolean> kidsWithCandies(int[] arr, int extraCandy){
        List list = new ArrayList();

        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] + extraCandy >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
