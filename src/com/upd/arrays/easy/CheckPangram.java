package com.upd.arrays.easy;

public class CheckPangram {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoveraladydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram (String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int[] result = new int[25];
        for (int i = 0; i < sentence.length(); i++) {

            int var = sentence.charAt(i);
            if (result[var - 97] == 1) {
                continue;
            } else {
                result[var - 97] = 1;
            }
        }
        for (int i = 0; i < result.length; i++) {

            if (result[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
