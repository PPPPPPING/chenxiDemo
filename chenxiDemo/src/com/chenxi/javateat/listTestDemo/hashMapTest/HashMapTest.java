package com.chenxi.javateat.listTestDemo.hashMapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 输入N个学生的信息，然后进行查询。
 */
public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("请输入学生的个数：");
        Map<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int stdNum = scanner.nextInt();
            for (int i = 0; i < stdNum; i++) {
                String xuehao = scanner.next();
                String xingming = scanner.next();
                String xingbie = scanner.next();
                String banji = scanner.next();
                Integer nianling = scanner.nextInt();
                String stdInfo = xuehao + "|" + xingming + "|" + xingbie + "|" + banji + "|" + nianling;
                hashMap.put(xuehao, stdInfo);
            }
            System.out.println("请输入要查询的学生人数:");
            Integer questionNum = scanner.nextInt();
            String[] string = new String[questionNum];
            for (int i = 0; i < questionNum; i++) {
                string[i] = scanner.next();
                if (hashMap.containsKey(string[i])) {
                    System.out.println(hashMap.get(string[i]));
                } else {
                    System.out.println("输入错误，请继续输入：");

                }

            }
        }


    }
}
