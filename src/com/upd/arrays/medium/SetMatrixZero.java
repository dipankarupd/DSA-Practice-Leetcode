package com.upd.arrays.medium;
// https://leetcode.com/problems/set-matrix-zeroes/solutions/
public class SetMatrixZero {
    public static void main(String[] args) {
//        int[][] arr = {
//                {0,1,2,0},
//                {3,4,5,2},
//                {1,3,1,5}
//        };
//
//        int[][]ans = setZeroes(arr);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[0].length; j++) {
//                System.out.print(ans[i][j]);
//            }
//            System.out.println();
//            }

        int a = Integer.MAX_VALUE;
        a++;
        System.out.println(a);
        System.out.println(Integer.MIN_VALUE);
        String an = "a";
    }

    static int[][] setZeroes(int[][] arr) {

        boolean[][] isZero = new boolean[arr.length][arr[0].length];

        for(int r = 0; r < arr.length; r++) {

            for(int c = 0; c < arr[0].length; c++) {

                if (arr[r][c] == 0) {
                    isZero[r][c] = true;
                }
            }

        }

        for(int r = 0; r < arr.length; r++) {

            for(int c = 0; c < arr[0].length; c++) {

                if (isZero[r][c]) {
                    makeRow0(arr,r);
                    makeCol0(arr,c);
                }
            }

        }

        return arr;
    }

    static void makeRow0(int[][] arr, int row) {
        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i] = 0;
        }
    }
    static void makeCol0(int[][] arr, int col) {

        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }
}


