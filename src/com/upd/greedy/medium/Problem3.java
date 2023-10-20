package com.upd.greedy.medium;

// https://leetcode.com/problems/jump-game/solutions/
public class Problem3 {

    public static void main(String[] args) {
        System.out.println(jump(new int[] {3,2,1,7,4}));
    }

    static boolean jump(int[] arr) {
        if(arr.length <= 1) return true;

        int steps = arr[0];
        int idx = 1;

        while(steps != 0) {

            if(idx == arr.length - 1) {
                return true;
            }
            steps = Math.max(steps-1, arr[idx]);
            idx++;
        }
        return false;
    }
}
