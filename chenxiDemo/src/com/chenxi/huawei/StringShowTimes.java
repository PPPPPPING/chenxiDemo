package com.chenxi.huawei;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/14 17:53
 * <p>
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 * <p>
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
 * <p>
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
 * <p>
 * 示例1
 * 输入：
 * ABCabc
 * A
 * 复制
 * 输出：
 * 2
 */
public class StringShowTimes {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();
        StringShowTimes stringShowTimes = new StringShowTimes();
        stringShowTimes.findRepeat(str, str2);
    }

    public void findRepeat(String str, String word) {
        String[] strings = str.split("");
        int times = 0;
        int times2 = 0;
        int allWords = 0;
        while (allWords < strings.length) {
            if (strings[allWords].equals(word)) {
                times++;
            }
            allWords++;
        }
        System.out.println(times);

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(word)){
                times2++;
            }
        }
        System.out.println(times2);
    }
}
