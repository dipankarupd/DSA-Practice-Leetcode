package com.upd.greedy.medium;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/non-overlapping-intervals/
public class Problem1 {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };

        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {

        int ans = 1;

        int check = arr[0][1];

        Arrays.sort(arr, (a,b) -> {
            if (a[1] > b[1]) {
                return 1;
            } else if(a[1] < b[1]) {
                 return 0;
            } else return 0;
        });

        for (int i = 1; i < arr.length; i++) {

            if(arr[i][0] >= check) {
                ans++;
                check = arr[i][1];
            }
        }

        return ans;
    }
}
