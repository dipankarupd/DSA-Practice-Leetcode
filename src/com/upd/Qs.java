package com.upd;

import java.util.Arrays;

public class Qs {
    public static void main(String[] args) {
        int[] arr = {7,3,1,4,9,5};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int l, int h) {
        if (l > h) {
            return;
        }
        int s = l;
        int e = h;
        int m = s+(e-s)/2;
        int p = arr[m];
        while(s <= e) {
            while(arr[s] < p) {
                s++;
            }
            while(arr[e] > p) {
                e--;
            }
            if (s <= e) {
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        quicksort(arr,l,e);
        quicksort(arr,s,h);
    }
}
