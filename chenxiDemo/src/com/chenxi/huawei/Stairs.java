package com.chenxi.huawei;

/**
 * @Author cxi
 * @Date 2022/7/11 18:15
 * <p>
 * 一个台阶的数量为n，一步可以走一个，两个，三个台阶，走完n需要几种方法。
 */
public class Stairs {
    public static void main(String[] args) { 
        System.out.println(countWays(4));
    }

    public static int countWays(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
    }
}
