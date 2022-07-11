package com.chenxi.java.listTestDemo.bubblesort;


/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = new int[]{-10, -20, -30, -15, 10, 16, 18, 19, 60, 45, 88};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int exchange = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = exchange;
                }

            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }

//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.binarySearch(ints, 45));

    }
}
