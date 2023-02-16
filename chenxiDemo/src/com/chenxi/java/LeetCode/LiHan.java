package com.chenxi.java.LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author chenxi
 * @Date 2022/6/27 20:07
 */


public class LiHan {
    public static void main(String[] args) {
        char[] s1 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
        char[] s2 = { 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R' };
        char[] s3 = { 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ' };
        char[] s4 = new char[s1.length];

        Scanner sc = new Scanner(System.in);
        //输入第一行
        String str1 = sc.nextLine();
        String[] str2 = str1.split(" ");
        //输入第二行
        str1 = sc.nextLine();

        // 月份
        int m = Integer.parseInt(str2[0]);
        // 日期
        int d = Integer.parseInt(str2[1]);

        // 月份旋转
        if ((m - 1) % 3 == 1) {
            s4 = s1;
            s1 = s2;
            s2 = s3;
            s3 = s4;
        } else if ((m - 1) % 3 == 2) {
            s4 = s1;
            s1 = s3;
            s3 = s2;
            s2 = s4;
        }

        // 日期旋转
        Arrayreverse(d, s1);
        Arrayreverse(d, s2);
        Arrayreverse(d, s3);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            //查询结果
            list.add(jiami(ch, s1, s2, s3));
        }
        //结果输出
        for(int i=0;i<list.size();i++){
            if(i!=list.size()-1){
                System.out.print(list.get(i)+" ");
            }else{
                System.out.print(list.get(i));
            }
        }

    }

    private static String jiami(char ch, char[] s1, char[] s2, char[] s3) {
        String s = null;

        for (int i = 0; i < s1.length; i++) {
            if (ch == s1[i]) {
                s = "1" + (i + 1);
            }
        }
        for (int i = 0; i < s2.length; i++) {
            if (ch == s2[i]) {
                s = "2" + (i + 1);
            }
        }
        for (int i = 0; i < s3.length; i++) {
            if (ch == s3[i]) {
                s = "3" + (i + 1);
            }
        }

        return s;
    }

    private static void Arrayreverse(int d, char[] s) {
        int len = s.length;
        int a = (d - 1) % len;
        char[] ch = new char[a];
        for (int i = 0; i < a; i++) {
            ch[i] = s[i];
        }
        // 旋转
        for (int i = 0; i < len; i++) {
            if (i < len - a) {
                s[i] = s[i + a];
            } else {
                s[i] = ch[i - (len - a)];
            }
        }
    }

}
