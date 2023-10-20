package com.upd.hashing.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/top-k-frequent-elements/
public class Problem4 {
    public static void main(String[] args) {
        int[] ans = topkfrequent(new int[]{1,1,2,2,3,3,3,2}, 2);
        for(int val:ans) {
            System.out.print(val + " ");
        }
    }

    // Follow up: Your algorithm's time complexity must be better than O(n log n),
    // where n is the array's size.

    // use hashing
    static int[] topkfrequent(int[] arr, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int j : arr) {
            map.merge(j, 1, Integer::sum);
        }

        List<Integer> bucket[] = new ArrayList[arr.length+1];

        for(int key:map.keySet()) {
            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int idx = 0;

        for(int i = arr.length; i>=0; i--) {
            if (bucket[i] != null) {
                for (int val:bucket[i]) {
                    ans[idx++] = val;
                    if (idx == k) {
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
