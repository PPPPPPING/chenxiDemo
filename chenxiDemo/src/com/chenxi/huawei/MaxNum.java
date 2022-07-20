package com.chenxi.huawei;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author cxi
 * @Date 2022/7/14 15:29
 * <p>
 * 排列找到可以构成最大的数
 */
public class MaxNum {
    public static void main(String[] args) {
        System.out.println(combination(new int[]{50, 20, 1, 9, 7}));
    }

    public static String combination(int[] nums) {
        String[] numStrArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String str = "";
        for (String s : numStrArray) {
            str += s;
        }
        return str;
    }

    @Test
    public void test(){

        /*如果指定的数与参数相等返回 0。
        如果指定的数小于参数返回 -1。
        如果指定的数大于参数返回 1。*/
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

        /*1.返回参与比较的前后两个字符串的ASCII码的差值，如果两个字符串首字母不同，则该方法返回首字母的ASCII码的差值。*/
        String a1 = "a";
        String a2 = "c";
        System.out.println(a1.compareTo(a2));//结果为-2

        /*2.参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值。*/
        String a11 = "aa";
        String a22 = "ad";
        System.out.println(a11.compareTo(a22));

        /*3.如果两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值。*/
        String a111 = "aa";
        String a222 = "aa12345678";
        System.out.println(a111.compareTo(a222));//结果为-8

        String a1111 = "abc";
        String a2222 = "def";
        System.out.println("1111" + a1111.compareTo(a2222));

        /*4.返回为正数表示a1>a2, 返回为负数表示a1<a2, 返回为0表示a1==a2。
5.int型可以直接比较，所以没有用到compareTo比较，如果声明的是Date、String、Integer、或者其他的，可以直接使用compareTo比较。*/
        Integer n1 = 5;
        Integer n2 = 6;
        System.out.println(n1.compareTo(n2));//-1

    }
}
