package com.upd.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {

    public static void main(String[] args) {

        int[] arr = {10,5,4,5,2,10,4,6};
        System.out.println(findDistinct(arr));
    }

    static int findDistinct(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for(int val: arr) {
            set.add(val);
        }
        return set.size();
    }
}
