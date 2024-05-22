package leetCode;

import org.junit.Test;

/**
 * @Description 122. 买卖股票的最佳时机 II
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 * 示例 1：
 * 输入：prices = [7,1,5,3,6,4]
 * 输出：7
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
 * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。
 * 总利润为 4 + 3 = 7 。
 * 示例 2：
 * 输入：prices = [1,2,3,4,5]
 * 输出：4
 * 解释：在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
 * 总利润为 4 。
 * 示例 3：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 交易无法获得正利润，所以不参与交易可以获得最大利润，最大利润为 0 。
 * 提示：
 * 1 <= prices.length <= 3 * 104
 * 0 <= prices[i] <= 104
 * @Author ping
 * @Date 2023/12/27 10:18
 */
public class BestTimeToBuyAndSellStockII122 {

    /**
     * 方法一：贪心算法
     * 贪心算法思路： 在每一步，如果当前股价比前一天高，就在前一天买入并在当天卖出。这样，只要股价上升，就可以在每一步都赚到利润。
     * 贪心算法的时间复杂度是 O(n)，其中 n 是数组的长度。
     *
     * @param prices
     * @return
     */
    public static int maxProfitGreedyAlgorithm(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    /**
     * 方法二：动态规划
     * 动态规划思路： 使用二维数组 dp[i][j] 表示在第 i 天结束时的最大利润，其中 j 可以是 0 或 1，分别表示不持有或持有股票。
     * 状态转移方程为 dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i]) 和 dp[i][1] = max(dp[i-1][1], dp[i-1][0] - prices[i])。
     * 时间复杂度为 O(n)。
     *
     * @param prices
     * @return
     */
    public static int maxProfitDTGH(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        // 循环遍历二维数组中的每个元素，并将其打印到控制台上
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n - 1][0];
    }

    /**
     * 方法三：峰谷法
     * 峰谷法思路： 将股价波动看作峰谷，只要股价上升，就在峰谷之间买卖。时间复杂度是 O(n)。
     *
     * @param prices
     * @return
     */
    public static int maxProfitGF(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

    }

    @Test
    public void greedyAlgorithm() {
        int[] intArr = new int[]{1, 7, 3, 5, 6, 4, 8};
//        int[] intArr = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxProfitGreedyAlgorithm(intArr));
    }

    @Test
    public void dtgh() {
        int[] intArr = new int[]{1, 7, 3, 5, 6, 4, 8};
        System.out.println(maxProfitDTGH(intArr));
    }

    @Test
    public void gf() {
        int[] intArr = new int[]{1, 7, 3, 5, 6, 4, 8};
        System.out.println(maxProfitGF(intArr));
    }

}
