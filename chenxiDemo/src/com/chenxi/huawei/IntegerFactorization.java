package com.chenxi.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/15 19:07
 * <p>
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * <p>
 * 数据范围： 1≤n≤2 * 10^9 + 14
 * 输入描述：
 * 输入一个整数
 * <p>
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。
 * <p>
 * 示例1
 * 输入：
 * 180
 * 复制
 * 输出：
 * 2 2 3 3 5
 */
public class IntegerFactorization {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int ints = scanner.nextInt();
        factorization(ints);
    }
    public static void factorization(int n) {
        List list = new ArrayList();

        //只检查平方根范围内数即可
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
                i--;
            }
        }

        for (Object list1: list){
            System.out.print(list1+" ");
        }
    }
}
