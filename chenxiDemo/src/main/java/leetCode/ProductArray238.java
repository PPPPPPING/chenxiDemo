package leetCode;

import java.util.Arrays;

/**
 * @Description 238. 除自身以外数组的乘积
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 示例 1:
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * 示例 2:
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 * 提示：
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内
 * 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）
 * @Author ping
 * @Date 2023/12/28 14:36
 */
public class ProductArray238 {

    /**
     * 解法一
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] intArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intArr[i] = 1;
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i != i1) {
                    intArr[i] = intArr[i] * nums[i1];
                }
            }
        }
        return intArr;
    }

    /**
     * 解法二
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf1(int[] nums) {
        int[] intArr = new int[]{nums.length};
        intArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] intArr = new int[]{1, 2, 3, 4};
        int[] intArr = new int[]{-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(intArr)));
    }
}
