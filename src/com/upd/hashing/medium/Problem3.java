package com.upd.hashing.medium;

import java.util.HashMap;

// https://leetcode.com/problems/continuous-subarray-sum/
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[] {23,2,4,6,7}, 6));
    }

    public static boolean checkSubarraySum(int[] arr, int k) {
        int currentSum = 0;
        int start = 0, end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        for (int i=0; i < arr.length; i++) {
            currentSum += arr[i];

            map.put(currentSum, i+1);

            if (currentSum - k == 0) {
               start = 0;
               end = i;

               return (end != start);
            }

            if (map.containsKey((currentSum - k) % k)) {
                start = map.get((currentSum - k)%k) + 1;
                end = i;

                return (end != start);
            }
        }
        return false;
    }
}
