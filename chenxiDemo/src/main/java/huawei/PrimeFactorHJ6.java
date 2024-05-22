package huawei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * 输入描述：
 * 输入一个整数
 * <p>
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。
 * <p>
 * 示例1
 * 输入：
 * 180
 * 复制
 * 输出：
 * 2 2 3 3 5
 * @Author ping
 * @Date 2023/12/22 14:16
 */
public class PrimeFactorHJ6 {
    // 方法 getPrimeFactors() 用于计算输入整数的所有质因子，并返回一个包含它们的列表
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>(); // 创建一个空列表，用于存储质因子
        int i = 2; // 从 2 开始尝试分解输入整数
        while (i * i <= n) { // 循环条件：只要 i 的平方小于或等于输入整数
            if (n % i == 0) { // 如果输入整数能够被 i 整除
                factors.add(i); // 将 i 添加到质因子列表中
                n /= i; // 除以 i，以便下一次循环时继续分解
            } else {
                i++; // 如果输入整数不能被 i 整除，则尝试下一个质因子
            }
        }
        if (n > 1) { // 如果输入整数不是质数，则将其添加到质因子列表中
            factors.add(n);
        }
        return factors; // 返回质因子列表
    }

    public static void main(String[] args) {
        int n = 6; // 输入一个正整数
        List<Integer> factors = getPrimeFactors(n); // 调用 getPrimeFactors() 方法来计算输入整数的所有质因子
        System.out.println(factors); // 输出结果
    }
}
