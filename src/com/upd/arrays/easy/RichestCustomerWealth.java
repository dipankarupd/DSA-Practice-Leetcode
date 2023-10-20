package com.upd.arrays.easy;

// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {2,6,4,0},
                {7,11},
                {6,9,8},
                {21}
        };

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] arr) {
        int maxWealth = 0;

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
