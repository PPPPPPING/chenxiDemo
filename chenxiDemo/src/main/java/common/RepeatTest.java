package common;

import java.util.Scanner;

/**
 * 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。chenxiwangying
 * 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。
 * 保证字符串中有重复字符，字符串的长度小于等于500。
 */
public class RepeatTest {
    public static void main(String[] args) {
        RepeatTest repeatTest = new RepeatTest();
        System.out.println(repeatTest.check());
    }

    public String check() {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        //输入字符串
        String str = scanner.next();
        //将字符串变成数组
//        char[] ch = str.toCharArray();
        //将数组分割
        String[] strings = str.split("");
        for (int i = 0; i < strings.length; i++) {
            int index = 0;
            int num = 0;
            while (index <= i) {
                if (strings[index].equals(strings[i])) {
                    num++;
                }
                index++;
            }
            if (num > 1) {
                String flag = strings[i];
                return flag;
            }
        }
        return "没有重复";
    }

}

