package com.chenxi.java.CommonTest;

public class tel {

    public static void main(String[] args) {
        int[] num = new int[]{8, 5, 1, 9, 2, 0, 6};
        int[] numm = new int[]{2, 3, 0, 1, 0, 2, 6, 4, 3, 3, 5};
        String tle = "";
        for (int i = 0; i < numm.length; i++) {
            tle += num[numm[i]];
        }
        System.out.println(tle);

    }
}

