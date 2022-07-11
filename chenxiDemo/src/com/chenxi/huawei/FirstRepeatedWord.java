package com.chenxi.huawei;

import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/14 21:07
 * <p>
 * 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。chenxiwangying
 * 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。
 * 保证字符串中有重复字符，字符串的长度小于等于500。
 */
public class FirstRepeatedWord {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split("");
        FirstRepeatedWord firstRepeatedWord = new FirstRepeatedWord();
        firstRepeatedWord.findFirst(strings);
    }

    public void findFirst(String[] str) {
        int repeat = 0;
//        每一个字符和全部的字符对比
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    repeat++;
                }
            }
            if(repeat > 1){
                System.out.println(str[i]);
                break;
            }
        }
    }
}
