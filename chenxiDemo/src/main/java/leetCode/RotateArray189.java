package leetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 * 提示：
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * 进阶：
 * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 * @Author ping
 * @Date 2023/12/27 09:12
 */
public class RotateArray189 {

    /**
     * 环形
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int exchange = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = exchange;
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 拼接原数组
     *
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        int[] nums1 = new int[nums.length * 2];
        for (int i = 0; i < nums1.length; i++) {
            if (i < nums.length) {
                nums1[i] = nums[i];
            } else {
                nums1[i] = nums[i - nums.length];
            }
        }
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums1[k + 1 + i];
        }
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * 隔断前后分别拼接
     *
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < k; i++) {
            nums1[i] = nums[nums.length - k + i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            nums1[k + i] = nums[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        int[] intArr = new int[]{-1, -100, 3, 99};
        int k = 3;
        rotate(intArr, k);
    }

    @Test
    public void getNums() {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate1(intArr, k);
    }

    @Test
    public void getNums1() {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate2(intArr, k);
    }
}
