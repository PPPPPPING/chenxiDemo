package com.chenxi.java.LeetCode;


import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author chenxi
 * @date 2022/6/14 22:51
 * <p>
 * 明明生成了N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * <p>
 * 数据范围：1 <= n <= 1000  ，输入的数字大小满足1 <= n <= 500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 * <p>
 * 示例1
 * 输入：
 * 3
 * 2
 * 2
 * 1
 * 输出：
 * 1
 * 2
 * 说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 2
 * 1
 * 所以样例的输出为：
 * 1
 * 2
 */
public class MingsRandomNum {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        randomNum(n);
    }

    public static void randomNum(int n) {
//        HashSet<Integer> hashSet = new HashSet<Integer>();
////        int repeat = 0;
//        Integer[] integers = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            integers[i] = (int) (500 * Math.random());
//            hashSet.add(integers[i]);
//        }
////        输出数组
//        System.out.print(Arrays.toString(integers));
//        ArrayList<Integer> arrayList = new ArrayList<>();
////        将hashSet添加到arrayList中
//        arrayList.addAll(hashSet);
////        arrayList集合排序
//        Collections.sort(arrayList);
////        输出arrayList集合
//        for (Integer s : arrayList) {
//            System.out.println(s + " ");
//        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int repeat = 0;
        Integer[] integers = new Integer[n];
        for (int i = 0; i < n; i++) {
            integers[i] = (int) (500 * Math.random());
            arrayList.add(integers[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.contains(integers[i])){
                arrayList.add(integers[i]);
            }
        }

        Collections.sort(arrayList);
        for (Integer s : arrayList) {
            System.out.println(s + " ");
        }
    }

    @Test
    public void randomTests(){
        int a = 1;
        int b = 2;
        int i = (int) (Math.random()*(b-a+1)+a);
        int n = (int) (Math.random()*2);
        System.out.println(n);
    }
}
