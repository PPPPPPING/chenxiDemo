package leetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description 26. 删除有序数组中的重复项
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 * 判题标准:
 * 系统会用下面的代码来测试你的题解:
 * int[] nums = [...]; // 输入数组
 * int[] expectedNums = [...]; // 长度正确的期望答案
 * int k = removeDuplicates(nums); // 调用
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * 如果所有断言都通过，那么您的题解将被 通过。
 * 示例 1：
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 提示：
 * 1 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按 非严格递增 排列
 * @Author ping
 * @Date 2023/12/26 15:37
 */
public class RemoveDuplicatesFromSortedArray26 {

    /**
     * 递增数组
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        // 特判：如果数组为空，则直接返回 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 使用双指针，一个指针用于遍历数组，另一个指针指向不重复元素的位置
        int uniqueIndex = 0;

        // 遍历数组，从第二个元素开始比较
        for (int i = 1; i < nums.length; i++) {
            // 如果当前元素与前一个元素不相等，说明是一个新的不重复元素
            if (nums[i] != nums[uniqueIndex]) {
                // 将新元素覆盖到不重复元素的位置
                nums[++uniqueIndex] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        // 返回不重复元素的个数，即不重复元素的最后位置 + 1
        return uniqueIndex + 1;
    }

    /**
     * 非递增数组
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j <= uniqueIndex; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[++uniqueIndex] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] intArr1 = new int[]{0, 0, 1, 4, 1, 2, 1, 3, 1, 4};
        System.out.println(removeDuplicates(intArr));
        System.out.println(removeDuplicates(intArr1));
//        [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
//        5
//        [0, 1, 4, 1, 2, 1, 3, 1, 4, 4]
//        9
    }

    @Test
    public void test1(){
        int[] intArr = new int[]{0, 0, 1, 4, 1, 2, 1, 3, 1, 4};
        System.out.println(removeDuplicates2(intArr));
//        [0, 1, 4, 2, 3, 2, 1, 3, 1, 4]
//        5
    }

}
