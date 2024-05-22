package swordFingerOffer;

import java.util.Scanner;

/**
 * @Author ping
 * @Date 2023/2/20 16:00
 * @Description 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效地转换时，请返回 0。
 * 说明：
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 */
public class StrExchangeInt67 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            System.out.println(strToInt(a));
        }
    }

    /**
     * 将字符串转换为整数。
     *
     * @param str 要转换的字符串
     * @return 转换后的整数
     */
    public static int strToInt(String str) {
        // 判断字符串是否为空
        if (str == null || str.length() == 0) {
            return 0;
        }

        // 跳过开头的空格
        int index = 0;
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        // 判断正负号
        int sign = 1;
        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = (str.charAt(index++) == '-') ? -1 : 1;
        }

        // 转换数字部分
        int result = 0;
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            // 检查是否溢出
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // 更新结果
            result = result * 10 + digit;
            index++;
        }

        // 返回最终结果
        return sign * result;
    }
}
