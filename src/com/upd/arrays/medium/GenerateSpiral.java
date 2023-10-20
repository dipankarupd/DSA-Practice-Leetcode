package com.upd.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-ii/description/
public class GenerateSpiral {
    public static void main(String[] args) {

        int n = 6;
        int[][] arr = generateMatrix(n);
        for (int i = 0; i < arr.length; i++) {
            for(int val: arr[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        while(minRow <= maxRow && minCol <= maxCol) {
            for (int i = minCol; i <= maxCol; i++) {
                arr[minRow][i] = count++;
            }
            minRow = minRow + 1;

            for (int i = minRow; i <= maxRow ; i++) {
                arr[i][maxCol] = count++;
            }
            maxCol --;

            if (minCol > maxCol || minRow > maxRow) {
                break;
            }

            for (int i = maxCol; i >=minCol; i--) {
               arr[maxRow][i] = count++;
            }

            maxRow --;
            for (int i = maxRow; i >= minRow; i--) {
                arr[i][minCol] = count++;
            }
            minCol++;
        }
        return arr;
    }
}
