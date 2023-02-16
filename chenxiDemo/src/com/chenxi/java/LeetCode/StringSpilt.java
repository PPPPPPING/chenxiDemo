package com.chenxi.java.LeetCode;

import java.util.*;

/**
 * @author chenxi
 * @date 2022/6/15 16:18
 *
 * 描述
 * •输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
 *
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述：
 * 连续输入字符串(每个字符串长度小于等于100)
 *
 * 输出描述：
 * 依次输出所有分割后的长度为8的新字符串
 *
 * 示例1
 * 输入：
 * abc
 * 复制
 * 输出：
 * abc00000
 */
public class StringSpilt {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        StringSpilt stringSpilt = new StringSpilt();
        stringSpilt.spilt();
    }

    public void spilt() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split("");
        List list = new ArrayList();
        if (strings.length < 8) {
            for (String strings1 : strings) {
                list.add(strings1);
            }
            for (int i = 0; i < 8 - strings.length; i++) {
                list.add(0);
            }
        } else if (strings.length % 8 == 0) {
            for (String strings1 : strings) {
                list.add(strings1);
            } 
        } else {
            for (int i = 0; i < strings.length - strings.length % 8; i++) {
                list.add(strings[i]);
            }
            for (int i = 0; i < strings.length % 8; i++) {
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
