package com.chenxi.java.listTestDemo.hashMapTest;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNext()){
        System.out.println("请输入你想要的数字（1到9）");
        // int num=x.nextInt();
        String a = x.next();

        for (char c : a.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Integer.parseInt(a.trim());
                if (num < 9 && num >= 1) {
                    char c2 = (char) (num + 64);
                    System.out.println("数字变成字母为：" + c2);
                } else {
                    System.out.println("您输入的数字不合法：");

                }
            } else if (Character.isLetter(c)) {
                String shuzi = a.substring(1);
                char[] chars = a.toCharArray();
                String new_str = chars[0] - 64 + shuzi;
                System.out.println("英文字母转数字为" + new_str);
            }
        }
        }
    }
}
