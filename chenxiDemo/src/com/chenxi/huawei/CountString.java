package com.chenxi.huawei;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/16 9:42
 * <p>
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
 * <p>
 * 数据范围： 1≤n≤500
 * 输入描述：
 * 输入一行没有空格的字符串。
 * <p>
 * 输出描述：
 * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
 * <p>
 * 示例1
 * 输入：
 * abc
 * 复制
 * 输出：
 * 3
 * 复制
 * 示例2
 * 输入：
 * aaa
 * 复制
 * 输出：
 * 1
 */
public class CountString {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split("");
        CountString countString = new CountString();
        countString.count(strings);
    }

    public void count(String[] str) {
//        for (String s: str){
//            System.out.print(s);
//        }
//        输出数组
//        System.out.println(Arrays.toString(str));
//        数组的重复用集合去重
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            if (!list.contains(str[i])) {
                list.add(str[i]);
            }
        }
//        System.out.println(list);
        //集合转化为数组
        String[] strings = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i);
        }
//        System.out.println(Arrays.toString(strings));
        for (String s : strings) {
            System.out.print(s);
        }
        System.out.println(strings.length);
    }
}
