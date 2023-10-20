package com.upd.arrays.easy;

import java.util.ArrayList;

public class MatchRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("phone");
        a1.add("blue");
        a1.add("iphone");

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("computer");
        a2.add("red");
        a2.add("dell");

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("phone");
        a3.add("yellow");
        a3.add("samsung");

        list.add(a1);
        list.add(a2);
        list.add(a3);

        System.out.println(countMatch(list,"color","white"));
    }

    static int countMatch(ArrayList<ArrayList<String>> list, String matchkey, String matchval) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (matchkey.equals("type") && matchval.equals(list.get(i).get(0))) {
                count++;
            }

            if (matchkey.equals("color") && matchval.equals(list.get(i).get(1))) {
                count++;
            }
            if (matchkey.equals("name") && matchval.equals(list.get(i).get(2))) {
                count++;
            }
        }
        return count;
    }
}
