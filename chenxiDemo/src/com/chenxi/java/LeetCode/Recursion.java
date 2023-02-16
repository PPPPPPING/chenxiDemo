package com.chenxi.java.LeetCode;

/**
 * @author chenxi
 * @date 2022/4/8 17:20
 */
public class Recursion {
    public static void main(String[] args) {
        Perfact(2);
    }

    public static void Perfact(int num) {
        if (num > 1000) {
            return;
        }

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println("输出完数：" + num);
        }
        Perfact(num + 1);
    }

}
