package com.upd.greedy.medium;
// https://leetcode.com/problems/container-with-most-water/
public class Problem2 {

    public static void main(String[] args) {

        int[] arr = {1,3,2,2,18,4,4,3,7};

        System.out.println(maxArea(arr));

    }

    static int maxArea(int[] height) {
        int ans = 0;
        int width = height.length - 1;

        int first = 0;
        int last = width;

        while (width != 0) {
            int resultArea = Math.min(height[first], height[last]) * width;

            if (resultArea > ans) ans = resultArea;

            width--;
            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return ans;
    }
}
