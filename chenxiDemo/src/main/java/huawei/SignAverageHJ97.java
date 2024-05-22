package huawei;

import java.util.Arrays;

/**
 * @Description
 * 首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 * 0即不是正整数，也不是负数，不计入计算。如果没有正数，则平均值为0。
 *
 * 数据范围：
 * 1
 * ≤
 * �
 *
 * ≤
 * 2000
 *
 * 1≤n ≤2000  ，输入的整数都满足
 * ∣
 * �
 * �
 * �
 * ∣
 * ≤
 * 1000
 *
 * ∣val∣≤1000
 * 输入描述：
 * 首先输入一个正整数n，
 * 然后输入n个整数。
 *
 * 输出描述：
 * 输出负数的个数，和所有正整数的平均值。
 *
 * 示例1
 * 输入：
 * 11
 * 1 2 3 4 5 6 7 8 9 0 -1
 * 复制
 * 输出：
 * 1 5.0
 * @Author ping
 * @Date 2023/12/26 09:25
 */
public class SignAverageHJ97 {
    public static String getNum(int num, int[] ints){
        int positiveNum = 0;
        int negativeNum = 0;
        float average = 0L;
        for (int i: ints){
            if (i < 0){
                negativeNum++;
            }else if (i > 0){
                positiveNum++;
                average = (average + i);
            }
        }
        average = average/positiveNum;
        String[] strings = new String[2];
        strings[0] = String.valueOf(negativeNum);
        strings[1] = String.valueOf(average);
        return Arrays.toString(strings);
    }

    public static void main(String[] args) {
        System.out.println(getNum(11, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1}));
    }
}
