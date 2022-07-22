package com.chenxi.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/16 12:40
 */
public class SentencesOpposite {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        SentencesOpposite sentencesOpposite = new SentencesOpposite();
        sentencesOpposite.sentences(strings);
    }
    public void sentences(String[] strings){
        for (int i = 0; i < strings.length/2; i++) {
            String exchange = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = exchange;
        }
        System.out.println(Arrays.toString(strings));
    }
}
