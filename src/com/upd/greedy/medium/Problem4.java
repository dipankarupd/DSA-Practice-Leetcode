package com.upd.greedy.medium;

// https://leetcode.com/problems/gas-station/

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {

        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5} , new int[]{3,4,5,1,2}));
    }

    static int canCompleteCircuit(int[]gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;
        int fuel = 0;
        int index = 0;

        for (int i = 0; i < gas.length; i++) {
            fuel = fuel + gas[i] - cost[i];

            if (fuel < 0) {
                index = i+1;
                fuel = 0;
            }
        }
        return index;
    }


}
