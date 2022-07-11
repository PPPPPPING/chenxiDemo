package com.chenxi.huawei;

/**
 * @Author cxi
 * @Date 2022/7/11 10:48
 * 输入两个字符串s和t,判断t是否可以通过删除若干字符得到s，例如：“sdfgdfgabcfss”可以删除部分字符得到"bcss"
 */
public class IsBelong {
    public static void main(String[] args) {
        System.out.println(inIsideString("sdfgdfgabcfss", "bcss"));
    }

    public static boolean inIsideString(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        if (cs.length < ct.length) {
            return false;
        }
        int index = 0;
        for (char cs1 : cs) {
            if (cs1 == ct[index]) {
                index++;
                if (index == ct.length) {
                    System.out.println("可以");
                    return true;
                }
            }
        }
        return false;
    }
}
