package com.chenxi.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/16 11:55
 *
 * 描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 数据范围：0≤n≤2^{30}-1
 * 30
 *  −1
 * 输入描述：
 * 输入一个int整数
 *
 * 输出描述：
 * 将这个整数以字符串的形式逆序输出
 *
 * 示例1
 * 输入：
 * 1516000
 * 复制
 * 输出：
 * 0006151
 * 复制
 * 示例2
 * 输入：
 * 0
 * 复制
 * 输出：
 * 0
 */
public class DigitalUpsideDown {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split("");
        DigitalUpsideDown digitalUpsideDown = new DigitalUpsideDown();
        digitalUpsideDown.Digital(strings);
    }

    public void Digital(String[] strings){

//        两个数换位置
        for (int i = 0; i < strings.length/2; i++) {
            String exchange = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = exchange;
        }
        System.out.println(Arrays.toString(strings));
    }
}
