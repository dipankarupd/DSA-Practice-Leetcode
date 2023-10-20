package com.upd.arrays.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintSpiral {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        ArrayList<Integer> list = spiral(arr);

        for (int val:list) {
            System.out.print(val + " ");
        }
    }

    static ArrayList<Integer> spiral(int[][] arr) {

        // declaring the rows and cols:
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        ArrayList<Integer> list = new ArrayList<>();
        while(minRow <= maxRow && minCol <= maxCol) {

            for (int i = minCol; i <= maxCol; i++) {

                list.add(arr[minRow][i]);

            }
            minRow = minRow + 1;



            for (int i = minRow; i <= maxRow ; i++) {

                list.add(arr[i][maxCol]);

            }
            maxCol --;

            if (minCol > maxCol || minRow > maxRow) {
                break;
            }

            for (int i = maxCol; i >=minCol; i--) {


                list.add(arr[maxRow][i]);

            }
            maxRow --;



            for (int i = maxRow; i >= minRow; i--) {
                list.add(arr[i][minCol]);
            }
            minCol++;
        }


        return list;
    }

    private static void printSpiral(int[][] arr) {

        // declaring the rows and cols:
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int direction = 1;
        while(minRow <= maxRow && minCol <= maxCol) {

            if (direction == 1) {
                for (int i = minCol; i <= maxCol; i++) {

                    System.out.println(arr[minRow][i]);

                }
                minRow = minRow + 1;
                direction = 2;
            }


            // print the right wall :
            if (direction == 2) {
                for (int i = minRow; i <= maxRow ; i++) {

                    System.out.println(arr[i][maxCol]);

                }
                maxCol --;
                direction = 3;
            }

            if (direction == 3) {
                for (int i = maxCol; i >=minCol; i--) {


                    System.out.println(arr[maxRow][i]);

                }
                maxRow --;
                direction = 4;
            }
            if (direction == 4){
                for (int i = maxRow; i >= minRow; i--) {
                    System.out.println(arr[i][minCol]);
                }
                minCol++;
                direction = 1;
            }


        }


    }
}
