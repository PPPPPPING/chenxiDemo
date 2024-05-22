package leetCode;

import org.junit.Test;

/**
 * @Description 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 示例 1：
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 * 提示：
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 *
 * 1.拼接原数组
 * 2.递归
 * 3.环形
 * 4.双指针
 * 5.左右指针
 * 6.峰值
 * 7.栈方法
 * 8.动态规划
 * 9.贪心算法
 * 10.指针法(不同类型的指针)
 * 11.状态机
 * 12.K次交易
 * @Author ping
 * @Date 2023/12/29 15:54
 */
public class ReceiveRainWater42 {
    public static int trap(int[] height) {
        int left = 0;
        int right = 2;
        for (int i = 1; i < height.length; i++) {
            for (int i1 = 0; i1 < height.length; i1++) {
                if (height[i] >= left && left >= 0){
                    left--;
                }
                if (height[i] >= right && right <= height.length - 1){
                    right++;
                }
            }
        }
        return 0;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] intArr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(intArr));
    }

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // 到达第0级或第1级台阶的方法数为1
        }

        // 递归调用，将问题划分为爬到第n-1级和第n-2级台阶的方法数之和
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    @Test
    public void test() {
        int n = 4;
        int methods = climbStairs(n);

        System.out.println("爬到楼梯顶部的方法数: " + methods);
    }
}
