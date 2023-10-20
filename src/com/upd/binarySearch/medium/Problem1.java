package com.upd.binarySearch.medium;
// https://leetcode.com/problems/koko-eating-bananas/
public class Problem1 {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(piles,h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int s = 0, e = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] >= e) e = piles[i];
        }

        while(s <= e) {
            int m = s + (e-s)/2;
            if (isAccepted(piles,m,h)) {
                k = m;
                e = m-1;
            } else {
                s = m+1;
            }

        }
        return k;
    }

    static boolean isAccepted(int[] arr, int x, int h) {
        int ans = 0;
        for (int j : arr) {
            ans += Math.ceilDiv(j, x);
        }
        return ans <= h;
    }
}
