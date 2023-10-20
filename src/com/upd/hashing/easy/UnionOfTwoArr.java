package com.upd.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {10,5,4,5,2,10,4,6};
        int[] arr2 = {2,4,6,8};

        System.out.println(union(arr1, arr2));
    }

    static int union(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<>();

        for(int val: arr1) {
            set.add(val);
        }

        for(int val: arr2) {
            set.add(val);
        }

        return set.size();
    }
}
