package com.upd.hashing.medium;

// https://www.codingninjas.com/codestudio/library/what-is-subarray-with-given-sum

import java.util.HashMap;

public class Problem1 {

    public static void main(String[] args) {

        sum(new int[] {10,5,-10,10,-5,5}, 5);
    }

    static void sum(int[] arr, int k) {

        int start = 0;
        int end = -1;
        int curr_sum = 0;

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            curr_sum += arr[i];

            if (k - curr_sum == 0) {
                end = i;
                break;
            }

            map.put(curr_sum, i);

            if(map.containsKey(curr_sum - k)) {
                start = map.get(curr_sum - k) + 1;
                end = i;
                break;
            }
        }

        if (end == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at: " + start + " " + end);
        }

    }
}
