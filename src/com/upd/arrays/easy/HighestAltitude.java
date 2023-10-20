package com.upd.arrays.easy;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,4};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain){
        int[] maxAltitude = new int[gain.length+1];
        maxAltitude[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            maxAltitude[i+1] = gain[i] + maxAltitude[i];
        }
        Arrays.sort(maxAltitude);
        return maxAltitude[maxAltitude.length-1];
    }
}
