package common;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个算法，将一组数字中重复的部分变为0，并且将它放到最后。
 * 比如将{1, 2, 3, 4, 4, 4, 5, 5, 6}
 * 变化为{1, 2, 3, 4, 5, 6, 0, 0, 0}
 */
public class RepeatTest2 {
    public static void main(String[] args) {
        RepeatTest2 repeatTest = new RepeatTest2();
        repeatTest.check(new int[]{1, 2, 3, 4, 4, 4, 5, 5, 6});
    }

    //将0移动到最后
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    /**
     *     查找重复的数字
     */
    public void check(int[] ints) {
        List list = new ArrayList();
        for (int i = 0; i < ints.length; i++) {
            int index = 0;
            int num = 0;
            while (index <= i) {
                if (ints[index] == (ints[i])) {
                    num++;
                }
                index++;
            }
            //将重复的变为0
            if (num > 1) {
                ints[i] = 0;
            }
            list.add(ints[i]);
        }

        //将集合变为数组
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = (int) list.get(i);
        }
        moveZeroes(nums);
    }

}

