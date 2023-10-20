package com.upd.arrays.easy;

public class RemoveDuplicateInPlace {

    public static void main(String[] args) {

        System.out.println(removeDuplicate(new int[] {0,0,1,1,1,1,2,2,2,3,4,4,5,6,8,9}));
    }

    public static int removeDuplicate(int[] nums) {
        int temp = 0;
        for(int i = 1; i<nums.length; i++) {
            if (nums[i] != nums[temp]) {
                nums[++temp] = nums[i];
            }

        }
        if(nums.length == 0) {
            return 0;
        } else {
            return temp + 1;
        }
    }
}
