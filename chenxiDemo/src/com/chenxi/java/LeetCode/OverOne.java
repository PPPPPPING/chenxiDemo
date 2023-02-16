package com.chenxi.java.LeetCode;

/**
 * @Author ping
 * @Date 2022/8/9 23:09
 */
public class OverOne {
    public static void main(String[] args) {
        overOne(new int[]{-3,2,-4,4,5});
    }
    public static void overOne(int[] intsArr){
        int add = 1;
        int sum = 0;
        int sum2 = 0;
        int index = 0;
        for (int i = 0; i < intsArr.length; i++) {
            if (intsArr[0] < 0){
                index = -intsArr[0] + add;
            }
                sum += intsArr[i];
                if (index + sum < 1){
                    add++;
                }
        }
        if (sum2 > 1){
            System.out.println(index);
        }

    }
}
